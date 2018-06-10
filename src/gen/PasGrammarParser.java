// Generated from C:/Users/ospen/IdeaProjects/Mt/pasToCplusplus/src\PasGrammar.g4 by ANTLR 4.7
package gen;

import utils.Variables;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOT=3, AND=4, XOR=5, OR=6, DO=7, WHILE=8, IF=9, THEN=10, 
		FOR=11, SEMI=12, COLON=13, COMMA=14, DOT=15, LPAREN=16, RPAREN=17, EQUALITY=18, 
		ASSIGNMENT=19, PLUS=20, MINUS=21, MUL=22, DIV=23, PROGRAM=24, VAR=25, 
		BEGIN=26, END=27, CONST=28, BOOLEAN=29, CHAR=30, INTEGER=31, REAL=32, 
		DOUBLE=33, EXTENDED=34, STRING=35, READ=36, READLN=37, WRITE=38, WRITELN=39, 
		IDENTIFIER=40, NUMBER=41, WS=42, OLD_STYLE_COMMENT=43, COMMENT=44;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_variableDeclarationPart = 2, 
		RULE_variableDeclaration = 3, RULE_identifierList = 4, RULE_compoundStatement = 5, 
		RULE_statements = 6, RULE_assignmentState = 7, RULE_funcState = 8, RULE_funcName = 9, 
		RULE_expression = 10, RULE_type = 11, RULE_ifState = 12, RULE_unOp = 13, 
		RULE_logicalOp = 14, RULE_whileState = 15, RULE_logical = 16, RULE_logicalSign = 17, 
		RULE_identifier = 18, RULE_number = 19;
	public static final String[] ruleNames = {
		"program", "programHeading", "variableDeclarationPart", "variableDeclaration", 
		"identifierList", "compoundStatement", "statements", "assignmentState", 
		"funcState", "funcName", "expression", "type", "ifState", "unOp", "logicalOp", 
		"whileState", "logical", "logicalSign", "identifier", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'<'", null, null, null, null, null, null, null, null, null, 
		"';'", "':'", "','", "'.'", "'('", "')'", "'='", "':='", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NOT", "AND", "XOR", "OR", "DO", "WHILE", "IF", "THEN", 
		"FOR", "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "CONST", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", 
		"STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", 
		"WS", "OLD_STYLE_COMMENT", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PasGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PasGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public String text;
		public VariableDeclarationPartContext variableDeclarationPart;
		public CompoundStatementContext compoundStatement;
		public VariableDeclarationPartContext variableDeclarationPart() {
			return getRuleContext(VariableDeclarationPartContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(40);
				programHeading();
				}
			}


			           ((ProgramContext)_localctx).text =  "#include <stdlib.h>\n";
			           _localctx.text += "#include <stdio.h>\n";
			     
			setState(44);
			((ProgramContext)_localctx).variableDeclarationPart = variableDeclarationPart();
			_localctx.text += ((ProgramContext)_localctx).variableDeclarationPart.name;
			setState(46);
			((ProgramContext)_localctx).compoundStatement = compoundStatement();
			_localctx.text += "int main() {\n" + ((ProgramContext)_localctx).compoundStatement.name + "return 0;\n}";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadingContext extends ParserRuleContext {
		public String name;
		public TerminalNode PROGRAM() { return getToken(PasGrammarParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PasGrammarParser.SEMI, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitProgramHeading(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(PROGRAM);
			setState(50);
			identifier();
			setState(51);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public String name;
		public VariableDeclarationContext variableDeclaration;
		public TerminalNode VAR() { return getToken(PasGrammarParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PasGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PasGrammarParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(VAR);
			setState(54);
			((VariableDeclarationPartContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationPartContext)_localctx).name =  ((VariableDeclarationPartContext)_localctx).variableDeclaration.name;
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					match(SEMI);
					setState(57);
					((VariableDeclarationPartContext)_localctx).variableDeclaration = variableDeclaration();
					_localctx.name += ((VariableDeclarationPartContext)_localctx).variableDeclaration.name;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(65);
			match(SEMI);
			_localctx.name += "\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public String name;
		public IdentifierListContext identifierList;
		public TypeContext type;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PasGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((VariableDeclarationContext)_localctx).identifierList = identifierList();
			setState(69);
			match(COLON);
			setState(70);
			((VariableDeclarationContext)_localctx).type = type();
			((VariableDeclarationContext)_localctx).name =  ((VariableDeclarationContext)_localctx).type.text + " " + ((VariableDeclarationContext)_localctx).identifierList.name + ";";
			}
			_ctx.stop = _input.LT(-1);

			        Variables.putVar(_localctx.type.text, _localctx.identifierList.name.split(", "));
			    
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public String name;
		public IdentifierContext identifier;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PasGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PasGrammarParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((IdentifierListContext)_localctx).identifier = identifier();
			((IdentifierListContext)_localctx).name =  (((IdentifierListContext)_localctx).identifier!=null?_input.getText(((IdentifierListContext)_localctx).identifier.start,((IdentifierListContext)_localctx).identifier.stop):null);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				((IdentifierListContext)_localctx).identifier = identifier();
				_localctx.name += ", " + (((IdentifierListContext)_localctx).identifier!=null?_input.getText(((IdentifierListContext)_localctx).identifier.start,((IdentifierListContext)_localctx).identifier.stop):null);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public String name;
		public StatementsContext statements;
		public TerminalNode BEGIN() { return getToken(PasGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PasGrammarParser.END, 0); }
		public TerminalNode DOT() { return getToken(PasGrammarParser.DOT, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(BEGIN);
			((CompoundStatementContext)_localctx).name =  "";
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << READ) | (1L << READLN) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(86);
				((CompoundStatementContext)_localctx).statements = statements();
				_localctx.name += ((CompoundStatementContext)_localctx).statements.name + "\n";
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(END);
			setState(95);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public String name;
		public AssignmentStateContext assignmentState;
		public FuncStateContext funcState;
		public IfStateContext ifState;
		public WhileStateContext whileState;
		public AssignmentStateContext assignmentState() {
			return getRuleContext(AssignmentStateContext.class,0);
		}
		public FuncStateContext funcState() {
			return getRuleContext(FuncStateContext.class,0);
		}
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public WhileStateContext whileState() {
			return getRuleContext(WhileStateContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((StatementsContext)_localctx).assignmentState = assignmentState();
				((StatementsContext)_localctx).name =  ((StatementsContext)_localctx).assignmentState.name;
				}
				break;
			case READ:
			case READLN:
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((StatementsContext)_localctx).funcState = funcState();
				((StatementsContext)_localctx).name =  "\t" + ((StatementsContext)_localctx).funcState.name;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				((StatementsContext)_localctx).ifState = ifState();
				((StatementsContext)_localctx).name =  ((StatementsContext)_localctx).ifState.text;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				((StatementsContext)_localctx).whileState = whileState();
				((StatementsContext)_localctx).name =  ((StatementsContext)_localctx).whileState.text;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStateContext extends ParserRuleContext {
		public String name;
		public IdentifierContext identifier;
		public NumberContext number;
		public ExpressionContext expression;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PasGrammarParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(PasGrammarParser.SEMI, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterAssignmentState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitAssignmentState(this);
		}
	}

	public final AssignmentStateContext assignmentState() throws RecognitionException {
		AssignmentStateContext _localctx = new AssignmentStateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((AssignmentStateContext)_localctx).identifier = identifier();
			((AssignmentStateContext)_localctx).name =  "\t" + (((AssignmentStateContext)_localctx).identifier!=null?_input.getText(((AssignmentStateContext)_localctx).identifier.start,((AssignmentStateContext)_localctx).identifier.stop):null) + " = ";
			setState(113);
			match(ASSIGNMENT);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(114);
				((AssignmentStateContext)_localctx).identifier = identifier();
				_localctx.name += (((AssignmentStateContext)_localctx).identifier!=null?_input.getText(((AssignmentStateContext)_localctx).identifier.start,((AssignmentStateContext)_localctx).identifier.stop):null);
				}
				break;
			case 2:
				{
				setState(117);
				((AssignmentStateContext)_localctx).number = number();
				_localctx.name += (((AssignmentStateContext)_localctx).number!=null?_input.getText(((AssignmentStateContext)_localctx).number.start,((AssignmentStateContext)_localctx).number.stop):null);
				}
				break;
			case 3:
				{
				setState(120);
				((AssignmentStateContext)_localctx).expression = expression();
				_localctx.name += (((AssignmentStateContext)_localctx).expression!=null?_input.getText(((AssignmentStateContext)_localctx).expression.start,((AssignmentStateContext)_localctx).expression.stop):null);
				}
				break;
			}
			setState(125);
			match(SEMI);
			_localctx.name += ";";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncStateContext extends ParserRuleContext {
		public String name;
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PasGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PasGrammarParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PasGrammarParser.SEMI, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public FuncStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterFuncState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitFuncState(this);
		}
	}

	public final FuncStateContext funcState() throws RecognitionException {
		FuncStateContext _localctx = new FuncStateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			funcName();
			setState(129);
			match(LPAREN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(130);
				identifierList();
				}
			}

			setState(133);
			match(RPAREN);
			setState(134);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);

			            ((FuncStateContext)_localctx).name =  Variables.getFunc(_localctx.funcName().name, _localctx.identifierList()== null ? new String[0] : _localctx.identifierList().name.split(", "));
			    
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public String name;
		public TerminalNode READ() { return getToken(PasGrammarParser.READ, 0); }
		public TerminalNode READLN() { return getToken(PasGrammarParser.READLN, 0); }
		public TerminalNode WRITE() { return getToken(PasGrammarParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(PasGrammarParser.WRITELN, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcName);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(READ);
				((FuncNameContext)_localctx).name =  "read";
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(READLN);
				((FuncNameContext)_localctx).name =  "readln";
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(WRITE);
				((FuncNameContext)_localctx).name =  "write";
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(WRITELN);
				((FuncNameContext)_localctx).name =  "writeln";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String name;
		public IdentifierContext identifier;
		public NumberContext number;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PasGrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PasGrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PasGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PasGrammarParser.MINUS, i);
		}
		public List<TerminalNode> MUL() { return getTokens(PasGrammarParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(PasGrammarParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PasGrammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PasGrammarParser.DIV, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(146);
				((ExpressionContext)_localctx).identifier = identifier();
				((ExpressionContext)_localctx).name =  (((ExpressionContext)_localctx).identifier!=null?_input.getText(((ExpressionContext)_localctx).identifier.start,((ExpressionContext)_localctx).identifier.stop):null);
				}
				break;
			case NUMBER:
				{
				setState(149);
				((ExpressionContext)_localctx).number = number();
				((ExpressionContext)_localctx).name =  (((ExpressionContext)_localctx).number!=null?_input.getText(((ExpressionContext)_localctx).number.start,((ExpressionContext)_localctx).number.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(154);
					match(PLUS);
					_localctx.name += " + ";
					}
					break;
				case MINUS:
					{
					setState(156);
					match(MINUS);
					_localctx.name += " - ";
					}
					break;
				case MUL:
					{
					setState(158);
					match(MUL);
					_localctx.name += " * ";
					}
					break;
				case DIV:
					{
					setState(160);
					match(DIV);
					_localctx.name += " / ";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(164);
					((ExpressionContext)_localctx).identifier = identifier();
					_localctx.name += (((ExpressionContext)_localctx).identifier!=null?_input.getText(((ExpressionContext)_localctx).identifier.start,((ExpressionContext)_localctx).identifier.stop):null);
					}
					break;
				case NUMBER:
					{
					setState(167);
					((ExpressionContext)_localctx).number = number();
					_localctx.name += (((ExpressionContext)_localctx).number!=null?_input.getText(((ExpressionContext)_localctx).number.start,((ExpressionContext)_localctx).number.stop):null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String text;
		public TerminalNode CHAR() { return getToken(PasGrammarParser.CHAR, 0); }
		public TerminalNode INTEGER() { return getToken(PasGrammarParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(PasGrammarParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(CHAR);
				((TypeContext)_localctx).text =  "char";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(INTEGER);
				((TypeContext)_localctx).text =  "int";
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(DOUBLE);
				((TypeContext)_localctx).text =  "double";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStateContext extends ParserRuleContext {
		public String text;
		public UnOpContext unOp;
		public LogicalContext logical;
		public LogicalOpContext logicalOp;
		public StatementsContext statements;
		public TerminalNode IF() { return getToken(PasGrammarParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PasGrammarParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PasGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PasGrammarParser.LPAREN, i);
		}
		public List<LogicalContext> logical() {
			return getRuleContexts(LogicalContext.class);
		}
		public LogicalContext logical(int i) {
			return getRuleContext(LogicalContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PasGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PasGrammarParser.RPAREN, i);
		}
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public List<UnOpContext> unOp() {
			return getRuleContexts(UnOpContext.class);
		}
		public UnOpContext unOp(int i) {
			return getRuleContext(UnOpContext.class,i);
		}
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterIfState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitIfState(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IF);
			((IfStateContext)_localctx).text =  "\tif (";
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(186);
				((IfStateContext)_localctx).unOp = unOp();
				_localctx.text += ((IfStateContext)_localctx).unOp.text;
				}
			}

			setState(191);
			match(LPAREN);
			setState(192);
			((IfStateContext)_localctx).logical = logical();
			setState(193);
			match(RPAREN);
			_localctx.text +=  "(" + ((IfStateContext)_localctx).logical.text + ") ";
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << XOR) | (1L << OR))) != 0)) {
				{
				{
				setState(196);
				((IfStateContext)_localctx).logicalOp = logicalOp();
				_localctx.text += ((IfStateContext)_localctx).logicalOp.text + " ";
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(198);
					((IfStateContext)_localctx).unOp = unOp();
					_localctx.text += ((IfStateContext)_localctx).unOp.text;
					}
				}

				setState(203);
				match(LPAREN);
				setState(204);
				((IfStateContext)_localctx).logical = logical();
				setState(205);
				match(RPAREN);
				_localctx.text += " (" + ((IfStateContext)_localctx).logical.text + ")"; 
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(THEN);
			setState(214);
			((IfStateContext)_localctx).statements = statements();
			_localctx.text +=  ") " + ((IfStateContext)_localctx).statements.name;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnOpContext extends ParserRuleContext {
		public String text;
		public TerminalNode NOT() { return getToken(PasGrammarParser.NOT, 0); }
		public UnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterUnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitUnOp(this);
		}
	}

	public final UnOpContext unOp() throws RecognitionException {
		UnOpContext _localctx = new UnOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NOT);
			((UnOpContext)_localctx).text =  "!";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOpContext extends ParserRuleContext {
		public String text;
		public TerminalNode AND() { return getToken(PasGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(PasGrammarParser.OR, 0); }
		public TerminalNode XOR() { return getToken(PasGrammarParser.XOR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitLogicalOp(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalOp);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(AND);
				((LogicalOpContext)_localctx).text =  "&&";
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(OR);
				((LogicalOpContext)_localctx).text =  "||";
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(XOR);
				((LogicalOpContext)_localctx).text =  "^";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStateContext extends ParserRuleContext {
		public String text;
		public LogicalContext logical;
		public StatementsContext statements;
		public TerminalNode WHILE() { return getToken(PasGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PasGrammarParser.LPAREN, 0); }
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PasGrammarParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(PasGrammarParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public WhileStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterWhileState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitWhileState(this);
		}
	}

	public final WhileStateContext whileState() throws RecognitionException {
		WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(WHILE);
			setState(229);
			match(LPAREN);
			setState(230);
			((WhileStateContext)_localctx).logical = logical();
			setState(231);
			match(RPAREN);
			setState(232);
			match(DO);
			setState(233);
			((WhileStateContext)_localctx).statements = statements();
			((WhileStateContext)_localctx).text =  "\t while (" + ((WhileStateContext)_localctx).logical.text  + ") " + ((WhileStateContext)_localctx).statements.name;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalContext extends ParserRuleContext {
		public String text;
		public IdentifierContext identifier;
		public NumberContext number;
		public LogicalSignContext logicalSign;
		public LogicalSignContext logicalSign() {
			return getRuleContext(LogicalSignContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitLogical(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(236);
				((LogicalContext)_localctx).identifier = identifier();
				((LogicalContext)_localctx).text =  (((LogicalContext)_localctx).identifier!=null?_input.getText(((LogicalContext)_localctx).identifier.start,((LogicalContext)_localctx).identifier.stop):null);
				}
				break;
			case NUMBER:
				{
				setState(239);
				((LogicalContext)_localctx).number = number();
				((LogicalContext)_localctx).text =  (((LogicalContext)_localctx).number!=null?_input.getText(((LogicalContext)_localctx).number.start,((LogicalContext)_localctx).number.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			((LogicalContext)_localctx).logicalSign = logicalSign();
			_localctx.text += ((LogicalContext)_localctx).logicalSign.text;
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(246);
				((LogicalContext)_localctx).identifier = identifier();
				_localctx.text += (((LogicalContext)_localctx).identifier!=null?_input.getText(((LogicalContext)_localctx).identifier.start,((LogicalContext)_localctx).identifier.stop):null);
				}
				break;
			case NUMBER:
				{
				setState(249);
				((LogicalContext)_localctx).number = number();
				_localctx.text += (((LogicalContext)_localctx).number!=null?_input.getText(((LogicalContext)_localctx).number.start,((LogicalContext)_localctx).number.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalSignContext extends ParserRuleContext {
		public String text;
		public LogicalSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterLogicalSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitLogicalSign(this);
		}
	}

	public final LogicalSignContext logicalSign() throws RecognitionException {
		LogicalSignContext _localctx = new LogicalSignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalSign);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__0);
				((LogicalSignContext)_localctx).text =  ">";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__1);
				((LogicalSignContext)_localctx).text =  "<";
				}
				break;
			case EQUALITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(EQUALITY);
				((LogicalSignContext)_localctx).text =  "==";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PasGrammarParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PasGrammarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PasGrammarListener ) ((PasGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6"+
		"U\13\6\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0086"+
		"\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\6\f\u00af\n\f"+
		"\r\f\16\f\u00b0\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00c0\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00cc\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16"+
		"\16\u00d6\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00e5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00f5\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0107\n"+
		"\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\2\2\u0116\2+\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\bF\3\2\2\2"+
		"\nK\3\2\2\2\fV\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22\u0082\3\2\2\2\24\u0092"+
		"\3\2\2\2\26\u009a\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00db\3"+
		"\2\2\2\36\u00e4\3\2\2\2 \u00e6\3\2\2\2\"\u00f4\3\2\2\2$\u0106\3\2\2\2"+
		"&\u0108\3\2\2\2(\u010a\3\2\2\2*,\5\4\3\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2"+
		"-.\b\2\1\2./\5\6\4\2/\60\b\2\1\2\60\61\5\f\7\2\61\62\b\2\1\2\62\3\3\2"+
		"\2\2\63\64\7\32\2\2\64\65\5&\24\2\65\66\7\16\2\2\66\5\3\2\2\2\678\7\33"+
		"\2\289\5\b\5\29@\b\4\1\2:;\7\16\2\2;<\5\b\5\2<=\b\4\1\2=?\3\2\2\2>:\3"+
		"\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\16\2\2DE"+
		"\b\4\1\2E\7\3\2\2\2FG\5\n\6\2GH\7\17\2\2HI\5\30\r\2IJ\b\5\1\2J\t\3\2\2"+
		"\2KL\5&\24\2LS\b\6\1\2MN\7\20\2\2NO\5&\24\2OP\b\6\1\2PR\3\2\2\2QM\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2\2US\3\2\2\2VW\7\34\2\2W]"+
		"\b\7\1\2XY\5\16\b\2YZ\b\7\1\2Z\\\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\35\2\2ab\7\21\2\2b\r\3\2\2\2cd\5"+
		"\20\t\2de\b\b\1\2ep\3\2\2\2fg\5\22\n\2gh\b\b\1\2hp\3\2\2\2ij\5\32\16\2"+
		"jk\b\b\1\2kp\3\2\2\2lm\5 \21\2mn\b\b\1\2np\3\2\2\2oc\3\2\2\2of\3\2\2\2"+
		"oi\3\2\2\2ol\3\2\2\2p\17\3\2\2\2qr\5&\24\2rs\b\t\1\2s}\7\25\2\2tu\5&\24"+
		"\2uv\b\t\1\2v~\3\2\2\2wx\5(\25\2xy\b\t\1\2y~\3\2\2\2z{\5\26\f\2{|\b\t"+
		"\1\2|~\3\2\2\2}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177\u0080\7"+
		"\16\2\2\u0080\u0081\b\t\1\2\u0081\21\3\2\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0085\7\22\2\2\u0084\u0086\5\n\6\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\23\2\2\u0088\u0089\7\16\2\2\u0089"+
		"\23\3\2\2\2\u008a\u008b\7&\2\2\u008b\u0093\b\13\1\2\u008c\u008d\7\'\2"+
		"\2\u008d\u0093\b\13\1\2\u008e\u008f\7(\2\2\u008f\u0093\b\13\1\2\u0090"+
		"\u0091\7)\2\2\u0091\u0093\b\13\1\2\u0092\u008a\3\2\2\2\u0092\u008c\3\2"+
		"\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095"+
		"\5&\24\2\u0095\u0096\b\f\1\2\u0096\u009b\3\2\2\2\u0097\u0098\5(\25\2\u0098"+
		"\u0099\b\f\1\2\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2"+
		"\2\2\u009b\u00ae\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u00a5\b\f\1\2\u009e"+
		"\u009f\7\27\2\2\u009f\u00a5\b\f\1\2\u00a0\u00a1\7\30\2\2\u00a1\u00a5\b"+
		"\f\1\2\u00a2\u00a3\7\31\2\2\u00a3\u00a5\b\f\1\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00ac\3\2"+
		"\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\b\f\1\2\u00a8\u00ad\3\2\2\2\u00a9"+
		"\u00aa\5(\25\2\u00aa\u00ab\b\f\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3\2"+
		"\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a4\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\27\3\2\2"+
		"\2\u00b2\u00b3\7 \2\2\u00b3\u00b9\b\r\1\2\u00b4\u00b5\7!\2\2\u00b5\u00b9"+
		"\b\r\1\2\u00b6\u00b7\7#\2\2\u00b7\u00b9\b\r\1\2\u00b8\u00b2\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\13\2"+
		"\2\u00bb\u00bf\b\16\1\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\b\16\1\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\23\2\2\u00c4"+
		"\u00c5\b\16\1\2\u00c5\u00d4\3\2\2\2\u00c6\u00c7\5\36\20\2\u00c7\u00cb"+
		"\b\16\1\2\u00c8\u00c9\5\34\17\2\u00c9\u00ca\b\16\1\2\u00ca\u00cc\3\2\2"+
		"\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\7\22\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\b\16\1"+
		"\2\u00d1\u00d3\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\7\f\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00da\b\16\1\2\u00da\33\3\2"+
		"\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\b\17\1\2\u00dd\35\3\2\2\2\u00de\u00df"+
		"\7\6\2\2\u00df\u00e5\b\20\1\2\u00e0\u00e1\7\b\2\2\u00e1\u00e5\b\20\1\2"+
		"\u00e2\u00e3\7\7\2\2\u00e3\u00e5\b\20\1\2\u00e4\u00de\3\2\2\2\u00e4\u00e0"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\37\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7"+
		"\u00e8\7\22\2\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb"+
		"\7\t\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed\b\21\1\2\u00ed!\3\2\2\2\u00ee"+
		"\u00ef\5&\24\2\u00ef\u00f0\b\22\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2\5"+
		"(\25\2\u00f2\u00f3\b\22\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5$\23\2\u00f7\u00fe\b\22"+
		"\1\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\b\22\1\2\u00fa\u00ff\3\2\2\2\u00fb"+
		"\u00fc\5(\25\2\u00fc\u00fd\b\22\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3"+
		"\2\2\2\u00fe\u00fb\3\2\2\2\u00ff#\3\2\2\2\u0100\u0101\7\3\2\2\u0101\u0107"+
		"\b\23\1\2\u0102\u0103\7\4\2\2\u0103\u0107\b\23\1\2\u0104\u0105\7\24\2"+
		"\2\u0105\u0107\b\23\1\2\u0106\u0100\3\2\2\2\u0106\u0102\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\7*\2\2\u0109\'\3\2\2\2\u010a"+
		"\u010b\7+\2\2\u010b)\3\2\2\2\26+@S]o}\u0085\u0092\u009a\u00a4\u00ac\u00b0"+
		"\u00b8\u00bf\u00cb\u00d4\u00e4\u00f4\u00fe\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}