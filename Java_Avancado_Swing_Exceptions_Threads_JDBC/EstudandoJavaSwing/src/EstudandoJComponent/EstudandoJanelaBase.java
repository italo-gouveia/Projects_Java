package EstudandoJComponent;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EstudandoJanelaBase extends JFrame {

	JButton button1;                 ///declarando um botão
	JButton button2;
	
	public EstudandoJanelaBase(){    ///definindo o construtor da janela
		button1 = new JButton("Clique aqui");  /// instânciando um novo botão e passando por parametro o nome dele
		button1.setPreferredSize(new Dimension(80, 50)); ///
		
		button2 = new JButton("Não clique aqui");
		
		super.setLayout(new BorderLayout());  ///setando o layout para border layout
		super.getContentPane().add(button1, BorderLayout.NORTH);   /// adicionando o botão ao layout e colocando a posição no centro
		super.getContentPane().add(button2, BorderLayout.SOUTH);
		super.setLocation(400, 300); ///setando o local onde a tela irá inicializar
		super.setSize(500, 300);     ///setando o tamanho da janela
		super.setVisible(true);      ///setando a visibilidade para verdadeiro
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new EstudandoJanelaBase();   ///instânciando uma nova janela chamando o seu construtor
			
	}

}
