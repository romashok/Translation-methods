// Generated from Functional.g4 by ANTLR 4.5.3

package lab3;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionalParser}.
 */
public interface FunctionalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#deflist}.
	 * @param ctx the parse tree
	 */
	void enterDeflist(FunctionalParser.DeflistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#deflist}.
	 * @param ctx the parse tree
	 */
	void exitDeflist(FunctionalParser.DeflistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(FunctionalParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(FunctionalParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(FunctionalParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(FunctionalParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FunctionalParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FunctionalParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FunctionalParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FunctionalParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(FunctionalParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(FunctionalParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FunctionalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FunctionalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(FunctionalParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(FunctionalParser.FuncContext ctx);
}