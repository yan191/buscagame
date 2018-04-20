package buscar.game;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller (Model model){
		this.model = model;
	}
	
	public void buscarPorString(){
		get("/jogo/:busca", (req, res) -> {
			
			List<Jogo> jogosEncontrados = model.buscarPorString(req.params(":busca"));
			return new Gson().toJson(jogosEncontrados);
			
		});
	}
	
	public void buscarTodos(){
		get("/jogo", (req, res) -> {

			return new Gson().toJson(model.buscarTodos());
			
		});
	}
	
	public void buscarPorTitulo(){
		get("/jogo/:titulo/:ano", (req, res) -> {
			
			Jogo jogoEncontrado = model.buscarPorTitulo(req.params(":titulo"));
			return new Gson().toJson(jogoEncontrado);
			
		});
	}
	
	public void catalogarJogo(){
		get("/catalogar/:titulo", (req, res) -> {
			Jogo jogoEncontrado = model.buscarPorTitulo(req.params(":titulo"));
			if(jogoEncontrado!=null) model.catalogar(jogoEncontrado);
			return new Gson().toJson(jogoEncontrado);
		});
	}
	public void buscarCatalogo (){
		get("/catalogo", (req, res) -> {
			List<Jogo> jogosCatalogado = model.getCatalogo().getJogos();
			return new Gson().toJson(jogosCatalogado);
		});
	}

}
