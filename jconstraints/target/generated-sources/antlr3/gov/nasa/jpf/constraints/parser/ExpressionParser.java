// $ANTLR 3.5.2 gov/nasa/jpf/constraints/parser/Expression.g 2019-06-17 15:44:31

package gov.nasa.jpf.constraints.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BIGDECIMAL_LITERAL", "BIGINT_LITERAL", 
		"BVAND", "BVNEG", "BVOR", "BVSHL", "BVSHR", "BVSHUR", "BVXOR", "BYTE_LITERAL", 
		"COLON", "COMMA", "DECIMAL", "DECLARE", "DIGIT", "DIV", "DOUBLE_LITERAL", 
		"EQ", "EXISTS", "EXPONENT", "FALSE", "FLOAT_LITERAL", "FORALL", "GE", 
		"GT", "ID", "IN", "INTEGER", "INT_LITERAL", "LAND", "LE", "LEQ", "LIMP", 
		"LNOT", "LONG_LITERAL", "LOR", "LPAREN", "LT", "LXOR", "MUL", "NE", "NZDIGIT", 
		"QID", "QUOTE", "REAL", "REM", "ROOT", "RPAREN", "SHORT_LITERAL", "SPACE", 
		"SUB", "TRUE", "TYPED_VAR", "TYPED_VAR_LIST", "TYPE_CAST", "UNARY_MINUS", 
		"UNARY_PLUS", "WS"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int BIGDECIMAL_LITERAL=5;
	public static final int BIGINT_LITERAL=6;
	public static final int BVAND=7;
	public static final int BVNEG=8;
	public static final int BVOR=9;
	public static final int BVSHL=10;
	public static final int BVSHR=11;
	public static final int BVSHUR=12;
	public static final int BVXOR=13;
	public static final int BYTE_LITERAL=14;
	public static final int COLON=15;
	public static final int COMMA=16;
	public static final int DECIMAL=17;
	public static final int DECLARE=18;
	public static final int DIGIT=19;
	public static final int DIV=20;
	public static final int DOUBLE_LITERAL=21;
	public static final int EQ=22;
	public static final int EXISTS=23;
	public static final int EXPONENT=24;
	public static final int FALSE=25;
	public static final int FLOAT_LITERAL=26;
	public static final int FORALL=27;
	public static final int GE=28;
	public static final int GT=29;
	public static final int ID=30;
	public static final int IN=31;
	public static final int INTEGER=32;
	public static final int INT_LITERAL=33;
	public static final int LAND=34;
	public static final int LE=35;
	public static final int LEQ=36;
	public static final int LIMP=37;
	public static final int LNOT=38;
	public static final int LONG_LITERAL=39;
	public static final int LOR=40;
	public static final int LPAREN=41;
	public static final int LT=42;
	public static final int LXOR=43;
	public static final int MUL=44;
	public static final int NE=45;
	public static final int NZDIGIT=46;
	public static final int QID=47;
	public static final int QUOTE=48;
	public static final int REAL=49;
	public static final int REM=50;
	public static final int ROOT=51;
	public static final int RPAREN=52;
	public static final int SHORT_LITERAL=53;
	public static final int SPACE=54;
	public static final int SUB=55;
	public static final int TRUE=56;
	public static final int TYPED_VAR=57;
	public static final int TYPED_VAR_LIST=58;
	public static final int TYPE_CAST=59;
	public static final int UNARY_MINUS=60;
	public static final int UNARY_PLUS=61;
	public static final int WS=62;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "gov/nasa/jpf/constraints/parser/Expression.g"; }


	public static class start_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start"
	// gov/nasa/jpf/constraints/parser/Expression.g:29:1: start : root_lexpression EOF !;
	public final ExpressionParser.start_return start() throws RecognitionException {
		ExpressionParser.start_return retval = new ExpressionParser.start_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope root_lexpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:30:2: ( root_lexpression EOF !)
			// gov/nasa/jpf/constraints/parser/Expression.g:30:4: root_lexpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_root_lexpression_in_start87);
			root_lexpression1=root_lexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, root_lexpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class start_aexpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start_aexpression"
	// gov/nasa/jpf/constraints/parser/Expression.g:32:1: start_aexpression : root_aexpression EOF !;
	public final ExpressionParser.start_aexpression_return start_aexpression() throws RecognitionException {
		ExpressionParser.start_aexpression_return retval = new ExpressionParser.start_aexpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF4=null;
		ParserRuleReturnScope root_aexpression3 =null;

		CommonTree EOF4_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:33:2: ( root_aexpression EOF !)
			// gov/nasa/jpf/constraints/parser/Expression.g:33:4: root_aexpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_root_aexpression_in_start_aexpression99);
			root_aexpression3=root_aexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, root_aexpression3.getTree());

			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_start_aexpression101); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start_aexpression"


	public static class start_variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "start_variable"
	// gov/nasa/jpf/constraints/parser/Expression.g:35:1: start_variable : root_variable EOF !;
	public final ExpressionParser.start_variable_return start_variable() throws RecognitionException {
		ExpressionParser.start_variable_return retval = new ExpressionParser.start_variable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF6=null;
		ParserRuleReturnScope root_variable5 =null;

		CommonTree EOF6_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:36:2: ( root_variable EOF !)
			// gov/nasa/jpf/constraints/parser/Expression.g:36:4: root_variable EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_root_variable_in_start_variable111);
			root_variable5=root_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, root_variable5.getTree());

			EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_start_variable113); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start_variable"


	public static class root_lexpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "root_lexpression"
	// gov/nasa/jpf/constraints/parser/Expression.g:38:1: root_lexpression : ( declare_stmt )? lexpression -> ^( ROOT ( declare_stmt )? lexpression ) ;
	public final ExpressionParser.root_lexpression_return root_lexpression() throws RecognitionException {
		ExpressionParser.root_lexpression_return retval = new ExpressionParser.root_lexpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declare_stmt7 =null;
		ParserRuleReturnScope lexpression8 =null;

		RewriteRuleSubtreeStream stream_lexpression=new RewriteRuleSubtreeStream(adaptor,"rule lexpression");
		RewriteRuleSubtreeStream stream_declare_stmt=new RewriteRuleSubtreeStream(adaptor,"rule declare_stmt");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:39:2: ( ( declare_stmt )? lexpression -> ^( ROOT ( declare_stmt )? lexpression ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:39:4: ( declare_stmt )? lexpression
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:39:4: ( declare_stmt )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DECLARE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:39:4: declare_stmt
					{
					pushFollow(FOLLOW_declare_stmt_in_root_lexpression124);
					declare_stmt7=declare_stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declare_stmt.add(declare_stmt7.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_lexpression_in_root_lexpression127);
			lexpression8=lexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpression.add(lexpression8.getTree());
			// AST REWRITE
			// elements: declare_stmt, lexpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 39:30: -> ^( ROOT ( declare_stmt )? lexpression )
			{
				// gov/nasa/jpf/constraints/parser/Expression.g:39:33: ^( ROOT ( declare_stmt )? lexpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROOT, "ROOT"), root_1);
				// gov/nasa/jpf/constraints/parser/Expression.g:39:40: ( declare_stmt )?
				if ( stream_declare_stmt.hasNext() ) {
					adaptor.addChild(root_1, stream_declare_stmt.nextTree());
				}
				stream_declare_stmt.reset();

				adaptor.addChild(root_1, stream_lexpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "root_lexpression"


	public static class root_aexpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "root_aexpression"
	// gov/nasa/jpf/constraints/parser/Expression.g:42:1: root_aexpression : ( declare_stmt )? aexpression -> ^( ROOT ( declare_stmt )? aexpression ) ;
	public final ExpressionParser.root_aexpression_return root_aexpression() throws RecognitionException {
		ExpressionParser.root_aexpression_return retval = new ExpressionParser.root_aexpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declare_stmt9 =null;
		ParserRuleReturnScope aexpression10 =null;

		RewriteRuleSubtreeStream stream_declare_stmt=new RewriteRuleSubtreeStream(adaptor,"rule declare_stmt");
		RewriteRuleSubtreeStream stream_aexpression=new RewriteRuleSubtreeStream(adaptor,"rule aexpression");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:43:2: ( ( declare_stmt )? aexpression -> ^( ROOT ( declare_stmt )? aexpression ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:43:4: ( declare_stmt )? aexpression
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:43:4: ( declare_stmt )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==DECLARE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:43:4: declare_stmt
					{
					pushFollow(FOLLOW_declare_stmt_in_root_aexpression150);
					declare_stmt9=declare_stmt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declare_stmt.add(declare_stmt9.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_aexpression_in_root_aexpression153);
			aexpression10=aexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_aexpression.add(aexpression10.getTree());
			// AST REWRITE
			// elements: declare_stmt, aexpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 43:30: -> ^( ROOT ( declare_stmt )? aexpression )
			{
				// gov/nasa/jpf/constraints/parser/Expression.g:43:33: ^( ROOT ( declare_stmt )? aexpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROOT, "ROOT"), root_1);
				// gov/nasa/jpf/constraints/parser/Expression.g:43:40: ( declare_stmt )?
				if ( stream_declare_stmt.hasNext() ) {
					adaptor.addChild(root_1, stream_declare_stmt.nextTree());
				}
				stream_declare_stmt.reset();

				adaptor.addChild(root_1, stream_aexpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "root_aexpression"


	public static class root_variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "root_variable"
	// gov/nasa/jpf/constraints/parser/Expression.g:46:1: root_variable : typed_var -> ^( ROOT typed_var ) ;
	public final ExpressionParser.root_variable_return root_variable() throws RecognitionException {
		ExpressionParser.root_variable_return retval = new ExpressionParser.root_variable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope typed_var11 =null;

		RewriteRuleSubtreeStream stream_typed_var=new RewriteRuleSubtreeStream(adaptor,"rule typed_var");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:47:2: ( typed_var -> ^( ROOT typed_var ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:47:4: typed_var
			{
			pushFollow(FOLLOW_typed_var_in_root_variable175);
			typed_var11=typed_var();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typed_var.add(typed_var11.getTree());
			// AST REWRITE
			// elements: typed_var
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 47:14: -> ^( ROOT typed_var )
			{
				// gov/nasa/jpf/constraints/parser/Expression.g:47:17: ^( ROOT typed_var )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROOT, "ROOT"), root_1);
				adaptor.addChild(root_1, stream_typed_var.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "root_variable"


	public static class declare_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declare_stmt"
	// gov/nasa/jpf/constraints/parser/Expression.g:50:1: declare_stmt : DECLARE ! typed_var_list IN !;
	public final ExpressionParser.declare_stmt_return declare_stmt() throws RecognitionException {
		ExpressionParser.declare_stmt_return retval = new ExpressionParser.declare_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DECLARE12=null;
		Token IN14=null;
		ParserRuleReturnScope typed_var_list13 =null;

		CommonTree DECLARE12_tree=null;
		CommonTree IN14_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:51:2: ( DECLARE ! typed_var_list IN !)
			// gov/nasa/jpf/constraints/parser/Expression.g:51:4: DECLARE ! typed_var_list IN !
			{
			root_0 = (CommonTree)adaptor.nil();


			DECLARE12=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declare_stmt194); if (state.failed) return retval;
			pushFollow(FOLLOW_typed_var_list_in_declare_stmt197);
			typed_var_list13=typed_var_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typed_var_list13.getTree());

			IN14=(Token)match(input,IN,FOLLOW_IN_in_declare_stmt199); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declare_stmt"


	public static class lexpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpression"
	// gov/nasa/jpf/constraints/parser/Expression.g:54:1: lexpression : lexpr_quantifier ;
	public final ExpressionParser.lexpression_return lexpression() throws RecognitionException {
		ExpressionParser.lexpression_return retval = new ExpressionParser.lexpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope lexpr_quantifier15 =null;


		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:55:5: ( lexpr_quantifier )
			// gov/nasa/jpf/constraints/parser/Expression.g:55:7: lexpr_quantifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_lexpr_quantifier_in_lexpression215);
			lexpr_quantifier15=lexpr_quantifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_quantifier15.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpression"


	public static class lexpr_quantifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_quantifier"
	// gov/nasa/jpf/constraints/parser/Expression.g:59:1: lexpr_quantifier : ( ( FORALL | EXISTS ) ^ LPAREN ! typed_var_list RPAREN ! COLON ! lexpr_quantifier | lexpr_cmp );
	public final ExpressionParser.lexpr_quantifier_return lexpr_quantifier() throws RecognitionException {
		ExpressionParser.lexpr_quantifier_return retval = new ExpressionParser.lexpr_quantifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		Token LPAREN17=null;
		Token RPAREN19=null;
		Token COLON20=null;
		ParserRuleReturnScope typed_var_list18 =null;
		ParserRuleReturnScope lexpr_quantifier21 =null;
		ParserRuleReturnScope lexpr_cmp22 =null;

		CommonTree set16_tree=null;
		CommonTree LPAREN17_tree=null;
		CommonTree RPAREN19_tree=null;
		CommonTree COLON20_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:60:2: ( ( FORALL | EXISTS ) ^ LPAREN ! typed_var_list RPAREN ! COLON ! lexpr_quantifier | lexpr_cmp )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==EXISTS||LA3_0==FORALL) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= ADD && LA3_0 <= BIGINT_LITERAL)||LA3_0==BVNEG||LA3_0==BYTE_LITERAL||LA3_0==DOUBLE_LITERAL||(LA3_0 >= FALSE && LA3_0 <= FLOAT_LITERAL)||LA3_0==ID||LA3_0==INT_LITERAL||(LA3_0 >= LNOT && LA3_0 <= LONG_LITERAL)||LA3_0==LPAREN||LA3_0==QID||LA3_0==SHORT_LITERAL||(LA3_0 >= SUB && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:60:4: ( FORALL | EXISTS ) ^ LPAREN ! typed_var_list RPAREN ! COLON ! lexpr_quantifier
					{
					root_0 = (CommonTree)adaptor.nil();


					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==EXISTS||input.LA(1)==FORALL ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lexpr_quantifier240); if (state.failed) return retval;
					pushFollow(FOLLOW_typed_var_list_in_lexpr_quantifier243);
					typed_var_list18=typed_var_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typed_var_list18.getTree());

					RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lexpr_quantifier245); if (state.failed) return retval;
					COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_lexpr_quantifier248); if (state.failed) return retval;
					pushFollow(FOLLOW_lexpr_quantifier_in_lexpr_quantifier251);
					lexpr_quantifier21=lexpr_quantifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_quantifier21.getTree());

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:61:4: lexpr_cmp
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_lexpr_cmp_in_lexpr_quantifier256);
					lexpr_cmp22=lexpr_cmp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_cmp22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_quantifier"


	public static class lexpr_cmp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_cmp"
	// gov/nasa/jpf/constraints/parser/Expression.g:64:1: lexpr_cmp : lexpr_or ( ( LIMP | LEQ ) ^ lexpr_or )* ;
	public final ExpressionParser.lexpr_cmp_return lexpr_cmp() throws RecognitionException {
		ExpressionParser.lexpr_cmp_return retval = new ExpressionParser.lexpr_cmp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set24=null;
		ParserRuleReturnScope lexpr_or23 =null;
		ParserRuleReturnScope lexpr_or25 =null;

		CommonTree set24_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:64:10: ( lexpr_or ( ( LIMP | LEQ ) ^ lexpr_or )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:65:2: lexpr_or ( ( LIMP | LEQ ) ^ lexpr_or )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_lexpr_or_in_lexpr_cmp267);
			lexpr_or23=lexpr_or();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_or23.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:65:11: ( ( LIMP | LEQ ) ^ lexpr_or )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= LEQ && LA4_0 <= LIMP)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:65:12: ( LIMP | LEQ ) ^ lexpr_or
					{
					set24=input.LT(1);
					set24=input.LT(1);
					if ( (input.LA(1) >= LEQ && input.LA(1) <= LIMP) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set24), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_lexpr_or_in_lexpr_cmp277);
					lexpr_or25=lexpr_or();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_or25.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_cmp"


	public static class lexpr_or_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_or"
	// gov/nasa/jpf/constraints/parser/Expression.g:68:1: lexpr_or : lexpr_and ( LOR ^ lexpr_and )* ;
	public final ExpressionParser.lexpr_or_return lexpr_or() throws RecognitionException {
		ExpressionParser.lexpr_or_return retval = new ExpressionParser.lexpr_or_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LOR27=null;
		ParserRuleReturnScope lexpr_and26 =null;
		ParserRuleReturnScope lexpr_and28 =null;

		CommonTree LOR27_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:69:2: ( lexpr_and ( LOR ^ lexpr_and )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:69:4: lexpr_and ( LOR ^ lexpr_and )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_lexpr_and_in_lexpr_or291);
			lexpr_and26=lexpr_and();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_and26.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:69:14: ( LOR ^ lexpr_and )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==LOR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:69:15: LOR ^ lexpr_and
					{
					LOR27=(Token)match(input,LOR,FOLLOW_LOR_in_lexpr_or294); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LOR27_tree = (CommonTree)adaptor.create(LOR27);
					root_0 = (CommonTree)adaptor.becomeRoot(LOR27_tree, root_0);
					}

					pushFollow(FOLLOW_lexpr_and_in_lexpr_or297);
					lexpr_and28=lexpr_and();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_and28.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_or"


	public static class lexpr_and_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_and"
	// gov/nasa/jpf/constraints/parser/Expression.g:72:1: lexpr_and : lexpr_xor ( LAND ^ lexpr_xor )* ;
	public final ExpressionParser.lexpr_and_return lexpr_and() throws RecognitionException {
		ExpressionParser.lexpr_and_return retval = new ExpressionParser.lexpr_and_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LAND30=null;
		ParserRuleReturnScope lexpr_xor29 =null;
		ParserRuleReturnScope lexpr_xor31 =null;

		CommonTree LAND30_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:73:2: ( lexpr_xor ( LAND ^ lexpr_xor )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:73:4: lexpr_xor ( LAND ^ lexpr_xor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_lexpr_xor_in_lexpr_and311);
			lexpr_xor29=lexpr_xor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_xor29.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:73:14: ( LAND ^ lexpr_xor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==LAND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:73:15: LAND ^ lexpr_xor
					{
					LAND30=(Token)match(input,LAND,FOLLOW_LAND_in_lexpr_and314); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LAND30_tree = (CommonTree)adaptor.create(LAND30);
					root_0 = (CommonTree)adaptor.becomeRoot(LAND30_tree, root_0);
					}

					pushFollow(FOLLOW_lexpr_xor_in_lexpr_and317);
					lexpr_xor31=lexpr_xor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_xor31.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_and"


	public static class lexpr_xor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_xor"
	// gov/nasa/jpf/constraints/parser/Expression.g:76:1: lexpr_xor : lexpr_unary ( LXOR ^ lexpr_unary )* ;
	public final ExpressionParser.lexpr_xor_return lexpr_xor() throws RecognitionException {
		ExpressionParser.lexpr_xor_return retval = new ExpressionParser.lexpr_xor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LXOR33=null;
		ParserRuleReturnScope lexpr_unary32 =null;
		ParserRuleReturnScope lexpr_unary34 =null;

		CommonTree LXOR33_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:77:2: ( lexpr_unary ( LXOR ^ lexpr_unary )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:77:4: lexpr_unary ( LXOR ^ lexpr_unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_lexpr_unary_in_lexpr_xor331);
			lexpr_unary32=lexpr_unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_unary32.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:77:16: ( LXOR ^ lexpr_unary )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LXOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:77:17: LXOR ^ lexpr_unary
					{
					LXOR33=(Token)match(input,LXOR,FOLLOW_LXOR_in_lexpr_xor334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LXOR33_tree = (CommonTree)adaptor.create(LXOR33);
					root_0 = (CommonTree)adaptor.becomeRoot(LXOR33_tree, root_0);
					}

					pushFollow(FOLLOW_lexpr_unary_in_lexpr_xor337);
					lexpr_unary34=lexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_unary34.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_xor"


	public static class lexpr_unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_unary"
	// gov/nasa/jpf/constraints/parser/Expression.g:80:1: lexpr_unary : ( LNOT ^ lexpr_unary | lexpr_atomic );
	public final ExpressionParser.lexpr_unary_return lexpr_unary() throws RecognitionException {
		ExpressionParser.lexpr_unary_return retval = new ExpressionParser.lexpr_unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LNOT35=null;
		ParserRuleReturnScope lexpr_unary36 =null;
		ParserRuleReturnScope lexpr_atomic37 =null;

		CommonTree LNOT35_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:81:2: ( LNOT ^ lexpr_unary | lexpr_atomic )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==LNOT) ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= ADD && LA8_0 <= BIGINT_LITERAL)||LA8_0==BVNEG||LA8_0==BYTE_LITERAL||LA8_0==DOUBLE_LITERAL||(LA8_0 >= FALSE && LA8_0 <= FLOAT_LITERAL)||LA8_0==ID||LA8_0==INT_LITERAL||LA8_0==LONG_LITERAL||LA8_0==LPAREN||LA8_0==QID||LA8_0==SHORT_LITERAL||(LA8_0 >= SUB && LA8_0 <= TRUE)) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:81:4: LNOT ^ lexpr_unary
					{
					root_0 = (CommonTree)adaptor.nil();


					LNOT35=(Token)match(input,LNOT,FOLLOW_LNOT_in_lexpr_unary351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LNOT35_tree = (CommonTree)adaptor.create(LNOT35);
					root_0 = (CommonTree)adaptor.becomeRoot(LNOT35_tree, root_0);
					}

					pushFollow(FOLLOW_lexpr_unary_in_lexpr_unary354);
					lexpr_unary36=lexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_unary36.getTree());

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:82:4: lexpr_atomic
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_lexpr_atomic_in_lexpr_unary359);
					lexpr_atomic37=lexpr_atomic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpr_atomic37.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_unary"


	public static class lexpr_atomic_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lexpr_atomic"
	// gov/nasa/jpf/constraints/parser/Expression.g:84:1: lexpr_atomic : ( ( TRUE | FALSE ) ^| aexpression ( ( EQ | NE | LE | LT | GE | GT ) ^ aexpression )? );
	public final ExpressionParser.lexpr_atomic_return lexpr_atomic() throws RecognitionException {
		ExpressionParser.lexpr_atomic_return retval = new ExpressionParser.lexpr_atomic_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set38=null;
		Token set40=null;
		ParserRuleReturnScope aexpression39 =null;
		ParserRuleReturnScope aexpression41 =null;

		CommonTree set38_tree=null;
		CommonTree set40_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:85:2: ( ( TRUE | FALSE ) ^| aexpression ( ( EQ | NE | LE | LT | GE | GT ) ^ aexpression )? )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FALSE||LA10_0==TRUE) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= ADD && LA10_0 <= BIGINT_LITERAL)||LA10_0==BVNEG||LA10_0==BYTE_LITERAL||LA10_0==DOUBLE_LITERAL||LA10_0==FLOAT_LITERAL||LA10_0==ID||LA10_0==INT_LITERAL||LA10_0==LONG_LITERAL||LA10_0==LPAREN||LA10_0==QID||LA10_0==SHORT_LITERAL||LA10_0==SUB) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:85:4: ( TRUE | FALSE ) ^
					{
					root_0 = (CommonTree)adaptor.nil();


					set38=input.LT(1);
					set38=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set38), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:86:4: aexpression ( ( EQ | NE | LE | LT | GE | GT ) ^ aexpression )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_aexpression_in_lexpr_atomic379);
					aexpression39=aexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpression39.getTree());

					// gov/nasa/jpf/constraints/parser/Expression.g:86:16: ( ( EQ | NE | LE | LT | GE | GT ) ^ aexpression )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EQ||(LA9_0 >= GE && LA9_0 <= GT)||LA9_0==LE||LA9_0==LT||LA9_0==NE) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// gov/nasa/jpf/constraints/parser/Expression.g:86:17: ( EQ | NE | LE | LT | GE | GT ) ^ aexpression
							{
							set40=input.LT(1);
							set40=input.LT(1);
							if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
								input.consume();
								if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set40), root_0);
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_aexpression_in_lexpr_atomic397);
							aexpression41=aexpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpression41.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr_atomic"


	public static class aexpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpression"
	// gov/nasa/jpf/constraints/parser/Expression.g:89:1: aexpression : aexpr_bvor ;
	public final ExpressionParser.aexpression_return aexpression() throws RecognitionException {
		ExpressionParser.aexpression_return retval = new ExpressionParser.aexpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope aexpr_bvor42 =null;


		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:90:2: ( aexpr_bvor )
			// gov/nasa/jpf/constraints/parser/Expression.g:90:4: aexpr_bvor
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_bvor_in_aexpression411);
			aexpr_bvor42=aexpr_bvor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvor42.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpression"


	public static class aexpr_bvor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_bvor"
	// gov/nasa/jpf/constraints/parser/Expression.g:92:1: aexpr_bvor : aexpr_bvxor ( BVOR ^ aexpr_bvxor )* ;
	public final ExpressionParser.aexpr_bvor_return aexpr_bvor() throws RecognitionException {
		ExpressionParser.aexpr_bvor_return retval = new ExpressionParser.aexpr_bvor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BVOR44=null;
		ParserRuleReturnScope aexpr_bvxor43 =null;
		ParserRuleReturnScope aexpr_bvxor45 =null;

		CommonTree BVOR44_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:93:2: ( aexpr_bvxor ( BVOR ^ aexpr_bvxor )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:93:4: aexpr_bvxor ( BVOR ^ aexpr_bvxor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_bvxor_in_aexpr_bvor421);
			aexpr_bvxor43=aexpr_bvxor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvxor43.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:93:16: ( BVOR ^ aexpr_bvxor )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==BVOR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:93:17: BVOR ^ aexpr_bvxor
					{
					BVOR44=(Token)match(input,BVOR,FOLLOW_BVOR_in_aexpr_bvor424); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BVOR44_tree = (CommonTree)adaptor.create(BVOR44);
					root_0 = (CommonTree)adaptor.becomeRoot(BVOR44_tree, root_0);
					}

					pushFollow(FOLLOW_aexpr_bvxor_in_aexpr_bvor427);
					aexpr_bvxor45=aexpr_bvxor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvxor45.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_bvor"


	public static class aexpr_bvxor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_bvxor"
	// gov/nasa/jpf/constraints/parser/Expression.g:96:1: aexpr_bvxor : ( aexpr_bvand ( LXOR aexpr_bvand )+ -> ^( BVXOR ( aexpr_bvand )* ) | aexpr_bvand );
	public final ExpressionParser.aexpr_bvxor_return aexpr_bvxor() throws RecognitionException {
		ExpressionParser.aexpr_bvxor_return retval = new ExpressionParser.aexpr_bvxor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LXOR47=null;
		ParserRuleReturnScope aexpr_bvand46 =null;
		ParserRuleReturnScope aexpr_bvand48 =null;
		ParserRuleReturnScope aexpr_bvand49 =null;

		CommonTree LXOR47_tree=null;
		RewriteRuleTokenStream stream_LXOR=new RewriteRuleTokenStream(adaptor,"token LXOR");
		RewriteRuleSubtreeStream stream_aexpr_bvand=new RewriteRuleSubtreeStream(adaptor,"rule aexpr_bvand");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:97:2: ( aexpr_bvand ( LXOR aexpr_bvand )+ -> ^( BVXOR ( aexpr_bvand )* ) | aexpr_bvand )
			int alt13=2;
			switch ( input.LA(1) ) {
			case SUB:
				{
				int LA13_1 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case ADD:
				{
				int LA13_2 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case BVNEG:
				{
				int LA13_3 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA13_4 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case BIGDECIMAL_LITERAL:
			case BIGINT_LITERAL:
			case BYTE_LITERAL:
			case DOUBLE_LITERAL:
			case FLOAT_LITERAL:
			case INT_LITERAL:
			case LONG_LITERAL:
			case SHORT_LITERAL:
				{
				int LA13_5 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case ID:
				{
				int LA13_6 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case QID:
				{
				int LA13_7 = input.LA(2);
				if ( (synpred21_Expression()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:97:4: aexpr_bvand ( LXOR aexpr_bvand )+
					{
					pushFollow(FOLLOW_aexpr_bvand_in_aexpr_bvxor440);
					aexpr_bvand46=aexpr_bvand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aexpr_bvand.add(aexpr_bvand46.getTree());
					// gov/nasa/jpf/constraints/parser/Expression.g:97:16: ( LXOR aexpr_bvand )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==LXOR) ) {
							int LA12_4 = input.LA(2);
							if ( (synpred20_Expression()) ) {
								alt12=1;
							}

						}

						switch (alt12) {
						case 1 :
							// gov/nasa/jpf/constraints/parser/Expression.g:97:17: LXOR aexpr_bvand
							{
							LXOR47=(Token)match(input,LXOR,FOLLOW_LXOR_in_aexpr_bvxor443); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LXOR.add(LXOR47);

							pushFollow(FOLLOW_aexpr_bvand_in_aexpr_bvxor445);
							aexpr_bvand48=aexpr_bvand();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_aexpr_bvand.add(aexpr_bvand48.getTree());
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// AST REWRITE
					// elements: aexpr_bvand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 97:36: -> ^( BVXOR ( aexpr_bvand )* )
					{
						// gov/nasa/jpf/constraints/parser/Expression.g:97:39: ^( BVXOR ( aexpr_bvand )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BVXOR, "BVXOR"), root_1);
						// gov/nasa/jpf/constraints/parser/Expression.g:97:47: ( aexpr_bvand )*
						while ( stream_aexpr_bvand.hasNext() ) {
							adaptor.addChild(root_1, stream_aexpr_bvand.nextTree());
						}
						stream_aexpr_bvand.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:98:4: aexpr_bvand
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_aexpr_bvand_in_aexpr_bvxor461);
					aexpr_bvand49=aexpr_bvand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvand49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_bvxor"


	public static class aexpr_bvand_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_bvand"
	// gov/nasa/jpf/constraints/parser/Expression.g:101:1: aexpr_bvand : aexpr_bvshift ( BVAND ^ aexpr_bvshift )* ;
	public final ExpressionParser.aexpr_bvand_return aexpr_bvand() throws RecognitionException {
		ExpressionParser.aexpr_bvand_return retval = new ExpressionParser.aexpr_bvand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BVAND51=null;
		ParserRuleReturnScope aexpr_bvshift50 =null;
		ParserRuleReturnScope aexpr_bvshift52 =null;

		CommonTree BVAND51_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:102:2: ( aexpr_bvshift ( BVAND ^ aexpr_bvshift )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:102:4: aexpr_bvshift ( BVAND ^ aexpr_bvshift )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_bvshift_in_aexpr_bvand473);
			aexpr_bvshift50=aexpr_bvshift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvshift50.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:102:18: ( BVAND ^ aexpr_bvshift )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==BVAND) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:102:19: BVAND ^ aexpr_bvshift
					{
					BVAND51=(Token)match(input,BVAND,FOLLOW_BVAND_in_aexpr_bvand476); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BVAND51_tree = (CommonTree)adaptor.create(BVAND51);
					root_0 = (CommonTree)adaptor.becomeRoot(BVAND51_tree, root_0);
					}

					pushFollow(FOLLOW_aexpr_bvshift_in_aexpr_bvand479);
					aexpr_bvshift52=aexpr_bvshift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_bvshift52.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_bvand"


	public static class aexpr_bvshift_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_bvshift"
	// gov/nasa/jpf/constraints/parser/Expression.g:105:1: aexpr_bvshift : aexpr_add ( ( BVSHL | BVSHR | BVSHUR ) ^ aexpr_add )* ;
	public final ExpressionParser.aexpr_bvshift_return aexpr_bvshift() throws RecognitionException {
		ExpressionParser.aexpr_bvshift_return retval = new ExpressionParser.aexpr_bvshift_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set54=null;
		ParserRuleReturnScope aexpr_add53 =null;
		ParserRuleReturnScope aexpr_add55 =null;

		CommonTree set54_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:106:2: ( aexpr_add ( ( BVSHL | BVSHR | BVSHUR ) ^ aexpr_add )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:106:4: aexpr_add ( ( BVSHL | BVSHR | BVSHUR ) ^ aexpr_add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_add_in_aexpr_bvshift493);
			aexpr_add53=aexpr_add();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_add53.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:106:14: ( ( BVSHL | BVSHR | BVSHUR ) ^ aexpr_add )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= BVSHL && LA15_0 <= BVSHUR)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:106:15: ( BVSHL | BVSHR | BVSHUR ) ^ aexpr_add
					{
					set54=input.LT(1);
					set54=input.LT(1);
					if ( (input.LA(1) >= BVSHL && input.LA(1) <= BVSHUR) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set54), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_aexpr_add_in_aexpr_bvshift505);
					aexpr_add55=aexpr_add();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_add55.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_bvshift"


	public static class aexpr_add_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_add"
	// gov/nasa/jpf/constraints/parser/Expression.g:109:1: aexpr_add : aexpr_mul ( ( ADD | SUB ) ^ aexpr_mul )* ;
	public final ExpressionParser.aexpr_add_return aexpr_add() throws RecognitionException {
		ExpressionParser.aexpr_add_return retval = new ExpressionParser.aexpr_add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set57=null;
		ParserRuleReturnScope aexpr_mul56 =null;
		ParserRuleReturnScope aexpr_mul58 =null;

		CommonTree set57_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:110:2: ( aexpr_mul ( ( ADD | SUB ) ^ aexpr_mul )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:110:4: aexpr_mul ( ( ADD | SUB ) ^ aexpr_mul )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_mul_in_aexpr_add519);
			aexpr_mul56=aexpr_mul();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_mul56.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:110:14: ( ( ADD | SUB ) ^ aexpr_mul )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ADD||LA16_0==SUB) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:110:15: ( ADD | SUB ) ^ aexpr_mul
					{
					set57=input.LT(1);
					set57=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set57), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_aexpr_mul_in_aexpr_add529);
					aexpr_mul58=aexpr_mul();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_mul58.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_add"


	public static class aexpr_mul_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_mul"
	// gov/nasa/jpf/constraints/parser/Expression.g:113:1: aexpr_mul : aexpr_unary ( ( MUL | DIV | REM ) ^ aexpr_unary )* ;
	public final ExpressionParser.aexpr_mul_return aexpr_mul() throws RecognitionException {
		ExpressionParser.aexpr_mul_return retval = new ExpressionParser.aexpr_mul_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set60=null;
		ParserRuleReturnScope aexpr_unary59 =null;
		ParserRuleReturnScope aexpr_unary61 =null;

		CommonTree set60_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:114:2: ( aexpr_unary ( ( MUL | DIV | REM ) ^ aexpr_unary )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:114:4: aexpr_unary ( ( MUL | DIV | REM ) ^ aexpr_unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_aexpr_unary_in_aexpr_mul542);
			aexpr_unary59=aexpr_unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_unary59.getTree());

			// gov/nasa/jpf/constraints/parser/Expression.g:114:16: ( ( MUL | DIV | REM ) ^ aexpr_unary )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DIV||LA17_0==MUL||LA17_0==REM) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:114:17: ( MUL | DIV | REM ) ^ aexpr_unary
					{
					set60=input.LT(1);
					set60=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MUL||input.LA(1)==REM ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set60), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_aexpr_unary_in_aexpr_mul554);
					aexpr_unary61=aexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_unary61.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_mul"


	public static class aexpr_unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_unary"
	// gov/nasa/jpf/constraints/parser/Expression.g:117:1: aexpr_unary : ( SUB aexpr_unary -> ^( UNARY_MINUS aexpr_unary ) | ADD aexpr_unary -> ^( UNARY_PLUS aexpr_unary ) | BVNEG ^ aexpr_unary | LPAREN ID RPAREN aexpr_unary -> ^( TYPE_CAST ID aexpr_unary ) | aexpr_atomic );
	public final ExpressionParser.aexpr_unary_return aexpr_unary() throws RecognitionException {
		ExpressionParser.aexpr_unary_return retval = new ExpressionParser.aexpr_unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUB62=null;
		Token ADD64=null;
		Token BVNEG66=null;
		Token LPAREN68=null;
		Token ID69=null;
		Token RPAREN70=null;
		ParserRuleReturnScope aexpr_unary63 =null;
		ParserRuleReturnScope aexpr_unary65 =null;
		ParserRuleReturnScope aexpr_unary67 =null;
		ParserRuleReturnScope aexpr_unary71 =null;
		ParserRuleReturnScope aexpr_atomic72 =null;

		CommonTree SUB62_tree=null;
		CommonTree ADD64_tree=null;
		CommonTree BVNEG66_tree=null;
		CommonTree LPAREN68_tree=null;
		CommonTree ID69_tree=null;
		CommonTree RPAREN70_tree=null;
		RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
		RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_aexpr_unary=new RewriteRuleSubtreeStream(adaptor,"rule aexpr_unary");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:118:2: ( SUB aexpr_unary -> ^( UNARY_MINUS aexpr_unary ) | ADD aexpr_unary -> ^( UNARY_PLUS aexpr_unary ) | BVNEG ^ aexpr_unary | LPAREN ID RPAREN aexpr_unary -> ^( TYPE_CAST ID aexpr_unary ) | aexpr_atomic )
			int alt18=5;
			switch ( input.LA(1) ) {
			case SUB:
				{
				alt18=1;
				}
				break;
			case ADD:
				{
				alt18=2;
				}
				break;
			case BVNEG:
				{
				alt18=3;
				}
				break;
			case LPAREN:
				{
				int LA18_4 = input.LA(2);
				if ( (synpred34_Expression()) ) {
					alt18=4;
				}
				else if ( (true) ) {
					alt18=5;
				}

				}
				break;
			case BIGDECIMAL_LITERAL:
			case BIGINT_LITERAL:
			case BYTE_LITERAL:
			case DOUBLE_LITERAL:
			case FLOAT_LITERAL:
			case ID:
			case INT_LITERAL:
			case LONG_LITERAL:
			case QID:
			case SHORT_LITERAL:
				{
				alt18=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:118:4: SUB aexpr_unary
					{
					SUB62=(Token)match(input,SUB,FOLLOW_SUB_in_aexpr_unary567); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUB.add(SUB62);

					pushFollow(FOLLOW_aexpr_unary_in_aexpr_unary569);
					aexpr_unary63=aexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aexpr_unary.add(aexpr_unary63.getTree());
					// AST REWRITE
					// elements: aexpr_unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 118:20: -> ^( UNARY_MINUS aexpr_unary )
					{
						// gov/nasa/jpf/constraints/parser/Expression.g:118:23: ^( UNARY_MINUS aexpr_unary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_aexpr_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:119:4: ADD aexpr_unary
					{
					ADD64=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr_unary582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ADD.add(ADD64);

					pushFollow(FOLLOW_aexpr_unary_in_aexpr_unary584);
					aexpr_unary65=aexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aexpr_unary.add(aexpr_unary65.getTree());
					// AST REWRITE
					// elements: aexpr_unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 119:20: -> ^( UNARY_PLUS aexpr_unary )
					{
						// gov/nasa/jpf/constraints/parser/Expression.g:119:23: ^( UNARY_PLUS aexpr_unary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_aexpr_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// gov/nasa/jpf/constraints/parser/Expression.g:120:4: BVNEG ^ aexpr_unary
					{
					root_0 = (CommonTree)adaptor.nil();


					BVNEG66=(Token)match(input,BVNEG,FOLLOW_BVNEG_in_aexpr_unary597); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BVNEG66_tree = (CommonTree)adaptor.create(BVNEG66);
					root_0 = (CommonTree)adaptor.becomeRoot(BVNEG66_tree, root_0);
					}

					pushFollow(FOLLOW_aexpr_unary_in_aexpr_unary600);
					aexpr_unary67=aexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_unary67.getTree());

					}
					break;
				case 4 :
					// gov/nasa/jpf/constraints/parser/Expression.g:121:4: LPAREN ID RPAREN aexpr_unary
					{
					LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aexpr_unary605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN68);

					ID69=(Token)match(input,ID,FOLLOW_ID_in_aexpr_unary607); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID69);

					RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aexpr_unary609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN70);

					pushFollow(FOLLOW_aexpr_unary_in_aexpr_unary611);
					aexpr_unary71=aexpr_unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aexpr_unary.add(aexpr_unary71.getTree());
					// AST REWRITE
					// elements: ID, aexpr_unary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:33: -> ^( TYPE_CAST ID aexpr_unary )
					{
						// gov/nasa/jpf/constraints/parser/Expression.g:121:36: ^( TYPE_CAST ID aexpr_unary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_CAST, "TYPE_CAST"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_aexpr_unary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// gov/nasa/jpf/constraints/parser/Expression.g:122:4: aexpr_atomic
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_aexpr_atomic_in_aexpr_unary626);
					aexpr_atomic72=aexpr_atomic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_atomic72.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_unary"


	public static class aexpr_atomic_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_atomic"
	// gov/nasa/jpf/constraints/parser/Expression.g:125:1: aexpr_atomic : ( aexpr_literal | identifier | LPAREN ! lexpression RPAREN !);
	public final ExpressionParser.aexpr_atomic_return aexpr_atomic() throws RecognitionException {
		ExpressionParser.aexpr_atomic_return retval = new ExpressionParser.aexpr_atomic_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN75=null;
		Token RPAREN77=null;
		ParserRuleReturnScope aexpr_literal73 =null;
		ParserRuleReturnScope identifier74 =null;
		ParserRuleReturnScope lexpression76 =null;

		CommonTree LPAREN75_tree=null;
		CommonTree RPAREN77_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:126:2: ( aexpr_literal | identifier | LPAREN ! lexpression RPAREN !)
			int alt19=3;
			switch ( input.LA(1) ) {
			case BIGDECIMAL_LITERAL:
			case BIGINT_LITERAL:
			case BYTE_LITERAL:
			case DOUBLE_LITERAL:
			case FLOAT_LITERAL:
			case INT_LITERAL:
			case LONG_LITERAL:
			case SHORT_LITERAL:
				{
				alt19=1;
				}
				break;
			case ID:
			case QID:
				{
				alt19=2;
				}
				break;
			case LPAREN:
				{
				alt19=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:126:4: aexpr_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_aexpr_literal_in_aexpr_atomic638);
					aexpr_literal73=aexpr_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr_literal73.getTree());

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:127:4: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_aexpr_atomic643);
					identifier74=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier74.getTree());

					}
					break;
				case 3 :
					// gov/nasa/jpf/constraints/parser/Expression.g:128:4: LPAREN ! lexpression RPAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aexpr_atomic648); if (state.failed) return retval;
					pushFollow(FOLLOW_lexpression_in_aexpr_atomic651);
					lexpression76=lexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lexpression76.getTree());

					RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aexpr_atomic653); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_atomic"


	public static class aexpr_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aexpr_literal"
	// gov/nasa/jpf/constraints/parser/Expression.g:131:1: aexpr_literal : ( BYTE_LITERAL | SHORT_LITERAL | INT_LITERAL | LONG_LITERAL | BIGINT_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | BIGDECIMAL_LITERAL ) ^;
	public final ExpressionParser.aexpr_literal_return aexpr_literal() throws RecognitionException {
		ExpressionParser.aexpr_literal_return retval = new ExpressionParser.aexpr_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set78=null;

		CommonTree set78_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:132:2: ( ( BYTE_LITERAL | SHORT_LITERAL | INT_LITERAL | LONG_LITERAL | BIGINT_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | BIGDECIMAL_LITERAL ) ^)
			// gov/nasa/jpf/constraints/parser/Expression.g:132:4: ( BYTE_LITERAL | SHORT_LITERAL | INT_LITERAL | LONG_LITERAL | BIGINT_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | BIGDECIMAL_LITERAL ) ^
			{
			root_0 = (CommonTree)adaptor.nil();


			set78=input.LT(1);
			set78=input.LT(1);
			if ( (input.LA(1) >= BIGDECIMAL_LITERAL && input.LA(1) <= BIGINT_LITERAL)||input.LA(1)==BYTE_LITERAL||input.LA(1)==DOUBLE_LITERAL||input.LA(1)==FLOAT_LITERAL||input.LA(1)==INT_LITERAL||input.LA(1)==LONG_LITERAL||input.LA(1)==SHORT_LITERAL ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set78), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aexpr_literal"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// gov/nasa/jpf/constraints/parser/Expression.g:136:1: identifier : ( ID ^| QID ^);
	public final ExpressionParser.identifier_return identifier() throws RecognitionException {
		ExpressionParser.identifier_return retval = new ExpressionParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID79=null;
		Token QID80=null;

		CommonTree ID79_tree=null;
		CommonTree QID80_tree=null;

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:137:2: ( ID ^| QID ^)
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ID) ) {
				alt20=1;
			}
			else if ( (LA20_0==QID) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:137:4: ID ^
					{
					root_0 = (CommonTree)adaptor.nil();


					ID79=(Token)match(input,ID,FOLLOW_ID_in_identifier711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID79_tree = (CommonTree)adaptor.create(ID79);
					root_0 = (CommonTree)adaptor.becomeRoot(ID79_tree, root_0);
					}

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:138:4: QID ^
					{
					root_0 = (CommonTree)adaptor.nil();


					QID80=(Token)match(input,QID,FOLLOW_QID_in_identifier717); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QID80_tree = (CommonTree)adaptor.create(QID80);
					root_0 = (CommonTree)adaptor.becomeRoot(QID80_tree, root_0);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class typed_var_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typed_var"
	// gov/nasa/jpf/constraints/parser/Expression.g:140:1: typed_var : identifier COLON ID -> ^( TYPED_VAR identifier ID ) ;
	public final ExpressionParser.typed_var_return typed_var() throws RecognitionException {
		ExpressionParser.typed_var_return retval = new ExpressionParser.typed_var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON82=null;
		Token ID83=null;
		ParserRuleReturnScope identifier81 =null;

		CommonTree COLON82_tree=null;
		CommonTree ID83_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:141:5: ( identifier COLON ID -> ^( TYPED_VAR identifier ID ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:141:7: identifier COLON ID
			{
			pushFollow(FOLLOW_identifier_in_typed_var738);
			identifier81=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier81.getTree());
			COLON82=(Token)match(input,COLON,FOLLOW_COLON_in_typed_var740); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON82);

			ID83=(Token)match(input,ID,FOLLOW_ID_in_typed_var742); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID83);

			// AST REWRITE
			// elements: ID, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 141:27: -> ^( TYPED_VAR identifier ID )
			{
				// gov/nasa/jpf/constraints/parser/Expression.g:141:30: ^( TYPED_VAR identifier ID )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPED_VAR, "TYPED_VAR"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typed_var"


	public static class typed_var_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typed_var_list"
	// gov/nasa/jpf/constraints/parser/Expression.g:145:1: typed_var_list : typed_var ( COMMA typed_var )* -> ^( TYPED_VAR_LIST ( typed_var )+ ) ;
	public final ExpressionParser.typed_var_list_return typed_var_list() throws RecognitionException {
		ExpressionParser.typed_var_list_return retval = new ExpressionParser.typed_var_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA85=null;
		ParserRuleReturnScope typed_var84 =null;
		ParserRuleReturnScope typed_var86 =null;

		CommonTree COMMA85_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_typed_var=new RewriteRuleSubtreeStream(adaptor,"rule typed_var");

		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:146:2: ( typed_var ( COMMA typed_var )* -> ^( TYPED_VAR_LIST ( typed_var )+ ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:146:4: typed_var ( COMMA typed_var )*
			{
			pushFollow(FOLLOW_typed_var_in_typed_var_list772);
			typed_var84=typed_var();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typed_var.add(typed_var84.getTree());
			// gov/nasa/jpf/constraints/parser/Expression.g:146:14: ( COMMA typed_var )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:146:15: COMMA typed_var
					{
					COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_typed_var_list775); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);

					pushFollow(FOLLOW_typed_var_in_typed_var_list777);
					typed_var86=typed_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typed_var.add(typed_var86.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			// AST REWRITE
			// elements: typed_var
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 146:33: -> ^( TYPED_VAR_LIST ( typed_var )+ )
			{
				// gov/nasa/jpf/constraints/parser/Expression.g:146:36: ^( TYPED_VAR_LIST ( typed_var )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPED_VAR_LIST, "TYPED_VAR_LIST"), root_1);
				if ( !(stream_typed_var.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_typed_var.hasNext() ) {
					adaptor.addChild(root_1, stream_typed_var.nextTree());
				}
				stream_typed_var.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typed_var_list"

	// $ANTLR start synpred20_Expression
	public final void synpred20_Expression_fragment() throws RecognitionException {
		// gov/nasa/jpf/constraints/parser/Expression.g:97:17: ( LXOR aexpr_bvand )
		// gov/nasa/jpf/constraints/parser/Expression.g:97:17: LXOR aexpr_bvand
		{
		match(input,LXOR,FOLLOW_LXOR_in_synpred20_Expression443); if (state.failed) return;

		pushFollow(FOLLOW_aexpr_bvand_in_synpred20_Expression445);
		aexpr_bvand();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Expression

	// $ANTLR start synpred21_Expression
	public final void synpred21_Expression_fragment() throws RecognitionException {
		// gov/nasa/jpf/constraints/parser/Expression.g:97:4: ( aexpr_bvand ( LXOR aexpr_bvand )+ )
		// gov/nasa/jpf/constraints/parser/Expression.g:97:4: aexpr_bvand ( LXOR aexpr_bvand )+
		{
		pushFollow(FOLLOW_aexpr_bvand_in_synpred21_Expression440);
		aexpr_bvand();
		state._fsp--;
		if (state.failed) return;

		// gov/nasa/jpf/constraints/parser/Expression.g:97:16: ( LXOR aexpr_bvand )+
		int cnt22=0;
		loop22:
		while (true) {
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LXOR) ) {
				alt22=1;
			}

			switch (alt22) {
			case 1 :
				// gov/nasa/jpf/constraints/parser/Expression.g:97:17: LXOR aexpr_bvand
				{
				match(input,LXOR,FOLLOW_LXOR_in_synpred21_Expression443); if (state.failed) return;

				pushFollow(FOLLOW_aexpr_bvand_in_synpred21_Expression445);
				aexpr_bvand();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt22 >= 1 ) break loop22;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(22, input);
				throw eee;
			}
			cnt22++;
		}

		}

	}
	// $ANTLR end synpred21_Expression

	// $ANTLR start synpred34_Expression
	public final void synpred34_Expression_fragment() throws RecognitionException {
		// gov/nasa/jpf/constraints/parser/Expression.g:121:4: ( LPAREN ID RPAREN aexpr_unary )
		// gov/nasa/jpf/constraints/parser/Expression.g:121:4: LPAREN ID RPAREN aexpr_unary
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred34_Expression605); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred34_Expression607); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred34_Expression609); if (state.failed) return;

		pushFollow(FOLLOW_aexpr_unary_in_synpred34_Expression611);
		aexpr_unary();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred34_Expression

	// Delegated rules

	public final boolean synpred34_Expression() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_Expression_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Expression() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Expression_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Expression() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Expression_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_root_lexpression_in_start87 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_root_aexpression_in_start_aexpression99 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start_aexpression101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_root_variable_in_start_variable111 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start_variable113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare_stmt_in_root_lexpression124 = new BitSet(new long[]{0x01A082C24EA04170L});
	public static final BitSet FOLLOW_lexpression_in_root_lexpression127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare_stmt_in_root_aexpression150 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpression_in_root_aexpression153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typed_var_in_root_variable175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_in_declare_stmt194 = new BitSet(new long[]{0x0000800040000000L});
	public static final BitSet FOLLOW_typed_var_list_in_declare_stmt197 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_declare_stmt199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_quantifier_in_lexpression215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_lexpr_quantifier231 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_lexpr_quantifier240 = new BitSet(new long[]{0x0000800040000000L});
	public static final BitSet FOLLOW_typed_var_list_in_lexpr_quantifier243 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lexpr_quantifier245 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COLON_in_lexpr_quantifier248 = new BitSet(new long[]{0x01A082C24EA04170L});
	public static final BitSet FOLLOW_lexpr_quantifier_in_lexpr_quantifier251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_cmp_in_lexpr_quantifier256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_or_in_lexpr_cmp267 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_lexpr_cmp270 = new BitSet(new long[]{0x01A082C246204170L});
	public static final BitSet FOLLOW_lexpr_or_in_lexpr_cmp277 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_lexpr_and_in_lexpr_or291 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_LOR_in_lexpr_or294 = new BitSet(new long[]{0x01A082C246204170L});
	public static final BitSet FOLLOW_lexpr_and_in_lexpr_or297 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_lexpr_xor_in_lexpr_and311 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_LAND_in_lexpr_and314 = new BitSet(new long[]{0x01A082C246204170L});
	public static final BitSet FOLLOW_lexpr_xor_in_lexpr_and317 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_lexpr_unary_in_lexpr_xor331 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_LXOR_in_lexpr_xor334 = new BitSet(new long[]{0x01A082C246204170L});
	public static final BitSet FOLLOW_lexpr_unary_in_lexpr_xor337 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_LNOT_in_lexpr_unary351 = new BitSet(new long[]{0x01A082C246204170L});
	public static final BitSet FOLLOW_lexpr_unary_in_lexpr_unary354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lexpr_atomic_in_lexpr_unary359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_lexpr_atomic369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpression_in_lexpr_atomic379 = new BitSet(new long[]{0x0000240830400002L});
	public static final BitSet FOLLOW_set_in_lexpr_atomic382 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpression_in_lexpr_atomic397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_bvor_in_aexpression411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_bvxor_in_aexpr_bvor421 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BVOR_in_aexpr_bvor424 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_bvxor_in_aexpr_bvor427 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_aexpr_bvand_in_aexpr_bvxor440 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LXOR_in_aexpr_bvxor443 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_bvand_in_aexpr_bvxor445 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_aexpr_bvand_in_aexpr_bvxor461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_bvshift_in_aexpr_bvand473 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BVAND_in_aexpr_bvand476 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_bvshift_in_aexpr_bvand479 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_aexpr_add_in_aexpr_bvshift493 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_set_in_aexpr_bvshift496 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_add_in_aexpr_bvshift505 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_aexpr_mul_in_aexpr_add519 = new BitSet(new long[]{0x0080000000000012L});
	public static final BitSet FOLLOW_set_in_aexpr_add522 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_mul_in_aexpr_add529 = new BitSet(new long[]{0x0080000000000012L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_mul542 = new BitSet(new long[]{0x0004100000100002L});
	public static final BitSet FOLLOW_set_in_aexpr_mul545 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_mul554 = new BitSet(new long[]{0x0004100000100002L});
	public static final BitSet FOLLOW_SUB_in_aexpr_unary567 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_unary569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_aexpr_unary582 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_unary584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BVNEG_in_aexpr_unary597 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_unary600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_aexpr_unary605 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ID_in_aexpr_unary607 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_aexpr_unary609 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_aexpr_unary611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_atomic_in_aexpr_unary626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_literal_in_aexpr_atomic638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_aexpr_atomic643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_aexpr_atomic648 = new BitSet(new long[]{0x01A082C24EA04170L});
	public static final BitSet FOLLOW_lexpression_in_aexpr_atomic651 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_aexpr_atomic653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_aexpr_literal665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QID_in_identifier717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_typed_var738 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COLON_in_typed_var740 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ID_in_typed_var742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typed_var_in_typed_var_list772 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_COMMA_in_typed_var_list775 = new BitSet(new long[]{0x0000800040000000L});
	public static final BitSet FOLLOW_typed_var_in_typed_var_list777 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_LXOR_in_synpred20_Expression443 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_bvand_in_synpred20_Expression445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aexpr_bvand_in_synpred21_Expression440 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LXOR_in_synpred21_Expression443 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_bvand_in_synpred21_Expression445 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred34_Expression605 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ID_in_synpred34_Expression607 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred34_Expression609 = new BitSet(new long[]{0x00A0828244204170L});
	public static final BitSet FOLLOW_aexpr_unary_in_synpred34_Expression611 = new BitSet(new long[]{0x0000000000000002L});
}
