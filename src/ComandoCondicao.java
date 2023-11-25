import java.util.ArrayList;

public class ComandoCondicao extends Comando{
	private String condicao;
	private ArrayList<Comando>listaTrue;
	private ArrayList<Comando>listaFalse;
	
	public ComandoCondicao(String condicao, ArrayList<Comando> listaTrue, ArrayList<Comando> listaFalse) {
		this.condicao = condicao;
		this.listaTrue = listaTrue;
		this.listaFalse = listaFalse;
	}

	@Override
	public String geradorCodigo() {
		String str = "\n\tif (" + condicao + ") {\n" ;
		
		for(Comando cmd: listaTrue) {
			str+=cmd.geradorCodigo();
		}
		str+="\t}\n";

		if(listaFalse.size()>0) {
			str+="else {\n";
			for(Comando cmd: listaFalse) {
				str+=cmd.geradorCodigo();
			}
			str+="\t}\n";
			
		}

		return str;
	}
	
}
