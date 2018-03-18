import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{

	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	
	//Utilizando o border layout
	
	/*public Layout(){
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, botao);
		
		setTitle("Treinando Layout");
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}*/
	
	
	//Utilizando o flow layout
	
	public Layout(){
		//o flow layout também pode ser usado definindo alinhamento dos itens em determinado lugar da janela
		//utilizando o parametro:
		//setLayout(new FlowLayout(FlowLayout.LEFT));      por padrão o flow vai vir como centralizado
		
		//setLayout(new FlowLayout());
		//add(botao);
		
		
		//o grid layout é utilizado para organizar um layout como tabela definindo o número de colunas e linhas
		setLayout(new GridLayout(2,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		setTitle("Treinando Layout");
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new Layout();
		
	}
	
}
