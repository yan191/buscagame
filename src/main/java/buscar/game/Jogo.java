package buscar.game;

public class Jogo {
	
	private String titulo;
	private int ano;
	private String descricao;
	private String informacao;
	private String imagem;
	private String desenvolvedora;
	
	public Jogo(String titulo, int ano, String descricao, String informacao, String imagem, String desenvolvedora){
		this.titulo = titulo;
		this.ano = ano;
		this.descricao = descricao;
		this.informacao = informacao;
		this.imagem = imagem;
		this.desenvolvedora = desenvolvedora;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

}
