package model;

import java.util.Objects;

public class Variavel {

    final private String tipo;// numero, texto, veracidade, naoDeclarada
    private String nome = null;
    private Object valor;

    public Variavel(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public Variavel(String tipo, String nome, Object valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.valor = valor;
    }

    public Variavel(String tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public boolean mesmoTipo(Object object){
        Variavel variavel;
        boolean mesmo = false;
        if(object instanceof Variavel){
            variavel = (Variavel) object;
            if(this.tipo.equals(variavel.tipo)){
                mesmo = true;
            }
        }
        return mesmo;
    }

    @Override
    public String toString() {
        String str;
        if(tipo.equals("veracidade")){
            if(valor.equals(false)){
                str = "falso";
            }else{
                str = "verdadeiro";
            }
        }else{
            if(valor!=null) {
                str = valor.toString();
            }else{
                return "nada";
            }
        }
        return str;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variavel variavel = (Variavel) o;
        return Objects.equals(tipo, variavel.tipo) &&
                Objects.equals(nome, variavel.nome) &&
                Objects.equals(valor, variavel.valor);
    }
    
    public boolean valorIgual(Variavel variavel){
        return this.valor.equals(variavel.getValor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, nome, valor);
    }
}
