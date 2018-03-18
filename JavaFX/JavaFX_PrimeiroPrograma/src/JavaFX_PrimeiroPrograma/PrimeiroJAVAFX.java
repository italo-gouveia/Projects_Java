package JavaFX_PrimeiroPrograma;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Perceba que a classe principal herda de javafx.application.Application. 
//Toda classe principal de JavaFX deve herdar de Application e implementar o método start;
public class PrimeiroJAVAFX extends Application{
	

	public static void main(String[] args) {
		//No método main chamamos o método launch para começar a nossa aplicação. 
		//Aqui não vai código JavaFX, o código vai no método start;
		launch();
	}
	
	@Override
	//A implementação do método start, herdado da classe Application. O atributo recebido é do tipo Stage. 
	//Bruscamente falando, podemos ver o Stage (palco) como o frame, a janela da nossa aplicação, mas na 
	//verdade ele não pode ser representado sim se pensarmos nos diversos dispositivos que podem rodar
	//(em um futuro próximo) JavaFX: Celulares, televisores, "tablets", etc;
	public void start(Stage palco) throws Exception {
		//Nesse ponto nós criamos um elemento chamado "pai", pois permite adicionarmos 
		//outras coisas dentro dele. No nosso caso, o StackPane permite adicionar vários 
		//elementos os quais tem seu leiaute de pilha, ou seja, eles serão empilhados um 
		//sobre o outro. No futuro falaremos mais sobre isso, mas lembre-se que tudo no 
		//JavaFX é um nó, ou seja, herda da classe Node;
		StackPane raiz = new StackPane();
		//Não há nada de mais aqui, simplesmente criamos um objeto do tipo Label, que é um controle 
		//de interface para mostrar texto. Ponto;
		Label lblMensagem = new Label();
		//Aqui informamos o texto que o Label irá mostrar. Note que isso poderia ter sido feito 
		//pelo construtor, na criação do Label;
		lblMensagem.setText("Hello World JAVA FX!");
		//Como o StackPane é um elemento pai, ele também tem elementos filhos. Nessa linha de código, 
		//recuperamos os filhos dele(getChildren()) e adicionamos nosso Label(add(Node)), fazendo que 
		//o Label seja um filho dele;
		raiz.getChildren().add(lblMensagem);
		
		//É hora de aprender outro conceito do JavaFX. Nessa linha criamos uma Scene(cena). Uma cena 
		//é o contâiner principal de todos os elementos do JavaFX e na criação dela aproveitamos para 
		//informar a raiz (como o nome diz, a raiz de todos os componentes), largura e altura da cena;
		Scene cena = new Scene(raiz, 250, 100);
		//Agora vamos voltar a mexer com nosso palco. Nessa linha informamos o título dele, no nosso 
		//caso atual, o título da janela que será mostrada;
		palco.setTitle("Aprendendo Java FX");
		//O palco precisa de uma cena, simplesmente é isso que é feito nessa linha.
		palco.setScene(cena);
		//Simplesmente mostrando o palco! Se esse método não for chamado, nada irá acontecer quando executar esse código.
		palco.show();
	}

	
}
