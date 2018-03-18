package BrincandoComJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BrincandoComJavaFX extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palco) throws Exception {
		StackPane raiz = new StackPane();
		Label lblMensagem = new Label("Olá Mundo!");
		raiz.getChildren().add(lblMensagem);
		
		Scene cena = new Scene(raiz, 500, 300);
		palco.setTitle("Aprendendo JAVA FX");
		palco.setScene(cena);
		palco.show();
	}
	
	
}
