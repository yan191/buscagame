package buscar.game;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Jogo> jogos = new LinkedList<Jogo>();
	
	private Catalogo catalogo = new Catalogo();
	
	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public void cadastrarJogo (Jogo jogo){
		jogos.add(jogo);
	}
	
	public List<Jogo> buscarPorString (String busca){
		List<Jogo> jogosEncontrados = new LinkedList<Jogo>();
		
		for(Jogo jogo:jogos){
			if(jogo.getTitulo().toLowerCase().contains(busca.toLowerCase()) || jogo.getDescricao().toLowerCase().contains(busca.toLowerCase())) jogosEncontrados.add(jogo); 
		}
		
		return jogosEncontrados;
	}
	
	public List<Jogo> buscarTodos(){
		return jogos;
	}
	
	public Jogo buscarPorTitulo(String titulo){
		for(Jogo jogo:jogos){
			if(jogo.getTitulo().equals(titulo)) return jogo;
		}
		return null;
	}
	
	public Jogo catalogar(Jogo jogo){
		Jogo jogoEncontrado = buscarPorTitulo(jogo.getTitulo());
		if(jogoEncontrado!=null) catalogo.catalogarJogo(jogoEncontrado);
		return jogoEncontrado;
	}

}
