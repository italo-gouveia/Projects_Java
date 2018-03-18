import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame implements ActionListener{

	//Primeira forma de criar um jframe, fazendo a clsse herdar da classe JFrame
	
	//Para implementar uma ação no botão deve-se implementar a interface ActionListener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb){
			JOptionPane.showMessageDialog(null, "Hello World!");
		}
		if(e.getSource() == jb2){
			System.exit(0);
		}
	}
	
	JButton jb = new JButton("Mensagem");
	JButton jb2 = new JButton("Sair"); 
	public Janela(){
			
		jb.addActionListener(this); //deve-se adicionar uma nova ação passando a classe por parametro
		jb2.addActionListener(this);
		setLayout(null); // deixando nulo o layout
		jb.setBounds(100,300,100,60); //define posição(horizontal e vertical) e tamanho(largura e altura)
		jb2.setBounds(200,300,100,60);
		add(jb); //adicionando o botão à tela
		add(jb2);
		
		setTitle("Janela Gráfica");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	//Segunda forma, Instânciando um novo objeto
	
/*	public Janela(){
		JFrame jf = new JFrame();                          - instância uma nova janela
		jf.setTitle("Janela Gráfica");                     - escolhe o nome da tela exibido no topo
		jf.setSize(500, 500);                              - define largura e altura
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); - fecha aplicação ao clicar no x
		jf.setLocationRelativeTo(null);                    - centraliza a janela
		jf.setResizable(false);                            - trava o redimensionamento da janela
		jf.setVisible(true);                               - torna visivel
	}*/
	
	public static void main(String[] args) {
		new Janela();
	}

}
