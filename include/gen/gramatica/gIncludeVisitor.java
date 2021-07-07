// Generated from C:/Users/USER/Google Drive/CC - PUC/5º semestre/COMP - COMPILADORES/Programas/Compiladores/includev2/src/gramatica\gInclude.g4 by ANTLR 4.9.1
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gIncludeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gIncludeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code rListaSentencaLista}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaSentencaLista(gIncludeParser.RListaSentencaListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rListaSentencaUnica}
	 * labeled alternative in {@link gIncludeParser#listaSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaSentencaUnica(gIncludeParser.RListaSentencaUnicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rListaDeclaracaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaDeclaracaoUnica(gIncludeParser.RListaDeclaracaoUnicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rListaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaDeclaracao(gIncludeParser.RListaDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaComposta}
	 * labeled alternative in {@link gIncludeParser#sentencaComposta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaComposta(gIncludeParser.RSentencaCompostaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaExpressao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaExpressao(gIncludeParser.RSentencaExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecao(gIncludeParser.RSentencaSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaIteracao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaIteracao(gIncludeParser.RSentencaIteracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaFuncao}
	 * labeled alternative in {@link gIncludeParser#sentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaFuncao(gIncludeParser.RSentencaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaCasoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaCasoFilha(gIncludeParser.RSentencaCasoFilhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaPadraoFilha}
	 * labeled alternative in {@link gIncludeParser#sentencaPadrao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaPadraoFilha(gIncludeParser.RSentencaPadraoFilhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecaoEntao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecaoEntao(gIncludeParser.RSentencaSelecaoEntaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecaoSenao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecaoSenao(gIncludeParser.RSentencaSelecaoSenaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecaoSenaoSe}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecaoSenaoSe(gIncludeParser.RSentencaSelecaoSenaoSeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecaoChecarCaso}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecaoChecarCaso(gIncludeParser.RSentencaSelecaoChecarCasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rSentencaSelecaoChecarPadrao}
	 * labeled alternative in {@link gIncludeParser#sentencaSelecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRSentencaSelecaoChecarPadrao(gIncludeParser.RSentencaSelecaoChecarPadraoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rIteracaoEnquanto}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRIteracaoEnquanto(gIncludeParser.RIteracaoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rIteracaoRepita}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRIteracaoRepita(gIncludeParser.RIteracaoRepitaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rIteracaoPara}
	 * labeled alternative in {@link gIncludeParser#sentencaIteracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRIteracaoPara(gIncludeParser.RIteracaoParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rDeclaraFuncao}
	 * labeled alternative in {@link gIncludeParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRDeclaraFuncao(gIncludeParser.RDeclaraFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoSentencaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoSentencaPrimaria(gIncludeParser.RExpressaoSentencaPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoSentencaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoSentencaAditiva(gIncludeParser.RExpressaoSentencaAditivaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoSentencaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoSentencaLogica(gIncludeParser.RExpressaoSentencaLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoSentencaDeclaracao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoSentencaDeclaracao(gIncludeParser.RExpressaoSentencaDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoSentencaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoSentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoSentencaAtribuicao(gIncludeParser.RExpressaoSentencaAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoPosfixa(gIncludeParser.RExpressaoPosfixaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPosFixaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPosFixaAditiva(gIncludeParser.RPosFixaAditivaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoLogica}
	 * labeled alternative in {@link gIncludeParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoLogica(gIncludeParser.RExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rListaExpressaoLista}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaExpressaoLista(gIncludeParser.RListaExpressaoListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rListaExpressaoUnica}
	 * labeled alternative in {@link gIncludeParser#listaExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRListaExpressaoUnica(gIncludeParser.RListaExpressaoUnicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPrimariaIdentificador}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPrimariaIdentificador(gIncludeParser.RPrimariaIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPrimariaConstante}
	 * labeled alternative in {@link gIncludeParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPrimariaConstante(gIncludeParser.RPrimariaConstanteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPosfixaPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPosfixaPrimaria(gIncludeParser.RPosfixaPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPosfixaLista}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPosfixaLista(gIncludeParser.RPosfixaListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPosfixaFuncao}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPosfixaFuncao(gIncludeParser.RPosfixaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPosfixaIncremento}
	 * labeled alternative in {@link gIncludeParser#expressaoPosfixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPosfixaIncremento(gIncludeParser.RPosfixaIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoListaFilha(gIncludeParser.RExpressaoListaFilhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoFuncaoFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoFuncaoFilha(gIncludeParser.RExpressaoFuncaoFilhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rMostrar}
	 * labeled alternative in {@link gIncludeParser#expressaoFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRMostrar(gIncludeParser.RMostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoIncrementoMais}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoIncrementoMais(gIncludeParser.RExpressaoIncrementoMaisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoIncrementoMenos}
	 * labeled alternative in {@link gIncludeParser#expressaoIncremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoIncrementoMenos(gIncludeParser.RExpressaoIncrementoMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoMultiplicativaResto}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoMultiplicativaResto(gIncludeParser.RExpressaoMultiplicativaRestoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoMultiplicativaPosfixa}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoMultiplicativaPosfixa(gIncludeParser.RExpressaoMultiplicativaPosfixaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoMultiplicativaMult}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoMultiplicativaMult(gIncludeParser.RExpressaoMultiplicativaMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoMultiplicativaDiv}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoMultiplicativaDiv(gIncludeParser.RExpressaoMultiplicativaDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoMultiplicativaDivInt}
	 * labeled alternative in {@link gIncludeParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoMultiplicativaDivInt(gIncludeParser.RExpressaoMultiplicativaDivIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAditivaSub}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAditivaSub(gIncludeParser.RExpressaoAditivaSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAditivaMultplicativa}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAditivaMultplicativa(gIncludeParser.RExpressaoAditivaMultplicativaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAditivaSoma}
	 * labeled alternative in {@link gIncludeParser#expressaoAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAditivaSoma(gIncludeParser.RExpressaoAditivaSomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaAditiva(gIncludeParser.RExpressaoComparativaAditivaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaIgualdade}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaIgualdade(gIncludeParser.RExpressaoComparativaIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaDiferente}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaDiferente(gIncludeParser.RExpressaoComparativaDiferenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaMaior}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaMaior(gIncludeParser.RExpressaoComparativaMaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaMenor}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaMenor(gIncludeParser.RExpressaoComparativaMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaMaiorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaMaiorIgual(gIncludeParser.RExpressaoComparativaMaiorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoComparativaMenorIgual}
	 * labeled alternative in {@link gIncludeParser#expressaoComparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoComparativaMenorIgual(gIncludeParser.RExpressaoComparativaMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoLogicaInv}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoLogicaInv(gIncludeParser.RExpressaoLogicaInvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoLogicaOu}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoLogicaOu(gIncludeParser.RExpressaoLogicaOuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoLogicaComparativa}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoLogicaComparativa(gIncludeParser.RExpressaoLogicaComparativaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoLogicaE}
	 * labeled alternative in {@link gIncludeParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoLogicaE(gIncludeParser.RExpressaoLogicaEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoIdPrimaria}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoIdPrimaria(gIncludeParser.RExpressaoAtribuicaoIdPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoIdAditiva}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoIdAditiva(gIncludeParser.RExpressaoAtribuicaoIdAditivaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoIdLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoIdLogica(gIncludeParser.RExpressaoAtribuicaoIdLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoListaLogica}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoListaLogica(gIncludeParser.RExpressaoAtribuicaoListaLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoLista}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoLista(gIncludeParser.RExpressaoAtribuicaoListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoAtribuicaoListaFilha}
	 * labeled alternative in {@link gIncludeParser#expressaoAtribuicaoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoAtribuicaoListaFilha(gIncludeParser.RExpressaoAtribuicaoListaFilhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoDeclaracaoId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoDeclaracaoId(gIncludeParser.RExpressaoDeclaracaoIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoDeclaracaoAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoDeclaracaoAtribuicao(gIncludeParser.RExpressaoDeclaracaoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoDeclaracaoListaId}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoDeclaracaoListaId(gIncludeParser.RExpressaoDeclaracaoListaIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rExpressaoDeclaracaoListaAtribuicao}
	 * labeled alternative in {@link gIncludeParser#expressaoDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpressaoDeclaracaoListaAtribuicao(gIncludeParser.RExpressaoDeclaracaoListaAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rConstanteNum}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRConstanteNum(gIncludeParser.RConstanteNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rConstanteTexto}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRConstanteTexto(gIncludeParser.RConstanteTextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rConstanteVeracidade}
	 * labeled alternative in {@link gIncludeParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRConstanteVeracidade(gIncludeParser.RConstanteVeracidadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rNumero}
	 * labeled alternative in {@link gIncludeParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRNumero(gIncludeParser.RNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rTexto}
	 * labeled alternative in {@link gIncludeParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRTexto(gIncludeParser.RTextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rVeracidade}
	 * labeled alternative in {@link gIncludeParser#veracidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRVeracidade(gIncludeParser.RVeracidadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rIdentificador}
	 * labeled alternative in {@link gIncludeParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRIdentificador(gIncludeParser.RIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rTipoNada}
	 * labeled alternative in {@link gIncludeParser#tipoNada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRTipoNada(gIncludeParser.RTipoNadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gIncludeParser#rTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRTipo(gIncludeParser.RTipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rPrefixoLista}
	 * labeled alternative in {@link gIncludeParser#prefixoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPrefixoLista(gIncludeParser.RPrefixoListaContext ctx);
}