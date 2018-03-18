import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Contas \u00E0 pagar");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmDespesasFixas = new JMenuItem("Despesas Fixas");
		mntmDespesasFixas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu.add(mntmDespesasFixas);
		
		JMenuItem mntmFolhaDePagamento_1 = new JMenuItem("Folha de Pagamento");
		mnNewMenu.add(mntmFolhaDePagamento_1);
		
		JMenu mnContasReceber = new JMenu("Contas \u00E0 receber");
		menuBar.add(mnContasReceber);
		
		JMenu mnMetas = new JMenu("Metas");
		menuBar.add(mnMetas);
		
		JMenu mnPrevisoFinanceira = new JMenu("Previs\u00E3o Financeira");
		menuBar.add(mnPrevisoFinanceira);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 702, 407);
		contentPane.add(panel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
