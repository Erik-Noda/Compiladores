// Generated from Gramatica.g4 by ANTLR 4.7.2
//----------------------------------------------------------------------------------------------------------
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PCDec=1, PCProg=2, PCInt=3, PCReal=4, PCLer=5, PCImprimir=6, PCSe=7, PCSenao=8, 
		PCEntao=9, PCEnqto=10, PCIni=11, PCFim=12, OpAritMult=13, OpAritDiv=14, 
		OpAritSoma=15, OpAritSub=16, OpRelMenor=17, OpRelMenorIgual=18, OpRelMaior=19, 
		OpRelMaiorIgual=20, OpRelIgual=21, OpRelDif=22, OpBoolE=23, OpBoolOu=24, 
		IniDelim=25, FimDelim=26, Atrib=27, AbrePar=28, FechaPar=29, Var=30, NumInt=31, 
		NumReal=32, Cadeia=33, Coment=34, EspBranco=35;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_expressaoAritmetica = 3, 
		RULE_expressaoAritmeticaLinha = 4, RULE_termoAritmetico = 5, RULE_termoAritmeticoLinha = 6, 
		RULE_fatorAritmetico = 7, RULE_expressaoRelacional = 8, RULE_expressaoRelacionalLinha = 9, 
		RULE_termoRelacional = 10, RULE_operadorRelacional = 11, RULE_operadorBooleano = 12, 
		RULE_listaComandos = 13, RULE_comando = 14, RULE_comandoAtribuicao = 15, 
		RULE_comandoEntrada = 16, RULE_comandoSaida = 17, RULE_comandoSaidaLinha = 18, 
		RULE_comandoCondicao = 19, RULE_comandoRepeticao = 20, RULE_subAlgoritmo = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "expressaoAritmetica", 
			"expressaoAritmeticaLinha", "termoAritmetico", "termoAritmeticoLinha", 
			"fatorAritmetico", "expressaoRelacional", "expressaoRelacionalLinha", 
			"termoRelacional", "operadorRelacional", "operadorBooleano", "listaComandos", 
			"comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", "comandoSaidaLinha", 
			"comandoCondicao", "comandoRepeticao", "subAlgoritmo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dec'", "'prog'", "'integer'", "'float'", "'read'", "'print'", 
			"'if'", "'else'", "'then'", "'while'", "'start'", "'end'", "'*'", "'/'", 
			"'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'and'", 
			"'or'", "'['", "']'", "'<<'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PCDec", "PCProg", "PCInt", "PCReal", "PCLer", "PCImprimir", "PCSe", 
			"PCSenao", "PCEntao", "PCEnqto", "PCIni", "PCFim", "OpAritMult", "OpAritDiv", 
			"OpAritSoma", "OpAritSub", "OpRelMenor", "OpRelMenorIgual", "OpRelMaior", 
			"OpRelMaiorIgual", "OpRelIgual", "OpRelDif", "OpBoolE", "OpBoolOu", "IniDelim", 
			"FimDelim", "Atrib", "AbrePar", "FechaPar", "Var", "NumInt", "NumReal", 
			"Cadeia", "Coment", "EspBranco"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	//----------------------------------------------------------------------------------------------------------
		private String _nomeVar;
		private String _tipoVar;
		private String _valorVar;
		private Simbolo _simboloVar;
		private TabelaSimbolos tabelaSimbolos = new TabelaSimbolos();
		
		private Programa programa= new Programa();
		
		//comandos
		private ArrayList<Comando>listaCmd= new ArrayList<Comando>();
		
		//comando escrita
		private String _escritaVar;
		
		//comando leitura
		private String _leituraVar;
		
		//comando atribuicao
		private String _expVar;
		private String _expConteudo;
		
		//comando condicao
		private String _condicao;
		private ArrayList<Comando>listaAux= new ArrayList<Comando>();
		private ArrayList<Comando>_listaTrue= new ArrayList<Comando>();
		private ArrayList<Comando>_listaFalse= new ArrayList<Comando>();
		
		//comando repeticao
		private String _condicaoWhile;
		private ArrayList<Comando>_listaWhile= new ArrayList<Comando>();
		
		//verificar variaveis
		public void verificaVar(String nomeVar){
			if(!tabelaSimbolos.exists(nomeVar)){
				System.out.println("\nErro Semantico variavel nao declarada " + nomeVar);
			}
		}
		
		
		public void geradorComando(){
			programa.geradorAlvo();
		}
		

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> IniDelim() { return getTokens(GramaticaParser.IniDelim); }
		public TerminalNode IniDelim(int i) {
			return getToken(GramaticaParser.IniDelim, i);
		}
		public TerminalNode PCDec() { return getToken(GramaticaParser.PCDec, 0); }
		public List<TerminalNode> FimDelim() { return getTokens(GramaticaParser.FimDelim); }
		public TerminalNode FimDelim(int i) {
			return getToken(GramaticaParser.FimDelim, i);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode PCProg() { return getToken(GramaticaParser.PCProg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IniDelim);
			setState(45);
			match(PCDec);
			setState(46);
			match(FimDelim);
			setState(47);
			listaDeclaracoes();
			setState(48);
			match(IniDelim);
			setState(49);
			match(PCProg);
			setState(50);
			match(FimDelim);
			setState(51);
			listaComandos();
			setState(52);
			match(EOF);

					  	programa.setTabelaVar(tabelaSimbolos);
						programa.setComando(listaCmd);
					  
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

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public int qtdeDecl;
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListaDeclaracoesContext)_localctx).qtdeDecl = 0;
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				declaracao();
				_localctx.qtdeDecl++;
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var );
			System.out.println("quantidade de declaracoes = " + _localctx.qtdeDecl);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode IniDelim() { return getToken(GramaticaParser.IniDelim, 0); }
		public TerminalNode FimDelim() { return getToken(GramaticaParser.FimDelim, 0); }
		public TerminalNode PCInt() { return getToken(GramaticaParser.PCInt, 0); }
		public TerminalNode PCReal() { return getToken(GramaticaParser.PCReal, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Var);
			setState(66);
			match(IniDelim);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==PCInt || _la==PCReal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

										  _nomeVar = _input.LT(-3).getText();
										  _tipoVar = _input.LT(-1).getText();
										  _valorVar =null;
										  _simboloVar = new Simbolo(_nomeVar,_tipoVar,_valorVar);
										  
										  	if(!tabelaSimbolos.exists(_nomeVar)){
										  		tabelaSimbolos.add(_simboloVar);	
										  	}else{
										  		System.out.println("\nErro Semantico: variavel declarada mais de uma vez " + _simboloVar);
										  	}
										  
			setState(69);
			match(FimDelim);
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaLinhaContext expressaoAritmeticaLinha() {
			return getRuleContext(ExpressaoAritmeticaLinhaContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressaoAritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			termoAritmetico();
			setState(72);
			expressaoAritmeticaLinha();
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

	public static class ExpressaoAritmeticaLinhaContext extends ParserRuleContext {
		public List<TermoAritmeticoContext> termoAritmetico() {
			return getRuleContexts(TermoAritmeticoContext.class);
		}
		public TermoAritmeticoContext termoAritmetico(int i) {
			return getRuleContext(TermoAritmeticoContext.class,i);
		}
		public List<TerminalNode> OpAritSoma() { return getTokens(GramaticaParser.OpAritSoma); }
		public TerminalNode OpAritSoma(int i) {
			return getToken(GramaticaParser.OpAritSoma, i);
		}
		public List<TerminalNode> OpAritSub() { return getTokens(GramaticaParser.OpAritSub); }
		public TerminalNode OpAritSub(int i) {
			return getToken(GramaticaParser.OpAritSub, i);
		}
		public ExpressaoAritmeticaLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmeticaLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoAritmeticaLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoAritmeticaLinha(this);
		}
	}

	public final ExpressaoAritmeticaLinhaContext expressaoAritmeticaLinha() throws RecognitionException {
		ExpressaoAritmeticaLinhaContext _localctx = new ExpressaoAritmeticaLinhaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressaoAritmeticaLinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritSoma || _la==OpAritSub) {
				{
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpAritSoma:
					{
					setState(74);
					match(OpAritSoma);
					_expConteudo+="+";
					}
					break;
				case OpAritSub:
					{
					setState(76);
					match(OpAritSub);
					_expConteudo+="-";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80);
				termoAritmetico();
				}
				}
				setState(85);
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

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoLinhaContext termoAritmeticoLinha() {
			return getRuleContext(TermoAritmeticoLinhaContext.class,0);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_termoAritmetico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			fatorAritmetico();
			setState(87);
			termoAritmeticoLinha();
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

	public static class TermoAritmeticoLinhaContext extends ParserRuleContext {
		public List<FatorAritmeticoContext> fatorAritmetico() {
			return getRuleContexts(FatorAritmeticoContext.class);
		}
		public FatorAritmeticoContext fatorAritmetico(int i) {
			return getRuleContext(FatorAritmeticoContext.class,i);
		}
		public List<TerminalNode> OpAritMult() { return getTokens(GramaticaParser.OpAritMult); }
		public TerminalNode OpAritMult(int i) {
			return getToken(GramaticaParser.OpAritMult, i);
		}
		public List<TerminalNode> OpAritDiv() { return getTokens(GramaticaParser.OpAritDiv); }
		public TerminalNode OpAritDiv(int i) {
			return getToken(GramaticaParser.OpAritDiv, i);
		}
		public TermoAritmeticoLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmeticoLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoAritmeticoLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoAritmeticoLinha(this);
		}
	}

	public final TermoAritmeticoLinhaContext termoAritmeticoLinha() throws RecognitionException {
		TermoAritmeticoLinhaContext _localctx = new TermoAritmeticoLinhaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termoAritmeticoLinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAritMult || _la==OpAritDiv) {
				{
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpAritMult:
					{
					setState(89);
					match(OpAritMult);
					_expConteudo+="*";
					}
					break;
				case OpAritDiv:
					{
					setState(91);
					match(OpAritDiv);
					_expConteudo+="/";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95);
				fatorAritmetico();
				}
				}
				setState(100);
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

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(GramaticaParser.NumInt, 0); }
		public TerminalNode NumReal() { return getToken(GramaticaParser.NumReal, 0); }
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(GramaticaParser.AbrePar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GramaticaParser.FechaPar, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fatorAritmetico);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(NumInt);

												_expConteudo+=_input.LT(-1).getText();
												_condicao+=" ";
												_condicao+=_input.LT(-1).getText();
											
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(NumReal);

												_expConteudo+=_input.LT(-1).getText();
												_condicao+=" ";
												_condicao+=_input.LT(-1).getText();
											
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(Var);

												verificaVar(_input.LT(-1).getText());
												_expConteudo+=_input.LT(-1).getText();
												_condicao+=" ";
												_condicao+=_input.LT(-1).getText();
											
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(AbrePar);
				_expConteudo+="(";
				setState(109);
				expressaoAritmetica();
				setState(110);
				match(FechaPar);
				_expConteudo+=")";
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

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalLinhaContext expressaoRelacionalLinha() {
			return getRuleContext(ExpressaoRelacionalLinhaContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressaoRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			termoRelacional();
			setState(116);
			expressaoRelacionalLinha();
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

	public static class ExpressaoRelacionalLinhaContext extends ParserRuleContext {
		public List<OperadorBooleanoContext> operadorBooleano() {
			return getRuleContexts(OperadorBooleanoContext.class);
		}
		public OperadorBooleanoContext operadorBooleano(int i) {
			return getRuleContext(OperadorBooleanoContext.class,i);
		}
		public List<TermoRelacionalContext> termoRelacional() {
			return getRuleContexts(TermoRelacionalContext.class);
		}
		public TermoRelacionalContext termoRelacional(int i) {
			return getRuleContext(TermoRelacionalContext.class,i);
		}
		public ExpressaoRelacionalLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacionalLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoRelacionalLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoRelacionalLinha(this);
		}
	}

	public final ExpressaoRelacionalLinhaContext expressaoRelacionalLinha() throws RecognitionException {
		ExpressaoRelacionalLinhaContext _localctx = new ExpressaoRelacionalLinhaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaoRelacionalLinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpBoolE || _la==OpBoolOu) {
				{
				{
				setState(118);
				operadorBooleano();

																_condicao+=" "; 
																_condicao+=_input.LT(-1).getText();
															
				setState(120);
				termoRelacional();

										 						_condicao+=" ";
										 						_condicao+=_expConteudo;
										 						_expConteudo = "";
									 						
				}
				}
				setState(127);
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

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public TerminalNode AbrePar() { return getToken(GramaticaParser.AbrePar, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GramaticaParser.FechaPar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termoRelacional);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_expConteudo = "";
				setState(129);
				expressaoAritmetica();
				setState(130);
				operadorRelacional();

															_condicao+=" ";
															_condicao+=_input.LT(-1).getText();
														
				setState(132);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(AbrePar);

															_condicao+=" (";
														
				setState(136);
				expressaoRelacional();
				setState(137);
				match(FechaPar);

															_condicao+=" )";
														
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

	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode OpRelMenor() { return getToken(GramaticaParser.OpRelMenor, 0); }
		public TerminalNode OpRelMenorIgual() { return getToken(GramaticaParser.OpRelMenorIgual, 0); }
		public TerminalNode OpRelMaior() { return getToken(GramaticaParser.OpRelMaior, 0); }
		public TerminalNode OpRelMaiorIgual() { return getToken(GramaticaParser.OpRelMaiorIgual, 0); }
		public TerminalNode OpRelIgual() { return getToken(GramaticaParser.OpRelIgual, 0); }
		public TerminalNode OpRelDif() { return getToken(GramaticaParser.OpRelDif, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperadorRelacional(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpRelMenor) | (1L << OpRelMenorIgual) | (1L << OpRelMaior) | (1L << OpRelMaiorIgual) | (1L << OpRelIgual) | (1L << OpRelDif))) != 0)) ) {
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

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public TerminalNode OpBoolE() { return getToken(GramaticaParser.OpBoolE, 0); }
		public TerminalNode OpBoolOu() { return getToken(GramaticaParser.OpBoolOu, 0); }
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperadorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperadorBooleano(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==OpBoolE || _la==OpBoolOu) ) {
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

	public static class ListaComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				comando();

												listaCmd.addAll(listaAux);
												listaAux.removeAll(listaAux);
											
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLer) | (1L << PCImprimir) | (1L << PCSe) | (1L << PCEnqto) | (1L << PCIni) | (1L << Var))) != 0) );
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				comandoSaida();
				}
				break;
			case PCSe:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				comandoRepeticao();
				}
				break;
			case PCIni:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				subAlgoritmo();
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode Atrib() { return getToken(GramaticaParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Var);

										verificaVar(_input.LT(-1).getText());
										_expVar = _input.LT(-1).getText();	
									
			setState(163);
			match(Atrib);
			_expConteudo = "";
			setState(165);
			expressaoAritmetica();

														ComandoAtribuicao cmd = new ComandoAtribuicao(_expVar,_expConteudo);
														listaAux.add(cmd);
														System.out.println(listaAux);
													
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

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode PCLer() { return getToken(GramaticaParser.PCLer, 0); }
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PCLer);
			setState(169);
			match(Var);

										verificaVar(_input.LT(-1).getText());
										_leituraVar = _input.LT(-1).getText();
										
										Simbolo var = tabelaSimbolos.get(_leituraVar);
									
										//verificando tipo
										if(var.getTipo().equals("integer")){
											ComandoLeitura cmd = new ComandoLeitura(_leituraVar,1);
											listaAux.add(cmd);
											
										}else if(var.getTipo().equals("float")){
											ComandoLeitura cmd = new ComandoLeitura(_leituraVar,2);
											listaAux.add(cmd);
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

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode PCImprimir() { return getToken(GramaticaParser.PCImprimir, 0); }
		public ComandoSaidaLinhaContext comandoSaidaLinha() {
			return getRuleContext(ComandoSaidaLinhaContext.class,0);
		}
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(PCImprimir);
			setState(173);
			comandoSaidaLinha();
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

	public static class ComandoSaidaLinhaContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode Cadeia() { return getToken(GramaticaParser.Cadeia, 0); }
		public ComandoSaidaLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaidaLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoSaidaLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoSaidaLinha(this);
		}
	}

	public final ComandoSaidaLinhaContext comandoSaidaLinha() throws RecognitionException {
		ComandoSaidaLinhaContext _localctx = new ComandoSaidaLinhaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comandoSaidaLinha);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(Var);

											verificaVar(_input.LT(-1).getText());
											_escritaVar = _input.LT(-1).getText();
											
											Simbolo var = tabelaSimbolos.get(_escritaVar);
											
											//verificando tipo
											if(var.getTipo().equals("integer")){
												ComandoEscrita cmd = new ComandoEscrita(_escritaVar,1);
												listaAux.add(cmd);
												
											}else if(var.getTipo().equals("float")){
												ComandoEscrita cmd = new ComandoEscrita(_escritaVar,2);
												listaAux.add(cmd);
											}

										
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Cadeia);

												String _cadeia =  _input.LT(-1).getText();
												ComandoEscrita cmd = new ComandoEscrita(_cadeia,3);
												listaAux.add(cmd);
											
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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public TerminalNode PCSe() { return getToken(GramaticaParser.PCSe, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GramaticaParser.PCEntao, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode PCSenao() { return getToken(GramaticaParser.PCSenao, 0); }
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(PCSe);
			_condicao="";
			setState(183);
			expressaoRelacional();
			setState(184);
			match(PCEntao);
			String condAux = _condicao;
									System.out.println("entrei no then");
									System.out.println("entrei no listaTrue");
									_listaTrue.addAll(listaAux);		
										listaAux.removeAll(listaAux);
			setState(186);
			comando();

										
										
									
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(188);
				match(PCSenao);
				setState(189);
				comando();

				                			_listaFalse.addAll(listaAux);
											listaAux.removeAll(listaAux);
				                		
				}
				break;
			}

					                	ComandoCondicao cmd = new ComandoCondicao(condAux, _listaTrue, _listaFalse);
					                	listaAux.add(cmd);
					                
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

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public TerminalNode PCEnqto() { return getToken(GramaticaParser.PCEnqto, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GramaticaParser.PCEntao, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(PCEnqto);
			_condicaoWhile = "";
			setState(198);
			expressaoRelacional();
			setState(199);
			match(PCEntao);
			setState(200);
			comando();

											ComandoRepeticao cmd = new ComandoRepeticao(_condicaoWhile, _listaWhile);
					                		listaAux.add(cmd);
										
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

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public TerminalNode PCIni() { return getToken(GramaticaParser.PCIni, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode PCFim() { return getToken(GramaticaParser.PCFim, 0); }
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(PCIni);
			System.out.println("entrei start");
			setState(205);
			listaComandos();
			setState(206);
			match(PCFim);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\7\6T\n"+
		"\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\7\bc\n\b\f"+
		"\b\16\bf\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\6\17\u0098\n\17\r\17\16\17\u0099\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00b6\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c3\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\5"+
		"\6\3\2\23\30\3\2\31\32\2\u00ce\2.\3\2\2\2\49\3\2\2\2\6C\3\2\2\2\bI\3\2"+
		"\2\2\nU\3\2\2\2\fX\3\2\2\2\16d\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24\177"+
		"\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2\34\u0097\3"+
		"\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2\2\2\"\u00aa\3\2\2\2$\u00ae\3\2\2\2"+
		"&\u00b5\3\2\2\2(\u00b7\3\2\2\2*\u00c6\3\2\2\2,\u00cd\3\2\2\2./\7\33\2"+
		"\2/\60\7\3\2\2\60\61\7\34\2\2\61\62\5\4\3\2\62\63\7\33\2\2\63\64\7\4\2"+
		"\2\64\65\7\34\2\2\65\66\5\34\17\2\66\67\7\2\2\3\678\b\2\1\28\3\3\2\2\2"+
		"9=\b\3\1\2:;\5\6\4\2;<\b\3\1\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@A\3\2\2\2AB\b\3\1\2B\5\3\2\2\2CD\7 \2\2DE\7\33\2\2EF\t\2\2"+
		"\2FG\b\4\1\2GH\7\34\2\2H\7\3\2\2\2IJ\5\f\7\2JK\5\n\6\2K\t\3\2\2\2LM\7"+
		"\21\2\2MQ\b\6\1\2NO\7\22\2\2OQ\b\6\1\2PL\3\2\2\2PN\3\2\2\2QR\3\2\2\2R"+
		"T\5\f\7\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2"+
		"\2XY\5\20\t\2YZ\5\16\b\2Z\r\3\2\2\2[\\\7\17\2\2\\`\b\b\1\2]^\7\20\2\2"+
		"^`\b\b\1\2_[\3\2\2\2_]\3\2\2\2`a\3\2\2\2ac\5\20\t\2b_\3\2\2\2cf\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fd\3\2\2\2gh\7!\2\2ht\b\t\1\2ij\7\""+
		"\2\2jt\b\t\1\2kl\7 \2\2lt\b\t\1\2mn\7\36\2\2no\b\t\1\2op\5\b\5\2pq\7\37"+
		"\2\2qr\b\t\1\2rt\3\2\2\2sg\3\2\2\2si\3\2\2\2sk\3\2\2\2sm\3\2\2\2t\21\3"+
		"\2\2\2uv\5\26\f\2vw\5\24\13\2w\23\3\2\2\2xy\5\32\16\2yz\b\13\1\2z{\5\26"+
		"\f\2{|\b\13\1\2|~\3\2\2\2}x\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\f\1\2\u0083"+
		"\u0084\5\b\5\2\u0084\u0085\5\30\r\2\u0085\u0086\b\f\1\2\u0086\u0087\5"+
		"\b\5\2\u0087\u008f\3\2\2\2\u0088\u0089\7\36\2\2\u0089\u008a\b\f\1\2\u008a"+
		"\u008b\5\22\n\2\u008b\u008c\7\37\2\2\u008c\u008d\b\f\1\2\u008d\u008f\3"+
		"\2\2\2\u008e\u0082\3\2\2\2\u008e\u0088\3\2\2\2\u008f\27\3\2\2\2\u0090"+
		"\u0091\t\3\2\2\u0091\31\3\2\2\2\u0092\u0093\t\4\2\2\u0093\33\3\2\2\2\u0094"+
		"\u0095\5\36\20\2\u0095\u0096\b\17\1\2\u0096\u0098\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\35\3\2\2\2\u009b\u00a2\5 \21\2\u009c\u00a2\5\"\22\2\u009d\u00a2\5$\23"+
		"\2\u009e\u00a2\5(\25\2\u009f\u00a2\5*\26\2\u00a0\u00a2\5,\27\2\u00a1\u009b"+
		"\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\7 \2\2"+
		"\u00a4\u00a5\b\21\1\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\b\21\1\2\u00a7"+
		"\u00a8\5\b\5\2\u00a8\u00a9\b\21\1\2\u00a9!\3\2\2\2\u00aa\u00ab\7\7\2\2"+
		"\u00ab\u00ac\7 \2\2\u00ac\u00ad\b\22\1\2\u00ad#\3\2\2\2\u00ae\u00af\7"+
		"\b\2\2\u00af\u00b0\5&\24\2\u00b0%\3\2\2\2\u00b1\u00b2\7 \2\2\u00b2\u00b6"+
		"\b\24\1\2\u00b3\u00b4\7#\2\2\u00b4\u00b6\b\24\1\2\u00b5\u00b1\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b6\'\3\2\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\b"+
		"\25\1\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\b\25\1\2"+
		"\u00bc\u00bd\5\36\20\2\u00bd\u00c2\b\25\1\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c0\5\36\20\2\u00c0\u00c1\b\25\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00be"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\25\1\2"+
		"\u00c5)\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\b\26\1\2\u00c8\u00c9\5"+
		"\22\n\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\b\26\1"+
		"\2\u00cc+\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\b\27\1\2\u00cf\u00d0"+
		"\5\34\17\2\u00d0\u00d1\7\16\2\2\u00d1-\3\2\2\2\16?PU_ds\177\u008e\u0099"+
		"\u00a1\u00b5\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}