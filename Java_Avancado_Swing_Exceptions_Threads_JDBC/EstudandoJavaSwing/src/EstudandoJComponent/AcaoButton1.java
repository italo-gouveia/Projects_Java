package EstudandoJComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcaoButton1 implements ActionListener{

	String texto;
	JFrame janelaPai;
	
	public AcaoButton1(String texto, JFrame janelaPai){
		this.texto = texto;
		this.janelaPai = janelaPai;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(janelaPai, texto);
	}

	
}
