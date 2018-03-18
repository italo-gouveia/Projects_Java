package EstudandoJComponent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JanelaLayoutNull extends JFrame {

	JLabel lbNome;
	JButton btAcaoNome;
	JTextArea jtaNome;
	JScrollPane scrollAreaDeTexto;
	
	public JanelaLayoutNull(){
		
		lbNome = new JLabel("Digite o seu nome: ");
		btAcaoNome = new JButton("Cadastrar");
		jtaNome = new JTextArea();
		jtaNome.setLineWrap(true);//faz um text area ter quebra de linhas automatica
		
		lbNome.setBounds(10,10, 130, 20);
		btAcaoNome.setBounds(300, 10, 100, 30);
		
		scrollAreaDeTexto = new JScrollPane(jtaNome);
		scrollAreaDeTexto.setBounds(150, 20, 150, 50);
		
		super.getContentPane().add(lbNome);
		super.getContentPane().add(scrollAreaDeTexto);
		super.getContentPane().add(btAcaoNome);
		super.setLayout(null);
		super.setTitle("Titulo da janela");
		super.setSize(500, 300);
		super.setVisible(true);
		
		btAcaoNome.addActionListener(new AcaoButton1(jtaNome.getText(), this));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JanelaLayoutNull();
	}

}
