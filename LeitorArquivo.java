package AnalisadorLexico;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LeitorArquivo {
    public InputStream is;
    
    public LeitorArquivo(String nomeArq){
        try{
            this.is= new FileInputStream(nomeArq);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public int lerProximoCaractere(){
        int c=1;
        try{
            c=is.read();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return c;
    }
}
