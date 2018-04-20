package buscar.game;

import java.util.LinkedList;
import java.util.List;

public class Catalogo {
	
	private List<Jogo> jogos = new LinkedList<Jogo>();
	
	
	public void catalogarJogo (Jogo jogo){
		jogos.add(jogo);
	}


	public List<Jogo> getJogos() {
		return jogos;
	}


	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

}
