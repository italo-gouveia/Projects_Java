import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {

	IngressoDAO iDAO = new IngressoDAO();
	
	public void comprar(JButton btn) {
		Ingresso i = new Ingresso();
		i.setEstudante(estudante);
		i.setFlag_vendida(true);
		i.setFileira_Coluna(btn.getText());
		i.setNumeroCarteira(numeroCarteira);
		iDAO.inserir(i);
		JOptionPane.showMessageDialog(null, "O ingresso: " + i.getId() + " foi vendido com sucesso!");
		btn.setBackground(Color.GREEN);
	}
	
	public void cancelar(long id) {
		iDAO.deletar(id);
	}
	
	public void alterar(long id) {
		//iDAO.atualizar(id, i);
	}
	
	public void listarIngressos() {
		
	}
	
	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup btngroup;
	long numeroCarteira;
	boolean estudante;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 775, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("A-0");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprar(btnNewButton);
			}
		});
		btnNewButton.setBounds(24, 13, 61, 53);
		contentPane.add(btnNewButton);
		
		JButton btnH = new JButton("A-1");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprar(btnH);
			}
		});
		btnH.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH.setBounds(97, 13, 61, 53);
		contentPane.add(btnH);
		
		JButton btnH_1 = new JButton("A-2");
		btnH_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprar(btnH_1);
			}
		});
		btnH_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_1.setBounds(170, 13, 61, 53);
		contentPane.add(btnH_1);
		
		JButton btnH_2 = new JButton("A-3");
		btnH_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_2);
			}
		});
		btnH_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_2.setBounds(243, 13, 61, 53);
		contentPane.add(btnH_2);
		
		JButton btnH_3 = new JButton("A-4");
		btnH_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_3);
			}
		});
		btnH_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_3.setBounds(316, 13, 61, 53);
		contentPane.add(btnH_3);
		
		JButton btnH_4 = new JButton("A-5");
		btnH_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_4);
			}
		});
		btnH_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_4.setBounds(389, 13, 61, 53);
		contentPane.add(btnH_4);
		
		JButton btnH_5 = new JButton("A-6");
		btnH_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_5);
			}
		});
		btnH_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_5.setBounds(462, 13, 61, 53);
		contentPane.add(btnH_5);
		
		JButton btnH_6 = new JButton("A-7");
		btnH_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_6);
			}
		});
		btnH_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_6.setBounds(533, 13, 61, 53);
		contentPane.add(btnH_6);
		
		JButton btnH_7 = new JButton("A-8");
		btnH_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_7);
			}
		});
		btnH_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_7.setBounds(606, 13, 61, 53);
		contentPane.add(btnH_7);
		
		JButton btnH_8 = new JButton("A-9");
		btnH_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(btnH_8);
			}
		});
		btnH_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnH_8.setBounds(679, 13, 61, 53);
		contentPane.add(btnH_8);
		
		JButton button = new JButton("B-0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(24, 79, 61, 53);
		contentPane.add(button);
		
		JButton button_1 = new JButton("B-9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_1);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(679, 79, 61, 53);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("B-8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_2);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(606, 79, 61, 53);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("B-7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_3);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(533, 79, 61, 53);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("B-6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_4);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(462, 79, 61, 53);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("B-5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_5);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBounds(389, 79, 61, 53);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("B-4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_6);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(316, 79, 61, 53);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("B-3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_7);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_7.setBounds(243, 79, 61, 53);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("B-2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_8);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_8.setBounds(170, 79, 61, 53);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("B-1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_9);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_9.setBounds(97, 79, 61, 53);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("C-0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_10);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_10.setBounds(24, 145, 61, 53);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("C-9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_11);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_11.setBounds(679, 145, 61, 53);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("C-8");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_12);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_12.setBounds(606, 145, 61, 53);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("C-7");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_13);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_13.setBounds(533, 145, 61, 53);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("C-6");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_14);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_14.setBounds(462, 145, 61, 53);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("C-5");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_15);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_15.setBounds(389, 145, 61, 53);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("C-4");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_16);
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_16.setBounds(316, 145, 61, 53);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("C-3");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_17);
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_17.setBounds(243, 145, 61, 53);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("C-2");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_18);
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_18.setBounds(170, 145, 61, 53);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("C-1");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_19);
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_19.setBounds(97, 145, 61, 53);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("D-0");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_20);
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_20.setBounds(24, 211, 61, 53);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("D-9");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_21);
			}
		});
		button_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_21.setBounds(679, 211, 61, 53);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("D-8");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_22);
			}
		});
		button_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_22.setBounds(606, 211, 61, 53);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("D-7");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_23);
			}
		});
		button_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_23.setBounds(533, 211, 61, 53);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("D-6");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_24);
			}
		});
		button_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_24.setBounds(462, 211, 61, 53);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("D-5");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_25);
			}
		});
		button_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_25.setBounds(389, 211, 61, 53);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("D-4");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_26);
			}
		});
		button_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_26.setBounds(316, 211, 61, 53);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("D-3");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_27);
			}
		});
		button_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_27.setBounds(243, 211, 61, 53);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("D-2");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_28);
			}
		});
		button_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_28.setBounds(170, 211, 61, 53);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("D-1");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_21);
			}
		});
		button_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_29.setBounds(97, 211, 61, 53);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("E-0");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_30);
			}
		});
		button_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_30.setBounds(24, 277, 61, 53);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("E-9");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_31);
			}
		});
		button_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_31.setBounds(679, 277, 61, 53);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("E-8");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_32);
			}
		});
		button_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_32.setBounds(606, 277, 61, 53);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("E-7");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_33);
			}
		});
		button_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_33.setBounds(533, 277, 61, 53);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("E-6");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_34);
			}
		});
		button_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_34.setBounds(462, 277, 61, 53);
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("E-5");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_35);
			}
		});
		button_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_35.setBounds(389, 277, 61, 53);
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("E-4");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_36);
			}
		});
		button_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_36.setBounds(316, 277, 61, 53);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("E-3");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_37);
			}
		});
		button_37.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_37.setBounds(243, 277, 61, 53);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("E-2");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_38);
			}
		});
		button_38.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_38.setBounds(170, 277, 61, 53);
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("E-1");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_39);
			}
		});
		button_39.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_39.setBounds(97, 277, 61, 53);
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("F-0");
		button_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_40);
			}
		});
		button_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_40.setBounds(24, 343, 61, 53);
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("F-9");
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_41);
			}
		});
		button_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_41.setBounds(679, 343, 61, 53);
		contentPane.add(button_41);
		
		JButton button_42 = new JButton("F-8");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_42);
			}
		});
		button_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_42.setBounds(606, 343, 61, 53);
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("F-7");
		button_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_43);
			}
		});
		button_43.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_43.setBounds(533, 343, 61, 53);
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("F-6");
		button_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_44);
			}
		});
		button_44.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_44.setBounds(462, 343, 61, 53);
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("F-5");
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_45);
			}
		});
		button_45.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_45.setBounds(389, 343, 61, 53);
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("F-4");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_46);
			}
		});
		button_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_46.setBounds(316, 343, 61, 53);
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("F-3");
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_47);
			}
		});
		button_47.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_47.setBounds(243, 343, 61, 53);
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("F-2");
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_48);
			}
		});
		button_48.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_48.setBounds(170, 343, 61, 53);
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("F-1");
		button_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar(button_49);
			}
		});
		button_49.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_49.setBounds(97, 343, 61, 53);
		contentPane.add(button_49);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnSim.setBounds(97, 434, 76, 25);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u00E3o");
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNo.setBounds(24, 434, 76, 25);
		contentPane.add(rdbtnNo);
		
		//ButtonGroup bntgroup = new ButtonGroup();
		//btngroup.add(rdbtnNo);
		//btngroup.add(rdbtnSim);
		//rdbtnNo.setSelected(true);
		
		if(rdbtnNo.isSelected()) {
			textField.setEnabled(false);
			estudante = false;
		}else if(rdbtnSim.isSelected()) {
			textField.setEnabled(true);
			estudante = true;
			numeroCarteira = Long.parseLong(textField.getText());
		}	
		JLabel lblEstudante = new JLabel("Estudante:");
		lblEstudante.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstudante.setBounds(24, 409, 134, 16);
		contentPane.add(lblEstudante);
		
		JButton btnConfirmar = new JButton("Cancelar Ingresso");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar(Long.parseLong(textField_2.getText()));
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmar.setBounds(507, 422, 233, 25);
		contentPane.add(btnConfirmar);
		
		/*JButton btnSair = new JButton("Alterar Ingresso");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterar(Long.parseLong(textField_1.getText()));
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSair.setBounds(244, 422, 233, 25);
		contentPane.add(btnSair);*/
		
		textField = new JTextField();
		textField.setBounds(24, 497, 173, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeroDaCarteira = new JLabel("Numero da carteira:");
		lblNumeroDaCarteira.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumeroDaCarteira.setBounds(24, 468, 181, 16);
		contentPane.add(lblNumeroDaCarteira);
		
		/*textField_1 = new JTextField();
		textField_1.setBounds(244, 466, 233, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);*/
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(507, 464, 233, 22);
		contentPane.add(textField_2);
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Para comprar um ingresso, marque se você é estudante ou não \n"
						+ "e se for informe o numero da carteira, \n"
						+ "após isso, clique na cadeira que deseja reservar.");
				JOptionPane.showMessageDialog(null, "Para cancelar a compra de um ingresso, informe no campo abaixo \n"
						+ "do botão de cancelamento o número do id \n do ingresso que é gerado após a compra do mesmo, \n"
						+ "após isso clique em cancelar o ingresso");
			}
		});
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAjuda.setBounds(643, 495, 97, 25);
		contentPane.add(btnAjuda);
		
	
	}
}
