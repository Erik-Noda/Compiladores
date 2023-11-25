import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;

public class Programa {
	private TabelaSimbolos tabelaVar;
	private ArrayList<Comando>comando = new ArrayList<Comando>();	
	
	public void geradorAlvo() {
		StringBuilder str = new StringBuilder();
		
		str.append("#include <stdio.h>\n");
		str.append("#include <stdlib.h>\n\n");
		
		str.append("void main(){\n");
		
		//variaveis
		for(Simbolo simbolo : tabelaVar.getAll()) {
			str.append(simbolo.geradorCodigo());
		}
		
		//comandos
		for(Comando cmd: comando) {
			str.append(cmd.geradorCodigo());
		}
		
		str.append("}");
		
		
		//gerar programa em c
		try {
			FileWriter file  = new FileWriter(new File("prog.c"));
			file.write(str.toString());
			file.close();
		}catch(Exception ex){
			
		}
	}

	public ArrayList<Comando> getComando() {
		return comando;
	}

	public void setComando(ArrayList<Comando> comando) {
		this.comando = comando;
	}

	public TabelaSimbolos getTabelaVar() {
		return tabelaVar;
	}

	public void setTabelaVar(TabelaSimbolos tabelaVar) {
		this.tabelaVar = tabelaVar;
	}
	
}
