// $ANTLR 3.5.2 gov/nasa/jpf/constraints/parser/Expression.g 2019-06-17 15:44:31

package gov.nasa.jpf.constraints.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpressionLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExpressionLexer() {} 
	public ExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "gov/nasa/jpf/constraints/parser/Expression.g"; }

	// $ANTLR start "DECLARE"
	public final void mDECLARE() throws RecognitionException {
		try {
			int _type = DECLARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:150:9: ( 'declare' )
			// gov/nasa/jpf/constraints/parser/Expression.g:150:11: 'declare'
			{
			match("declare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARE"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:151:4: ( 'in' )
			// gov/nasa/jpf/constraints/parser/Expression.g:151:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:153:9: ( '(' )
			// gov/nasa/jpf/constraints/parser/Expression.g:153:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:154:9: ( ')' )
			// gov/nasa/jpf/constraints/parser/Expression.g:154:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:156:7: ( ':' )
			// gov/nasa/jpf/constraints/parser/Expression.g:156:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:157:7: ( ',' )
			// gov/nasa/jpf/constraints/parser/Expression.g:157:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:159:5: ( '==' )
			// gov/nasa/jpf/constraints/parser/Expression.g:159:7: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:160:5: ( '!=' )
			// gov/nasa/jpf/constraints/parser/Expression.g:160:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:161:5: ( '>=' )
			// gov/nasa/jpf/constraints/parser/Expression.g:161:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:162:5: ( '<=' )
			// gov/nasa/jpf/constraints/parser/Expression.g:162:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:163:5: ( '>' )
			// gov/nasa/jpf/constraints/parser/Expression.g:163:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:164:5: ( '<' )
			// gov/nasa/jpf/constraints/parser/Expression.g:164:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LAND"
	public final void mLAND() throws RecognitionException {
		try {
			int _type = LAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:167:6: ( '&&' )
			// gov/nasa/jpf/constraints/parser/Expression.g:167:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAND"

	// $ANTLR start "LOR"
	public final void mLOR() throws RecognitionException {
		try {
			int _type = LOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:168:6: ( '||' )
			// gov/nasa/jpf/constraints/parser/Expression.g:168:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOR"

	// $ANTLR start "LNOT"
	public final void mLNOT() throws RecognitionException {
		try {
			int _type = LNOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:169:7: ( '!' )
			// gov/nasa/jpf/constraints/parser/Expression.g:169:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LNOT"

	// $ANTLR start "LIMP"
	public final void mLIMP() throws RecognitionException {
		try {
			int _type = LIMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:170:6: ( '->' )
			// gov/nasa/jpf/constraints/parser/Expression.g:170:8: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMP"

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:171:5: ( '<->' )
			// gov/nasa/jpf/constraints/parser/Expression.g:171:7: '<->'
			{
			match("<->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQ"

	// $ANTLR start "LXOR"
	public final void mLXOR() throws RecognitionException {
		try {
			int _type = LXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:172:6: ( '^' )
			// gov/nasa/jpf/constraints/parser/Expression.g:172:8: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LXOR"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:174:5: ( '+' )
			// gov/nasa/jpf/constraints/parser/Expression.g:174:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:175:5: ( '-' )
			// gov/nasa/jpf/constraints/parser/Expression.g:175:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:176:5: ( '*' )
			// gov/nasa/jpf/constraints/parser/Expression.g:176:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:177:5: ( '/' )
			// gov/nasa/jpf/constraints/parser/Expression.g:177:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "REM"
	public final void mREM() throws RecognitionException {
		try {
			int _type = REM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:178:5: ( '%' )
			// gov/nasa/jpf/constraints/parser/Expression.g:178:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REM"

	// $ANTLR start "BVSHL"
	public final void mBVSHL() throws RecognitionException {
		try {
			int _type = BVSHL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:180:7: ( '<<' )
			// gov/nasa/jpf/constraints/parser/Expression.g:180:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVSHL"

	// $ANTLR start "BVSHR"
	public final void mBVSHR() throws RecognitionException {
		try {
			int _type = BVSHR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:181:7: ( '>>' )
			// gov/nasa/jpf/constraints/parser/Expression.g:181:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVSHR"

	// $ANTLR start "BVSHUR"
	public final void mBVSHUR() throws RecognitionException {
		try {
			int _type = BVSHUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:182:8: ( '>>>' )
			// gov/nasa/jpf/constraints/parser/Expression.g:182:10: '>>>'
			{
			match(">>>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVSHUR"

	// $ANTLR start "BVNEG"
	public final void mBVNEG() throws RecognitionException {
		try {
			int _type = BVNEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:184:7: ( '~' )
			// gov/nasa/jpf/constraints/parser/Expression.g:184:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVNEG"

	// $ANTLR start "BVAND"
	public final void mBVAND() throws RecognitionException {
		try {
			int _type = BVAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:185:7: ( '&' )
			// gov/nasa/jpf/constraints/parser/Expression.g:185:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVAND"

	// $ANTLR start "BVOR"
	public final void mBVOR() throws RecognitionException {
		try {
			int _type = BVOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:186:6: ( '|' )
			// gov/nasa/jpf/constraints/parser/Expression.g:186:8: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BVOR"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:188:7: ( 'true' )
			// gov/nasa/jpf/constraints/parser/Expression.g:188:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:191:7: ( 'false' )
			// gov/nasa/jpf/constraints/parser/Expression.g:191:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FORALL"
	public final void mFORALL() throws RecognitionException {
		try {
			int _type = FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:194:9: ( 'forall' )
			// gov/nasa/jpf/constraints/parser/Expression.g:194:11: 'forall'
			{
			match("forall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORALL"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:197:8: ( 'exists' )
			// gov/nasa/jpf/constraints/parser/Expression.g:197:10: 'exists'
			{
			match("exists"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:202:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )* )
			// gov/nasa/jpf/constraints/parser/Expression.g:202:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// gov/nasa/jpf/constraints/parser/Expression.g:202:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='.'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NZDIGIT"
	public final void mNZDIGIT() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:206:2: ( '1' .. '9' )
			// gov/nasa/jpf/constraints/parser/Expression.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NZDIGIT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:209:2: ( '0' | NZDIGIT )
			// gov/nasa/jpf/constraints/parser/Expression.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:212:2: ( ( '0' | NZDIGIT ( DIGIT )* ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:212:4: ( '0' | NZDIGIT ( DIGIT )* )
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:212:4: ( '0' | NZDIGIT ( DIGIT )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:212:5: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:212:9: NZDIGIT ( DIGIT )*
					{
					mNZDIGIT(); 

					// gov/nasa/jpf/constraints/parser/Expression.g:212:17: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// gov/nasa/jpf/constraints/parser/Expression.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "BYTE_LITERAL"
	public final void mBYTE_LITERAL() throws RecognitionException {
		try {
			int _type = BYTE_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:215:2: ( INTEGER 'b' )
			// gov/nasa/jpf/constraints/parser/Expression.g:215:4: INTEGER 'b'
			{
			mINTEGER(); 

			match('b'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE_LITERAL"

	// $ANTLR start "SHORT_LITERAL"
	public final void mSHORT_LITERAL() throws RecognitionException {
		try {
			int _type = SHORT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:218:2: ( INTEGER 's' )
			// gov/nasa/jpf/constraints/parser/Expression.g:218:4: INTEGER 's'
			{
			mINTEGER(); 

			match('s'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_LITERAL"

	// $ANTLR start "INT_LITERAL"
	public final void mINT_LITERAL() throws RecognitionException {
		try {
			int _type = INT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:221:2: ( INTEGER )
			// gov/nasa/jpf/constraints/parser/Expression.g:221:4: INTEGER
			{
			mINTEGER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_LITERAL"

	// $ANTLR start "LONG_LITERAL"
	public final void mLONG_LITERAL() throws RecognitionException {
		try {
			int _type = LONG_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:224:2: ( INTEGER 'L' )
			// gov/nasa/jpf/constraints/parser/Expression.g:224:4: INTEGER 'L'
			{
			mINTEGER(); 

			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_LITERAL"

	// $ANTLR start "BIGINT_LITERAL"
	public final void mBIGINT_LITERAL() throws RecognitionException {
		try {
			int _type = BIGINT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:227:2: ( INTEGER 'I' )
			// gov/nasa/jpf/constraints/parser/Expression.g:227:4: INTEGER 'I'
			{
			mINTEGER(); 

			match('I'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGINT_LITERAL"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:231:2: ( ( INTEGER )? '.' ( DIGIT )+ )
			// gov/nasa/jpf/constraints/parser/Expression.g:231:4: ( INTEGER )? '.' ( DIGIT )+
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:231:4: ( INTEGER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:231:4: INTEGER
					{
					mINTEGER(); 

					}
					break;

			}

			match('.'); 
			// gov/nasa/jpf/constraints/parser/Expression.g:231:17: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:233:15: ( ( INTEGER | DECIMAL ) ( EXPONENT )? )
			// gov/nasa/jpf/constraints/parser/Expression.g:233:17: ( INTEGER | DECIMAL ) ( EXPONENT )?
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:233:17: ( INTEGER | DECIMAL )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:233:18: INTEGER
					{
					mINTEGER(); 

					}
					break;
				case 2 :
					// gov/nasa/jpf/constraints/parser/Expression.g:233:26: DECIMAL
					{
					mDECIMAL(); 

					}
					break;

			}

			// gov/nasa/jpf/constraints/parser/Expression.g:233:35: ( EXPONENT )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='E'||LA7_0=='e') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:233:35: EXPONENT
					{
					mEXPONENT(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "FLOAT_LITERAL"
	public final void mFLOAT_LITERAL() throws RecognitionException {
		try {
			int _type = FLOAT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:238:2: ( REAL 'f' )
			// gov/nasa/jpf/constraints/parser/Expression.g:238:4: REAL 'f'
			{
			mREAL(); 

			match('f'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_LITERAL"

	// $ANTLR start "DOUBLE_LITERAL"
	public final void mDOUBLE_LITERAL() throws RecognitionException {
		try {
			int _type = DOUBLE_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:241:2: ( REAL 'd' )
			// gov/nasa/jpf/constraints/parser/Expression.g:241:4: REAL 'd'
			{
			mREAL(); 

			match('d'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_LITERAL"

	// $ANTLR start "BIGDECIMAL_LITERAL"
	public final void mBIGDECIMAL_LITERAL() throws RecognitionException {
		try {
			int _type = BIGDECIMAL_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:244:2: ( REAL )
			// gov/nasa/jpf/constraints/parser/Expression.g:244:4: REAL
			{
			mREAL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIGDECIMAL_LITERAL"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:250:13: ( '\\'' )
			// gov/nasa/jpf/constraints/parser/Expression.g:250:17: '\\''
			{
			match('\''); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:252:13: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// gov/nasa/jpf/constraints/parser/Expression.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:254:9: ( ( SPACE )+ )
			// gov/nasa/jpf/constraints/parser/Expression.g:254:13: ( SPACE )+
			{
			// gov/nasa/jpf/constraints/parser/Expression.g:254:13: ( SPACE )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "QID"
	public final void mQID() throws RecognitionException {
		try {
			int _type = QID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gov/nasa/jpf/constraints/parser/Expression.g:255:6: ( QUOTE ( options {greedy=false; } : . )* QUOTE )
			// gov/nasa/jpf/constraints/parser/Expression.g:255:10: QUOTE ( options {greedy=false; } : . )* QUOTE
			{
			mQUOTE(); 

			// gov/nasa/jpf/constraints/parser/Expression.g:255:16: ( options {greedy=false; } : . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\'') ) {
					alt9=2;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '&')||(LA9_0 >= '(' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:255:43: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			mQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QID"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// gov/nasa/jpf/constraints/parser/Expression.g:261:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// gov/nasa/jpf/constraints/parser/Expression.g:261:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// gov/nasa/jpf/constraints/parser/Expression.g:261:22: ( '+' | '-' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='+'||LA10_0=='-') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// gov/nasa/jpf/constraints/parser/Expression.g:261:33: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// gov/nasa/jpf/constraints/parser/Expression.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	@Override
	public void mTokens() throws RecognitionException {
		// gov/nasa/jpf/constraints/parser/Expression.g:1:8: ( DECLARE | IN | LPAREN | RPAREN | COLON | COMMA | EQ | NE | GE | LE | GT | LT | LAND | LOR | LNOT | LIMP | LEQ | LXOR | ADD | SUB | MUL | DIV | REM | BVSHL | BVSHR | BVSHUR | BVNEG | BVAND | BVOR | TRUE | FALSE | FORALL | EXISTS | ID | BYTE_LITERAL | SHORT_LITERAL | INT_LITERAL | LONG_LITERAL | BIGINT_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | BIGDECIMAL_LITERAL | WS | QID )
		int alt12=44;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:10: DECLARE
				{
				mDECLARE(); 

				}
				break;
			case 2 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:18: IN
				{
				mIN(); 

				}
				break;
			case 3 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:21: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 4 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:28: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 5 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:35: COLON
				{
				mCOLON(); 

				}
				break;
			case 6 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:41: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 8 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:50: NE
				{
				mNE(); 

				}
				break;
			case 9 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:53: GE
				{
				mGE(); 

				}
				break;
			case 10 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:56: LE
				{
				mLE(); 

				}
				break;
			case 11 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:59: GT
				{
				mGT(); 

				}
				break;
			case 12 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:62: LT
				{
				mLT(); 

				}
				break;
			case 13 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:65: LAND
				{
				mLAND(); 

				}
				break;
			case 14 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:70: LOR
				{
				mLOR(); 

				}
				break;
			case 15 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:74: LNOT
				{
				mLNOT(); 

				}
				break;
			case 16 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:79: LIMP
				{
				mLIMP(); 

				}
				break;
			case 17 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:84: LEQ
				{
				mLEQ(); 

				}
				break;
			case 18 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:88: LXOR
				{
				mLXOR(); 

				}
				break;
			case 19 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:93: ADD
				{
				mADD(); 

				}
				break;
			case 20 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:97: SUB
				{
				mSUB(); 

				}
				break;
			case 21 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:101: MUL
				{
				mMUL(); 

				}
				break;
			case 22 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:105: DIV
				{
				mDIV(); 

				}
				break;
			case 23 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:109: REM
				{
				mREM(); 

				}
				break;
			case 24 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:113: BVSHL
				{
				mBVSHL(); 

				}
				break;
			case 25 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:119: BVSHR
				{
				mBVSHR(); 

				}
				break;
			case 26 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:125: BVSHUR
				{
				mBVSHUR(); 

				}
				break;
			case 27 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:132: BVNEG
				{
				mBVNEG(); 

				}
				break;
			case 28 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:138: BVAND
				{
				mBVAND(); 

				}
				break;
			case 29 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:144: BVOR
				{
				mBVOR(); 

				}
				break;
			case 30 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:149: TRUE
				{
				mTRUE(); 

				}
				break;
			case 31 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:154: FALSE
				{
				mFALSE(); 

				}
				break;
			case 32 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:160: FORALL
				{
				mFORALL(); 

				}
				break;
			case 33 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:167: EXISTS
				{
				mEXISTS(); 

				}
				break;
			case 34 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:174: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:177: BYTE_LITERAL
				{
				mBYTE_LITERAL(); 

				}
				break;
			case 36 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:190: SHORT_LITERAL
				{
				mSHORT_LITERAL(); 

				}
				break;
			case 37 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:204: INT_LITERAL
				{
				mINT_LITERAL(); 

				}
				break;
			case 38 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:216: LONG_LITERAL
				{
				mLONG_LITERAL(); 

				}
				break;
			case 39 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:229: BIGINT_LITERAL
				{
				mBIGINT_LITERAL(); 

				}
				break;
			case 40 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:244: FLOAT_LITERAL
				{
				mFLOAT_LITERAL(); 

				}
				break;
			case 41 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:258: DOUBLE_LITERAL
				{
				mDOUBLE_LITERAL(); 

				}
				break;
			case 42 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:273: BIGDECIMAL_LITERAL
				{
				mBIGDECIMAL_LITERAL(); 

				}
				break;
			case 43 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:292: WS
				{
				mWS(); 

				}
				break;
			case 44 :
				// gov/nasa/jpf/constraints/parser/Expression.g:1:295: QID
				{
				mQID(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA6_eotS =
		"\1\uffff\2\4\2\uffff\1\4";
	static final String DFA6_eofS =
		"\6\uffff";
	static final String DFA6_minS =
		"\3\56\2\uffff\1\56";
	static final String DFA6_maxS =
		"\1\71\1\56\1\71\2\uffff\1\71";
	static final String DFA6_acceptS =
		"\3\uffff\1\2\1\1\1\uffff";
	static final String DFA6_specialS =
		"\6\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\3\1\uffff\1\1\11\2",
			"\1\3",
			"\1\3\1\uffff\12\5",
			"",
			"",
			"\1\3\1\uffff\12\5"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "233:17: ( INTEGER | DECIMAL )";
		}
	}

	static final String DFA12_eotS =
		"\1\uffff\2\27\5\uffff\1\40\1\43\1\47\1\51\1\53\1\55\6\uffff\3\27\1\uffff"+
		"\2\62\3\uffff\1\27\1\75\3\uffff\1\77\13\uffff\4\27\10\uffff\1\62\1\106"+
		"\1\27\3\uffff\4\27\1\uffff\1\106\1\uffff\1\27\1\115\4\27\1\uffff\1\122"+
		"\3\27\1\uffff\1\126\1\127\1\130\3\uffff";
	static final String DFA12_eofS =
		"\131\uffff";
	static final String DFA12_minS =
		"\1\11\1\145\1\156\5\uffff\2\75\1\55\1\46\1\174\1\76\6\uffff\1\162\1\141"+
		"\1\170\1\uffff\2\56\1\60\2\uffff\1\143\1\56\3\uffff\1\76\13\uffff\1\165"+
		"\1\154\1\162\1\151\5\uffff\1\53\2\uffff\1\56\1\60\1\154\3\uffff\1\145"+
		"\1\163\1\141\1\163\2\60\1\uffff\1\141\1\56\1\145\1\154\1\164\1\162\1\uffff"+
		"\1\56\1\154\1\163\1\145\1\uffff\3\56\3\uffff";
	static final String DFA12_maxS =
		"\1\176\1\145\1\156\5\uffff\1\75\1\76\1\75\1\46\1\174\1\76\6\uffff\1\162"+
		"\1\157\1\170\1\uffff\2\163\1\71\2\uffff\1\143\1\172\3\uffff\1\76\13\uffff"+
		"\1\165\1\154\1\162\1\151\5\uffff\1\71\2\uffff\1\163\1\146\1\154\3\uffff"+
		"\1\145\1\163\1\141\1\163\1\71\1\146\1\uffff\1\141\1\172\1\145\1\154\1"+
		"\164\1\162\1\uffff\1\172\1\154\1\163\1\145\1\uffff\3\172\3\uffff";
	static final String DFA12_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\7\6\uffff\1\22\1\23\1\25\1\26\1\27\1\33\3\uffff"+
		"\1\42\3\uffff\1\53\1\54\2\uffff\1\10\1\17\1\11\1\uffff\1\13\1\12\1\21"+
		"\1\30\1\14\1\15\1\34\1\16\1\35\1\20\1\24\4\uffff\1\45\1\43\1\44\1\46\1"+
		"\47\1\uffff\1\50\1\51\3\uffff\1\2\1\32\1\31\6\uffff\1\52\6\uffff\1\36"+
		"\4\uffff\1\37\3\uffff\1\40\1\41\1\1";
	static final String DFA12_specialS =
		"\131\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\33\1\uffff\2\33\22\uffff\1\33\1\10\3\uffff\1\22\1\13\1\34\1\3\1\4"+
			"\1\20\1\17\1\6\1\15\1\32\1\21\1\30\11\31\1\5\1\uffff\1\12\1\7\1\11\2"+
			"\uffff\32\27\3\uffff\1\16\1\27\1\uffff\3\27\1\1\1\26\1\25\2\27\1\2\12"+
			"\27\1\24\6\27\1\uffff\1\14\1\uffff\1\23",
			"\1\35",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"\1\41\1\42",
			"\1\45\16\uffff\1\46\1\44",
			"\1\50",
			"\1\52",
			"\1\54",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\56",
			"\1\57\15\uffff\1\60",
			"\1\61",
			"",
			"\1\32\26\uffff\1\67\3\uffff\1\66\2\uffff\1\65\25\uffff\1\63\1\uffff"+
			"\1\71\1\67\1\70\14\uffff\1\64",
			"\1\32\1\uffff\12\72\13\uffff\1\67\3\uffff\1\66\2\uffff\1\65\25\uffff"+
			"\1\63\1\uffff\1\71\1\67\1\70\14\uffff\1\64",
			"\12\73",
			"",
			"",
			"\1\74",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"",
			"\1\76",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"",
			"",
			"",
			"",
			"",
			"\1\104\1\uffff\1\104\2\uffff\12\105",
			"",
			"",
			"\1\32\1\uffff\12\72\13\uffff\1\67\3\uffff\1\66\2\uffff\1\65\25\uffff"+
			"\1\63\1\uffff\1\71\1\67\1\70\14\uffff\1\64",
			"\12\73\13\uffff\1\67\36\uffff\1\71\1\67\1\70",
			"\1\107",
			"",
			"",
			"",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\105",
			"\12\105\52\uffff\1\71\1\uffff\1\70",
			"",
			"\1\114",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\27\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( DECLARE | IN | LPAREN | RPAREN | COLON | COMMA | EQ | NE | GE | LE | GT | LT | LAND | LOR | LNOT | LIMP | LEQ | LXOR | ADD | SUB | MUL | DIV | REM | BVSHL | BVSHR | BVSHUR | BVNEG | BVAND | BVOR | TRUE | FALSE | FORALL | EXISTS | ID | BYTE_LITERAL | SHORT_LITERAL | INT_LITERAL | LONG_LITERAL | BIGINT_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | BIGDECIMAL_LITERAL | WS | QID );";
		}
	}

}
