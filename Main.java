package AnalisadorLexico;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        GyhLex lex = new GyhLex(args[0]);
        Token t;
        ArrayList<Token>lista = new ArrayList<>();
        
        while((t=lex.proximoToken())!=null) {
            System.out.print(t.toString()+"\n");
            lista.add(t);
        }
        Token tokenFinal = new Token("$",TipoToken.TokenFinal,-1);
        lista.add(tokenFinal);
        AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico(lista);
        analisadorSintatico.P();
    }
    
}

