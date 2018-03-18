package EstudandoJComponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exercicio3 extends JFrame implements ActionListener{

	private JPanel painelPrincipal;
	private JRadioButton rbSomar;
	private JRadioButton rbSubtrair;
	private JRadioButton rbDividir;
	private JRadioButton rbMultiplicar;
	private JTextField tfElemento;
	private JTextField tfElemento2;
	private JTextField tfElemento3;
	private JLabel lblSimbIgualdade;
	private JLabel lblSimbOperacao;
	private ButtonGroup btGrupo;
	private JButton btnCalcular;
	
	public float resultado;
	
	public Exercicio3(){
		painelPrincipal = new JPanel();
	
		rbSomar = new JRadioButton("Somar");
		rbSomar.setBounds(10, 50, 80, 20);
		rbSubtrair = new JRadioButton("Subtrair");
		rbSubtrair.setBounds(10, 100, 80, 20);
		rbDividir = new JRadioButton("Dividir");
		rbDividir.setBounds(10, 150, 80, 30);
		rbMultiplicar = new JRadioButton("Multiplicar");
		rbMultiplicar.setBounds(10, 200, 100, 40);
		
		tfElemento = new JTextField();
		tfElemento.setBounds(100, 100, 50, 50);
		tfElemento2 = new JTextField();
		tfElemento2.setBounds(200, 100, 50, 50);
		tfElemento3 = new JTextField();
		tfElemento3.setBounds(300, 100, 50, 50);
		lblSimbIgualdade = new JLabel("=");
		lblSimbIgualdade.setBounds(250, 100, 50, 50);
		lblSimbOperacao = new JLabel("+");
		lblSimbOperacao.setBounds(150, 100, 50, 50);
		btGrupo = new ButtonGroup();
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(200, 150, 150, 50);
		btnCalcular.setBackground(Color.BLACK);//muda a cor de fundo
		btnCalcular.setForeground(new Color(5, 255, 5, 100));//muda a cor da letra
		btnCalcular.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20));
		
		painelPrincipal.add(lblSimbOperacao);
		painelPrincipal.add(lblSimbIgualdade);
		painelPrincipal.add(rbSomar);
		painelPrincipal.add(rbSubtrair);
		painelPrincipal.add(rbDividir);
		painelPrincipal.add(rbMultiplicar);
		painelPrincipal.add(tfElemento);
		painelPrincipal.add(tfElemento2);
		painelPrincipal.add(tfElemento3);
		painelPrincipal.add(btnCalcular);
		
		btGrupo.add(rbSomar);
		btGrupo.add(rbSubtrair);
		btGrupo.add(rbDividir);
		btGrupo.add(rbMultiplicar);
		
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Titulo da janela principal");
		super.setSize(500, 300);
		super.setVisible(true);
		
		rbSomar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventSomar) {
				// TODO Auto-generated method stub
					resultado = Float.parseFloat( tfElemento.getText()) + Float.parseFloat(tfElemento2.getText());
					//tfElemento3.setText(String.valueOf(resultado));
					lblSimbOperacao.setText("+");
			}
		});
		
		rbSubtrair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventSubtrair) {
				// TODO Auto-generated method stub
					resultado = Float.parseFloat(tfElemento.getText()) - Float.parseFloat(tfElemento2.getText());
					//tfElemento3.setText(String.valueOf(resultado));
					lblSimbOperacao.setText("-");
			}
		});
		
		rbMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventMultiplicar) {
				// TODO Auto-generated method stub
					resultado = Float.parseFloat(tfElemento.getText()) * Float.parseFloat(tfElemento2.getText());
					//tfElemento3.setText(String.valueOf(resultado));
					lblSimbOperacao.setText("*");
			}
		});
		
		rbDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent eventDividir) {
				// TODO Auto-generated method stub
					resultado = Float.parseFloat(tfElemento.getText()) / Float.parseFloat(tfElemento2.getText());
					//tfElemento3.setText(String.valueOf(resultado));
					lblSimbOperacao.setText("/");
			}
		});
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbSomar.isSelected()){
					tfElemento3.setText(String.valueOf(resultado));
				}else if(rbSubtrair.isSelected()){
					tfElemento3.setText(String.valueOf(resultado));
				}else if(rbDividir.isSelected()){
					tfElemento3.setText(String.valueOf(resultado));
				}else if(rbMultiplicar.isSelected()){
					tfElemento3.setText(String.valueOf(resultado));
				}
			}
		});
	
	}
	public static void main(String[] args) {
		new Exercicio3();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}