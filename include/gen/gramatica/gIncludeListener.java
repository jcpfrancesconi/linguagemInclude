// Generated from C:/Users/USER/Google Drive/CC - PUC/5º semestre/COMP - COMPILADORES/Programas/Compiladores/includev2/src/gramatica\gInclude.g4 by ANTLR 4.9.1
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gIncludeParser}.
 */
public interface gIncludeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code rListaSentencaLista}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRListaSentencaLista(gIncludeParser.RListaSentencaListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaSentencaLista}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRListaSentencaLista(gIncludeParser.RListaSentencaListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rListaSentencaUnica}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRListaSentencaUnica(gIncludeParser.RListaSentencaUnicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaSentencaUnica}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRListaSentencaUnica(gIncludeParser.RListaSentencaUnicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rListaDeclaracaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRListaDeclaracaoUnica(gIncludeParser.RListaDeclaracaoUnicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaDeclaracaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRListaDeclaracaoUnica(gIncludeParser.RListaDeclaracaoUnicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rListaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRListaDeclaracao(gIncludeParser.RListaDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRListaDeclaracao(gIncludeParser.RListaDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaComposta}
	 * labeled alternative in {@link gIncludeParser#sentencaComposta}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaComposta(gIncludeParser.RSentencaCompostaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaComposta}
	 * labeled alternative in {@link gIncludeParser#sentencaComposta}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaComposta(gIncludeParser.RSentencaCompostaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaExpressao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaExpressao(gIncludeParser.RSentencaExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaExpressao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaExpressao(gIncludeParser.RSentencaExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecao(gIncludeParser.RSentencaSelecaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecao(gIncludeParser.RSentencaSelecaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaIteracao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaIteracao(gIncludeParser.RSentencaIteracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaIteracao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaIteracao(gIncludeParser.RSentencaIteracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaFuncao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaFuncao(gIncludeParser.RSentencaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaFuncao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaFuncao(gIncludeParser.RSentencaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaCasoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaCaso}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaCasoFilha(gIncludeParser.RSentencaCasoFilhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaCasoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaCaso}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaCasoFilha(gIncludeParser.RSentencaCasoFilhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaPadraoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaPadrao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaPadraoFilha(gIncludeParser.RSentencaPadraoFilhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaPadraoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaPadrao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaPadraoFilha(gIncludeParser.RSentencaPadraoFilhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecaoEntao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecaoEntao(gIncludeParser.RSentencaSelecaoEntaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecaoEntao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecaoEntao(gIncludeParser.RSentencaSelecaoEntaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecaoSenao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecaoSenao(gIncludeParser.RSentencaSelecaoSenaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecaoSenao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecaoSenao(gIncludeParser.RSentencaSelecaoSenaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecaoSenaoSe}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecaoSenaoSe(gIncludeParser.RSentencaSelecaoSenaoSeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecaoSenaoSe}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecaoSenaoSe(gIncludeParser.RSentencaSelecaoSenaoSeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecaoChecarCaso}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecaoChecarCaso(gIncludeParser.RSentencaSelecaoChecarCasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecaoChecarCaso}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecaoChecarCaso(gIncludeParser.RSentencaSelecaoChecarCasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rSentencaSelecaoChecarPadrao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void enterRSentencaSelecaoChecarPadrao(gIncludeParser.RSentencaSelecaoChecarPadraoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rSentencaSelecaoChecarPadrao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 */
	void exitRSentencaSelecaoChecarPadrao(gIncludeParser.RSentencaSelecaoChecarPadraoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rIteracaoEnquanto}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void enterRIteracaoEnquanto(gIncludeParser.RIteracaoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rIteracaoEnquanto}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void exitRIteracaoEnquanto(gIncludeParser.RIteracaoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rIteracaoRepita}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void enterRIteracaoRepita(gIncludeParser.RIteracaoRepitaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rIteracaoRepita}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void exitRIteracaoRepita(gIncludeParser.RIteracaoRepitaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rIteracaoPara}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void enterRIteracaoPara(gIncludeParser.RIteracaoParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rIteracaoPara}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 */
	void exitRIteracaoPara(gIncludeParser.RIteracaoParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rDeclaraFuncao}
	 * labeled alternative in {@link gIncludeParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterRDeclaraFuncao(gIncludeParser.RDeclaraFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rDeclaraFuncao}
	 * labeled alternative in {@link gIncludeParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitRDeclaraFuncao(gIncludeParser.RDeclaraFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoSentencaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoSentencaPrimaria(gIncludeParser.RExpressaoSentencaPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoSentencaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoSentencaPrimaria(gIncludeParser.RExpressaoSentencaPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoSentencaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoSentencaAditiva(gIncludeParser.RExpressaoSentencaAditivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoSentencaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoSentencaAditiva(gIncludeParser.RExpressaoSentencaAditivaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoSentencaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoSentencaLogica(gIncludeParser.RExpressaoSentencaLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoSentencaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoSentencaLogica(gIncludeParser.RExpressaoSentencaLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoSentencaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoSentencaDeclaracao(gIncludeParser.RExpressaoSentencaDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoSentencaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoSentencaDeclaracao(gIncludeParser.RExpressaoSentencaDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoSentencaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoSentencaAtribuicao(gIncludeParser.RExpressaoSentencaAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoSentencaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoSentencaAtribuicao(gIncludeParser.RExpressaoSentencaAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoPosfixa(gIncludeParser.RExpressaoPosfixaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoPosfixa(gIncludeParser.RExpressaoPosfixaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPosFixaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterRPosFixaAditiva(gIncludeParser.RPosFixaAditivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPosFixaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitRPosFixaAditiva(gIncludeParser.RPosFixaAditivaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoLogica}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoLogica(gIncludeParser.RExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoLogica}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoLogica(gIncludeParser.RExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rListaExpressaoLista}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void enterRListaExpressaoLista(gIncludeParser.RListaExpressaoListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaExpressaoLista}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void exitRListaExpressaoLista(gIncludeParser.RListaExpressaoListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rListaExpressaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void enterRListaExpressaoUnica(gIncludeParser.RListaExpressaoUnicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rListaExpressaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void exitRListaExpressaoUnica(gIncludeParser.RListaExpressaoUnicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPrimariaIdentificador}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterRPrimariaIdentificador(gIncludeParser.RPrimariaIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPrimariaIdentificador}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitRPrimariaIdentificador(gIncludeParser.RPrimariaIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPrimariaConstante}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterRPrimariaConstante(gIncludeParser.RPrimariaConstanteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPrimariaConstante}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitRPrimariaConstante(gIncludeParser.RPrimariaConstanteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPosfixaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void enterRPosfixaPrimaria(gIncludeParser.RPosfixaPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPosfixaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void exitRPosfixaPrimaria(gIncludeParser.RPosfixaPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPosfixaLista}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void enterRPosfixaLista(gIncludeParser.RPosfixaListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPosfixaLista}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void exitRPosfixaLista(gIncludeParser.RPosfixaListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPosfixaFuncao}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void enterRPosfixaFuncao(gIncludeParser.RPosfixaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPosfixaFuncao}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void exitRPosfixaFuncao(gIncludeParser.RPosfixaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPosfixaIncremento}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void enterRPosfixaIncremento(gIncludeParser.RPosfixaIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPosfixaIncremento}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 */
	void exitRPosfixaIncremento(gIncludeParser.RPosfixaIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoListaFilha(gIncludeParser.RExpressaoListaFilhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoListaFilha(gIncludeParser.RExpressaoListaFilhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoFuncaoFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoFuncaoFilha(gIncludeParser.RExpressaoFuncaoFilhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoFuncaoFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoFuncaoFilha(gIncludeParser.RExpressaoFuncaoFilhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rMostrar}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterRMostrar(gIncludeParser.RMostrarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rMostrar}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitRMostrar(gIncludeParser.RMostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoIncrementoMais}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoIncrementoMais(gIncludeParser.RExpressaoIncrementoMaisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoIncrementoMais}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoIncrementoMais(gIncludeParser.RExpressaoIncrementoMaisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoIncrementoMenos}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoIncrementoMenos(gIncludeParser.RExpressaoIncrementoMenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoIncrementoMenos}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoIncrementoMenos(gIncludeParser.RExpressaoIncrementoMenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoMultiplicativaResto}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoMultiplicativaResto(gIncludeParser.RExpressaoMultiplicativaRestoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoMultiplicativaResto}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoMultiplicativaResto(gIncludeParser.RExpressaoMultiplicativaRestoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoMultiplicativaPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoMultiplicativaPosfixa(gIncludeParser.RExpressaoMultiplicativaPosfixaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoMultiplicativaPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoMultiplicativaPosfixa(gIncludeParser.RExpressaoMultiplicativaPosfixaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoMultiplicativaMult}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoMultiplicativaMult(gIncludeParser.RExpressaoMultiplicativaMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoMultiplicativaMult}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoMultiplicativaMult(gIncludeParser.RExpressaoMultiplicativaMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoMultiplicativaDiv}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoMultiplicativaDiv(gIncludeParser.RExpressaoMultiplicativaDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoMultiplicativaDiv}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoMultiplicativaDiv(gIncludeParser.RExpressaoMultiplicativaDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoMultiplicativaDivInt}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoMultiplicativaDivInt(gIncludeParser.RExpressaoMultiplicativaDivIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoMultiplicativaDivInt}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoMultiplicativaDivInt(gIncludeParser.RExpressaoMultiplicativaDivIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAditivaSub}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAditivaSub(gIncludeParser.RExpressaoAditivaSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAditivaSub}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAditivaSub(gIncludeParser.RExpressaoAditivaSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAditivaMultplicativa}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAditivaMultplicativa(gIncludeParser.RExpressaoAditivaMultplicativaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAditivaMultplicativa}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAditivaMultplicativa(gIncludeParser.RExpressaoAditivaMultplicativaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAditivaSoma}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAditivaSoma(gIncludeParser.RExpressaoAditivaSomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAditivaSoma}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAditivaSoma(gIncludeParser.RExpressaoAditivaSomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaAditiva(gIncludeParser.RExpressaoComparativaAditivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaAditiva(gIncludeParser.RExpressaoComparativaAditivaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaIgualdade}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaIgualdade(gIncludeParser.RExpressaoComparativaIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaIgualdade}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaIgualdade(gIncludeParser.RExpressaoComparativaIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaDiferente}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaDiferente(gIncludeParser.RExpressaoComparativaDiferenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaDiferente}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaDiferente(gIncludeParser.RExpressaoComparativaDiferenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaMaior}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaMaior(gIncludeParser.RExpressaoComparativaMaiorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaMaior}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaMaior(gIncludeParser.RExpressaoComparativaMaiorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaMenor}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaMenor(gIncludeParser.RExpressaoComparativaMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaMenor}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaMenor(gIncludeParser.RExpressaoComparativaMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaMaiorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaMaiorIgual(gIncludeParser.RExpressaoComparativaMaiorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaMaiorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaMaiorIgual(gIncludeParser.RExpressaoComparativaMaiorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoComparativaMenorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoComparativaMenorIgual(gIncludeParser.RExpressaoComparativaMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoComparativaMenorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoComparativaMenorIgual(gIncludeParser.RExpressaoComparativaMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoLogicaInv}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoLogicaInv(gIncludeParser.RExpressaoLogicaInvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoLogicaInv}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoLogicaInv(gIncludeParser.RExpressaoLogicaInvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoLogicaOu}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoLogicaOu(gIncludeParser.RExpressaoLogicaOuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoLogicaOu}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoLogicaOu(gIncludeParser.RExpressaoLogicaOuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoLogicaComparativa}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoLogicaComparativa(gIncludeParser.RExpressaoLogicaComparativaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoLogicaComparativa}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoLogicaComparativa(gIncludeParser.RExpressaoLogicaComparativaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoLogicaE}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoLogicaE(gIncludeParser.RExpressaoLogicaEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoLogicaE}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoLogicaE(gIncludeParser.RExpressaoLogicaEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoIdPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoIdPrimaria(gIncludeParser.RExpressaoAtribuicaoIdPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoIdPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoIdPrimaria(gIncludeParser.RExpressaoAtribuicaoIdPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoIdAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoIdAditiva(gIncludeParser.RExpressaoAtribuicaoIdAditivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoIdAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoIdAditiva(gIncludeParser.RExpressaoAtribuicaoIdAditivaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoIdLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoIdLogica(gIncludeParser.RExpressaoAtribuicaoIdLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoIdLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoIdLogica(gIncludeParser.RExpressaoAtribuicaoIdLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoListaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoListaLogica(gIncludeParser.RExpressaoAtribuicaoListaLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoListaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoListaLogica(gIncludeParser.RExpressaoAtribuicaoListaLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoLista}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoLista(gIncludeParser.RExpressaoAtribuicaoListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoLista}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoLista(gIncludeParser.RExpressaoAtribuicaoListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoAtribuicaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicaoLista}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoAtribuicaoListaFilha(gIncludeParser.RExpressaoAtribuicaoListaFilhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoAtribuicaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicaoLista}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoAtribuicaoListaFilha(gIncludeParser.RExpressaoAtribuicaoListaFilhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoDeclaracaoId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoDeclaracaoId(gIncludeParser.RExpressaoDeclaracaoIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoDeclaracaoId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoDeclaracaoId(gIncludeParser.RExpressaoDeclaracaoIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoDeclaracaoAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoDeclaracaoAtribuicao(gIncludeParser.RExpressaoDeclaracaoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoDeclaracaoAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoDeclaracaoAtribuicao(gIncludeParser.RExpressaoDeclaracaoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoDeclaracaoListaId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoDeclaracaoListaId(gIncludeParser.RExpressaoDeclaracaoListaIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoDeclaracaoListaId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoDeclaracaoListaId(gIncludeParser.RExpressaoDeclaracaoListaIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rExpressaoDeclaracaoListaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRExpressaoDeclaracaoListaAtribuicao(gIncludeParser.RExpressaoDeclaracaoListaAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rExpressaoDeclaracaoListaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRExpressaoDeclaracaoListaAtribuicao(gIncludeParser.RExpressaoDeclaracaoListaAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rConstanteNum}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterRConstanteNum(gIncludeParser.RConstanteNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rConstanteNum}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitRConstanteNum(gIncludeParser.RConstanteNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rConstanteTexto}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterRConstanteTexto(gIncludeParser.RConstanteTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rConstanteTexto}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitRConstanteTexto(gIncludeParser.RConstanteTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rConstanteVeracidade}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterRConstanteVeracidade(gIncludeParser.RConstanteVeracidadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rConstanteVeracidade}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitRConstanteVeracidade(gIncludeParser.RConstanteVeracidadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rNumero}
	 * labeled alternative in {@link gIncludeParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterRNumero(gIncludeParser.RNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rNumero}
	 * labeled alternative in {@link gIncludeParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitRNumero(gIncludeParser.RNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rTexto}
	 * labeled alternative in {@link gIncludeParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterRTexto(gIncludeParser.RTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rTexto}
	 * labeled alternative in {@link gIncludeParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitRTexto(gIncludeParser.RTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rVeracidade}
	 * labeled alternative in {@link gIncludeParser#veracidade}.
	 * @param ctx the parse tree
	 */
	void enterRVeracidade(gIncludeParser.RVeracidadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rVeracidade}
	 * labeled alternative in {@link gIncludeParser#veracidade}.
	 * @param ctx the parse tree
	 */
	void exitRVeracidade(gIncludeParser.RVeracidadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rIdentificador}
	 * labeled alternative in {@link gIncludeParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterRIdentificador(gIncludeParser.RIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rIdentificador}
	 * labeled alternative in {@link gIncludeParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitRIdentificador(gIncludeParser.RIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rTipoNada}
	 * labeled alternative in {@link gIncludeParser#tipoNada}.
	 * @param ctx the parse tree
	 */
	void enterRTipoNada(gIncludeParser.RTipoNadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rTipoNada}
	 * labeled alternative in {@link gIncludeParser#tipoNada}.
	 * @param ctx the parse tree
	 */
	void exitRTipoNada(gIncludeParser.RTipoNadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gIncludeParser#rTipo}.
	 * @param ctx the parse tree
	 */
	void enterRTipo(gIncludeParser.RTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gIncludeParser#rTipo}.
	 * @param ctx the parse tree
	 */
	void exitRTipo(gIncludeParser.RTipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rPrefixoLista}
	 * labeled alternative in {@link gIncludeParser#prefixoLista}.
	 * @param ctx the parse tree
	 */
	void enterRPrefixoLista(gIncludeParser.RPrefixoListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rPrefixoLista}
	 * labeled alternative in {@link gIncludeParser#prefixoLista}.
	 * @param ctx the parse tree
	 */
	void exitRPrefixoLista(gIncludeParser.RPrefixoListaContext ctx);
}