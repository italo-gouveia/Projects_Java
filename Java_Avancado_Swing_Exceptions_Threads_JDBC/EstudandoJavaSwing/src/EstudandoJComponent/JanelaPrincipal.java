package EstudandoJComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame{
	
	private JPanel painelPrincipal;
	private JLabel lbBoasVindas;
	private JButton btnAcao;
	private JButton btnAcao2;
	private JTextField tfElemento;
	private JCheckBox cbAcao;
	
	public JanelaPrincipal(){

		painelPrincipal = new JPanel();
		lbBoasVindas = new JLabel("Vamos programar ? ");
		btnAcao = new JButton("Clique aqui ");
		btnAcao2 = new JButton("Não clique aqui ");
		tfElemento = new JTextField();
		cbAcao = new JCheckBox("Selecione");
		
		lbBoasVindas.setBounds(10, 10, 160, 25);
		btnAcao.setBounds(10, 40, 100, 25);
		btnAcao2.setBounds(120, 40, 150, 25);
		tfElemento.setBounds(10, 70, 80, 25);
		cbAcao.setBounds(10, 100, 80, 25);
		
		painelPrincipal.add(btnAcao);
		painelPrincipal.add(btnAcao2);
		painelPrincipal.add(lbBoasVindas);
		painelPrincipal.add(tfElemento);
		painelPrincipal.add(cbAcao);
		
		painelPrincipal.setLayout(null);
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Titulo da janela principal");
		super.setSize(500, 300);
		super.setVisible(true);
		
		//o seguinte trecho de código adiciona uma ação ao botão - necessário implementar Action Listener,
		//sobrescreve o método na mesma e declara a ação que será feita no método
		btnAcao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, tfElemento.getText());
				if(cbAcao.isSelected()){
					JOptionPane.showMessageDialog(null, tfElemento.getText());
				}else{
					JOptionPane.showMessageDialog(null, "informe alguma coisa! ");
				}
			}
		});
		
		btnAcao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Explosion Mind ");
					JOptionPane.PLAIN_MENSAGE(null, "");
			}
		});
	}
	
	public static void main(String[] args) {
		new JanelaPrincipal();
	}
	
}
