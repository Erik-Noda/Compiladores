package AnalisadorLexico;

public class Main {
    public static void main(String[] args) {
        LeitorArquivo ldat=new LeitorArquivo("C:\\Users\\a2367874\\Documents\\NetBeansProjects\\JavaApplication1\\src\\AnalisadorLexico\\programa1.gyh");
        int c;
        while((c=ldat.lerProximoCaractere())!= -1){
            System.out.print((char)c);
        }
    }
}
