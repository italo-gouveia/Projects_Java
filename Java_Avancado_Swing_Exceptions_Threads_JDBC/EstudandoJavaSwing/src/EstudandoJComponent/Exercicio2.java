package EstudandoJComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio2 extends JFrame implements ActionListener{

	private JPanel painelPrincipal;
	private JButton btnSomar;
	private JButton btnSubtrair;
	private JButton btnDividir;
	private JButton btnMultiplicar;
	private JTextField tfElementoSoma;
	private JTextField tfElemento2Soma;
	private JTextField tfElemento3Soma;
	private JTextField tfElementoSubtrair;
	private JTextField tfElemento2Subtrair;
	private JTextField tfElemento3Subtrair;
	private JTextField tfElementoDividir;
	private JTextField tfElemento2Dividir;
	private JTextField tfElemento3Dividir;
	private JTextField tfElementoMultiplicar;
	private JTextField tfElemento2Multiplicar;
	private JTextField tfElemento3Multiplicar;
	private JLabel lbSoma;
	private JLabel lbSubtrair;
	private JLabel lbDividir;
	private JLabel lbMultiplicar;
	private JLabel lbSimbSoma;
	private JLabel lbSimbSubtrair;
	private JLabel lbSimbDividir;
	private JLabel lbSimbMultiplicar;
	private JLabel lbSimbIgual;
	private JLabel lbSimbIgual2;
	private JLabel lbSimbIgual3;
	private JLabel lbSimbIgual4;
	private JButton jbSoma;
	private JButton jbSubtrair;
	private JButton jbDividir;
	private JButton jbMultiplicar;
	
	public Exercicio2(){
		painelPrincipal = new JPanel();
		lbSoma = new JLabel("Soma: ");
		lbSoma.setBounds(10, 50, 50, 10);
		lbSubtrair = new JLabel("Subtrair: ");
		lbSubtrair.setBounds(10, 100, 100, 20);
		lbDividir = new JLabel("Dividir: ");
		lbDividir.setBounds(10, 150, 150, 40);
		lbMultiplicar = new JLabel("Multiplicar: ");
		lbMultiplicar.setBounds(10, 200, 200, 60);
		
		lbSimbSoma = new JLabel("+");
		lbSimbSubtrair = new JLabel("-");
		lbSimbDividir = new JLabel("/");
		lbSimbMultiplicar = new JLabel("*");
		lbSimbIgual = new JLabel("=");
		lbSimbIgual2 = new JLabel("=");
		lbSimbIgual3 = new JLabel("=");
		lbSimbIgual4 = new JLabel("=");
		
		tfElementoSoma = new JTextField();
		tfElementoSoma.setBounds(70, 50, 30, 30);
		tfElemento2Soma = new JTextField();
		tfElemento2Soma.setBounds(140, 50, 30, 30);
		tfElemento3Soma = new JTextField();
		tfElemento3Soma.setBounds(210, 50, 30, 30);
		lbSimbSoma.setBounds(105, 50, 30, 30);
		lbSimbIgual.setBounds(175, 50, 30, 30);
		
		tfElementoSubtrair = new JTextField();
		tfElementoSubtrair.setBounds(70, 100, 30, 30);
		tfElemento2Subtrair = new JTextField();
		tfElemento2Subtrair.setBounds(140, 100, 30, 30);
		tfElemento3Subtrair = new JTextField();
		tfElemento3Subtrair.setBounds(210, 100, 30, 30);
		lbSimbSubtrair.setBounds(105, 100, 30, 30);
		lbSimbIgual2.setBounds(175, 100, 30, 30);
		
		tfElementoDividir = new JTextField();
		tfElementoDividir.setBounds(70, 150, 30, 30);
		tfElemento2Dividir = new JTextField();
		tfElemento2Dividir.setBounds(140, 150, 30, 30);
		tfElemento3Dividir = new JTextField();
		tfElemento3Dividir.setBounds(210, 150, 30, 30);
		lbSimbDividir.setBounds(105, 150, 30, 30);
		lbSimbIgual3.setBounds(175, 150, 30, 30);
		
		tfElementoMultiplicar = new JTextField();
		tfElementoMultiplicar.setBounds(70, 200, 30, 30);
		tfElemento2Multiplicar = new JTextField();
		tfElemento2Multiplicar.setBounds(140, 200, 30, 30);
		tfElemento3Multiplicar = new JTextField();
		tfElemento3Multiplicar.setBounds(210, 200, 30, 30);
		lbSimbMultiplicar.setBounds(105, 200, 30, 30);
		lbSimbIgual4.setBounds(175, 200, 30, 30);
		
		jbSoma = new JButton("Somar");
		jbSoma.setBounds(280, 50, 100, 50);
		jbSubtrair = new JButton("Subtrair");
		jbSubtrair.setBounds(280, 100, 100, 50);
		jbDividir = new JButton("Dividir");
		jbDividir.setBounds(280, 150, 100, 50);
		jbMultiplicar = new JButton("Multiplicar");
		jbMultiplicar.setBounds(280, 200, 100, 50);
		
		painelPrincipal.add(lbSoma);
		painelPrincipal.add(lbSubtrair);
		painelPrincipal.add(lbDividir);
		painelPrincipal.add(lbMultiplicar);
		painelPrincipal.add(tfElementoSoma);
		painelPrincipal.add(tfElemento2Soma);
		painelPrincipal.add(tfElemento3Soma);
		painelPrincipal.add(tfElementoSubtrair);
		painelPrincipal.add(tfElemento2Subtrair);
		painelPrincipal.add(tfElemento3Subtrair);
		painelPrincipal.add(tfElementoDividir);
		painelPrincipal.add(tfElemento2Dividir);
		painelPrincipal.add(tfElemento3Dividir);
		painelPrincipal.add(tfElementoMultiplicar);
		painelPrincipal.add(tfElemento2Multiplicar);
		painelPrincipal.add(tfElemento3Multiplicar);
		painelPrincipal.add(lbSimbSoma);
		painelPrincipal.add(lbSimbSubtrair);
		painelPrincipal.add(lbSimbDividir);
		painelPrincipal.add(lbSimbMultiplicar);
		painelPrincipal.add(lbSimbIgual);
		painelPrincipal.add(lbSimbIgual2);
		painelPrincipal.add(lbSimbIgual3);
		painelPrincipal.add(lbSimbIgual4);
		painelPrincipal.add(jbSoma);
		painelPrincipal.add(jbSubtrair);
		painelPrincipal.add(jbDividir);
		painelPrincipal.add(jbMultiplicar);
		
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Titulo da janela principal");
		super.setSize(500, 300);
		super.setVisible(true);
		
		jbSoma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventSomar) {
				// TODO Auto-generated method stub
				float soma;
					soma = Float.parseFloat( tfElementoSoma.getText()) + Float.parseFloat(tfElemento2Soma.getText());
					tfElemento3Soma.setText(String.valueOf(soma));
			}
		});
		
		jbSubtrair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventSubtrair) {
				// TODO Auto-generated method stub
				float subtracao;
					subtracao = Float.parseFloat(tfElementoSubtrair.getText()) - Float.parseFloat(tfElemento2Subtrair.getText());
					tfElemento3Subtrair.setText(String.valueOf(subtracao));
			}
		});
		
		jbMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventMultiplicar) {
				// TODO Auto-generated method stub
				float multiplicacao;
					multiplicacao = Float.parseFloat(tfElementoMultiplicar.getText()) * Float.parseFloat(tfElemento2Multiplicar.getText());
					tfElemento3Multiplicar.setText(String.valueOf(multiplicacao));
			}
		});
		
		jbDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventDividir) {
				// TODO Auto-generated method stub
				float divisao;
					divisao = Float.parseFloat(tfElementoDividir.getText()) / Float.parseFloat(tfElemento2Dividir.getText());
					tfElemento3Dividir.setText(String.valueOf(divisao));
			}
		});
	}
	
	public static void main(String[] args) {
		new Exercicio2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
