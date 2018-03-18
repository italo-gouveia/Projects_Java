package ClassesConexao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setForeground(Color.GREEN);
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsurio.setBounds(12, 28, 84, 55);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.GREEN);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSenha.setBounds(12, 111, 84, 55);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfUsuario.setBounds(93, 36, 135, 38);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(93, 120, 135, 38);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					Connection con = Conexao.conexaoBanco();
					
					//comando passado para o mysql
					String sql = "select *from dados_senhas where usuario=? and senha=?";
					
					//prepara a declaração e envia pra o banco
					PreparedStatement stmt = con.prepareStatement(sql);
					
					//prepara os dados pra enviar pra o banco
					stmt.setString(1, tfUsuario.getText());
					stmt.setString(2, new String (pfSenha.getPassword()));
					
					//armazena o resultado da consulta
					ResultSet rs = stmt.executeQuery();
					if(rs.next()){
						JOptionPane.showMessageDialog(null, "Usuário logado com sucesso");
						setLocationRelativeTo(null);
					}else{
						JOptionPane.showMessageDialog(null, "Usuário não existe");
						setLocationRelativeTo(null);
					}
					
					stmt.close();
					con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnEntrar.setForeground(Color.GREEN);
		btnEntrar.setBackground(Color.DARK_GRAY);
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEntrar.setBounds(93, 197, 135, 38);
		contentPane.add(btnEntrar);
	}
}
