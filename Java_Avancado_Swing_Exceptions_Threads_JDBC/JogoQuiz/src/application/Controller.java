package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	@FXML Button btn0;
	@FXML Button btn1;
	@FXML Button btn2;
	@FXML Button btn3;
	@FXML Button btn4;
	@FXML Button btn5;
	@FXML Button btn6;
	@FXML Button btn7;
	@FXML Button btn8;
	@FXML Button btn9;
	
	@FXML TextField txtVisor;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void onClickButtonNumerico(ActionEvent evento) {
		Button btnClicado = (Button) evento.getSource();
		String button = btnClicado.getId();
		switch(button) {
		case "btn1":
			txtVisor.appendText("1");
			break;
		case "btn2":
			txtVisor.appendText("2");
			break;
		case "btn3":
			txtVisor.appendText("3");
			break;
		case "btn4":
			txtVisor.appendText("4");
			break;
		case "btn5":
			txtVisor.appendText("5");
			break;
		case "btn6":
			txtVisor.appendText("6");
			break;
		case "btn7":
			txtVisor.appendText("7");
			break;	
		case "btn8":
			txtVisor.appendText("8");
			break;	
		case "btn9":
			txtVisor.appendText("9");
			break;	
		default :
			txtVisor.appendText("0");
			break;	
		}
	}

}
