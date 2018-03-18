package EstudandoJComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Aula08_09 extends JFrame implements ActionListener{
	JPanel painelPrincipal;
	JRadioButton rbSelecao1, rbSelecao2, rbSelecao3, rbSelecao4;
	ButtonGroup btGrupo;
	
	public Aula08_09(){
		painelPrincipal = new JPanel();
		painelPrincipal.setLayout(null);
		
		btGrupo = new ButtonGroup();//instância de um grupo de botões que só irá permitir a seleção de um deles
		
		rbSelecao1 = new JRadioButton("Item 1");
		rbSelecao1.setBounds(10, 10, 80, 25);
		rbSelecao2 = new JRadioButton("Item 2");
		rbSelecao2.setBounds(10, 40, 80, 25);
		rbSelecao3 = new JRadioButton("Item 3");
		rbSelecao3.setBounds(10, 70, 80, 25);
		rbSelecao4 = new JRadioButton("Item 4");
		rbSelecao4.setBounds(10, 100, 80, 25);
				
		painelPrincipal.add(rbSelecao1);
		painelPrincipal.add(rbSelecao2);
		painelPrincipal.add(rbSelecao3);
		painelPrincipal.add(rbSelecao4);
		
		btGrupo.add(rbSelecao1);
		btGrupo.add(rbSelecao2);
		btGrupo.add(rbSelecao3);
		btGrupo.add(rbSelecao4);
		
		super.getContentPane().add(painelPrincipal);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		super.setTitle("Titulo da Janela");
		super.setSize(500, 300);
		super.setVisible(true);
		
		rbSelecao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, rbSelecao1.getText());
			}
		});
		
		rbSelecao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, rbSelecao2.getText());
			}
		});
		
		rbSelecao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, rbSelecao3.getText());
			}
		});
		
		rbSelecao4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, rbSelecao4.getText());
			}
		});
	}
	
	public static void main(String[] args) {
		new Aula08_09();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
