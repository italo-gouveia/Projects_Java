import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{

	private JPanel painelPrincipal;
	private JTextField tfElemento1;
	private JTextField tfElemento2;
	private JTextField tfElemento3;
	private JRadioButton rbSomar;
	private JRadioButton rbSubtrair;
	private JRadioButton rbMultiplicar;
	private JRadioButton rbDividir;
	private JLabel lbSimbIgualdade;
	private JLabel lbSimbOperador;
	private ButtonGroup btGrupo;
	private JButton btCalcular;
	
	public float valorResultado;
	
	public Calculadora(){
		painelPrincipal = new JPanel();
		
		tfElemento1 = new JTextField();
		tfElemento1.setBounds(50, 100, 100, 100);
		tfElemento2 = new JTextField();
		tfElemento2.setBounds(250, 100, 100, 100);
		tfElemento3 = new JTextField();
		tfElemento3.setBounds(450, 100, 100, 100);
		
		lbSimbIgualdade = new JLabel("=");
		lbSimbIgualdade.setBounds(350, 100, 100, 100);
		lbSimbIgualdade.setFont(new Font("Arial", Font.BOLD, 40));
		lbSimbOperador = new JLabel();
		lbSimbOperador.setBounds(150, 100, 50, 50);
		lbSimbOperador.setFont(new Font("Arial", Font.BOLD, 40));
		
		rbSomar = new JRadioButton("Soma");
		rbSomar.setBounds(100, 50, 100, 40);
		rbSubtrair = new JRadioButton("Subtrai");
		rbSubtrair.setBounds(200, 50, 100, 40);
		rbMultiplicar = new JRadioButton("Multiplica");
		rbMultiplicar.setBounds(300, 50, 100, 40);
		rbDividir = new JRadioButton("Divide");
		rbDividir.setBounds(400, 50, 100, 40);
		
		btGrupo = new ButtonGroup();
		btGrupo.add(rbSomar);
		btGrupo.add(rbSubtrair);
		btGrupo.add(rbDividir);
		btGrupo.add(rbMultiplicar);
		
		btCalcular = new JButton("Calcular");
		btCalcular.setBounds(200, 220, 200, 70);
		
		painelPrincipal.add(rbSomar);
		painelPrincipal.add(rbSubtrair);
		painelPrincipal.add(rbDividir);
		painelPrincipal.add(rbMultiplicar);
		painelPrincipal.add(tfElemento1);
		painelPrincipal.add(tfElemento2);
		painelPrincipal.add(tfElemento3);
		painelPrincipal.add(btCalcular);
		painelPrincipal.add(lbSimbOperador);
		painelPrincipal.add(lbSimbIgualdade);
		
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Calculadoraaa");
		super.setSize(700, 500);
		super.setVisible(true);
		
		rbSomar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoSoma) {
					valorResultado = Float.parseFloat( tfElemento1.getText()) + Float.parseFloat(tfElemento2.getText());
					lbSimbOperador.setText("+");
			}
		});
		
		rbSubtrair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoSubtrai) {
					valorResultado = Float.parseFloat(tfElemento1.getText()) - Float.parseFloat(tfElemento2.getText());
					lbSimbOperador.setText("-");
			}
		});
		
		rbMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoMultiplica) {
					valorResultado = Float.parseFloat(tfElemento1.getText()) * Float.parseFloat(tfElemento2.getText());
					lbSimbOperador.setText("*");
			}
		});
		
		rbDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoDivide) {
					valorResultado = Float.parseFloat(tfElemento1.getText()) / Float.parseFloat(tfElemento2.getText());
					lbSimbOperador.setText("/");
			}
		});
		
		btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent acaoCalcula) {
				// TODO Auto-generated method stub
				if(rbSomar.isSelected()){
					tfElemento3.setText(String.valueOf(valorResultado));
				}else if(rbSubtrair.isSelected()){
					tfElemento3.setText(String.valueOf(valorResultado));
				}else if(rbDividir.isSelected()){
					tfElemento3.setText(String.valueOf(valorResultado));
				}else if(rbMultiplicar.isSelected()){
					tfElemento3.setText(String.valueOf(valorResultado));
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
