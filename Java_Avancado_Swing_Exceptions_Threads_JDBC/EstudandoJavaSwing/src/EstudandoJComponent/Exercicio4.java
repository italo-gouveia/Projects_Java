package EstudandoJComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio4 extends JFrame implements ActionListener{

	private JLabel lblNome;
	private JLabel lblIdade;
	private JLabel lblSexo;
	private JTextField tfElemento;
	private JTextField tfElemento2;
	private JTextField tfElemento3;
	private JButton btnCadastrar;
	private JButton btnListar;
	private Vector<String> vector;
	private JComboBox<String> cbLista;
	private JPanel painelPrincipal;
	
	public Exercicio4(){
		
		painelPrincipal = new JPanel();
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 10, 70, 70);
		lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 70, 70, 70);
		lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 130, 70, 70);
		tfElemento = new JTextField();
		tfElemento.setBounds(50, 30, 100, 30);
		tfElemento2 = new JTextField();
		tfElemento2.setBounds(50, 90, 100, 30);
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(100, 100, 100, 30);
		btnListar = new JButton("Listar");
		vector = new Vector<String>();
		vector.add("Masculino");
		vector.add("Feminino");
		cbLista = new JComboBox(vector);
		cbLista.setBounds(50, 150, 100, 30);
		
		
		painelPrincipal.add(lblNome);
		painelPrincipal.add(lblIdade);
		painelPrincipal.add(lblSexo);
		painelPrincipal.add(tfElemento);
		painelPrincipal.add(tfElemento2);
		painelPrincipal.add(btnCadastrar);
		painelPrincipal.add(btnListar);
		painelPrincipal.add(cbLista);
		
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Titulo da janela principal");
		super.setSize(500, 300);
		super.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercicio4();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
