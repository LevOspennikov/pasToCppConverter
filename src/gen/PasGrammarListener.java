// Generated from C:/Users/ospen/IdeaProjects/Mt/pasToCplusplus/src\PasGrammar.g4 by ANTLR 4.7
package gen;

import utils.Variables;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PasGrammarParser}.
 */
public interface PasGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PasGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PasGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PasGrammarParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PasGrammarParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PasGrammarParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PasGrammarParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PasGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PasGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PasGrammarParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PasGrammarParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PasGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PasGrammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PasGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PasGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#assignmentState}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentState(PasGrammarParser.AssignmentStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#assignmentState}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentState(PasGrammarParser.AssignmentStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#funcState}.
	 * @param ctx the parse tree
	 */
	void enterFuncState(PasGrammarParser.FuncStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#funcState}.
	 * @param ctx the parse tree
	 */
	void exitFuncState(PasGrammarParser.FuncStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(PasGrammarParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(PasGrammarParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PasGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PasGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PasGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PasGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#ifState}.
	 * @param ctx the parse tree
	 */
	void enterIfState(PasGrammarParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#ifState}.
	 * @param ctx the parse tree
	 */
	void exitIfState(PasGrammarParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#unOp}.
	 * @param ctx the parse tree
	 */
	void enterUnOp(PasGrammarParser.UnOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#unOp}.
	 * @param ctx the parse tree
	 */
	void exitUnOp(PasGrammarParser.UnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(PasGrammarParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(PasGrammarParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#whileState}.
	 * @param ctx the parse tree
	 */
	void enterWhileState(PasGrammarParser.WhileStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#whileState}.
	 * @param ctx the parse tree
	 */
	void exitWhileState(PasGrammarParser.WhileStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(PasGrammarParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(PasGrammarParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#logicalSign}.
	 * @param ctx the parse tree
	 */
	void enterLogicalSign(PasGrammarParser.LogicalSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#logicalSign}.
	 * @param ctx the parse tree
	 */
	void exitLogicalSign(PasGrammarParser.LogicalSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PasGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PasGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PasGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PasGrammarParser.NumberContext ctx);
}