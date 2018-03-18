package sistema.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sistema.control.UsuarioControl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteGui extends JFrame {

	private JPanel contentPane;
	private JTextField jtfNome;
	private JTextField jtfSobrenome;
	private JTextField jtfEmail;
	private JTextField jtfSenha;
	private JTextField jtfConfirmarSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGui frame = new ClienteGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	UsuarioControl UserControl = new UsuarioControl();
	
	/**
	 * Create the frame.
	 */
	public ClienteGui() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroPercep = new JLabel("Cadastro Percep");
		lblCadastroPercep.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCadastroPercep.setBounds(12, 0, 276, 29);
		contentPane.add(lblCadastroPercep);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 55, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(12, 109, 108, 16);
		contentPane.add(lblSobrenome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(12, 166, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(12, 216, 56, 16);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setBounds(12, 263, 173, 16);
		contentPane.add(lblConfirmarSenha);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(116, 52, 520, 22);
		contentPane.add(jtfNome);
		jtfNome.setColumns(10);
		
		jtfSobrenome = new JTextField();
		jtfSobrenome.setBounds(116, 106, 520, 22);
		contentPane.add(jtfSobrenome);
		jtfSobrenome.setColumns(10);
		
		jtfEmail = new JTextField();
		jtfEmail.setBounds(116, 157, 520, 22);
		contentPane.add(jtfEmail);
		jtfEmail.setColumns(10);
		
		jtfSenha = new JTextField();
		jtfSenha.setBounds(116, 213, 520, 22);
		contentPane.add(jtfSenha);
		jtfSenha.setColumns(10);
		
		jtfConfirmarSenha = new JTextField();
		jtfConfirmarSenha.setBounds(116, 260, 520, 22);
		contentPane.add(jtfConfirmarSenha);
		jtfConfirmarSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = jtfNome.getText();
				String sobrenome = jtfSobrenome.getText();
				String email = jtfEmail.getText();
				String senha = jtfSenha.getText();
				String confirmarsenha = jtfConfirmarSenha.getText();
			
				UserControl.InsereDados(nome,sobrenome,email,senha,confirmarsenha);
			}

		});
		btnCadastrar.setBounds(539, 322, 97, 25);
		contentPane.add(btnCadastrar);
	}
}
