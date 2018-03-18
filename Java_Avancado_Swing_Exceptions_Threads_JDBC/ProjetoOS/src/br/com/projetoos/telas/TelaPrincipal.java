package br.com.projetoos.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;

public class TelaPrincipal extends JFrame{

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("OS F\u00E1cil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 565);
		
		JMenuBar menu = new JMenuBar();
		menu.setToolTipText("");
		setJMenuBar(menu);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menu.add(menuCadastro);
		
		JMenuItem menuCadastroCliente = new JMenuItem("Cliente");
		menuCadastro.add(menuCadastroCliente);
		
		JMenuItem menuCadastroUsuario = new JMenuItem("Us\u00FAario");
		menuCadastro.add(menuCadastroUsuario);
		
		JMenuItem menuCadastroOS = new JMenuItem("OS");
		menuCadastro.add(menuCadastroOS);
		
		JMenu menuRelatorio = new JMenu("Relat\u00F3rios");
		menu.add(menuRelatorio);
		
		JMenuItem menuServios = new JMenuItem("Servi\u00E7os");
		menuRelatorio.add(menuServios);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menu.add(menuAjuda);
		
		JMenuItem menuSobre = new JMenuItem("Sobre");
		menuAjuda.add(menuSobre);
		
		JMenu menuOpcoes = new JMenu("Op\u00E7\u00F5es");
		menu.add(menuOpcoes);
		
		JMenuItem menuSair = new JMenuItem("Sair");
		menuOpcoes.add(menuSair);
		
		setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setForeground(new Color(102, 51, 255));
		desktopPane.setBounds(0, 0, 1420, 975);
		getContentPane().add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Italo\\Downloads\\if_document-03_1622833.png"));
		lblNewLabel.setBounds(1419, 0, 248, 231);
		getContentPane().add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblUsuario.setBounds(1615, 34, 181, 22);
		getContentPane().add(lblUsuario);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblData.setBounds(1615, 119, 157, 77);
		getContentPane().add(lblData);

	}
}
