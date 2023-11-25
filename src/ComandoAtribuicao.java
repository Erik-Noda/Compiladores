
public class ComandoAtribuicao extends Comando{
	private String id;
	private String expressao;
	
	
	public ComandoAtribuicao(String id, String expressao) {
		this.id = id;
		this.expressao = expressao;
	}
	
	
	@Override
	public String geradorCodigo() {
		// TODO Auto-generated method stub
		return "\t"+id +" = " + expressao + ";\n";
	}



}
