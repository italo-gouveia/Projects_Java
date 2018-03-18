package br.com.projetoos.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.sql.*;
import br.com.projetoos.dal.ModuloConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaLogin extends JFrame {
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public void logar(){
		String sql="select * from tbusuarios where login =? and senha =?";
		try {
			//as linhas abaixo preparam a consulta ao banco em função do
			//que foi digitado nas caixas de texto
			//o ? é substituido pelo conteudo das variaveis
			pst = conexao.prepareStatement(sql);
			pst.setString(1, txtUsuario.getText());
			pst.setString(2, txtSenha.getText());
			//a linha abaixo executa a query
			rs = pst.executeQuery();
			//se existir usuario e senha correspondente
			if(rs.next()){
				TelaPrincipal principal = new TelaPrincipal();
				principal.setVisible(true);
				this.dispose();
				conexao.close();
			}else{
				JOptionPane.showMessageDialog(null, "Senha e/ou usuário(s) inválido(s).");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Senha e/ou usuário(s) inválido(s).");
		}
	}
	
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	
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
		setTitle("InfoOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsurio.setBounds(12, 13, 87, 30);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSenha.setBounds(12, 75, 56, 30);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsuario.setBounds(85, 11, 386, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//chamando o método logar
				logar();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBounds(374, 147, 97, 25);
		contentPane.add(btnLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSenha.setBounds(85, 73, 386, 30);
		contentPane.add(txtSenha);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(TelaLogin.class.getResource("/br/com/projetoos/icones/dberror.png")));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStatus.setBounds(12, 155, 350, 40);
		contentPane.add(lblStatus);
		
		this.setLocationRelativeTo(null);
		
		conexao = ModuloConexao.conector();
		//a linha abaixo de apoio ao status da conexão
		//System.out.println(conexao);
		
		if (conexao != null){
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoos/icones/dbok.png")));
		}else{
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projetoos/icones/dberror.png")));
		}	
	}
}
