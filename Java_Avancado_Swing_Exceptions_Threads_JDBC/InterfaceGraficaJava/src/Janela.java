import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame implements ActionListener{

	//Primeira forma de criar um jframe, fazendo a clsse herdar da classe JFrame
	
	//Para implementar uma a��o no bot�o deve-se implementar a interface ActionListener
	
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
			
		jb.addActionListener(this); //deve-se adicionar uma nova a��o passando a classe por parametro
		jb2.addActionListener(this);
		setLayout(null); // deixando nulo o layout
		jb.setBounds(100,300,100,60); //define posi��o(horizontal e vertical) e tamanho(largura e altura)
		jb2.setBounds(200,300,100,60);
		add(jb); //adicionando o bot�o � tela
		add(jb2);
		
		setTitle("Janela Gr�fica");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	//Segunda forma, Inst�nciando um novo objeto
	
/*	public Janela(){
		JFrame jf = new JFrame();                          - inst�ncia uma nova janela
		jf.setTitle("Janela Gr�fica");                     - escolhe o nome da tela exibido no topo
		jf.setSize(500, 500);                              - define largura e altura
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); - fecha aplica��o ao clicar no x
		jf.setLocationRelativeTo(null);                    - centraliza a janela
		jf.setResizable(false);                            - trava o redimensionamento da janela
		jf.setVisible(true);                               - torna visivel
	}*/
	
	public static void main(String[] args) {
		new Janela();
	}

}
