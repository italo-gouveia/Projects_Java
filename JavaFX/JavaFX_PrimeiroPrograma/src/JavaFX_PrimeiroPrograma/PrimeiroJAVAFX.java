package JavaFX_PrimeiroPrograma;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Perceba que a classe principal herda de javafx.application.Application. 
//Toda classe principal de JavaFX deve herdar de Application e implementar o m�todo start;
public class PrimeiroJAVAFX extends Application{
	

	public static void main(String[] args) {
		//No m�todo main chamamos o m�todo launch para come�ar a nossa aplica��o. 
		//Aqui n�o vai c�digo JavaFX, o c�digo vai no m�todo start;
		launch();
	}
	
	@Override
	//A implementa��o do m�todo start, herdado da classe Application. O atributo recebido � do tipo Stage. 
	//Bruscamente falando, podemos ver o Stage (palco) como o frame, a janela da nossa aplica��o, mas na 
	//verdade ele n�o pode ser representado sim se pensarmos nos diversos dispositivos que podem rodar
	//(em um futuro pr�ximo) JavaFX: Celulares, televisores, "tablets", etc;
	public void start(Stage palco) throws Exception {
		//Nesse ponto n�s criamos um elemento chamado "pai", pois permite adicionarmos 
		//outras coisas dentro dele. No nosso caso, o StackPane permite adicionar v�rios 
		//elementos os quais tem seu leiaute de pilha, ou seja, eles ser�o empilhados um 
		//sobre o outro. No futuro falaremos mais sobre isso, mas lembre-se que tudo no 
		//JavaFX � um n�, ou seja, herda da classe Node;
		StackPane raiz = new StackPane();
		//N�o h� nada de mais aqui, simplesmente criamos um objeto do tipo Label, que � um controle 
		//de interface para mostrar texto. Ponto;
		Label lblMensagem = new Label();
		//Aqui informamos o texto que o Label ir� mostrar. Note que isso poderia ter sido feito 
		//pelo construtor, na cria��o do Label;
		lblMensagem.setText("Hello World JAVA FX!");
		//Como o StackPane � um elemento pai, ele tamb�m tem elementos filhos. Nessa linha de c�digo, 
		//recuperamos os filhos dele(getChildren()) e adicionamos nosso Label(add(Node)), fazendo que 
		//o Label seja um filho dele;
		raiz.getChildren().add(lblMensagem);
		
		//� hora de aprender outro conceito do JavaFX. Nessa linha criamos uma Scene(cena). Uma cena 
		//� o cont�iner principal de todos os elementos do JavaFX e na cria��o dela aproveitamos para 
		//informar a raiz (como o nome diz, a raiz de todos os componentes), largura e altura da cena;
		Scene cena = new Scene(raiz, 250, 100);
		//Agora vamos voltar a mexer com nosso palco. Nessa linha informamos o t�tulo dele, no nosso 
		//caso atual, o t�tulo da janela que ser� mostrada;
		palco.setTitle("Aprendendo Java FX");
		//O palco precisa de uma cena, simplesmente � isso que � feito nessa linha.
		palco.setScene(cena);
		//Simplesmente mostrando o palco! Se esse m�todo n�o for chamado, nada ir� acontecer quando executar esse c�digo.
		palco.show();
	}

	
}
