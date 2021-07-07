// Generated from C:/Users/USER/Google Drive/CC - PUC/5º semestre/COMP - COMPILADORES/Programas/Compiladores/includev2/src/gramatica\gInclude.g4 by ANTLR 4.9.1
package gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gIncludeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, TIPO_TEXTO=47, TIPO_NUMERO=48, TIPO_VERACIDADE=49, VERACID=50, 
		TEXTO=51, SEP=52, NUM=53, COMENTL=54, COMENTB=55, ID=56;
	public static final int
		RULE_listaSentenca = 0, RULE_listaDeclaracao = 1, RULE_sentencaComposta = 2, 
		RULE_sentenca = 3, RULE_sentencaCaso = 4, RULE_sentencaPadrao = 5, RULE_sentencaSelecao = 6, 
		RULE_sentencaIteracao = 7, RULE_declaracaoFuncao = 8, RULE_expressaoSentenca = 9, 
		RULE_expressao = 10, RULE_listaExpressao = 11, RULE_expressaoPrimaria = 12, 
		RULE_expressaoPosfixa = 13, RULE_expressaoLista = 14, RULE_expressaoFuncao = 15, 
		RULE_expressaoIncremento = 16, RULE_expressaoMultiplicativa = 17, RULE_expressaoAditiva = 18, 
		RULE_expressaoComparativa = 19, RULE_expressaoLogica = 20, RULE_expressaoAtribuicao = 21, 
		RULE_expressaoAtribuicaoLista = 22, RULE_expressaoDeclaracao = 23, RULE_constante = 24, 
		RULE_numero = 25, RULE_texto = 26, RULE_veracidade = 27, RULE_identificador = 28, 
		RULE_tipoNada = 29, RULE_rTipo = 30, RULE_prefixoLista = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"listaSentenca", "listaDeclaracao", "sentencaComposta", "sentenca", "sentencaCaso", 
			"sentencaPadrao", "sentencaSelecao", "sentencaIteracao", "declaracaoFuncao", 
			"expressaoSentenca", "expressao", "listaExpressao", "expressaoPrimaria", 
			"expressaoPosfixa", "expressaoLista", "expressaoFuncao", "expressaoIncremento", 
			"expressaoMultiplicativa", "expressaoAditiva", "expressaoComparativa", 
			"expressaoLogica", "expressaoAtribuicao", "expressaoAtribuicaoLista", 
			"expressaoDeclaracao", "constante", "numero", "texto", "veracidade", 
			"identificador", "tipoNada", "rTipo", "prefixoLista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'caso'", "':'", "'padrao'", "'se'", "'('", "')'", 
			"'entao'", "'senao'", "'senao se'", "'checar'", "'enquanto'", "'repita'", 
			"'ate que'", "'para k de '", "' ate '", "','", "'passo'", "'funcao '", 
			"' recebe'", "'retorna '", "';'", "'['", "']'", "'mostrar'", "'++'", 
			"'--'", "'*'", "'/'", "'//'", "'%'", "'+'", "'-'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'e'", "'ou'", "'inverso'", "'='", "'nada'", "'lista de '", 
			"'texto'", "'numero'", "'veracidade'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "TIPO_TEXTO", 
			"TIPO_NUMERO", "TIPO_VERACIDADE", "VERACID", "TEXTO", "SEP", "NUM", "COMENTL", 
			"COMENTB", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "gInclude.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gIncludeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ListaSentencaContext extends ParserRuleContext {
		public ListaSentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSentenca; }
	 
		public ListaSentencaContext() { }
		public void copyFrom(ListaSentencaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RListaSentencaListaContext extends ListaSentencaContext {
		public ListaSentencaContext listaSentenca() {
			return getRuleContext(ListaSentencaContext.class,0);
		}
		public SentencaContext sentenca() {
			return getRuleContext(SentencaContext.class,0);
		}
		public RListaSentencaListaContext(ListaSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaSentencaLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaSentencaLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaSentencaLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RListaSentencaUnicaContext extends ListaSentencaContext {
		public SentencaContext sentenca() {
			return getRuleContext(SentencaContext.class,0);
		}
		public RListaSentencaUnicaContext(ListaSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaSentencaUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaSentencaUnica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaSentencaUnica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaSentencaContext listaSentenca() throws RecognitionException {
		return listaSentenca(0);
	}

	private ListaSentencaContext listaSentenca(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaSentencaContext _localctx = new ListaSentencaContext(_ctx, _parentState);
		ListaSentencaContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_listaSentenca, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RListaSentencaUnicaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(65);
			sentenca();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RListaSentencaListaContext(new ListaSentencaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_listaSentenca);
					setState(67);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(68);
					sentenca();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListaDeclaracaoContext extends ParserRuleContext {
		public ListaDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracao; }
	 
		public ListaDeclaracaoContext() { }
		public void copyFrom(ListaDeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RListaDeclaracaoUnicaContext extends ListaDeclaracaoContext {
		public ExpressaoDeclaracaoContext expressaoDeclaracao() {
			return getRuleContext(ExpressaoDeclaracaoContext.class,0);
		}
		public RListaDeclaracaoUnicaContext(ListaDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaDeclaracaoUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaDeclaracaoUnica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaDeclaracaoUnica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RListaDeclaracaoContext extends ListaDeclaracaoContext {
		public ListaDeclaracaoContext listaDeclaracao() {
			return getRuleContext(ListaDeclaracaoContext.class,0);
		}
		public ExpressaoDeclaracaoContext expressaoDeclaracao() {
			return getRuleContext(ExpressaoDeclaracaoContext.class,0);
		}
		public RListaDeclaracaoContext(ListaDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracaoContext listaDeclaracao() throws RecognitionException {
		return listaDeclaracao(0);
	}

	private ListaDeclaracaoContext listaDeclaracao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaDeclaracaoContext _localctx = new ListaDeclaracaoContext(_ctx, _parentState);
		ListaDeclaracaoContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_listaDeclaracao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RListaDeclaracaoUnicaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(75);
			expressaoDeclaracao();
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RListaDeclaracaoContext(new ListaDeclaracaoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_listaDeclaracao);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					expressaoDeclaracao();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SentencaCompostaContext extends ParserRuleContext {
		public SentencaCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencaComposta; }
	 
		public SentencaCompostaContext() { }
		public void copyFrom(SentencaCompostaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RSentencaCompostaContext extends SentencaCompostaContext {
		public List<ListaDeclaracaoContext> listaDeclaracao() {
			return getRuleContexts(ListaDeclaracaoContext.class);
		}
		public ListaDeclaracaoContext listaDeclaracao(int i) {
			return getRuleContext(ListaDeclaracaoContext.class,i);
		}
		public List<ListaSentencaContext> listaSentenca() {
			return getRuleContexts(ListaSentencaContext.class);
		}
		public ListaSentencaContext listaSentenca(int i) {
			return getRuleContext(ListaSentencaContext.class,i);
		}
		public RSentencaCompostaContext(SentencaCompostaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaComposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaComposta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaComposta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaCompostaContext sentencaComposta() throws RecognitionException {
		SentencaCompostaContext _localctx = new SentencaCompostaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencaComposta);
		int _la;
		try {
			_localctx = new RSentencaCompostaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__25) | (1L << T__42) | (1L << T__45) | (1L << TIPO_TEXTO) | (1L << TIPO_NUMERO) | (1L << TIPO_VERACIDADE) | (1L << VERACID) | (1L << TEXTO) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(85);
					listaDeclaracao(0);
					}
					break;
				case 2:
					{
					setState(86);
					listaSentenca(0);
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__1);
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

	public static class SentencaContext extends ParserRuleContext {
		public SentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenca; }
	 
		public SentencaContext() { }
		public void copyFrom(SentencaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RSentencaExpressaoContext extends SentencaContext {
		public ExpressaoSentencaContext expressaoSentenca() {
			return getRuleContext(ExpressaoSentencaContext.class,0);
		}
		public RSentencaExpressaoContext(SentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaExpressao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaSelecaoContext extends SentencaContext {
		public SentencaSelecaoContext sentencaSelecao() {
			return getRuleContext(SentencaSelecaoContext.class,0);
		}
		public RSentencaSelecaoContext(SentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaIteracaoContext extends SentencaContext {
		public SentencaIteracaoContext sentencaIteracao() {
			return getRuleContext(SentencaIteracaoContext.class,0);
		}
		public RSentencaIteracaoContext(SentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaIteracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaIteracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaIteracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaFuncaoContext extends SentencaContext {
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public RSentencaFuncaoContext(SentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaContext sentenca() throws RecognitionException {
		SentencaContext _localctx = new SentencaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentenca);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__42:
			case T__45:
			case TIPO_TEXTO:
			case TIPO_NUMERO:
			case TIPO_VERACIDADE:
			case VERACID:
			case TEXTO:
			case NUM:
			case ID:
				_localctx = new RSentencaExpressaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expressaoSentenca();
				}
				break;
			case T__5:
			case T__11:
				_localctx = new RSentencaSelecaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				sentencaSelecao();
				}
				break;
			case T__12:
			case T__13:
			case T__15:
				_localctx = new RSentencaIteracaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				sentencaIteracao();
				}
				break;
			case T__19:
				_localctx = new RSentencaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				declaracaoFuncao();
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

	public static class SentencaCasoContext extends ParserRuleContext {
		public SentencaCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencaCaso; }
	 
		public SentencaCasoContext() { }
		public void copyFrom(SentencaCasoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RSentencaCasoFilhaContext extends SentencaCasoContext {
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public ListaSentencaContext listaSentenca() {
			return getRuleContext(ListaSentencaContext.class,0);
		}
		public RSentencaCasoFilhaContext(SentencaCasoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaCasoFilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaCasoFilha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaCasoFilha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaCasoContext sentencaCaso() throws RecognitionException {
		SentencaCasoContext _localctx = new SentencaCasoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencaCaso);
		try {
			_localctx = new RSentencaCasoFilhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__2);
			setState(101);
			expressaoPrimaria();
			setState(102);
			match(T__3);
			setState(103);
			listaSentenca(0);
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

	public static class SentencaPadraoContext extends ParserRuleContext {
		public SentencaPadraoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencaPadrao; }
	 
		public SentencaPadraoContext() { }
		public void copyFrom(SentencaPadraoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RSentencaPadraoFilhaContext extends SentencaPadraoContext {
		public ListaSentencaContext listaSentenca() {
			return getRuleContext(ListaSentencaContext.class,0);
		}
		public RSentencaPadraoFilhaContext(SentencaPadraoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaPadraoFilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaPadraoFilha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaPadraoFilha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaPadraoContext sentencaPadrao() throws RecognitionException {
		SentencaPadraoContext _localctx = new SentencaPadraoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencaPadrao);
		try {
			_localctx = new RSentencaPadraoFilhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
			setState(106);
			match(T__3);
			setState(107);
			listaSentenca(0);
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

	public static class SentencaSelecaoContext extends ParserRuleContext {
		public SentencaSelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencaSelecao; }
	 
		public SentencaSelecaoContext() { }
		public void copyFrom(SentencaSelecaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RSentencaSelecaoChecarPadraoContext extends SentencaSelecaoContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public SentencaPadraoContext sentencaPadrao() {
			return getRuleContext(SentencaPadraoContext.class,0);
		}
		public RSentencaSelecaoChecarPadraoContext(SentencaSelecaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecaoChecarPadrao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecaoChecarPadrao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecaoChecarPadrao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaSelecaoChecarCasoContext extends SentencaSelecaoContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public List<SentencaCasoContext> sentencaCaso() {
			return getRuleContexts(SentencaCasoContext.class);
		}
		public SentencaCasoContext sentencaCaso(int i) {
			return getRuleContext(SentencaCasoContext.class,i);
		}
		public SentencaPadraoContext sentencaPadrao() {
			return getRuleContext(SentencaPadraoContext.class,0);
		}
		public RSentencaSelecaoChecarCasoContext(SentencaSelecaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecaoChecarCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecaoChecarCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecaoChecarCaso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaSelecaoEntaoContext extends SentencaSelecaoContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public SentencaCompostaContext sentencaComposta() {
			return getRuleContext(SentencaCompostaContext.class,0);
		}
		public RSentencaSelecaoEntaoContext(SentencaSelecaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecaoEntao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecaoEntao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecaoEntao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaSelecaoSenaoContext extends SentencaSelecaoContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public List<SentencaCompostaContext> sentencaComposta() {
			return getRuleContexts(SentencaCompostaContext.class);
		}
		public SentencaCompostaContext sentencaComposta(int i) {
			return getRuleContext(SentencaCompostaContext.class,i);
		}
		public RSentencaSelecaoSenaoContext(SentencaSelecaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecaoSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecaoSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecaoSenao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RSentencaSelecaoSenaoSeContext extends SentencaSelecaoContext {
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public List<SentencaCompostaContext> sentencaComposta() {
			return getRuleContexts(SentencaCompostaContext.class);
		}
		public SentencaCompostaContext sentencaComposta(int i) {
			return getRuleContext(SentencaCompostaContext.class,i);
		}
		public RSentencaSelecaoSenaoSeContext(SentencaSelecaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRSentencaSelecaoSenaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRSentencaSelecaoSenaoSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRSentencaSelecaoSenaoSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaSelecaoContext sentencaSelecao() throws RecognitionException {
		SentencaSelecaoContext _localctx = new SentencaSelecaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencaSelecao);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new RSentencaSelecaoEntaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__5);
				setState(110);
				match(T__6);
				setState(111);
				expressaoLogica(0);
				setState(112);
				match(T__7);
				setState(113);
				match(T__8);
				setState(114);
				sentencaComposta();
				}
				break;
			case 2:
				_localctx = new RSentencaSelecaoSenaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__5);
				setState(117);
				match(T__6);
				setState(118);
				expressaoLogica(0);
				setState(119);
				match(T__7);
				setState(120);
				match(T__8);
				setState(121);
				sentencaComposta();
				setState(122);
				match(T__9);
				setState(123);
				sentencaComposta();
				}
				break;
			case 3:
				_localctx = new RSentencaSelecaoSenaoSeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__5);
				setState(126);
				match(T__6);
				setState(127);
				expressaoLogica(0);
				setState(128);
				match(T__7);
				setState(129);
				match(T__8);
				setState(130);
				sentencaComposta();
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(T__10);
					setState(132);
					match(T__6);
					setState(133);
					expressaoLogica(0);
					setState(134);
					match(T__7);
					setState(135);
					sentencaComposta();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				setState(141);
				match(T__9);
				setState(142);
				sentencaComposta();
				}
				break;
			case 4:
				_localctx = new RSentencaSelecaoChecarCasoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__11);
				setState(145);
				match(T__6);
				setState(146);
				expressaoAditiva(0);
				setState(147);
				match(T__7);
				setState(148);
				match(T__0);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					sentencaCaso();
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(154);
					sentencaPadrao();
					}
				}

				setState(157);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new RSentencaSelecaoChecarPadraoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(T__11);
				setState(160);
				match(T__6);
				setState(161);
				expressaoAditiva(0);
				setState(162);
				match(T__7);
				setState(163);
				match(T__0);
				setState(164);
				sentencaPadrao();
				setState(165);
				match(T__1);
				}
				break;
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

	public static class SentencaIteracaoContext extends ParserRuleContext {
		public SentencaIteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencaIteracao; }
	 
		public SentencaIteracaoContext() { }
		public void copyFrom(SentencaIteracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RIteracaoRepitaContext extends SentencaIteracaoContext {
		public SentencaCompostaContext sentencaComposta() {
			return getRuleContext(SentencaCompostaContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RIteracaoRepitaContext(SentencaIteracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRIteracaoRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRIteracaoRepita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRIteracaoRepita(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RIteracaoParaContext extends SentencaIteracaoContext {
		public List<ExpressaoPrimariaContext> expressaoPrimaria() {
			return getRuleContexts(ExpressaoPrimariaContext.class);
		}
		public ExpressaoPrimariaContext expressaoPrimaria(int i) {
			return getRuleContext(ExpressaoPrimariaContext.class,i);
		}
		public SentencaCompostaContext sentencaComposta() {
			return getRuleContext(SentencaCompostaContext.class,0);
		}
		public RIteracaoParaContext(SentencaIteracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRIteracaoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRIteracaoPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRIteracaoPara(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RIteracaoEnquantoContext extends SentencaIteracaoContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public SentencaCompostaContext sentencaComposta() {
			return getRuleContext(SentencaCompostaContext.class,0);
		}
		public RIteracaoEnquantoContext(SentencaIteracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRIteracaoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRIteracaoEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRIteracaoEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaIteracaoContext sentencaIteracao() throws RecognitionException {
		SentencaIteracaoContext _localctx = new SentencaIteracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencaIteracao);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new RIteracaoEnquantoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__12);
				setState(170);
				match(T__6);
				setState(171);
				expressaoLogica(0);
				setState(172);
				match(T__7);
				setState(173);
				sentencaComposta();
				}
				break;
			case T__13:
				_localctx = new RIteracaoRepitaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__13);
				setState(176);
				sentencaComposta();
				setState(177);
				match(T__14);
				setState(178);
				match(T__6);
				setState(179);
				expressaoLogica(0);
				setState(180);
				match(T__7);
				}
				break;
			case T__15:
				_localctx = new RIteracaoParaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__15);
				setState(183);
				expressaoPrimaria();
				setState(184);
				match(T__16);
				setState(185);
				expressaoPrimaria();
				setState(186);
				match(T__17);
				setState(187);
				match(T__18);
				setState(188);
				expressaoPrimaria();
				setState(189);
				sentencaComposta();
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

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
	 
		public DeclaracaoFuncaoContext() { }
		public void copyFrom(DeclaracaoFuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RDeclaraFuncaoContext extends DeclaracaoFuncaoContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public SentencaCompostaContext sentencaComposta() {
			return getRuleContext(SentencaCompostaContext.class,0);
		}
		public List<TipoNadaContext> tipoNada() {
			return getRuleContexts(TipoNadaContext.class);
		}
		public TipoNadaContext tipoNada(int i) {
			return getRuleContext(TipoNadaContext.class,i);
		}
		public List<RTipoContext> rTipo() {
			return getRuleContexts(RTipoContext.class);
		}
		public RTipoContext rTipo(int i) {
			return getRuleContext(RTipoContext.class,i);
		}
		public RDeclaraFuncaoContext(DeclaracaoFuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRDeclaraFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRDeclaraFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRDeclaraFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoFuncao);
		int _la;
		try {
			_localctx = new RDeclaraFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__19);
			setState(194);
			identificador();
			setState(195);
			match(T__20);
			setState(196);
			match(T__6);
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case TIPO_TEXTO:
			case TIPO_NUMERO:
			case TIPO_VERACIDADE:
				{
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_TEXTO) | (1L << TIPO_NUMERO) | (1L << TIPO_VERACIDADE))) != 0)) {
					{
					setState(197);
					rTipo();
					setState(198);
					identificador();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__17) {
						{
						{
						setState(199);
						match(T__17);
						setState(200);
						rTipo();
						setState(201);
						identificador();
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				break;
			case T__44:
				{
				setState(210);
				tipoNada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(213);
			match(T__7);
			setState(214);
			match(T__21);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_TEXTO:
			case TIPO_NUMERO:
			case TIPO_VERACIDADE:
				{
				setState(215);
				rTipo();
				}
				break;
			case T__44:
				{
				setState(216);
				tipoNada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			sentencaComposta();
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

	public static class ExpressaoSentencaContext extends ParserRuleContext {
		public ExpressaoSentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSentenca; }
	 
		public ExpressaoSentencaContext() { }
		public void copyFrom(ExpressaoSentencaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoSentencaDeclaracaoContext extends ExpressaoSentencaContext {
		public ExpressaoDeclaracaoContext expressaoDeclaracao() {
			return getRuleContext(ExpressaoDeclaracaoContext.class,0);
		}
		public RExpressaoSentencaDeclaracaoContext(ExpressaoSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoSentencaDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoSentencaDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoSentencaDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoSentencaAditivaContext extends ExpressaoSentencaContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public RExpressaoSentencaAditivaContext(ExpressaoSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoSentencaAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoSentencaAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoSentencaAditiva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoSentencaAtribuicaoContext extends ExpressaoSentencaContext {
		public ExpressaoAtribuicaoContext expressaoAtribuicao() {
			return getRuleContext(ExpressaoAtribuicaoContext.class,0);
		}
		public RExpressaoSentencaAtribuicaoContext(ExpressaoSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoSentencaAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoSentencaAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoSentencaAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoSentencaPrimariaContext extends ExpressaoSentencaContext {
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public RExpressaoSentencaPrimariaContext(ExpressaoSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoSentencaPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoSentencaPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoSentencaPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoSentencaLogicaContext extends ExpressaoSentencaContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RExpressaoSentencaLogicaContext(ExpressaoSentencaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoSentencaLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoSentencaLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoSentencaLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoSentencaContext expressaoSentenca() throws RecognitionException {
		ExpressaoSentencaContext _localctx = new ExpressaoSentencaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaoSentenca);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RExpressaoSentencaPrimariaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				expressaoPrimaria();
				setState(222);
				match(T__22);
				}
				break;
			case 2:
				_localctx = new RExpressaoSentencaAditivaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				expressaoAditiva(0);
				setState(225);
				match(T__22);
				}
				break;
			case 3:
				_localctx = new RExpressaoSentencaLogicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				expressaoLogica(0);
				setState(228);
				match(T__22);
				}
				break;
			case 4:
				_localctx = new RExpressaoSentencaDeclaracaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				expressaoDeclaracao();
				setState(231);
				match(T__22);
				}
				break;
			case 5:
				_localctx = new RExpressaoSentencaAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				expressaoAtribuicao();
				setState(234);
				match(T__22);
				}
				break;
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoPosfixaContext extends ExpressaoContext {
		public ExpressaoPosfixaContext expressaoPosfixa() {
			return getRuleContext(ExpressaoPosfixaContext.class,0);
		}
		public RExpressaoPosfixaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoPosfixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoPosfixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoPosfixa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoLogicaContext extends ExpressaoContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RExpressaoLogicaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPosFixaAditivaContext extends ExpressaoContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public RPosFixaAditivaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPosFixaAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPosFixaAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPosFixaAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RExpressaoPosfixaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				expressaoPosfixa();
				}
				break;
			case 2:
				_localctx = new RPosFixaAditivaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				expressaoAditiva(0);
				}
				break;
			case 3:
				_localctx = new RExpressaoLogicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				expressaoLogica(0);
				}
				break;
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

	public static class ListaExpressaoContext extends ParserRuleContext {
		public ListaExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressao; }
	 
		public ListaExpressaoContext() { }
		public void copyFrom(ListaExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RListaExpressaoListaContext extends ListaExpressaoContext {
		public ListaExpressaoContext listaExpressao() {
			return getRuleContext(ListaExpressaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RListaExpressaoListaContext(ListaExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaExpressaoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaExpressaoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaExpressaoLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RListaExpressaoUnicaContext extends ListaExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RListaExpressaoUnicaContext(ListaExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRListaExpressaoUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRListaExpressaoUnica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRListaExpressaoUnica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressaoContext listaExpressao() throws RecognitionException {
		return listaExpressao(0);
	}

	private ListaExpressaoContext listaExpressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaExpressaoContext _localctx = new ListaExpressaoContext(_ctx, _parentState);
		ListaExpressaoContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_listaExpressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RListaExpressaoUnicaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(244);
			expressao();
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RListaExpressaoListaContext(new ListaExpressaoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_listaExpressao);
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(T__17);
					setState(248);
					expressao();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoPrimariaContext extends ParserRuleContext {
		public ExpressaoPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPrimaria; }
	 
		public ExpressaoPrimariaContext() { }
		public void copyFrom(ExpressaoPrimariaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RPrimariaConstanteContext extends ExpressaoPrimariaContext {
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public RPrimariaConstanteContext(ExpressaoPrimariaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPrimariaConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPrimariaConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPrimariaConstante(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPrimariaIdentificadorContext extends ExpressaoPrimariaContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RPrimariaIdentificadorContext(ExpressaoPrimariaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPrimariaIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPrimariaIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPrimariaIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoPrimariaContext expressaoPrimaria() throws RecognitionException {
		ExpressaoPrimariaContext _localctx = new ExpressaoPrimariaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressaoPrimaria);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new RPrimariaIdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				identificador();
				}
				break;
			case VERACID:
			case TEXTO:
			case NUM:
				_localctx = new RPrimariaConstanteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				constante();
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

	public static class ExpressaoPosfixaContext extends ParserRuleContext {
		public ExpressaoPosfixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPosfixa; }
	 
		public ExpressaoPosfixaContext() { }
		public void copyFrom(ExpressaoPosfixaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RPosfixaListaContext extends ExpressaoPosfixaContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public RPosfixaListaContext(ExpressaoPosfixaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPosfixaLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPosfixaLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPosfixaLista(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPosfixaPrimariaContext extends ExpressaoPosfixaContext {
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public RPosfixaPrimariaContext(ExpressaoPosfixaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPosfixaPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPosfixaPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPosfixaPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPosfixaFuncaoContext extends ExpressaoPosfixaContext {
		public ExpressaoFuncaoContext expressaoFuncao() {
			return getRuleContext(ExpressaoFuncaoContext.class,0);
		}
		public RPosfixaFuncaoContext(ExpressaoPosfixaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPosfixaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPosfixaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPosfixaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPosfixaIncrementoContext extends ExpressaoPosfixaContext {
		public ExpressaoIncrementoContext expressaoIncremento() {
			return getRuleContext(ExpressaoIncrementoContext.class,0);
		}
		public RPosfixaIncrementoContext(ExpressaoPosfixaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPosfixaIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPosfixaIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPosfixaIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoPosfixaContext expressaoPosfixa() throws RecognitionException {
		ExpressaoPosfixaContext _localctx = new ExpressaoPosfixaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressaoPosfixa);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new RPosfixaPrimariaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				expressaoPrimaria();
				}
				break;
			case 2:
				_localctx = new RPosfixaListaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				expressaoLista();
				}
				break;
			case 3:
				_localctx = new RPosfixaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				expressaoFuncao();
				}
				break;
			case 4:
				_localctx = new RPosfixaIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				expressaoIncremento();
				}
				break;
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

	public static class ExpressaoListaContext extends ParserRuleContext {
		public ExpressaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLista; }
	 
		public ExpressaoListaContext() { }
		public void copyFrom(ExpressaoListaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoListaFilhaContext extends ExpressaoListaContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RExpressaoListaFilhaContext(ExpressaoListaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoListaFilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoListaFilha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoListaFilha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoListaContext expressaoLista() throws RecognitionException {
		ExpressaoListaContext _localctx = new ExpressaoListaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoLista);
		try {
			_localctx = new RExpressaoListaFilhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			identificador();
			setState(265);
			match(T__23);
			setState(266);
			expressao();
			setState(267);
			match(T__24);
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

	public static class ExpressaoFuncaoContext extends ParserRuleContext {
		public ExpressaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoFuncao; }
	 
		public ExpressaoFuncaoContext() { }
		public void copyFrom(ExpressaoFuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoFuncaoFilhaContext extends ExpressaoFuncaoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ListaExpressaoContext listaExpressao() {
			return getRuleContext(ListaExpressaoContext.class,0);
		}
		public RExpressaoFuncaoFilhaContext(ExpressaoFuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoFuncaoFilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoFuncaoFilha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoFuncaoFilha(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RMostrarContext extends ExpressaoFuncaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RMostrarContext(ExpressaoFuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoFuncaoContext expressaoFuncao() throws RecognitionException {
		ExpressaoFuncaoContext _localctx = new ExpressaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressaoFuncao);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new RExpressaoFuncaoFilhaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				identificador();
				setState(270);
				match(T__6);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__42) | (1L << VERACID) | (1L << TEXTO) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					setState(271);
					listaExpressao(0);
					}
				}

				setState(274);
				match(T__7);
				}
				break;
			case T__25:
				_localctx = new RMostrarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__25);
				setState(277);
				match(T__6);
				setState(278);
				expressao();
				setState(279);
				match(T__7);
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

	public static class ExpressaoIncrementoContext extends ParserRuleContext {
		public ExpressaoIncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIncremento; }
	 
		public ExpressaoIncrementoContext() { }
		public void copyFrom(ExpressaoIncrementoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoIncrementoMaisContext extends ExpressaoIncrementoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RExpressaoIncrementoMaisContext(ExpressaoIncrementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoIncrementoMais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoIncrementoMais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoIncrementoMais(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoIncrementoMenosContext extends ExpressaoIncrementoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RExpressaoIncrementoMenosContext(ExpressaoIncrementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoIncrementoMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoIncrementoMenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoIncrementoMenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoIncrementoContext expressaoIncremento() throws RecognitionException {
		ExpressaoIncrementoContext _localctx = new ExpressaoIncrementoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressaoIncremento);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new RExpressaoIncrementoMaisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				identificador();
				setState(284);
				match(T__26);
				}
				break;
			case 2:
				_localctx = new RExpressaoIncrementoMenosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				identificador();
				setState(287);
				match(T__27);
				}
				break;
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

	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
	 
		public ExpressaoMultiplicativaContext() { }
		public void copyFrom(ExpressaoMultiplicativaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoMultiplicativaRestoContext extends ExpressaoMultiplicativaContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public RExpressaoMultiplicativaRestoContext(ExpressaoMultiplicativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoMultiplicativaResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoMultiplicativaResto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoMultiplicativaResto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoMultiplicativaPosfixaContext extends ExpressaoMultiplicativaContext {
		public ExpressaoPosfixaContext expressaoPosfixa() {
			return getRuleContext(ExpressaoPosfixaContext.class,0);
		}
		public RExpressaoMultiplicativaPosfixaContext(ExpressaoMultiplicativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoMultiplicativaPosfixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoMultiplicativaPosfixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoMultiplicativaPosfixa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoMultiplicativaMultContext extends ExpressaoMultiplicativaContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public RExpressaoMultiplicativaMultContext(ExpressaoMultiplicativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoMultiplicativaMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoMultiplicativaMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoMultiplicativaMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoMultiplicativaDivContext extends ExpressaoMultiplicativaContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public RExpressaoMultiplicativaDivContext(ExpressaoMultiplicativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoMultiplicativaDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoMultiplicativaDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoMultiplicativaDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoMultiplicativaDivIntContext extends ExpressaoMultiplicativaContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public RExpressaoMultiplicativaDivIntContext(ExpressaoMultiplicativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoMultiplicativaDivInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoMultiplicativaDivInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoMultiplicativaDivInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressaoMultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RExpressaoMultiplicativaPosfixaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(292);
			expressaoPosfixa();
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new RExpressaoMultiplicativaMultContext(new ExpressaoMultiplicativaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295);
						match(T__28);
						setState(296);
						expressaoMultiplicativa(5);
						}
						break;
					case 2:
						{
						_localctx = new RExpressaoMultiplicativaDivContext(new ExpressaoMultiplicativaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						match(T__29);
						setState(299);
						expressaoMultiplicativa(4);
						}
						break;
					case 3:
						{
						_localctx = new RExpressaoMultiplicativaDivIntContext(new ExpressaoMultiplicativaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(300);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(301);
						match(T__30);
						setState(302);
						expressaoMultiplicativa(3);
						}
						break;
					case 4:
						{
						_localctx = new RExpressaoMultiplicativaRestoContext(new ExpressaoMultiplicativaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(303);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(304);
						match(T__31);
						setState(305);
						expressaoMultiplicativa(2);
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoAditivaContext extends ParserRuleContext {
		public ExpressaoAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAditiva; }
	 
		public ExpressaoAditivaContext() { }
		public void copyFrom(ExpressaoAditivaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoAditivaSubContext extends ExpressaoAditivaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoAditivaSubContext(ExpressaoAditivaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAditivaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAditivaSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAditivaSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAditivaMultplicativaContext extends ExpressaoAditivaContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public RExpressaoAditivaMultplicativaContext(ExpressaoAditivaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAditivaMultplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAditivaMultplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAditivaMultplicativa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAditivaSomaContext extends ExpressaoAditivaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoAditivaSomaContext(ExpressaoAditivaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAditivaSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAditivaSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAditivaSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAditivaContext expressaoAditiva() throws RecognitionException {
		return expressaoAditiva(0);
	}

	private ExpressaoAditivaContext expressaoAditiva(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAditivaContext _localctx = new ExpressaoAditivaContext(_ctx, _parentState);
		ExpressaoAditivaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressaoAditiva, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RExpressaoAditivaMultplicativaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(312);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new RExpressaoAditivaSomaContext(new ExpressaoAditivaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAditiva);
						setState(314);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(315);
						match(T__32);
						setState(316);
						expressaoAditiva(3);
						}
						break;
					case 2:
						{
						_localctx = new RExpressaoAditivaSubContext(new ExpressaoAditivaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAditiva);
						setState(317);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(318);
						match(T__33);
						setState(319);
						expressaoAditiva(2);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoComparativaContext extends ParserRuleContext {
		public ExpressaoComparativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoComparativa; }
	 
		public ExpressaoComparativaContext() { }
		public void copyFrom(ExpressaoComparativaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoComparativaMaiorIgualContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaMaiorIgualContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaMaiorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaMaiorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaMaiorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaMenorContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaMenorContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaAditivaContext extends ExpressaoComparativaContext {
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public RExpressaoComparativaAditivaContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaAditiva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaMaiorContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaMaiorContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaMaior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaMenorIgualContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaMenorIgualContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaIgualdadeContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaIgualdadeContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoComparativaDiferenteContext extends ExpressaoComparativaContext {
		public List<ExpressaoAditivaContext> expressaoAditiva() {
			return getRuleContexts(ExpressaoAditivaContext.class);
		}
		public ExpressaoAditivaContext expressaoAditiva(int i) {
			return getRuleContext(ExpressaoAditivaContext.class,i);
		}
		public RExpressaoComparativaDiferenteContext(ExpressaoComparativaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoComparativaDiferente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoComparativaDiferente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoComparativaDiferente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoComparativaContext expressaoComparativa() throws RecognitionException {
		ExpressaoComparativaContext _localctx = new ExpressaoComparativaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressaoComparativa);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new RExpressaoComparativaAditivaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				expressaoAditiva(0);
				}
				break;
			case 2:
				_localctx = new RExpressaoComparativaIgualdadeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expressaoAditiva(0);
				setState(327);
				match(T__34);
				setState(328);
				expressaoAditiva(0);
				}
				break;
			case 3:
				_localctx = new RExpressaoComparativaDiferenteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				expressaoAditiva(0);
				setState(331);
				match(T__35);
				setState(332);
				expressaoAditiva(0);
				}
				break;
			case 4:
				_localctx = new RExpressaoComparativaMaiorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				expressaoAditiva(0);
				setState(335);
				match(T__36);
				setState(336);
				expressaoAditiva(0);
				}
				break;
			case 5:
				_localctx = new RExpressaoComparativaMenorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				expressaoAditiva(0);
				setState(339);
				match(T__37);
				setState(340);
				expressaoAditiva(0);
				}
				break;
			case 6:
				_localctx = new RExpressaoComparativaMaiorIgualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				expressaoAditiva(0);
				setState(343);
				match(T__38);
				setState(344);
				expressaoAditiva(0);
				}
				break;
			case 7:
				_localctx = new RExpressaoComparativaMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				expressaoAditiva(0);
				setState(347);
				match(T__39);
				setState(348);
				expressaoAditiva(0);
				}
				break;
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

	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
	 
		public ExpressaoLogicaContext() { }
		public void copyFrom(ExpressaoLogicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoLogicaInvContext extends ExpressaoLogicaContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RExpressaoLogicaInvContext(ExpressaoLogicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoLogicaInv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoLogicaInv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoLogicaInv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoLogicaOuContext extends ExpressaoLogicaContext {
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public RExpressaoLogicaOuContext(ExpressaoLogicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoLogicaOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoLogicaOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoLogicaOu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoLogicaComparativaContext extends ExpressaoLogicaContext {
		public ExpressaoComparativaContext expressaoComparativa() {
			return getRuleContext(ExpressaoComparativaContext.class,0);
		}
		public RExpressaoLogicaComparativaContext(ExpressaoLogicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoLogicaComparativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoLogicaComparativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoLogicaComparativa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoLogicaEContext extends ExpressaoLogicaContext {
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public RExpressaoLogicaEContext(ExpressaoLogicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoLogicaE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoLogicaE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoLogicaE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case VERACID:
			case TEXTO:
			case NUM:
			case ID:
				{
				_localctx = new RExpressaoLogicaComparativaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(353);
				expressaoComparativa();
				}
				break;
			case T__42:
				{
				_localctx = new RExpressaoLogicaInvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(T__42);
				setState(355);
				match(T__6);
				setState(356);
				expressaoLogica(0);
				setState(357);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new RExpressaoLogicaEContext(new ExpressaoLogicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(361);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(362);
						match(T__40);
						setState(363);
						expressaoLogica(4);
						}
						break;
					case 2:
						{
						_localctx = new RExpressaoLogicaOuContext(new ExpressaoLogicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
						match(T__41);
						setState(366);
						expressaoLogica(3);
						}
						break;
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressaoAtribuicaoContext extends ParserRuleContext {
		public ExpressaoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAtribuicao; }
	 
		public ExpressaoAtribuicaoContext() { }
		public void copyFrom(ExpressaoAtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoAtribuicaoIdLogicaContext extends ExpressaoAtribuicaoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RExpressaoAtribuicaoIdLogicaContext(ExpressaoAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoIdLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoIdLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoIdLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAtribuicaoListaLogicaContext extends ExpressaoAtribuicaoContext {
		public ExpressaoListaContext expressaoLista() {
			return getRuleContext(ExpressaoListaContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public RExpressaoAtribuicaoListaLogicaContext(ExpressaoAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoListaLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoListaLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoListaLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAtribuicaoIdAditivaContext extends ExpressaoAtribuicaoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoAditivaContext expressaoAditiva() {
			return getRuleContext(ExpressaoAditivaContext.class,0);
		}
		public RExpressaoAtribuicaoIdAditivaContext(ExpressaoAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoIdAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoIdAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoIdAditiva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAtribuicaoIdPrimariaContext extends ExpressaoAtribuicaoContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public RExpressaoAtribuicaoIdPrimariaContext(ExpressaoAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoIdPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoIdPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoIdPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoAtribuicaoListaContext extends ExpressaoAtribuicaoContext {
		public ExpressaoAtribuicaoListaContext expressaoAtribuicaoLista() {
			return getRuleContext(ExpressaoAtribuicaoListaContext.class,0);
		}
		public RExpressaoAtribuicaoListaContext(ExpressaoAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAtribuicaoContext expressaoAtribuicao() throws RecognitionException {
		ExpressaoAtribuicaoContext _localctx = new ExpressaoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoAtribuicao);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new RExpressaoAtribuicaoIdPrimariaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				identificador();
				setState(373);
				match(T__43);
				setState(374);
				expressaoPrimaria();
				}
				break;
			case 2:
				_localctx = new RExpressaoAtribuicaoIdAditivaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				identificador();
				setState(377);
				match(T__43);
				setState(378);
				expressaoAditiva(0);
				}
				break;
			case 3:
				_localctx = new RExpressaoAtribuicaoIdLogicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				identificador();
				setState(381);
				match(T__43);
				setState(382);
				expressaoLogica(0);
				}
				break;
			case 4:
				_localctx = new RExpressaoAtribuicaoListaLogicaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				expressaoLista();
				setState(385);
				match(T__43);
				setState(386);
				expressaoLogica(0);
				}
				break;
			case 5:
				_localctx = new RExpressaoAtribuicaoListaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				expressaoAtribuicaoLista();
				}
				break;
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

	public static class ExpressaoAtribuicaoListaContext extends ParserRuleContext {
		public ExpressaoAtribuicaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAtribuicaoLista; }
	 
		public ExpressaoAtribuicaoListaContext() { }
		public void copyFrom(ExpressaoAtribuicaoListaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoAtribuicaoListaFilhaContext extends ExpressaoAtribuicaoListaContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public RExpressaoAtribuicaoListaFilhaContext(ExpressaoAtribuicaoListaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoAtribuicaoListaFilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoAtribuicaoListaFilha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoAtribuicaoListaFilha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAtribuicaoListaContext expressaoAtribuicaoLista() throws RecognitionException {
		ExpressaoAtribuicaoListaContext _localctx = new ExpressaoAtribuicaoListaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoAtribuicaoLista);
		int _la;
		try {
			_localctx = new RExpressaoAtribuicaoListaFilhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			identificador();
			setState(392);
			match(T__43);
			setState(393);
			match(T__23);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__42) | (1L << VERACID) | (1L << TEXTO) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(394);
				expressaoLogica(0);
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(397);
				match(T__17);
				setState(398);
				expressaoLogica(0);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(T__24);
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

	public static class ExpressaoDeclaracaoContext extends ParserRuleContext {
		public ExpressaoDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoDeclaracao; }
	 
		public ExpressaoDeclaracaoContext() { }
		public void copyFrom(ExpressaoDeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RExpressaoDeclaracaoAtribuicaoContext extends ExpressaoDeclaracaoContext {
		public RTipoContext rTipo() {
			return getRuleContext(RTipoContext.class,0);
		}
		public ExpressaoAtribuicaoContext expressaoAtribuicao() {
			return getRuleContext(ExpressaoAtribuicaoContext.class,0);
		}
		public RExpressaoDeclaracaoAtribuicaoContext(ExpressaoDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoDeclaracaoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoDeclaracaoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoDeclaracaoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoDeclaracaoListaAtribuicaoContext extends ExpressaoDeclaracaoContext {
		public PrefixoListaContext prefixoLista() {
			return getRuleContext(PrefixoListaContext.class,0);
		}
		public RTipoContext rTipo() {
			return getRuleContext(RTipoContext.class,0);
		}
		public ExpressaoAtribuicaoListaContext expressaoAtribuicaoLista() {
			return getRuleContext(ExpressaoAtribuicaoListaContext.class,0);
		}
		public RExpressaoDeclaracaoListaAtribuicaoContext(ExpressaoDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoDeclaracaoListaAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoDeclaracaoListaAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoDeclaracaoListaAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoDeclaracaoIdContext extends ExpressaoDeclaracaoContext {
		public RTipoContext rTipo() {
			return getRuleContext(RTipoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RExpressaoDeclaracaoIdContext(ExpressaoDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoDeclaracaoId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoDeclaracaoId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoDeclaracaoId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RExpressaoDeclaracaoListaIdContext extends ExpressaoDeclaracaoContext {
		public PrefixoListaContext prefixoLista() {
			return getRuleContext(PrefixoListaContext.class,0);
		}
		public RTipoContext rTipo() {
			return getRuleContext(RTipoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RExpressaoDeclaracaoListaIdContext(ExpressaoDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRExpressaoDeclaracaoListaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRExpressaoDeclaracaoListaId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRExpressaoDeclaracaoListaId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoDeclaracaoContext expressaoDeclaracao() throws RecognitionException {
		ExpressaoDeclaracaoContext _localctx = new ExpressaoDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressaoDeclaracao);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new RExpressaoDeclaracaoIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				rTipo();
				setState(407);
				identificador();
				}
				break;
			case 2:
				_localctx = new RExpressaoDeclaracaoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				rTipo();
				setState(410);
				expressaoAtribuicao();
				}
				break;
			case 3:
				_localctx = new RExpressaoDeclaracaoListaIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				prefixoLista();
				setState(413);
				rTipo();
				setState(414);
				identificador();
				}
				break;
			case 4:
				_localctx = new RExpressaoDeclaracaoListaAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				prefixoLista();
				setState(417);
				rTipo();
				setState(418);
				expressaoAtribuicaoLista();
				}
				break;
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

	public static class ConstanteContext extends ParserRuleContext {
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	 
		public ConstanteContext() { }
		public void copyFrom(ConstanteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RConstanteTextoContext extends ConstanteContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public RConstanteTextoContext(ConstanteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRConstanteTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRConstanteTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRConstanteTexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RConstanteNumContext extends ConstanteContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public RConstanteNumContext(ConstanteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRConstanteNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRConstanteNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRConstanteNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RConstanteVeracidadeContext extends ConstanteContext {
		public VeracidadeContext veracidade() {
			return getRuleContext(VeracidadeContext.class,0);
		}
		public RConstanteVeracidadeContext(ConstanteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRConstanteVeracidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRConstanteVeracidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRConstanteVeracidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constante);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new RConstanteNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				numero();
				}
				break;
			case TEXTO:
				_localctx = new RConstanteTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				texto();
				}
				break;
			case VERACID:
				_localctx = new RConstanteVeracidadeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				veracidade();
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

	public static class NumeroContext extends ParserRuleContext {
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	 
		public NumeroContext() { }
		public void copyFrom(NumeroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RNumeroContext extends NumeroContext {
		public TerminalNode NUM() { return getToken(gIncludeParser.NUM, 0); }
		public RNumeroContext(NumeroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numero);
		try {
			_localctx = new RNumeroContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(NUM);
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

	public static class TextoContext extends ParserRuleContext {
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	 
		public TextoContext() { }
		public void copyFrom(TextoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RTextoContext extends TextoContext {
		public TerminalNode TEXTO() { return getToken(gIncludeParser.TEXTO, 0); }
		public RTextoContext(TextoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_texto);
		try {
			_localctx = new RTextoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(TEXTO);
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

	public static class VeracidadeContext extends ParserRuleContext {
		public VeracidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veracidade; }
	 
		public VeracidadeContext() { }
		public void copyFrom(VeracidadeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RVeracidadeContext extends VeracidadeContext {
		public TerminalNode VERACID() { return getToken(gIncludeParser.VERACID, 0); }
		public RVeracidadeContext(VeracidadeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRVeracidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRVeracidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRVeracidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VeracidadeContext veracidade() throws RecognitionException {
		VeracidadeContext _localctx = new VeracidadeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_veracidade);
		try {
			_localctx = new RVeracidadeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(VERACID);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	 
		public IdentificadorContext() { }
		public void copyFrom(IdentificadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RIdentificadorContext extends IdentificadorContext {
		public TerminalNode ID() { return getToken(gIncludeParser.ID, 0); }
		public RIdentificadorContext(IdentificadorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identificador);
		try {
			_localctx = new RIdentificadorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(ID);
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

	public static class TipoNadaContext extends ParserRuleContext {
		public TipoNadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoNada; }
	 
		public TipoNadaContext() { }
		public void copyFrom(TipoNadaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RTipoNadaContext extends TipoNadaContext {
		public RTipoNadaContext(TipoNadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRTipoNada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRTipoNada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRTipoNada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoNadaContext tipoNada() throws RecognitionException {
		TipoNadaContext _localctx = new TipoNadaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipoNada);
		try {
			_localctx = new RTipoNadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__44);
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

	public static class RTipoContext extends ParserRuleContext {
		public TerminalNode TIPO_TEXTO() { return getToken(gIncludeParser.TIPO_TEXTO, 0); }
		public TerminalNode TIPO_NUMERO() { return getToken(gIncludeParser.TIPO_NUMERO, 0); }
		public TerminalNode TIPO_VERACIDADE() { return getToken(gIncludeParser.TIPO_VERACIDADE, 0); }
		public RTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RTipoContext rTipo() throws RecognitionException {
		RTipoContext _localctx = new RTipoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rTipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_TEXTO) | (1L << TIPO_NUMERO) | (1L << TIPO_VERACIDADE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrefixoListaContext extends ParserRuleContext {
		public PrefixoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixoLista; }
	 
		public PrefixoListaContext() { }
		public void copyFrom(PrefixoListaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RPrefixoListaContext extends PrefixoListaContext {
		public RPrefixoListaContext(PrefixoListaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).enterRPrefixoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gIncludeListener ) ((gIncludeListener)listener).exitRPrefixoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gIncludeVisitor ) return ((gIncludeVisitor<? extends T>)visitor).visitRPrefixoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixoListaContext prefixoLista() throws RecognitionException {
		PrefixoListaContext _localctx = new PrefixoListaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_prefixoLista);
		try {
			_localctx = new RPrefixoListaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__45);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return listaSentenca_sempred((ListaSentencaContext)_localctx, predIndex);
		case 1:
			return listaDeclaracao_sempred((ListaDeclaracaoContext)_localctx, predIndex);
		case 11:
			return listaExpressao_sempred((ListaExpressaoContext)_localctx, predIndex);
		case 17:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		case 18:
			return expressaoAditiva_sempred((ExpressaoAditivaContext)_localctx, predIndex);
		case 20:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaSentenca_sempred(ListaSentencaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listaDeclaracao_sempred(ListaDeclaracaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listaExpressao_sempred(ListaExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoAditiva_sempred(ExpressaoAditivaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3\3\7"+
		"\3R\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008c\n\b\r\b\16\b\u008d\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\b\5\b\u009e"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00c2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ce"+
		"\n\n\f\n\16\n\u00d1\13\n\5\n\u00d3\n\n\3\n\5\n\u00d6\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00dc\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ef\n\13\3\f\3\f\3\f\5\f\u00f4\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\16\3\16"+
		"\5\16\u0103\n\16\3\17\3\17\3\17\3\17\5\17\u0109\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\5\21\u0113\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u011c\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0124\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u0135\n\23\f\23\16\23\u0138\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0143\n\24\f\24\16\24\u0146\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0161\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u016a\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0172\n\26\f\26\16\26\u0175\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0188\n\27"+
		"\3\30\3\30\3\30\3\30\5\30\u018e\n\30\3\30\3\30\7\30\u0192\n\30\f\30\16"+
		"\30\u0195\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01a7\n\31\3\32\3\32\3\32\5\32\u01ac\n"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2"+
		"\b\2\4\30$&*\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@\2\3\3\2\61\63\2\u01d7\2B\3\2\2\2\4L\3\2\2\2\6V\3\2\2\2\bd\3\2"+
		"\2\2\nf\3\2\2\2\fk\3\2\2\2\16\u00a9\3\2\2\2\20\u00c1\3\2\2\2\22\u00c3"+
		"\3\2\2\2\24\u00ee\3\2\2\2\26\u00f3\3\2\2\2\30\u00f5\3\2\2\2\32\u0102\3"+
		"\2\2\2\34\u0108\3\2\2\2\36\u010a\3\2\2\2 \u011b\3\2\2\2\"\u0123\3\2\2"+
		"\2$\u0125\3\2\2\2&\u0139\3\2\2\2(\u0160\3\2\2\2*\u0169\3\2\2\2,\u0187"+
		"\3\2\2\2.\u0189\3\2\2\2\60\u01a6\3\2\2\2\62\u01ab\3\2\2\2\64\u01ad\3\2"+
		"\2\2\66\u01af\3\2\2\28\u01b1\3\2\2\2:\u01b3\3\2\2\2<\u01b5\3\2\2\2>\u01b7"+
		"\3\2\2\2@\u01b9\3\2\2\2BC\b\2\1\2CD\5\b\5\2DI\3\2\2\2EF\f\3\2\2FH\5\b"+
		"\5\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2LM\b"+
		"\3\1\2MN\5\60\31\2NS\3\2\2\2OP\f\3\2\2PR\5\60\31\2QO\3\2\2\2RU\3\2\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2V[\7\3\2\2WZ\5\4\3\2XZ\5\2\2"+
		"\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2"+
		"\2\2^_\7\4\2\2_\7\3\2\2\2`e\5\24\13\2ae\5\16\b\2be\5\20\t\2ce\5\22\n\2"+
		"d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\t\3\2\2\2fg\7\5\2\2gh\5\32\16"+
		"\2hi\7\6\2\2ij\5\2\2\2j\13\3\2\2\2kl\7\7\2\2lm\7\6\2\2mn\5\2\2\2n\r\3"+
		"\2\2\2op\7\b\2\2pq\7\t\2\2qr\5*\26\2rs\7\n\2\2st\7\13\2\2tu\5\6\4\2u\u00aa"+
		"\3\2\2\2vw\7\b\2\2wx\7\t\2\2xy\5*\26\2yz\7\n\2\2z{\7\13\2\2{|\5\6\4\2"+
		"|}\7\f\2\2}~\5\6\4\2~\u00aa\3\2\2\2\177\u0080\7\b\2\2\u0080\u0081\7\t"+
		"\2\2\u0081\u0082\5*\26\2\u0082\u0083\7\n\2\2\u0083\u0084\7\13\2\2\u0084"+
		"\u008b\5\6\4\2\u0085\u0086\7\r\2\2\u0086\u0087\7\t\2\2\u0087\u0088\5*"+
		"\26\2\u0088\u0089\7\n\2\2\u0089\u008a\5\6\4\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\6\4\2\u0091"+
		"\u00aa\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5"+
		"&\24\2\u0095\u0096\7\n\2\2\u0096\u0098\7\3\2\2\u0097\u0099\5\n\6\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5\f\7\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00aa\3\2"+
		"\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5&\24\2\u00a4"+
		"\u00a5\7\n\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7\4"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9o\3\2\2\2\u00a9v\3\2\2\2\u00a9\177\3\2\2"+
		"\2\u00a9\u0092\3\2\2\2\u00a9\u00a1\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00ac"+
		"\7\17\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af\7\n\2\2"+
		"\u00af\u00b0\5\6\4\2\u00b0\u00c2\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3"+
		"\5\6\4\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5*\26\2"+
		"\u00b6\u00b7\7\n\2\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba"+
		"\5\32\16\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\7\24"+
		"\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\5\6\4\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00ab\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b8\3\2"+
		"\2\2\u00c2\21\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5:\36\2\u00c5\u00c6"+
		"\7\27\2\2\u00c6\u00d5\7\t\2\2\u00c7\u00c8\5> \2\u00c8\u00cf\5:\36\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00cb\5> \2\u00cb\u00cc\5:\36\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00c7\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\5<\37\2\u00d5"+
		"\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\n"+
		"\2\2\u00d8\u00db\7\30\2\2\u00d9\u00dc\5> \2\u00da\u00dc\5<\37\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\5\6"+
		"\4\2\u00de\23\3\2\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\31\2\2\u00e1"+
		"\u00ef\3\2\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e4\7\31\2\2\u00e4\u00ef\3"+
		"\2\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\31\2\2\u00e7\u00ef\3\2\2\2\u00e8"+
		"\u00e9\5\60\31\2\u00e9\u00ea\7\31\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00ec"+
		"\5,\27\2\u00ec\u00ed\7\31\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00df\3\2\2\2"+
		"\u00ee\u00e2\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ef\25\3\2\2\2\u00f0\u00f4\5\34\17\2\u00f1\u00f4\5&\24\2\u00f2"+
		"\u00f4\5*\26\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\27\3\2\2\2\u00f5\u00f6\b\r\1\2\u00f6\u00f7\5\26\f\2\u00f7\u00fd"+
		"\3\2\2\2\u00f8\u00f9\f\3\2\2\u00f9\u00fa\7\24\2\2\u00fa\u00fc\5\26\f\2"+
		"\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\5:\36\2\u0101"+
		"\u0103\5\62\32\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\33\3\2"+
		"\2\2\u0104\u0109\5\32\16\2\u0105\u0109\5\36\20\2\u0106\u0109\5 \21\2\u0107"+
		"\u0109\5\"\22\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3"+
		"\2\2\2\u0108\u0107\3\2\2\2\u0109\35\3\2\2\2\u010a\u010b\5:\36\2\u010b"+
		"\u010c\7\32\2\2\u010c\u010d\5\26\f\2\u010d\u010e\7\33\2\2\u010e\37\3\2"+
		"\2\2\u010f\u0110\5:\36\2\u0110\u0112\7\t\2\2\u0111\u0113\5\30\r\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\n"+
		"\2\2\u0115\u011c\3\2\2\2\u0116\u0117\7\34\2\2\u0117\u0118\7\t\2\2\u0118"+
		"\u0119\5\26\f\2\u0119\u011a\7\n\2\2\u011a\u011c\3\2\2\2\u011b\u010f\3"+
		"\2\2\2\u011b\u0116\3\2\2\2\u011c!\3\2\2\2\u011d\u011e\5:\36\2\u011e\u011f"+
		"\7\35\2\2\u011f\u0124\3\2\2\2\u0120\u0121\5:\36\2\u0121\u0122\7\36\2\2"+
		"\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124#\3"+
		"\2\2\2\u0125\u0126\b\23\1\2\u0126\u0127\5\34\17\2\u0127\u0136\3\2\2\2"+
		"\u0128\u0129\f\6\2\2\u0129\u012a\7\37\2\2\u012a\u0135\5$\23\7\u012b\u012c"+
		"\f\5\2\2\u012c\u012d\7 \2\2\u012d\u0135\5$\23\6\u012e\u012f\f\4\2\2\u012f"+
		"\u0130\7!\2\2\u0130\u0135\5$\23\5\u0131\u0132\f\3\2\2\u0132\u0133\7\""+
		"\2\2\u0133\u0135\5$\23\4\u0134\u0128\3\2\2\2\u0134\u012b\3\2\2\2\u0134"+
		"\u012e\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137%\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a"+
		"\b\24\1\2\u013a\u013b\5$\23\2\u013b\u0144\3\2\2\2\u013c\u013d\f\4\2\2"+
		"\u013d\u013e\7#\2\2\u013e\u0143\5&\24\5\u013f\u0140\f\3\2\2\u0140\u0141"+
		"\7$\2\2\u0141\u0143\5&\24\4\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\'\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0147\u0161\5&\24\2\u0148\u0149\5&\24\2\u0149\u014a"+
		"\7%\2\2\u014a\u014b\5&\24\2\u014b\u0161\3\2\2\2\u014c\u014d\5&\24\2\u014d"+
		"\u014e\7&\2\2\u014e\u014f\5&\24\2\u014f\u0161\3\2\2\2\u0150\u0151\5&\24"+
		"\2\u0151\u0152\7\'\2\2\u0152\u0153\5&\24\2\u0153\u0161\3\2\2\2\u0154\u0155"+
		"\5&\24\2\u0155\u0156\7(\2\2\u0156\u0157\5&\24\2\u0157\u0161\3\2\2\2\u0158"+
		"\u0159\5&\24\2\u0159\u015a\7)\2\2\u015a\u015b\5&\24\2\u015b\u0161\3\2"+
		"\2\2\u015c\u015d\5&\24\2\u015d\u015e\7*\2\2\u015e\u015f\5&\24\2\u015f"+
		"\u0161\3\2\2\2\u0160\u0147\3\2\2\2\u0160\u0148\3\2\2\2\u0160\u014c\3\2"+
		"\2\2\u0160\u0150\3\2\2\2\u0160\u0154\3\2\2\2\u0160\u0158\3\2\2\2\u0160"+
		"\u015c\3\2\2\2\u0161)\3\2\2\2\u0162\u0163\b\26\1\2\u0163\u016a\5(\25\2"+
		"\u0164\u0165\7-\2\2\u0165\u0166\7\t\2\2\u0166\u0167\5*\26\2\u0167\u0168"+
		"\7\n\2\2\u0168\u016a\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0164\3\2\2\2\u016a"+
		"\u0173\3\2\2\2\u016b\u016c\f\5\2\2\u016c\u016d\7+\2\2\u016d\u0172\5*\26"+
		"\6\u016e\u016f\f\4\2\2\u016f\u0170\7,\2\2\u0170\u0172\5*\26\5\u0171\u016b"+
		"\3\2\2\2\u0171\u016e\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174+\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5:\36\2"+
		"\u0177\u0178\7.\2\2\u0178\u0179\5\32\16\2\u0179\u0188\3\2\2\2\u017a\u017b"+
		"\5:\36\2\u017b\u017c\7.\2\2\u017c\u017d\5&\24\2\u017d\u0188\3\2\2\2\u017e"+
		"\u017f\5:\36\2\u017f\u0180\7.\2\2\u0180\u0181\5*\26\2\u0181\u0188\3\2"+
		"\2\2\u0182\u0183\5\36\20\2\u0183\u0184\7.\2\2\u0184\u0185\5*\26\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0188\5.\30\2\u0187\u0176\3\2\2\2\u0187\u017a\3\2"+
		"\2\2\u0187\u017e\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"-\3\2\2\2\u0189\u018a\5:\36\2\u018a\u018b\7.\2\2\u018b\u018d\7\32\2\2"+
		"\u018c\u018e\5*\26\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0193"+
		"\3\2\2\2\u018f\u0190\7\24\2\2\u0190\u0192\5*\26\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\33\2\2\u0197/\3\2\2\2\u0198"+
		"\u0199\5> \2\u0199\u019a\5:\36\2\u019a\u01a7\3\2\2\2\u019b\u019c\5> \2"+
		"\u019c\u019d\5,\27\2\u019d\u01a7\3\2\2\2\u019e\u019f\5@!\2\u019f\u01a0"+
		"\5> \2\u01a0\u01a1\5:\36\2\u01a1\u01a7\3\2\2\2\u01a2\u01a3\5@!\2\u01a3"+
		"\u01a4\5> \2\u01a4\u01a5\5.\30\2\u01a5\u01a7\3\2\2\2\u01a6\u0198\3\2\2"+
		"\2\u01a6\u019b\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\61"+
		"\3\2\2\2\u01a8\u01ac\5\64\33\2\u01a9\u01ac\5\66\34\2\u01aa\u01ac\58\35"+
		"\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\63"+
		"\3\2\2\2\u01ad\u01ae\7\67\2\2\u01ae\65\3\2\2\2\u01af\u01b0\7\65\2\2\u01b0"+
		"\67\3\2\2\2\u01b1\u01b2\7\64\2\2\u01b29\3\2\2\2\u01b3\u01b4\7:\2\2\u01b4"+
		";\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6=\3\2\2\2\u01b7\u01b8\t\2\2\2\u01b8"+
		"?\3\2\2\2\u01b9\u01ba\7\60\2\2\u01baA\3\2\2\2%ISY[d\u008d\u009a\u009d"+
		"\u00a9\u00c1\u00cf\u00d2\u00d5\u00db\u00ee\u00f3\u00fd\u0102\u0108\u0112"+
		"\u011b\u0123\u0134\u0136\u0142\u0144\u0160\u0169\u0171\u0173\u0187\u018d"+
		"\u0193\u01a6\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}