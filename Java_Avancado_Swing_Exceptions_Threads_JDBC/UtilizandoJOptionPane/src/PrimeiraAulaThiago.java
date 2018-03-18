import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeiraAulaThiago extends JFrame{
	
	public static void main(String[] args) {
		/*aula de thiago 18-08-2017*/
		
		
		
		//Message Dialog:
		//Show Message Dialog s�o m�todos que exibem uma caixa de mensagem na tela.
		//Assinatura dos m�todos:
		//JOptionPane.showMessageDialog(parentComponent, message);
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
		
		JOptionPane.showMessageDialog(null, "Bem vindos");
		JOptionPane.showMessageDialog(null, "Bem vindos", "Titulo1", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Bem vindos", "Titulo2", JOptionPane.WARNING_MESSAGE, new ImageIcon("icone.png"));
		
		//parentComponent - � o parametro que define qual � o objeto pai relacionado, utilizado apenas pra m�todos que sejam "internal"
		//message - define a mensagem exibida
		//title - define o titulo
		//messageType - define o tipo da mensagem, alterando ele, tamb�m � alterado o icone pois cada tipo tem o seu, exemplos: WARNING_MESSAGE E QUESTION_MESSAGE
		//icon - modifica o icone, para isso ele deve estar na mesma pasta do projeto utilizando a instru��o new ImageIcon(NomeImagem.png);
		
		
		
		
		
		
		//Confirm Dialog:
		//Show Confirm Dialog � utilizado para fazer perguntas ao usu�rio
		//Assinatura dos m�todos:
		
		//int op = JOptionPane.showConfirmDialog(parentComponent, message);
		//int op =JOptionPane.showConfirmDialog(parentComponent, message, title, optionType);
		//int op = JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType);
		//int op = JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType, icon);
		
		//Deve-se fazer um int receber esse metodo pois ele retorna um inteiro que representa o tipo da a��o que o usu�rio fizer, por exemplo clicar no x retorna -1 etc				
		//Isso � bom para controlar as opera��es de maneira melhor
		
		int op = JOptionPane.showConfirmDialog(null, "Voc� gosta de java ?");
		System.out.println(op);
		op = JOptionPane.showConfirmDialog(null, "Voc� gosta de SO ?", "SO the best", JOptionPane.DEFAULT_OPTION);
		System.out.println(op);
		op = JOptionPane.showConfirmDialog(null, "Voc� gosta de\n programa��o para internet ?", 
				"javascript is very good", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println(op);
		if(op == 0){
			JOptionPane.showMessageDialog(null, "Leia o livro de SO");
		}
		//Aqui utilizando esse retorno da numera��o, podemos verificar uma condi��o, no exemplo, utilizamos o zero que caso a op��o escolhida retorne 0, ele exibir� determinada mensagem
		op = JOptionPane.showConfirmDialog(null, "He-man", "Esqueleto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, new ImageIcon("icone.png"));
		System.out.println(op);
		
		//assinatura semelhante � do showMessageDialog com exce��o do parametro optionType
		//optionType - utilizado para definir o tipo de op��es que disponibilizaremos na caixa de confirma��o de opera��o, ex: JOptionPane.YES_NO_OPTION que adiciona as referidas op��es
		
		
		
		
		
		//Input Dialog:
		//Show input dialog � utilizado para receber uma entrada do usu�rio, retorna sempre uma String
		
		//Assinatura dos m�todos:
		//JOptionPane.showInputDialog(message);
		//JOptionPane.showInputDialog(parentComponent, message);
		//JOptionPane.showInputDialog(message, initialSelectionValue);
		//JOptionPane.showInputDialog(parentComponent, message, initialSelectionValue);
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType);
		
		//essa ultima retorna um objeto ao inv�s de uma String como as anteriores;
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)

		//message - mensagem que voc� quer colocar como uma pergunta
		//parentComponent - objeto pai
		//initialSelectionValue - valor que vem selecionado como padr�o(inicia com ele), caso n�o utilizado, ser� definido a primeira op��o como padr�o 
		//title - titulo
		//icon - icone
		//selectionValues - podemos definir nossos proprios valores aqui por exemplo, utilizando um vetor declarado anteriormente
		
		String materia = JOptionPane.showInputDialog("Digite a mat�ria que voc� mais gosta: ");
		System.out.println(materia);
		JOptionPane.showInputDialog(null, "Mensagem");
		JOptionPane.showInputDialog("Mensagem", "isso aqui � padr�o");
		JOptionPane.showInputDialog(null, "Mensagem", "isso aqui � padr�o");
		JOptionPane.showInputDialog(null, "A", "B", JOptionPane.WARNING_MESSAGE);
		Object[] valores = {"SO", "ED", "P2", "PI"};
		JOptionPane.showInputDialog(null, "Agora voc� n�o erra", "Titulo", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icone.png"), valores, "SO");
		//o icone sobrescreve o icone do plain message
		//o ultimo parametro define a primeira op��o do vetor como padr�o
		
		Object [] botoes = {"Ol�", "oi", "ooooiiiii"};
		JOptionPane.showOptionDialog(null, "Option type", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);
		
		//tudo que for internal precisa ter um objeto pai, ou seja, n�o pode ser null
	}
}
