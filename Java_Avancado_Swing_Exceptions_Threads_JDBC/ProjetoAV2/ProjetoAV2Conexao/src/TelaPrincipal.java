import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfPlaca;
	private JTextField tfChassi;
	private JTextField tfCor;
	private JTextField tfModelo;
	private JTextField tfMarca;
	private JTextField tfAno;
	static public JTextArea taListar = new JTextArea();
	private CarroDAO cDao = new CarroDAO();
	
	public Carro capturarDados() {
		Carro c = new Carro();
		c.setPlaca(tfPlaca.getText());
		c.setChassi(Long.parseLong(tfChassi.getText()));
		c.setCor(tfCor.getText());
		c.setMarca(tfMarca.getText());
		c.setModelo(tfModelo.getText());
		c.setAno(Integer.parseInt(tfAno.getText()));
		return c;
	}
	
	public void reabilitarCampos() {
		tfAno.setEnabled(true);
		tfCor.setEnabled(true);
		tfMarca.setEnabled(true);
		tfModelo.setEnabled(true);
		tfPlaca.setEnabled(true);
	}
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(10, 10, 50, 15);
		contentPane.add(lblPlaca);
		
		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setBounds(10, 40, 50, 15);
		contentPane.add(lblChassi);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(10, 70, 50, 15);
		contentPane.add(lblCor);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 100, 50, 15);
		contentPane.add(lblModelo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 130, 50, 15);
		contentPane.add(lblMarca);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(10, 160, 50, 15);
		contentPane.add(lblAno);
		
		tfPlaca = new JTextField();
		tfPlaca.setBounds(60, 10, 110, 22);
		contentPane.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		tfChassi = new JTextField();
		tfChassi.setBounds(60, 40, 110, 22);
		contentPane.add(tfChassi);
		tfChassi.setColumns(10);
		tfChassi.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					reabilitarCampos();
				}
				
			}
		});
		
		tfCor = new JTextField();
		tfCor.setBounds(60, 70, 110, 22);
		contentPane.add(tfCor);
		tfCor.setColumns(10);
		
		tfModelo = new JTextField();
		tfModelo.setBounds(60, 100, 110, 22);
		contentPane.add(tfModelo);
		tfModelo.setColumns(10);
		
		tfMarca = new JTextField();
		tfMarca.setBounds(60, 130, 110, 22);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		tfAno = new JTextField();
		tfAno.setBounds(60, 160, 110, 22);
		contentPane.add(tfAno);
		tfAno.setColumns(10);
	
		JCheckBox cbxAlterar = new JCheckBox("Alterar");
		cbxAlterar.setBounds(340, 190, 100, 25);
		contentPane.add(cbxAlterar);
		
		JCheckBox cbxRemover = new JCheckBox("Remover");
		cbxRemover.setBounds(190, 190, 100, 25);
		contentPane.add(cbxRemover);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int opc = JOptionPane.showConfirmDialog(null, "Deseja cadastrar os dados ?", "Inserir", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
				//verifica se o cliente clicou em sim
				if(opc == 0) {
					Carro c = capturarDados();
					//verifica se a lista está vazia
					if(cDao.listar() == null) {
						cDao.inserir(c);
						JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
					}else {
						for(Carro carroModel: cDao.listar()) {
							//verifica se o carro já está cadastrado
							if(c.getChassi() == carroModel.getChassi()) {
								JOptionPane.showMessageDialog(null, "Impossível inserir carro já cadastrado");
							}else{
								cDao.inserir(c);
								JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
							}
						}
					}
				}else if(opc == 1) {
					JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!");
				}
			}
		});
		btnInserir.setBounds(10, 220, 90, 25);
		contentPane.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxAlterar.isSelected()) {
					long catchChassi = Long.parseLong(tfChassi.getText());
					int opc = JOptionPane.showConfirmDialog(null, "Deseja alterar o carro ?", "Alterar", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if(opc == 1) {
						JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
					}else if (opc == 0){
						Carro cModel = capturarDados();
						cDao.atualizar(catchChassi, cModel);
						JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
					}
				}
				
			}
		});
		btnAlterar.setBounds(120, 220, 90, 25);
		contentPane.add(btnAlterar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxRemover.isSelected()) {
					long catchChassi = Long.parseLong(tfChassi.getText());
					int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente remover esse carro ?", "Remover", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
					if(opc == 1) {
						JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!");
					}else if(opc == 0){
						cDao.deletar(catchChassi);
						JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
					}
				}
			}
		});
		btnRemover.setBounds(230, 220, 90, 25);
		contentPane.add(btnRemover);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(340, 220, 90, 25);
		contentPane.add(btnSair);
		
		cbxAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxAlterar.isSelected()) {
					cbxRemover.setSelected(false);
					tfAno.setEnabled(false);
					tfCor.setEnabled(false);
					tfMarca.setEnabled(false);
					tfModelo.setEnabled(false);
					tfPlaca.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Informe o numero de chassi do carro que será Alterado aperte enter "
							+ "\n para liberar os campos que serão atualizados e em seguida aperte o botão alterar");					
				}else {
					reabilitarCampos();
				}
			}	
		});
		
		cbxRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxRemover.isSelected()) {
					cbxAlterar.setSelected(false);
					tfAno.setEnabled(false);
					tfCor.setEnabled(false);
					tfMarca.setEnabled(false);
					tfModelo.setEnabled(false);
					tfPlaca.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Informe o numero de chassi do carro que será removido "
							+ "\n e em seguida aperta o botão remover");
				}else {
					reabilitarCampos();
				}
			}	
		});
		
		taListar.setBounds(190, 10, 240, 160);
		contentPane.add(taListar);
		Thread t1 = new Thread(new ClasseThreads());
		t1.start();
		//taListar.setText(String.valueOf(t1));
	}
}
