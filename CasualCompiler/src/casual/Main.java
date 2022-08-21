package casual;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.tree.ParseTree;

import casual.grammar.CasualLexer;
import casual.grammar.CasualParser;

public class Main {
	public static void main(String[] args) throws IOException {
		CodePointCharStream input = (CodePointCharStream) CharStreams.fromFileName(args[0]);
		CasualLexer lexer = new CasualLexer(input);
		
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CasualParser parser = new CasualParser(tokens);
		parser.setBuildParseTree(true);
		CasualListener cl = new CasualListener();
		cl.fileSetter(args[0].substring(0,args[0].length()-4)+".c");
		parser.addParseListener(cl);
		ParseTree p = parser.prog();
		System.out.println(p.toStringTree(parser));
	}
}
