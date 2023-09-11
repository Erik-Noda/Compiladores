package AnalisadorLexico;

public class Main {
    public static void main(String[] args) {
        //GyhLex lex = new GyhLex(args[0]);
        Teste lex = new Teste(args[0]);
        Token t;
        while((t=lex.proximoToken())!=null) {
            System.out.print(t.toString()+"\n");
        }
    }
    
    
}

