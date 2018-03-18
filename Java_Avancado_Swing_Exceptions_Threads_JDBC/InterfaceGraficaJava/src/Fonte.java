import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fonte extends JFrame{

	JButton jb = new JButton("Texto");
	//comando para definir fontes no java swing instânciando um objeto do tipo Font podemos utilizá-lo
	//para definir as fontes de algo como por exemplo o botão abaixo 
	Font fonte = new Font("Courier New",Font.ITALIC | Font.BOLD, 100);
	
	public Fonte(){
		//modificando cor do texto(Foreground) e cor de fundo(Background)
		jb.setBackground(Color.GRAY);
		jb.setForeground(Color.GREEN);
		
		//também pode-se utilizar o RGB (RedGreenBlue) para instanciar uma nova cor EX:
		//Color cor = new Color(0,0,0);
		
		jb.setFont(fonte);
		add(jb);
		
		setTitle("Titulo da janela");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new Fonte();
	}
}
