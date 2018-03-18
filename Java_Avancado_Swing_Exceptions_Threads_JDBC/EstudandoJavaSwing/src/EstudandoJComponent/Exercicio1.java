package EstudandoJComponent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio1 extends JFrame{

	JLabel jlSoma;
	JTextField jtfNum1, jtfNum2, jtfResult;
	JButton jbSomar;
	
	public Exercicio1(){
		
		jlSoma = new JLabel("Soma");
		jlSoma.setBounds(10,10, 150, 20);
		jtfNum1 = new JTextField();
		jtfNum1.setBounds(10,10,170,20);
		jtfNum2 = new JTextField();
		jtfNum2.setBounds(10, 10, 190, 20);
		jtfResult = new JTextField();
		jtfResult.setBounds(10, 10, 200, 20);
		jbSomar = new JButton();
		jbSomar.setBounds(10, 10, 220, 20);

		super.setLayout(null);
		super.getContentPane().add(jlSoma);
		super.getContentPane().add(jtfNum1);
		super.getContentPane().add(jtfNum2);
		super.getContentPane().add(jtfResult);
		super.getContentPane().add(jbSomar);
		
		super.setVisible(true);
		super.setSize(720, 720);
		super.setLocationRelativeTo(null); //vai exibir sempre no centro
		
		/*add(jlSoma);
		add(jtfNum1);
		add(jtfNum2);
		add(jtfResult);
		add(jbSomar);*/
		

	}
	
	public static void main(String[] args) {
		new Exercicio1();
	}
}
