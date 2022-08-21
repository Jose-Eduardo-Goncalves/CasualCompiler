// Generated from Casual.g4 by ANTLR 4.8

  package casual.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CasualParser}.
 */
public interface CasualListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CasualParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CasualParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CasualParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CasualParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CasualParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CasualParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CasualParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CasualParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CasualParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CasualParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CasualParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#blck}.
	 * @param ctx the parse tree
	 */
	void enterBlck(CasualParser.BlckContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#blck}.
	 * @param ctx the parse tree
	 */
	void exitBlck(CasualParser.BlckContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(CasualParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(CasualParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CasualParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CasualParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CasualParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CasualParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CasualParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(CasualParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(CasualParser.IndexContext ctx);
}