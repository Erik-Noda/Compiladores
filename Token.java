
package AnalisadorLexico;

public class Token {
    public String lexema;
    public TipoToken padrao;
    public int linha;
    
    public Token(String lex, TipoToken pad, int lin){
        this.lexema = lex;
        this.padrao=pad;
        this.linha=lin;
    }

    @Override
    public String toString(){
        return "ç" + this.lexema + "," + this.padrao + "," + this.linha + "ç";
    }
}
