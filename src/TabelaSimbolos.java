import java.util.ArrayList;
import java.util.HashMap;

public class TabelaSimbolos {
	private HashMap<String,Simbolo>tabela;

	public TabelaSimbolos() {
		tabela = new HashMap<String, Simbolo>();
	}
	
	public void add(Simbolo simbolo) {
		tabela.put(simbolo.getNome(),simbolo);
	}

	public boolean exists(String chave) {
		return tabela.get(chave)!=null;
	}

	public Simbolo get(String nomeSimbolo) {
		return tabela.get(nomeSimbolo);
	}

	
	public ArrayList <Simbolo> getAll() {
		ArrayList<Simbolo> lista = new ArrayList<Simbolo>();
		for(Simbolo simbolo:tabela.values()) {
			lista.add(simbolo);
		}
		return lista;
	}
	
}
