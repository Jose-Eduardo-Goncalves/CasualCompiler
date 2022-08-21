package casual;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import casual.grammar.CasualBaseListener;
import casual.grammar.CasualLexer;
import casual.grammar.CasualParser;
import casual.grammar.CasualParser.*;

public class CasualListener extends CasualBaseListener {
	BufferedWriter writer;
	ArrayList<String> prt;
	
	public void fileSetter(String name) throws IOException {
		File output = new File(name);
		output.createNewFile();
		writer = new BufferedWriter(new FileWriter(output));
		String[] sa = {"double"};
		prt = new ArrayList<String>(Arrays.asList(sa));
	}
	
	@Override
	public void exitProg(ProgContext ctx) {
		if (writer != null) {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {

		int ruleIndex = arg0.getRuleIndex();
		String ruleName = CasualParser.ruleNames[ruleIndex];

		/*System.out.println("Non-Terminal: " + arg0.getText());
		System.out.println("Type of Token:" + ruleName);
		System.out.println("....");*/
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		int index = arg0.getSymbol().getType();
		String type = CasualLexer.VOCABULARY.getDisplayName(index);

		System.out.println("Found unexpected literal:" + arg0.getText());

		System.out.println("At :" + arg0.getSymbol().getLine() + "," + 
						   arg0.getSymbol().getCharPositionInLine());
		System.out.println("....");

	}
	
	@Override
	public void visitTerminal(TerminalNode arg0) {

		int index = arg0.getSymbol().getType();
		String type = CasualLexer.VOCABULARY.getDisplayName(index);
		
		/**System.out.println("Found literal:" + arg0.getText());
		System.out.println("Type:" + type);
		System.out.println("....");*/
		
		ParseTree pt = arg0.getParent();
		String t;
		
		try {
			switch (arg0.getText()) {
			case "{":
				switch (pt.getChild(0).getText()) {
				case "def":
					writeMethod(pt);
					writer.write("{\n");
					break;
				case "if":
					writer.write("if (" + pt.getChild(1).getText() + ") {\n");
					break;
				case "while":
					writer.write("while (" + pt.getChild(1).getText() + ") {\n");
					break;
				case "else":
					writer.write("else {\n");
				default:
					break;
				}
				break;
			
			case ";":
				if (pt.getChild(0).getText().compareTo("return") == 0) {
					if (pt.getChildCount() > 2)
						writer.write("return " + pt.getChild(1).getText() + ";\n");
					else
						break;
				} else if (pt.getChild(1).getText().compareTo(":") == 0) {
					writer.write(pt.getChild(2).getText().toLowerCase() + " " + pt.getChild(0).getText() + " = ");
					writeVar(pt,4);
					writer.write(";\n");
				} else if (pt.getChild(1).getText().compareTo("=") == 0) {
					writer.write(pt.getChild(0).getText() + " = ");
					writeVar(pt,2);
					writer.write(";\n");
				} else if (pt.getChild(0).getText().contains("print")) {
					t = pt.getChild(0).getText();
					if (t.contains("Line"))
						writer.write("printf(\"%s\\n\"," + t.substring(10) + ";\n");
					else if (t.contains("Int"))
						writer.write("printf(\"%d\\n\","+ t.substring(9) +";\n");
				} else 
					writer.write(pt.getText() + "\n");
				break;

			case "}":
				writer.write("}\n");
				break;
			default:
				break;
			}
		} catch (IOException e) {
			System.err.println("Compilling error" + 
							   "File not found");
		}
	}
	
	@Override
	public void enterProg(ProgContext ctx) {
		try {
			writer.write("#include <stdio.h>\n"
						+"#include <stdlib.h>\n");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Compile checker
	 */
	
	@Override
	public void exitDef(DefContext ctx) {
		try {
			RuleContext rule = ctx;
			if (rule.getChild(rule.getChildCount()-4).getText().toUpperCase().compareTo("VOID") != 0) {
				while (rule.getChild(0).getText().compareTo("}") != 0) {
					rule = (RuleContext) rule.getChild(rule.getChildCount()-1);
					if (rule.getChild(0).getText().compareTo("return") == 0)
						break;
					else if (rule.getChild(0).getText().compareTo("}") == 0)
						throw new Exception("Function definition error:\n" +
											"No return statement found for non VOID method" + "\n" +
											"At :" + ((TerminalNode) rule.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) rule.getChild(0)).getSymbol().getCharPositionInLine());
				}
			}
			if (prt.contains(ctx.getChild(1).getText())) 
				throw new Exception("Function definition error:\n" +
									"Protected term: " + ctx.getChild(1).getText() + " used" + "\n" +
									"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
									((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public void exitIndex(IndexContext ctx) {
		try {
			String t = varType(ctx.getChild(0).getText(), ctx);
			if (t == null)
				throw new Exception("Invalid array access:\n" + 
									"Array does not exist\n" +
									"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
									((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());

			int index = ((TerminalNode) ctx.getChild(2).getChild(0)).getSymbol().getType();
			t = CasualLexer.VOCABULARY.getDisplayName(index);
			if (t.compareTo("INT") != 0)
				throw new Exception("Invalid array access:\n" + 
									"Expected type INT but got " + t + "\n" +
									"At :" + ((TerminalNode) ctx.getParent().getChild(0)).getSymbol().getLine() + "," + 
									((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public void exitBlck(BlckContext ctx) {
		try {
			String t;
			String type;

			switch (ctx.getChild(0).getText()) {
			case "return":
				t = findType(ctx);
				if (ctx.getChild(1).getChildCount() == 0) {
					if (t.compareTo("VOID") != 0)
						throw new Exception("Return type mismatch:\n" + 
											"Expected return type " + t + "but got VOID");
				} else {
					type = getExprType((RuleContext) ctx.getChild(1));
					if (type.compareTo(t) != 0)
						throw new Exception("Return type mismatch:\n" + 
											"Expected return type " + t + "but got " + type);
				}
				break;
				
			case "if":
				t = getExprType((RuleContext) ctx.getChild(1));
				if (t.compareTo("BOOL") != 0)
					throw new Exception("Conditional error:\n" +
										"Expected type BOOL but got " + t + "\n" +
										"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
										((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
				break;
				
			case "while":
				t = getExprType((RuleContext) ctx.getChild(1));
				if (t.compareTo("BOOL") != 0)
					throw new Exception("Conditional error:\n" +
										"Expected type BOOL but got " + t + "\n" +
										"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
										((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
				break;
				
			case "}":
				
				break;
				
			default:
				if (prt.contains(ctx.getChild(0).getText()))
					throw new Exception("Variable error:\n" +
										"Protected term: " + ctx.getChild(0).getText() + " used" + "\n" +
										"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
										((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
				if (ctx.getChild(1).getText().compareTo(":") == 0) {
					if (varType(ctx.getChild(0).getText(), ctx.getParent()) != null)
						throw new Exception("Variable creation type mismatch:\n" + 
											"Variable already exists\n" +
											"At" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					
					if (ctx.getChild(2).getChildCount() == 1) {
						t = ctx.getChild(2).getText().toUpperCase();
						type = getExprType((RuleContext) ctx.getChild(4));
						if (t.compareTo(type) != 0)
							throw new Exception("Variable creation type mismatch:\n" + 
												"Expected type " + t + " but got " + type + "\n" +
												"At" + ((TerminalNode) ctx.getChild(3)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(3)).getSymbol().getCharPositionInLine());
					}
					else {
						t = ctx.getChild(2).getChild(1).getText().toUpperCase();
						if (ctx.getChild(5).getText().compareTo("]") == 0)
							break;
						else {
							int index = ((TerminalNode) ctx.getChild(5).getChild(1)).getSymbol().getType();
							type = CasualLexer.VOCABULARY.getDisplayName(index);
							if (type.compareTo(t) != 0)
								throw new Exception("Variable creation type mismatch:\n" + 
													"Expected type " + t + " but got " + type + "\n" +
													"At" + ((TerminalNode) ctx.getChild(5).getChild(1)).getSymbol().getLine() + "," + 
													((TerminalNode) ctx.getChild(5).getChild(1)).getSymbol().getCharPositionInLine());
						}
					}
				} else if (ctx.getChild(1).getText().compareTo("=") == 0) {
					t = varType(ctx.getChild(0).getText(), ctx);
					type = getExprType((RuleContext) ctx.getChild(2));
					if (t.compareTo(type) != 0)
						throw new Exception("Variable assignment type mismatch:\n" + 
											"Expected type " + t + " but got " + type + "\n" +
											"At" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
				}
				break;
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public void exitExpr(ExprContext ctx) {
		String t;
		try {
			if (prt.contains(ctx.getChild(0).getText()))
				throw new Exception("Expression error:\n" +
									"Protected term: " + ctx.getChild(0).getText() + " used" + "\n" +
									"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
									((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
			switch (ctx.getChildCount()) {
			case 1:
				if (ctx.getChild(0).getChildCount() == 0) {
					int index = ((TerminalNode) ctx.getChild(0)).getSymbol().getType();
					t = CasualLexer.VOCABULARY.getDisplayName(index);
					if (t.compareTo("VARS") == 0)
						if (varType(ctx.getChild(0).getText(), ctx) == null)
							throw new Exception("Invalid Variable access:\n" + 
												"Variable" + ctx.getChild(0).getText() + " does not exist\n" +
												"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
				}
				break;
			case 2:
				t = getExprType((RuleContext) ctx.getChild(1));
				if (t.compareTo("BOOL") != 0)
					throw new Exception("Invalid expression:\n" + 
										"Expected type BOOL but got " + t + "\n" +
										"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
										 ((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
				break;
			case 3:
				if (ctx.getChild(0).getChildCount()!=0) {
					t = getExprType((RuleContext) ctx.getChild(0));
					String t2 = getExprType((RuleContext) ctx.getChild(2));
					String op = ctx.getChild(1).getText();
					if (op.compareTo("||") == 0 ||
						op.compareTo("&&") == 0) {
						if (t.compareTo("BOOL") != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type BOOL but got " + t + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												 ((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
						else if (t2.compareTo("BOOL") != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type BOOL but got " + t2 + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
						
					} else if (op.compareTo("+") == 0  ||
							   op.compareTo("-") == 0  ||
							   op.compareTo("*") == 0  ||
							   op.compareTo("/") == 0  ||
							   op.compareTo(">=") == 0 ||
							   op.compareTo("<=") == 0 ||
							   op.compareTo("<") == 0  ||
							   op.compareTo(">") == 0) {
						
						if (t.compareTo("INT") != 0 && t.compareTo("FLOAT") != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type INT or FLOAT but got " + t + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												 ((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
						else if (t2.compareTo(t) != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type " + t +" but got " + t2 + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
					} else if (op.compareTo("%") == 0) {
						
						if (t.compareTo("INT") != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type INT but got " + t + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												 ((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
						else if (t2.compareTo(t) != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type " + t +" but got " + t2 + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
				
					} else if (op.compareTo("==") == 0  ||
							   op.compareTo("!=") == 0) {
						
						if (t.compareTo("INT") != 0 && t.compareTo("FLOAT") != 0 && t.compareTo("BOOL") != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type INT, FLOAT or BOOL but got " + t + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												 ((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
						else if (t2.compareTo(t) != 0)
							throw new Exception("Invalid expression:\n" + 
												"Expected type " + t +" but got " + t2 + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(1)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(1)).getSymbol().getCharPositionInLine());
					}
				} else if (ctx.getChild(1).getText().compareTo("(") == 0) {
					ArrayList<String> lst = findParamType(ctx.getChild(0).getText(), ctx);
					if (lst == null) {
						throw new Exception("Invalid expression:\n" + 
											"Invalid access to not defined method" + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					}
					if (!lst.isEmpty()) {
						throw new Exception("Invalid expression:\n" + 
											"Invalid access to defined method" + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					}
				}
				break;

			default:
				switch (ctx.getChild(0).getText()) {
				
				case "printFloat":
					if (ctx.getChildCount() > 5)
						throw new Exception("Functio error:\n" +
											"Expected only one input but got multiples\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					t = getExprType((RuleContext) ctx.getChild(2));
					if (t.compareTo("FLOAT") != 0)
						throw new Exception("Functuon error:\n" +
											"Expected type FLOAT but got " + t + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					break;
					
				case "printLine":
					if (ctx.getChildCount() > 5)
						throw new Exception("Functio error:\n" +
											"Expected only one input but got multiples\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					t = getExprType((RuleContext) ctx.getChild(2));
					if (t.compareTo("STRING") != 0)
						throw new Exception("Function error:\n" +
											"Expected type STRING but got " + t + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					break;
					
				case "printInt":
					if (ctx.getChildCount() > 5)
						throw new Exception("Functio error:\n" +
											"Expected only one input but got multiples\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					t = getExprType((RuleContext) ctx.getChild(2));
					if (t.compareTo("INT") != 0)
						throw new Exception("Function error:\n" +
											"Expected type INT but got " + t + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					break;
					
				case "stringToInt":
					if (ctx.getChildCount() > 5)
						throw new Exception("Functio error:\n" +
											"Expected only one input but got multiples\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					t = getExprType((RuleContext) ctx.getChild(2));
					if (t.compareTo("STRING") != 0)
						throw new Exception("Function error:\n" +
											"Expected type STRING but got " + t + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					
					break;

				default:
					ArrayList<String> lst = findParamType(ctx.getChild(0).getText(), ctx);
					if (lst == null) {
						throw new Exception("Invalid expression:\n" + 
											"Invalid access to not defined method" + "\n" +
											"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
											((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
					}
					
					int i = 2;
					for (String type : lst) {
						if (ctx.getChildCount() < i) {
							throw new Exception("Invalid expression:\n" + 
												"Invalid access to defined method" + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
						}
						t = getExprType((RuleContext) ctx.getChild(i));
						if (type.compareTo(t) != 0) {
							throw new Exception("Invalid expression:\n" + 
												"Invalid access to defined method" + "\n" +
												"At :" + ((TerminalNode) ctx.getChild(0)).getSymbol().getLine() + "," + 
												((TerminalNode) ctx.getChild(0)).getSymbol().getCharPositionInLine());
						}
						i+=2;
					}
					break;
				}
				break;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Returns the type of given expr rule
	 */
	private String getExprType(RuleContext expr) {
		String t;
		
		switch (expr.getChildCount()) {
		
		case 1:
			if (expr.getChild(0).getChildCount() != 0) {
				t = varType(expr.getChild(0).getChild(0).getText(), expr);
				if (expr.getChild(0).getChild(1).getText().compareTo("[") == 0 && t != null) {
					t = t.substring(1, t.length()-1);
				}
				return t;
			} else {
				if (expr.getChild(0).getText().compareTo("!true") == 0)
					return "BOOL";
				else {
					t = CasualLexer.VOCABULARY.getDisplayName(((TerminalNode) expr.getChild(0)).getSymbol().getType());
					if (t.compareTo("VARS") == 0)
						return varType(expr.getChild(0).getText(), expr);
					else 
						return t;
				}
			}
		
		case 3:
			if (expr.getChild(0).getText().compareTo("(") == 0)
				return getExprType((RuleContext) expr.getChild(1));
			else if (expr.getChild(0).getChildCount() == 0)
				return defType(expr.getChild(0).getText(), expr);
			else if (expr.getChild(1).getText().compareTo("||") == 0 ||
					 expr.getChild(1).getText().compareTo("&&") == 0 ||
					 expr.getChild(1).getText().compareTo("==") == 0 ||
					 expr.getChild(1).getText().compareTo("!=") == 0 ||
					 expr.getChild(1).getText().compareTo("<") == 0  ||
					 expr.getChild(1).getText().compareTo("<=") == 0 ||
					 expr.getChild(1).getText().compareTo(">=") == 0 ||
					 expr.getChild(1).getText().compareTo(">") == 0)
				return "BOOL";
			else if (expr.getChild(1).getText().compareTo("+") == 0 ||
					 expr.getChild(1).getText().compareTo("-") == 0 ||
					 expr.getChild(1).getText().compareTo("*") == 0 ||
					 expr.getChild(1).getText().compareTo("/") == 0 ||
					 expr.getChild(1).getText().compareTo("%") == 0)
				return getExprType((RuleContext) expr.getChild(0));
			break;
		default:
			if (expr.getChild(0).getText().compareTo("stringToInt") == 0)
				return "INT";
			return defType(expr.getChild(0).getText(), expr);
		}
		return null;
	}
	
	/*
	 * Finds the type of given var
	 */
	private String varType(String var, RuleContext ctx) {
		while (ctx.getChild(0).getText().compareTo("def") != 0) {
			ctx = ctx.getParent();
			if (ctx.getChildCount() > 7) {
				if (ctx.getChild(0).getText().compareTo(var) == 0 && 
						ctx.getChild(1).getText().compareTo(":") == 0) {
						if (ctx.getChild(2).getChildCount() == 1)
							return ctx.getChild(2).getChild(0).getText().toUpperCase();
						else
							return ctx.getChild(2).getChild(1).getText().toUpperCase();
					}
			}
		}
		
		for (int i = 3; i < ctx.getChildCount(); i += 4) {
			if (ctx.getChild(i).getText().compareTo(var) == 0) {
				return ctx.getChild(i+2).getText().toUpperCase();
			}
		}
		return null;
	}
	
	/*
	 * finds the type of given def
	 */
	private String defType(String func, RuleContext ctx) {
		while (ctx.getParent() != null) {
			ctx = ctx.getParent();
		}
		
		for (int i = 0; i <= ctx.getChildCount(); i += 2) {
			if (ctx.getChild(i).getChild(1).getText().compareTo(func) == 0) {
				ctx = (RuleContext) ctx.getChild(i);
				return ctx.getChild(ctx.getChildCount()-4).getText().toUpperCase();
			}
		}
		
		return null;
	}
	
	/*
	 * Finds the type of all parameters of given function
	 */
	private ArrayList<String> findParamType(String func, RuleContext ctx) {
		ArrayList<String> lst = new ArrayList<String>();
		while (ctx.getParent() != null) {
			ctx = ctx.getParent();
		}
		
		for (int i = 0; i <= ctx.getChildCount(); i += 2) {
			if (ctx.getChild(i).getChild(1).getText().compareTo(func) == 0) {
				ctx = (RuleContext) ctx.getChild(i);
				break;
			}
		}
		
		if (ctx.getChild(3).getText().compareTo(")") == 0)
			return lst;
		
		for (int i = 5; i < ctx.getChildCount(); i+=4) {
			if (ctx.getChild(i-3).getText().compareTo(")") == 0)
				return lst;
			else
				lst.add(ctx.getChild(i).getText().toUpperCase());
		}
		return null;	
	}

	/*
	 * Finds the type of the current function
	 */
	private String findType(ParseTree pt) {
		while (pt.getChild(0).getText().compareTo("def") != 0) {
			pt = pt.getParent();
		}
		
		return pt.getChild(pt.getChildCount()-4).getText().toUpperCase();
	}
	
	private void writeMethod(ParseTree pt) throws IOException {
		String t = pt.getChild(pt.getChildCount()-2).getText().toUpperCase();
		if(t.compareTo("STRING") == 0)
			writer.write("char* ");
		else if (t.charAt(0) == '[') {
			t = t.substring(1, t.length()-1);
			if(t.compareTo("STRING") == 0)
				writer.write("char** ");
			else
				writer.write(t.toLowerCase() + "* ");
		}
		else
			writer.write(t.toLowerCase() + " ");
		writer.write(pt.getChild(1).getText());
		writer.write("(");
		if(pt.getChild(1).getText().compareTo("main") == 0){
			writer.write("int argc");
			if (pt.getChild(3).getText().compareTo(")") != 0)
				writer.write(", ");
		}
		if (pt.getChild(3).getText().compareTo(")") == 0)
			writer.write(") ");
		else
			for (int i = 3; i < pt.getChildCount(); i += 4) {
				t = pt.getChild(i+2).getText();
				if(t.compareTo("STRING ") == 0)
					writer.write("char* ");
				else if (t.charAt(0) == '[') {
					t = t.substring(1, t.length()-1).toUpperCase();
					if(t.compareTo("STRING") == 0)
						writer.write("char** ");
					else
						writer.write(t.toLowerCase() + "* ");
				}
				else
					writer.write(t.toLowerCase() + " ");
				writer.write(pt.getChild(i).getText());
				if (pt.getChild(i+3).getText().compareTo(")") == 0) {
					writer.write(") ");
					break;
				} else {
					writer.write(", ");
				}
			}
	}
	
	private void writeVar(ParseTree pt, int i) throws IOException {
		String stg = pt.getChild(i).getText();
		String[] ta;
		while(stg.compareTo(";") != 0) {
			if (stg.contains("stringToInt")) {
				ta = stg.split("stringToInt");
				stg ="atoi"+ta[1];
			}
			writer.write(stg);
			i++;
			stg = pt.getChild(i).getText();
		}
	}

}
