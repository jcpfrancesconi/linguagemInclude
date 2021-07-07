grammar gInclude;

//REGRAS DE PRODUÇÃO

//sentenças


listaSentenca: sentenca 		#rListaSentencaUnica
	| listaSentenca sentenca	#rListaSentencaLista
	;



listaDeclaracao: expressaoDeclaracao #rListaDeclaracaoUnica
		| listaDeclaracao expressaoDeclaracao #rListaDeclaracao
		;
sentencaComposta: '{' (listaDeclaracao | listaSentenca)* '}' #rSentencaComposta
			;

sentenca: expressaoSentenca #rSentencaExpressao
	| sentencaSelecao #rSentencaSelecao
	| sentencaIteracao #rSentencaIteracao
	| declaracaoFuncao #rSentencaFuncao
;

	//sentenças do checar

sentencaCaso: 'caso' expressaoPrimaria ':' listaSentenca  #rSentencaCasoFilha
		;

sentencaPadrao: 'padrao' ':' listaSentenca  #rSentencaPadraoFilha
		;

	//sentenças de seleção

sentencaSelecao: 'se' '(' expressaoLogica ')'  'entao' sentencaComposta  #rSentencaSelecaoEntao //feito
		| 'se' '(' expressaoLogica ')' 'entao' sentencaComposta 'senao' sentencaComposta  #rSentencaSelecaoSenao  //feito
		| 'se' '(' expressaoLogica ')' 'entao' sentencaComposta ('senao se' '(' expressaoLogica ')' sentencaComposta)+ 'senao' sentencaComposta  #rSentencaSelecaoSenaoSe  //feito
		| 'checar' '(' expressaoAditiva ')' '{' (sentencaCaso)+ sentencaPadrao? '}'  #rSentencaSelecaoChecarCaso  //feito
		| 'checar' '(' expressaoAditiva ')' '{' sentencaPadrao '}'  #rSentencaSelecaoChecarPadrao  //feito
		;
	//senteças de iteração
sentencaIteracao: 'enquanto' '(' expressaoLogica ')' sentencaComposta #rIteracaoEnquanto
		| 'repita' sentencaComposta 'ate que' '(' expressaoLogica ')' #rIteracaoRepita
		| 'para k de ' expressaoPrimaria ' ate ' expressaoPrimaria ',' 'passo' expressaoPrimaria sentencaComposta #rIteracaoPara
		;
	//declaração de função

declaracaoFuncao: 'funcao ' identificador ' recebe' '(' (((rTipo identificador (',' rTipo identificador)*)?) | tipoNada) ')' 'retorna ' (rTipo | tipoNada) sentencaComposta #rDeclaraFuncao
       		 ;

expressaoSentenca: expressaoPrimaria ';' 	#rExpressaoSentencaPrimaria
			| expressaoAditiva ';'	#rExpressaoSentencaAditiva
			| expressaoLogica ';'	#rExpressaoSentencaLogica
			| expressaoDeclaracao ';'	#rExpressaoSentencaDeclaracao
			| expressaoAtribuicao ';'	#rExpressaoSentencaAtribuicao
			;

//expressões
expressao: expressaoPosfixa 		#rExpressaoPosfixa
	| expressaoAditiva  #rPosFixaAditiva
	| expressaoLogica		#rExpressaoLogica
;

listaExpressao: expressao				#rListaExpressaoUnica
		| listaExpressao ',' expressao		#rListaExpressaoLista
		;

expressaoPrimaria: identificador			#rPrimariaIdentificador
	| constante					#rPrimariaConstante
	;

//expressões posfixas
expressaoPosfixa: expressaoPrimaria		#rPosfixaPrimaria
        | expressaoLista			#rPosfixaLista
		| expressaoFuncao			#rPosfixaFuncao
		| expressaoIncremento		#rPosfixaIncremento
;
expressaoLista: identificador '[' expressao ']'		#rExpressaoListaFilha
		;
expressaoFuncao: identificador '(' listaExpressao? ')'	#rExpressaoFuncaoFilha
				  |'mostrar' '(' expressao ')' # rMostrar
		;
expressaoIncremento: identificador '++'			#rExpressaoIncrementoMais
			| identificador '--'			#rExpressaoIncrementoMenos
;

//expressões infixas
//aritméticas
//multiplicativas
expressaoMultiplicativa: expressaoPosfixa  #rExpressaoMultiplicativaPosfixa
			| expressaoMultiplicativa '*' expressaoMultiplicativa  #rExpressaoMultiplicativaMult  //feito
			| expressaoMultiplicativa '/' expressaoMultiplicativa  #rExpressaoMultiplicativaDiv     //feito
			| expressaoMultiplicativa '//' expressaoMultiplicativa  #rExpressaoMultiplicativaDivInt     //feito
			| expressaoMultiplicativa '%' expressaoMultiplicativa  #rExpressaoMultiplicativaResto   //feito
			;


		//aditivas
expressaoAditiva: expressaoMultiplicativa   #rExpressaoAditivaMultplicativa
		| expressaoAditiva '+' expressaoAditiva  #rExpressaoAditivaSoma
		| expressaoAditiva '-' expressaoAditiva  #rExpressaoAditivaSub
		;

expressaoComparativa: expressaoAditiva #rExpressaoComparativaAditiva
            | expressaoAditiva '==' expressaoAditiva  #rExpressaoComparativaIgualdade  //feito
			| expressaoAditiva '!=' expressaoAditiva  #rExpressaoComparativaDiferente   //feito
			| expressaoAditiva '>' expressaoAditiva  #rExpressaoComparativaMaior    //feito
			| expressaoAditiva '<' expressaoAditiva  #rExpressaoComparativaMenor    //feito
			| expressaoAditiva '>=' expressaoAditiva  #rExpressaoComparativaMaiorIgual  //feito
			| expressaoAditiva '<=' expressaoAditiva  #rExpressaoComparativaMenorIgual  //feito
			;


		//lógicas
expressaoLogica: expressaoComparativa  #rExpressaoLogicaComparativa
		| expressaoLogica 'e' expressaoLogica  #rExpressaoLogicaE
		| expressaoLogica 'ou' expressaoLogica  #rExpressaoLogicaOu
		| 'inverso' '(' expressaoLogica ')'  #rExpressaoLogicaInv
		;
		
		//atribuições
expressaoAtribuicao: identificador '=' expressaoPrimaria  #rExpressaoAtribuicaoIdPrimaria
			| identificador '=' expressaoAditiva  #rExpressaoAtribuicaoIdAditiva
			| identificador '=' expressaoLogica  #rExpressaoAtribuicaoIdLogica
			| expressaoLista '=' expressaoLogica  #rExpressaoAtribuicaoListaLogica
			| expressaoAtribuicaoLista  #rExpressaoAtribuicaoLista
			;

expressaoAtribuicaoLista: identificador '=' '[' expressaoLogica? (','expressaoLogica)* ']'  #rExpressaoAtribuicaoListaFilha
			;
		
//declarações
expressaoDeclaracao: rTipo identificador  #rExpressaoDeclaracaoId
			| rTipo expressaoAtribuicao  #rExpressaoDeclaracaoAtribuicao
			| prefixoLista rTipo identificador  #rExpressaoDeclaracaoListaId
			| prefixoLista rTipo expressaoAtribuicaoLista  #rExpressaoDeclaracaoListaAtribuicao
			;


constante: numero  #rConstanteNum
| texto  #rConstanteTexto
| veracidade  #rConstanteVeracidade
;

numero: NUM #rNumero
	;
texto: TEXTO #rTexto
	;
veracidade: VERACID #rVeracidade
	;
identificador: ID  #rIdentificador
	;

tipoNada: 'nada'  #rTipoNada
	;
rTipo: TIPO_TEXTO | TIPO_NUMERO | TIPO_VERACIDADE ;
prefixoLista: 'lista de '   #rPrefixoLista
	;

//Definicao Regular

TIPO_TEXTO: 'texto' ;
TIPO_NUMERO: 'numero';
TIPO_VERACIDADE: 'veracidade';

VERACID: 'verdadeiro' | 'falso';

fragment
LETRA: [a-zA-Z];

fragment
UNDERS: '_';

fragment
NDIG:  LETRA| UNDERS;

fragment
ASP2: '"';

fragment
CHAR: NDIG|EXTRA;

fragment
DIG: [0-9] ;

TEXTO: ASP2 (CHAR | DIG)* ASP2;


SEP : [ \t\n\r]+ -> skip ;

fragment
EXTRA: [~"][!-_ ];


NUM: '-'? DIG (PONTO DIG)? DIG*;

fragment
PONTO: '.' ;

COMENTL:  '#' ~[\r\n]* -> skip ;

COMENTB:   '##' .*? '##' -> skip;

ID : LETRA (NDIG|DIG)*;
