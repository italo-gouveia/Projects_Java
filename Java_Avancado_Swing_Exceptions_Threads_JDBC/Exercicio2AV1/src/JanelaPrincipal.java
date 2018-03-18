import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfSobrenome;
	private JTextField tfRua;
	private JTextField tfNumero;
	private JTextField tfCEP;
	private JTextField tfBairro;
	private ButtonGroup btGrupo;
	private JTextField tfCPF_CNPJ;
	private JComboBox<String> cbCidade;
	private JRadioButton rbPessoaFisica;
	private JRadioButton rbPessoaJuridica;
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
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
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 13, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(12, 60, 94, 16);
		contentPane.add(lblSobrenome);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(12, 109, 56, 16);
		contentPane.add(lblRua);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(12, 154, 56, 16);
		contentPane.add(lblNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(248, 154, 56, 16);
		contentPane.add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(248, 204, 56, 16);
		contentPane.add(lblCep);
		
		tfNome = new JTextField();
		tfNome.setBounds(106, 10, 116, 22);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfSobrenome = new JTextField();
		tfSobrenome.setBounds(106, 57, 116, 22);
		contentPane.add(tfSobrenome);
		tfSobrenome.setColumns(10);
		
		tfRua = new JTextField();
		tfRua.setBounds(106, 106, 116, 22);
		contentPane.add(tfRua);
		tfRua.setColumns(10);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(106, 151, 116, 22);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		tfCEP = new JTextField();
		tfCEP.setBounds(304, 201, 116, 22);
		contentPane.add(tfCEP);
		tfCEP.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(304, 151, 116, 22);
		contentPane.add(tfBairro);
		tfBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 204, 56, 16);
		contentPane.add(lblCidade);
		
		rbPessoaFisica = new JRadioButton("Pessoa Fisica");
		rbPessoaFisica.setBounds(293, 9, 127, 25);
		contentPane.add(rbPessoaFisica);
		
		rbPessoaJuridica = new JRadioButton("Pessoa Juridica");
		rbPessoaJuridica.setBounds(293, 39, 127, 25);
		contentPane.add(rbPessoaJuridica);
		
		btGrupo = new ButtonGroup();
		btGrupo.add(rbPessoaJuridica);
		btGrupo.add(rbPessoaFisica);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(248, 109, 56, 16);
		contentPane.add(lblCpf);
		
		tfCPF_CNPJ = new JTextField();
		tfCPF_CNPJ.setBounds(304, 106, 116, 22);
		contentPane.add(tfCPF_CNPJ);
		tfCPF_CNPJ.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(248, 109, 56, 16);
		contentPane.add(lblCnpj);
		lblCnpj.setVisible(false);
		
		cbCidade = new JComboBox<String>();
		cbCidade.setBounds(106, 201, 116, 22);
		contentPane.add(cbCidade);
		
		cbCidade.addItem("");
		cbCidade.addItem("Patos");
		cbCidade.addItem("João Pessoa");
		cbCidade.addItem("Natal");
		cbCidade.addItem("Campina Grande");
		cbCidade.addItem("Recife");
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listar();
			}
		});
		btnListar.setBounds(323, 266, 97, 25);
		contentPane.add(btnListar);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnNewButton.setBounds(216, 266, 97, 25);
		contentPane.add(btnNewButton);
		
		rbPessoaFisica.addActionListener(a->{
			lblCpf.setVisible(true);
			lblCnpj.setVisible(false);
		});
		
		rbPessoaJuridica.addActionListener(a->{
			lblCpf.setVisible(false);
			lblCnpj.setVisible(true);
		});
		/*if(rbPessoaFisica.isSelected()){
			//lblCnpj.setEnabled(false);
			//lblCpf.setEnabled(true);
			//lblCnpj.setVisible(false);
			//lblCpf.setVisible(true);
			lblCpf_Cnpj.setText("CPF:");
		}else if(rbPessoaJuridica.isSelected()){
			//lblCnpj.setEnabled(true);
			//lblCpf.setEnabled(false);
			//lblCnpj.setVisible(true);
			//lblCpf.setVisible(false);
			lblCpf_Cnpj.setText("CNPJ:");
		}*/
	}
	public void listar(){
		//Forma Antiga de listar:
		
		/*Object [] pessoasObj = new Object[pessoas.size()];
		for(int i=0; i<pessoas.size(); i++){
			pessoasObj[i] = pessoas.get(i).getNome();
		}
		String pessoaSel = (String) JOptionPane.showInputDialog(null, "Selecione a pessoa: ", 
				"Lista de pessoas", JOptionPane.INFORMATION_MESSAGE, null,pessoasObj, pessoasObj[0]);
		for(int i=0 ; i <pessoas.size(); i++){
			if(pessoaSel.equals(pessoas.get(i).getNome())){
				JOptionPane.showMessageDialog(null, pessoas.get(i).toString(), 
						"Dados Cadastrados", JOptionPane.INFORMATION_MESSAGE);
			}
		}*/
		Pessoa pessoaSel = (Pessoa) JOptionPane.showInputDialog(null, "Selecione a pessoa: ", 
				"Lista de pessoas", JOptionPane.INFORMATION_MESSAGE, null, pessoas.toArray(), pessoas.toArray()[0].toString());
		JOptionPane.showMessageDialog(null, pessoaSel.IdentityClass(), 
				"Dados Cadastrados", JOptionPane.INFORMATION_MESSAGE);
	}
	public void cadastrar(){
		if(rbPessoaFisica.isSelected()){
			PessoaFisica pf = new PessoaFisica();
			pf.setNome(tfNome.getText());
			pf.setSobrenome(tfSobrenome.getText());
			pf.setCpf(tfCPF_CNPJ.getText());
			pf.getEndereco().setRua(tfRua.getText());
			pf.getEndereco().setNumero(tfNumero.getText());
			pf.getEndereco().setBairro(tfBairro.getText());
			pf.getEndereco().setCep(tfCEP.getText());
			pf.getEndereco().setCidade((String) cbCidade.getSelectedItem());
			pessoas.add(pf);
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
		}else if(rbPessoaJuridica.isSelected()){
			PessoaJuridica pj = new PessoaJuridica();
			pj.setNome(tfNome.getText());
			pj.setSobrenome(tfSobrenome.getText());
			pj.setCpnj(tfCPF_CNPJ.getText());
			pj.getEndereco().setRua(tfRua.getText());
			pj.getEndereco().setNumero(tfNumero.getText());
			pj.getEndereco().setBairro(tfBairro.getText());
			pj.getEndereco().setCep(tfCEP.getText());
			pj.getEndereco().setCidade((String)cbCidade.getSelectedItem());
			pessoas.add(pj);
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
		}
		
	}
}
