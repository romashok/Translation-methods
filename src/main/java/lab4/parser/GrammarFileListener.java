// Generated from GrammarFile.g4 by ANTLR 4.5.3

package lab4.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarFileParser}.
 */
public interface GrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#grammarFileContent}.
	 * @param ctx the parse tree
	 */
	void enterGrammarFileContent(GrammarFileParser.GrammarFileContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#grammarFileContent}.
	 * @param ctx the parse tree
	 */
	void exitGrammarFileContent(GrammarFileParser.GrammarFileContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GrammarFileParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GrammarFileParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarFileParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarFileParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexerRule(GrammarFileParser.LexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexerRule(GrammarFileParser.LexerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#productions}.
	 * @param ctx the parse tree
	 */
	void enterProductions(GrammarFileParser.ProductionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#productions}.
	 * @param ctx the parse tree
	 */
	void exitProductions(GrammarFileParser.ProductionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(GrammarFileParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(GrammarFileParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarFileParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarFileParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#grammarRuleName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRuleName(GrammarFileParser.GrammarRuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#grammarRuleName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRuleName(GrammarFileParser.GrammarRuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#lexerToken}.
	 * @param ctx the parse tree
	 */
	void enterLexerToken(GrammarFileParser.LexerTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#lexerToken}.
	 * @param ctx the parse tree
	 */
	void exitLexerToken(GrammarFileParser.LexerTokenContext ctx);
}