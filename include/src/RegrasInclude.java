import gramatica.*;
import model.Variavel;
import model.excecoes.ExcecaoSemantica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegrasInclude extends gIncludeBaseVisitor<Object>{
    // RegrasInclude.java::<<procedimento semântico>>
    Map<String, Variavel> memoria = new HashMap<>();
    Map<String, RegrasInclude> funcoes = new HashMap<>();
    gIncludeParser.RDeclaraFuncaoContext contexto;
    String[] ruleNames = gIncludeParser.ruleNames;

    public RegrasInclude() {
    }

    public RegrasInclude(gIncludeParser.RDeclaraFuncaoContext contexto) {
        this.contexto = contexto;
    }

    public boolean adicionaVariavel(String nome, Variavel variavel){
        if(!memoria.containsKey(nome)){
            memoria.put(nome, variavel);
            return true;
        }else{
            return false;
        }
    }

    //sentenças

    @Override
    public Integer visitRDeclaraFuncao(gIncludeParser.RDeclaraFuncaoContext ctx){
        Variavel identificador = (Variavel) visit(ctx.identificador(0));
        String nome = identificador.getNome();
        if(this.funcoes.containsKey(nome)){
            throw new ExcecaoSemantica("Função já declarada anteriormente.");
        }else{
            RegrasInclude funcao = new RegrasInclude(ctx);
            funcoes.put(nome, funcao);
            if(ctx.tipoNada().size()==0){
                int i;
                for(i = 0; i<ctx.rTipo().size()-1; i++){
                    Variavel variavel = (Variavel)visit(ctx.identificador(i+1));
                    String nomeVariavel = variavel.getNome();
                    Variavel nova = new Variavel((String)visit(ctx.rTipo(i)),nomeVariavel);
                    funcao.adicionaVariavel(nomeVariavel,nova);
                }
                Variavel tipoRetorno = new Variavel((String)visit(ctx.rTipo(i)), "retorna");
                funcao.adicionaVariavel("retorna", tipoRetorno);
            }
            return 1;
        }
    }


    @Override
    public Variavel visitRExpressaoFuncaoFilha(gIncludeParser.RExpressaoFuncaoFilhaContext ctx){
        Variavel identificador = (Variavel) visit(ctx.identificador());
        String nome = identificador.getNome();
        if(!this.funcoes.containsKey(nome)){
            throw new ExcecaoSemantica("Função inexistente.");
        }else{
            RegrasInclude funcao = funcoes.get(nome);
            ArrayList<Variavel> parametros = (ArrayList<Variavel>) visit(ctx.listaExpressao());
            if(parametros.size()!= funcao.memoria.size()){
                throw new ExcecaoSemantica("Numero errado de valores passados como parametros.");
            }
            int i = 0;
            for(String nomeParametro: funcao.memoria.keySet()){
                Variavel parametro = funcao.memoria.get(nomeParametro);
                Variavel valor = parametros.get(i);
                if(valor.getTipo().equals(parametro.getTipo())){
                    parametro.setValor(valor.getValor());
                }else{
                    throw new ExcecaoSemantica(i + "º valor passado é do tipo " + parametro.getTipo());
                }
            }
            Variavel resultado = (Variavel) visit(this.funcoes.get(nome).contexto.sentencaComposta());
            return resultado;
        }
    }




    @Override
    public Integer visitRSentencaSelecaoEntao(gIncludeParser.RSentencaSelecaoEntaoContext ctx) {
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica());
        Boolean cond = (Boolean) expressao.getValor();
        if(cond){visit(ctx.sentencaComposta());}
        return 1;
    }

    @Override
    public Integer visitRSentencaSelecaoSenao(gIncludeParser.RSentencaSelecaoSenaoContext ctx) {
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica());
        Boolean cond = (Boolean) expressao.getValor();
        if(cond){visit(ctx.sentencaComposta(0));}
        else{visit(ctx.sentencaComposta(1));}
        return 1;
    }


    @Override
    public Integer visitRSentencaSelecaoSenaoSe(gIncludeParser.RSentencaSelecaoSenaoSeContext ctx) {
        Boolean cond;
        Boolean achou = false;
        int i = 0;
        int tam = ctx.expressaoLogica().size() - 1;
        while((achou==false) && (i<=tam)){
            Variavel expressao = (Variavel) visit(ctx.expressaoLogica(i));
            cond = (Boolean) expressao.getValor();
            if(cond){
                visit(ctx.sentencaComposta(i));
                achou = true;
            }
            i++;
        }
        if(achou==false){visit(ctx.sentencaComposta(i));}
        return 1;
    }

    @Override
    public Integer visitRSentencaSelecaoChecarCaso (gIncludeParser.RSentencaSelecaoChecarCasoContext ctx){
        Boolean achou = false;
        int i = 0;
        Variavel expressao = (Variavel) visit(ctx.expressaoAditiva());
        int tam = ctx.sentencaCaso().size() ;
        while((achou==false) && (i<tam)){
            Variavel primaria = (Variavel) visit(ctx.sentencaCaso(i).getChild(1));
            if(expressao.valorIgual(primaria)){
                visit(ctx.sentencaCaso(i).getChild(3));
                achou = true;
            }
            i++;
        }
        if((achou==false) &&(ctx.sentencaPadrao()!=null)){visit(ctx.sentencaPadrao());}
        return 1;

    }

    @Override
    public Integer visitRSentencaSelecaoChecarPadrao(gIncludeParser.RSentencaSelecaoChecarPadraoContext ctx){
        visit(ctx.sentencaPadrao());
        return 1;
    }


    @Override
    public Integer visitRIteracaoEnquanto(gIncludeParser.RIteracaoEnquantoContext ctx){
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica());
        boolean condicao = (Boolean) expressao.getValor();
        while(condicao){
            visit(ctx.sentencaComposta());
            expressao = (Variavel) visit(ctx.expressaoLogica());
            condicao = (Boolean) expressao.getValor();
        }
        return 1;
    }

    @Override
    public Integer visitRIteracaoRepita(gIncludeParser.RIteracaoRepitaContext ctx){
        Variavel expressao;
        boolean condicao;
        do{
            visit(ctx.sentencaComposta());
            expressao = (Variavel) visit(ctx.expressaoLogica());
            condicao = (Boolean) expressao.getValor();
        }while(!condicao);
        return 1;
    }

    @Override
    public Integer visitRIteracaoPara (gIncludeParser.RIteracaoParaContext ctx){
        Variavel expressao1 = (Variavel) visit(ctx.expressaoPrimaria(0));
        Variavel expressao2 = (Variavel) visit(ctx.expressaoPrimaria(1));
        Variavel expressao3 = (Variavel) visit(ctx.expressaoPrimaria(2));
        Variavel k = new Variavel("numero", "k");
        Variavel salvar = new Variavel("outro", "salvar");
        if(memoria.containsKey("k")){
            salvar = memoria.get("k");
        }
        this.memoria.put("k", k);
        int i =  (int) ((Double) expressao1.getValor()).doubleValue();
        int f = (int) ((Double) expressao2.getValor()).doubleValue();
        int p = (int) ((Double) expressao3.getValor()).doubleValue();
        if(f>=i) {
            for (k.setValor(i); (Integer)k.getValor() <= f; k.setValor((Integer)k.getValor() + p)) {
                visit(ctx.sentencaComposta());
            }
        }else{
            for (k.setValor(i); (Integer)k.getValor() >= f; k.setValor((Integer)k.getValor() + p)) {
                visit(ctx.sentencaComposta());
            }
        }
        this.memoria.remove("k");
        if(!salvar.getNome().equals("salvar")){
            this.memoria.put("k", salvar);
        }
        return 1;
    }








    //expressoes
    public Variavel visitRPrimariaIdentificador(gIncludeParser.RPrimariaIdentificadorContext ctx){
        return (Variavel) visit(ctx.identificador());
    }
    public Variavel visitRPrimariaConstante(gIncludeParser.RPrimariaConstanteContext ctx){
        Variavel nova;
        Object valor = visit(ctx.constante());

        if(valor instanceof Double){
            nova = new Variavel("numero", valor);
        }else if(valor instanceof String){
            nova = new Variavel("texto", valor);
        }else if(valor instanceof Boolean){
            nova = new Variavel("veracidade", valor);
        }else{
            nova = new Variavel("outro", valor);
        }

        return nova;
    }

    public Variavel visitRExpressaoListaFilha(gIncludeParser.RExpressaoListaFilhaContext ctx){
        Variavel lista = (Variavel) visit(ctx.identificador());
        String nomeLista = lista.getNome();
        if(!this.memoria.containsKey(nomeLista)){
            throw new ExcecaoSemantica("Lista não existente.");
        }

        int indice = (int)((Double)((Variavel) visit(ctx.expressao())).getValor()).doubleValue();
        ArrayList<Variavel> listaRetornada = (ArrayList<Variavel>) memoria.get(nomeLista).getValor();

        return listaRetornada.get(indice);
    }

    public Variavel visitRExpressaoIncrementoMais(gIncludeParser.RExpressaoIncrementoMaisContext ctx){
        Variavel incrementada = (Variavel) visit(ctx.identificador());
        String nome = incrementada.getNome();
        if(!this.memoria.containsKey(nome)){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        Variavel acessada = this.memoria.get(nome);
        if(incrementada.getTipo().equals("numero")){
            acessada.setValor((Double)acessada.getValor() + 1);
        }
        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoIncrementoMenos(gIncludeParser.RExpressaoIncrementoMenosContext ctx){
        Variavel incrementada = (Variavel) visit(ctx.identificador());
        String nome = incrementada.getNome();
        if(!this.memoria.containsKey(nome)){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        Variavel acessada = this.memoria.get(nome);
        if(incrementada.getTipo().equals("numero")){
            acessada.setValor((Double)acessada.getValor() - 1);
        }
        return this.memoria.get(nome);
    }

    @Override
    public Variavel visitRListaExpressaoUnica (gIncludeParser.RListaExpressaoUnicaContext ctx){
        Variavel m = (Variavel) visit(ctx.expressao());
        return m;
    }

    @Override
    public ArrayList<Variavel> visitRListaExpressaoLista (gIncludeParser.RListaExpressaoListaContext ctx){
        ArrayList<Variavel> lista = new ArrayList<>();
        Variavel n = (Variavel) visit(ctx.expressao());
        lista.add(n);
        ArrayList<Variavel> m = (ArrayList<Variavel>) visit(ctx.listaExpressao());
        lista.addAll(m);
        return lista;
    }


    @Override
    public Variavel visitRExpressaoMultiplicativaMult(gIncludeParser.RExpressaoMultiplicativaMultContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para multiplicação.");
        }
        Double a = (Double) valor1.getValor();
        Double b = (Double) valor2.getValor();
        Variavel nova = new Variavel("numero", a*b);
        return nova;

    }

    @Override
    public Variavel visitRExpressaoMultiplicativaDiv(gIncludeParser.RExpressaoMultiplicativaDivContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para divisão.");
        }
        Double a = (Double) valor1.getValor();
        Double b = (Double) valor2.getValor();

        Variavel nova = new Variavel("numero", a/b);
        return nova;

    }

    @Override
    public Variavel visitRExpressaoMultiplicativaDivInt(gIncludeParser.RExpressaoMultiplicativaDivIntContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para divisão inteira.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();

        Variavel nova = new Variavel("numero", a/b);
        return nova;

    }

    @Override
    public Variavel visitRExpressaoMultiplicativaResto(gIncludeParser.RExpressaoMultiplicativaRestoContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para operação resto.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();

        Variavel nova = new Variavel("numero", a%b);
        return nova;

    }

    @Override
    public Variavel visitRExpressaoAditivaSoma (gIncludeParser.RExpressaoAditivaSomaContext ctx){
        Variavel nova;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((valor1.getTipo().equals("veracidade") || valor2.getTipo().equals("veracidade")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para soma.");
        }
        if(valor1.getTipo().equals("texto")){
            String texto1 = (String) valor1.getValor();
            String texto2 = (String) valor1.getValor();
            nova = new Variavel("texto", texto1 + texto2);
        }else {
            Double a = (Double) valor1.getValor();
            Double b = (Double) valor2.getValor();

            nova = new Variavel("numero", a + b);
        }
        return nova;


    }


    @Override
    public Variavel visitRExpressaoAditivaSub (gIncludeParser.RExpressaoAditivaSubContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para subtração.");
        }
        Double a = (Double) valor1.getValor();
        Double b = (Double) valor2.getValor();

        Variavel nova = new Variavel("numero", a-b);
        return nova;


    }





    @Override
    public Variavel visitRExpressaoComparativaIgualdade(gIncludeParser.RExpressaoComparativaIgualdadeContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(a.equals(b)){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }


    @Override
    public Variavel visitRExpressaoComparativaDiferente(gIncludeParser.RExpressaoComparativaDiferenteContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(!a.equals(b)){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }


    @Override
    public Variavel visitRExpressaoComparativaMaior(gIncludeParser.RExpressaoComparativaMaiorContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para comparação.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(a>b){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }


    @Override
    public Variavel visitRExpressaoComparativaMenor(gIncludeParser.RExpressaoComparativaMenorContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para comparação.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(a<b){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }



    @Override
    public Variavel visitRExpressaoComparativaMaiorIgual(gIncludeParser.RExpressaoComparativaMaiorIgualContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para comparação.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(a>=b){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }


    @Override
    public Variavel visitRExpressaoComparativaMenorIgual(gIncludeParser.RExpressaoComparativaMenorIgualContext ctx){
        Boolean retornado;
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("numero") || !valor2.getTipo().equals("numero")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para comparação.");
        }
        Integer a = (int) ((Double)valor1.getValor()).doubleValue();
        Integer b = (int) ((Double)valor2.getValor()).doubleValue();
        if(a<=b){retornado = true;}
        else {retornado = false;}

        Variavel nova = new Variavel("veracidade", retornado);
        return nova;

    }


    @Override
    public Variavel visitRExpressaoLogicaE (gIncludeParser.RExpressaoLogicaEContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("veracidade") || !valor2.getTipo().equals("veracidade")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para operação E.");
        }
        Boolean a = (Boolean) valor1.getValor();
        Boolean b = (Boolean) valor2.getValor();
        Variavel nova = new Variavel("veracidade", a&&b);
        return nova;
    }

    @Override
    public Variavel visitRExpressaoLogicaOu (gIncludeParser.RExpressaoLogicaOuContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(0));
        Variavel valor2 = (Variavel) visit(ctx.getChild(2));
        if((!valor1.getTipo().equals("veracidade") || !valor2.getTipo().equals("veracidade")) || !(valor1.getTipo().equals(valor2.getTipo()))){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para operação OU.");
        }
        Boolean a = (Boolean) valor1.getValor();
        Boolean b = (Boolean) valor2.getValor();
        Variavel nova = new Variavel("veracidade", a||b);
        return nova;
    }

    @Override
    public Variavel visitRExpressaoLogicaInv (gIncludeParser.RExpressaoLogicaInvContext ctx){
        Variavel valor1 = (Variavel) visit(ctx.getChild(2));
        if(!valor1.getTipo().equals("veracidade")){
            throw new ExcecaoSemantica("Operandos de tipo não suportado para operação INVERSO.");
        }
        Boolean a = (Boolean) valor1.getValor();
        Variavel nova = new Variavel("veracidade", !a);
        return nova;
    }





    public Variavel visitRExpressaoAtribuicaoIdPrimaria(gIncludeParser.RExpressaoAtribuicaoIdPrimariaContext ctx)  {
        Variavel nova;
        String nome = ((Variavel) visit(ctx.identificador())).getNome();
        if(!memoria.containsKey(nome) && !ruleNames[ctx.parent.getRuleIndex()].contains("expressaoDeclaracao")){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        String tipo;

        Variavel expressao = (Variavel) visit(ctx.getChild(2));
        if(memoria.containsKey(nome)) {
            tipo = memoria.get(nome).getTipo();
            if (expressao.getTipo().equals(tipo)) {
                this.memoria.get(nome).setValor(expressao.getValor());
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + "não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }else{
            tipo = (String)visit(ctx.parent.getChild(0));
            if (expressao.getTipo().equals(tipo)) {
                nova = new Variavel(tipo, nome, expressao.getValor());
                this.memoria.put(nome, nova);
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + " não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }

        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoAtribuicaoIdAditiva(gIncludeParser.RExpressaoAtribuicaoIdAditivaContext ctx)  {
        Variavel nova;
        String nome = ((Variavel) visit(ctx.identificador())).getNome();
        if(!memoria.containsKey(nome) && !ruleNames[ctx.parent.getRuleIndex()].contains("expressaoDeclaracao")){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        String tipo;
        Variavel expressao = (Variavel) visit(ctx.expressaoAditiva());
        if(memoria.containsKey(nome)) {
            tipo = memoria.get(nome).getTipo();
            if (expressao.getTipo().equals(tipo)) {
                this.memoria.get(nome).setValor(expressao.getValor());
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + "não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }else{
            tipo = (String)visit(ctx.parent.getChild(0));
            if (expressao.getTipo().equals(tipo)) {
                nova = new Variavel(tipo, nome, expressao.getValor());
                this.memoria.put(nome, nova);
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + " não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }

        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoAtribuicaoIdLogica(gIncludeParser.RExpressaoAtribuicaoIdLogicaContext ctx)  {
        Variavel nova;
        String nome = ((Variavel) visit(ctx.identificador())).getNome();
        if(!memoria.containsKey(nome) && !ruleNames[ctx.parent.getRuleIndex()].contains("expressaoDeclaracao")){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        String tipo;
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica());
        if(memoria.containsKey(nome)) {
            tipo = memoria.get(nome).getTipo();
            if (expressao.getTipo().equals(tipo)) {
                this.memoria.get(nome).setValor(expressao.getValor());
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + "não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }else{
            tipo = (String)visit(ctx.parent.getChild(0));
            if (expressao.getTipo().equals(tipo)) {
                nova = new Variavel(tipo, nome, expressao.getValor());
                this.memoria.put(nome, nova);
            } else {
                throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + " não pode ser atribuída à uma variável do tipo " + tipo);
            }
        }

        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoAtribuicaoListaLogica(gIncludeParser.RExpressaoAtribuicaoListaLogicaContext ctx)  {
        String nome = ((Variavel) visit(ctx.expressaoLista().getChild(0))).getNome();

        if(!memoria.containsKey(nome)){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }

        int indice = (int)((Double)((Variavel) visit(ctx.expressaoLogica())).getValor()).doubleValue();
        Variavel acessada = memoria.get(nome);
        ArrayList<Object> lista = (ArrayList<Object>) acessada.getValor();
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica());
        String tipo = memoria.get(nome).getTipo();
        if (tipo.contains(expressao.getTipo())) {
            lista.set(indice, expressao);
        } else {
            throw new ExcecaoSemantica("Valor do tipo " + expressao.getTipo() + "não pode ser atribuída à uma variável do tipo " + tipo);
        }

        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoAtribuicaoListaFilha(gIncludeParser.RExpressaoAtribuicaoListaFilhaContext ctx)  {
        Variavel nova;
        String nome = ((Variavel) visit(ctx.identificador())).getNome();
        if(!memoria.containsKey(nome) && !ruleNames[ctx.parent.getRuleIndex()].contains("expressaoDeclaracao")){
            throw new ExcecaoSemantica("Variavel " + nome + " não declarada");
        }
        String tipo;
        ArrayList<Variavel> lista = new ArrayList<>();
        int i = 0;
        Variavel expressao = (Variavel) visit(ctx.expressaoLogica(i));
        lista.add(expressao);
        for (i = 1; i<ctx.expressaoLogica().size(); i++){
            expressao = (Variavel) visit(ctx.expressaoLogica(i));
            if(expressao.mesmoTipo(lista.get(i-1))) {
                lista.add(expressao);
            }else{
                throw new ExcecaoSemantica("Valor " + expressao.getValor() + "não é do mesmo tipo.");
            }
        }

        if(memoria.containsKey(nome)) {
            tipo = memoria.get(nome).getTipo();
            if (tipo.contains(expressao.getTipo())) {
                this.memoria.get(nome).setValor(lista);
            } else {
                throw new ExcecaoSemantica("Valores do tipo " + expressao.getTipo() + "não podem ser atribuídos à uma " + tipo);
            }
        }else{
            tipo = (String)visit(ctx.parent.getChild(0)) + (String)visit(ctx.parent.getChild(1));
            if (tipo.contains(expressao.getTipo())) {
                nova = new Variavel(tipo, nome, lista);
                this.memoria.put(nome, nova);
            } else {
                throw new ExcecaoSemantica("Valores do tipo " + expressao.getTipo() + "não podem ser atribuídos à uma " + tipo);
            }
        }

        return this.memoria.get(nome);
    }

    public Variavel visitRExpressaoDeclaracaoId(gIncludeParser.RExpressaoDeclaracaoIdContext ctx) throws ExcecaoSemantica {
        String tipo = ctx.rTipo().getText();
        String nome = ctx.identificador().getText();
        Variavel nova = new Variavel(tipo, nome);
        if(this.memoria.containsKey(nome)){
            throw new ExcecaoSemantica("Variável " + nome + "já declarada.");
        }else {
            this.memoria.put(nome, nova);
            return nova;
        }
    }

    public Variavel visitRExpressaoDeclaracaoAtribuicao(gIncludeParser.RExpressaoDeclaracaoAtribuicaoContext ctx) throws ExcecaoSemantica {
        String tipo = ctx.rTipo().getText();
        Variavel nova = (Variavel) visit(ctx.expressaoAtribuicao());

        if(nova.getTipo().equals(tipo)){
            this.memoria.put(nova.getNome(), nova);
        }else{
            throw new ExcecaoSemantica("O valor atribuído não é do tipo " + tipo);
        }
        return nova;
    }

    public Variavel visitRExpressaoDeclaracaoListaId(gIncludeParser.RExpressaoDeclaracaoListaIdContext ctx) throws ExcecaoSemantica {
        String tipo = ctx.prefixoLista().getText() + ctx.rTipo().getText();
        String nome = ctx.identificador().getText();
        Variavel nova = new Variavel(tipo, nome);
        if(this.memoria.containsKey(nome)){
            throw new ExcecaoSemantica("Variável com identificador " + nome + "já declarada.");
        }else {
            this.memoria.put(nome, nova);
            return nova;
        }
    }

    public Variavel visitRExpressaoDeclaracaoListaAtribuicao(gIncludeParser.RExpressaoDeclaracaoListaAtribuicaoContext ctx) throws ExcecaoSemantica {
        String tipo = ctx.prefixoLista().getText() + ctx.rTipo().getText();
        Variavel nova = (Variavel) visit(ctx.expressaoAtribuicaoLista());

        if(nova.getTipo().equals(tipo)){
            this.memoria.put(nova.getNome(), nova);
        }else{
            throw new ExcecaoSemantica("Os valores atribuídos não são do tipo " + tipo);
        }
        return nova;
    }




    public Variavel visitRIdentificador(gIncludeParser.RIdentificadorContext ctx){
        String id = ctx.ID().getText();
        Variavel naoDeclarada;
        naoDeclarada = new Variavel("naoDeclarada", id);
        if(this.memoria.containsKey(id)){
            return memoria.get(id);
        }else{
            return naoDeclarada;
        }
    }

    @Override
    public Boolean visitRVeracidade(gIncludeParser.RVeracidadeContext ctx){
        boolean veracid;
        String valor = ctx.VERACID().getText();
        if(valor.equals("verdadeiro")){
            veracid = true;
        }else {
            veracid = false;
        }
        return veracid;
    }

    @Override
    public String visitRTexto(gIncludeParser.RTextoContext ctx){
        String texto = ctx.TEXTO().getText();
        return texto;
    }

    @Override
    public Double visitRNumero(gIncludeParser.RNumeroContext ctx){
        Double num = Double.parseDouble(ctx.NUM().getText());
        return num;
    }

    public String visitRTipo(gIncludeParser.RTipoContext ctx){
        return ctx.getText();
    }

    public String visitRPrefixoLista(gIncludeParser.RPrefixoListaContext ctx){
        return ctx.getText();
    }





 @Override
    public Integer visitRMostrar(gIncludeParser.RMostrarContext ctx){
        Variavel valor = (Variavel) visit(ctx.expressao());
        System.out.println(valor.toString());

        return 1;
    }


}
