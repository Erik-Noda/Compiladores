
public class ComandoEscrita extends Comando {
	private String id;
	private int tipo;
	
	public ComandoEscrita(String id) {
		this.id = id;
	}
	
	public ComandoEscrita(String id, int tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String geradorCodigo() {
		if(tipo==1) {			
			return "\tprintf(\"%d\", " + id + ");\n";
		}else if(tipo == 2) {
			return "\tprintf(\"%f\", " + id + ");\n";
		}else {
			return "\tprintf(\"%s\", " + id + ");\n";
		}
			
	}
	
}
