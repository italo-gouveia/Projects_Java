import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class ProjetoAV2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoAV2 frame = new ProjetoAV2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjetoAV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(12, 13, 56, 16);
		contentPane.add(lblPlaca);
		
		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setBounds(12, 42, 56, 16);
		contentPane.add(lblChassi);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(12, 85, 56, 16);
		contentPane.add(lblCor);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(12, 114, 56, 16);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(12, 143, 56, 16);
		contentPane.add(lblModelo);
		
		textField = new JTextField();
		textField.setBounds(63, 10, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 42, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(63, 82, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(63, 109, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(63, 140, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(12, 199, 97, 25);
		contentPane.add(btnInserir);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(146, 199, 97, 25);
		contentPane.add(btnRemover);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(285, 199, 97, 25);
		contentPane.add(btnAlterar);
	}
}
