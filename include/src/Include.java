// FVM.java::<<Dependências de uso>>
import gramatica.gIncludeLexer;
import gramatica.gIncludeParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;
import java.util.Scanner;

public class Include {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String infixa = scan.nextLine(); //args[ 0 ];
        // FVM.java::main::<<lexer>>
        gIncludeLexer lexer = new gIncludeLexer(CharStreams.fromString(infixa));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // FVM.java::main::<<parser>>
        gIncludeParser parser = new gIncludeParser(tokens);
        gIncludeParser.ListaSentencaContext arvore = parser.listaSentenca();

        // FVM.java::main::<<procedimentosSemânticos>>
        RegrasInclude semantico = new RegrasInclude();
        Object resultado = semantico.visit(arvore);
        //System.out.println(resultado);

    }
}