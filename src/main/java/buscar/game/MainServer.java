package buscar.game;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8080;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarJogos();

		Controller controller = new Controller(model);
		
		controller.buscarPorString();
		
		controller.buscarTodos();
		
		controller.buscarPorTitulo();
		
		controller.catalogarJogo();
		
		controller.buscarCatalogo();
		
    }
    
    public static void inicializarJogos(){
    	model.cadastrarJogo(new Jogo("Civilization VI: Rise and Fall",2016,"Jogo de estrátegia por turnos desenvolvido pela 2k games.","Roda em qualquer PC atual.","Blade Runner.jpg","2k Games"));
    	model.cadastrarJogo(new Jogo("Smite",2015,"Jogo do estilo moba, onde você deverá escolher entre varios deuses e batalhar até o fim.","Roda em qualquer PC atual.","Blade Runner.jpg","Hi-rez"));   
    }
}
