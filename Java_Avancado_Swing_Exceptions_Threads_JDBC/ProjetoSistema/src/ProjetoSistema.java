import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjetoSistema extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	
	public void logar() {
		String usuario = "admin";
		String senha = "admin";
		if(textField.getText().equals(usuario) && passwordField.getText().equals(senha)) {
			JanelaPrincipal jp = new JanelaPrincipal();
			jp.setVisible(true);
			this.dispose();
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*//esse trecho de try-catch define o tema nimbus
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace();
        }*/
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoSistema frame = new ProjetoSistema();
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
	public ProjetoSistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 204);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(new Color(255, 140, 0));
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblLogin.setBounds(12, 30, 63, 19);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(255, 140, 0));
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSenha.setBounds(12, 86, 76, 19);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 0));
		textField.setBounds(100, 30, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 0));
		passwordField.setBounds(100, 86, 116, 22);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logar();
			}
		});
		btnLogin.setBackground(new Color(0, 255, 255));
		btnLogin.setForeground(new Color(255, 140, 0));
		btnLogin.setBounds(100, 121, 119, 25);
		contentPane.add(btnLogin);
	}
}
