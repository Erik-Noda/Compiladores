
public class ComandoLeitura extends Comando{

	private String id;
	private int tipo;
	
	public ComandoLeitura(String id) {
		this.id = id;
	}
	
	public ComandoLeitura(String id,int tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	@Override
	public String geradorCodigo() {
		if(tipo==1) {			
			return "\tscanf(\"%d\", &" + id + ");\n";
		}else if(tipo == 2) {
			return "\tscanf(\"%f\", &" + id + ");\n";
		}else {
			return "\tscanf(\"%s\", &" + id + ");\n";
		}
			
	}

}
