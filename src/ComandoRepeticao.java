import java.util.ArrayList;

public class ComandoRepeticao extends Comando{
	private String condicao;
	private ArrayList<Comando>listaWhile;
	
	public ComandoRepeticao(String condicao, ArrayList<Comando> listaWhile) {
		this.condicao = condicao;
		this.listaWhile = listaWhile;
	}

	@Override
	public String geradorCodigo() {
		String str = "\n\twhile (" + condicao + ") {\n" ;
		
		for(Comando cmd: listaWhile) {
			str+=cmd.geradorCodigo();
		}
		str+="\t}\n";


		return str;
	}
	
}
