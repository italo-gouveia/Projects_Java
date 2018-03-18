import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrimeiraAulaThiago extends JFrame{
	
	public static void main(String[] args) {
		/*aula de thiago 18-08-2017*/
		
		
		
		//Message Dialog:
		//Show Message Dialog são métodos que exibem uma caixa de mensagem na tela.
		//Assinatura dos métodos:
		//JOptionPane.showMessageDialog(parentComponent, message);
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
		
		JOptionPane.showMessageDialog(null, "Bem vindos");
		JOptionPane.showMessageDialog(null, "Bem vindos", "Titulo1", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Bem vindos", "Titulo2", JOptionPane.WARNING_MESSAGE, new ImageIcon("icone.png"));
		
		//parentComponent - é o parametro que define qual é o objeto pai relacionado, utilizado apenas pra métodos que sejam "internal"
		//message - define a mensagem exibida
		//title - define o titulo
		//messageType - define o tipo da mensagem, alterando ele, também é alterado o icone pois cada tipo tem o seu, exemplos: WARNING_MESSAGE E QUESTION_MESSAGE
		//icon - modifica o icone, para isso ele deve estar na mesma pasta do projeto utilizando a instrução new ImageIcon(NomeImagem.png);
		
		
		
		
		
		
		//Confirm Dialog:
		//Show Confirm Dialog é utilizado para fazer perguntas ao usuário
		//Assinatura dos métodos:
		
		//int op = JOptionPane.showConfirmDialog(parentComponent, message);
		//int op =JOptionPane.showConfirmDialog(parentComponent, message, title, optionType);
		//int op = JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType);
		//int op = JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType, icon);
		
		//Deve-se fazer um int receber esse metodo pois ele retorna um inteiro que representa o tipo da ação que o usuário fizer, por exemplo clicar no x retorna -1 etc				
		//Isso é bom para controlar as operações de maneira melhor
		
		int op = JOptionPane.showConfirmDialog(null, "Você gosta de java ?");
		System.out.println(op);
		op = JOptionPane.showConfirmDialog(null, "Você gosta de SO ?", "SO the best", JOptionPane.DEFAULT_OPTION);
		System.out.println(op);
		op = JOptionPane.showConfirmDialog(null, "Você gosta de\n programação para internet ?", 
				"javascript is very good", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println(op);
		if(op == 0){
			JOptionPane.showMessageDialog(null, "Leia o livro de SO");
		}
		//Aqui utilizando esse retorno da numeração, podemos verificar uma condição, no exemplo, utilizamos o zero que caso a opção escolhida retorne 0, ele exibirá determinada mensagem
		op = JOptionPane.showConfirmDialog(null, "He-man", "Esqueleto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, new ImageIcon("icone.png"));
		System.out.println(op);
		
		//assinatura semelhante à do showMessageDialog com exceção do parametro optionType
		//optionType - utilizado para definir o tipo de opções que disponibilizaremos na caixa de confirmação de operação, ex: JOptionPane.YES_NO_OPTION que adiciona as referidas opções
		
		
		
		
		
		//Input Dialog:
		//Show input dialog é utilizado para receber uma entrada do usuário, retorna sempre uma String
		
		//Assinatura dos métodos:
		//JOptionPane.showInputDialog(message);
		//JOptionPane.showInputDialog(parentComponent, message);
		//JOptionPane.showInputDialog(message, initialSelectionValue);
		//JOptionPane.showInputDialog(parentComponent, message, initialSelectionValue);
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType);
		
		//essa ultima retorna um objeto ao invés de uma String como as anteriores;
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)

		//message - mensagem que você quer colocar como uma pergunta
		//parentComponent - objeto pai
		//initialSelectionValue - valor que vem selecionado como padrão(inicia com ele), caso não utilizado, será definido a primeira opção como padrão 
		//title - titulo
		//icon - icone
		//selectionValues - podemos definir nossos proprios valores aqui por exemplo, utilizando um vetor declarado anteriormente
		
		String materia = JOptionPane.showInputDialog("Digite a matéria que você mais gosta: ");
		System.out.println(materia);
		JOptionPane.showInputDialog(null, "Mensagem");
		JOptionPane.showInputDialog("Mensagem", "isso aqui é padrão");
		JOptionPane.showInputDialog(null, "Mensagem", "isso aqui é padrão");
		JOptionPane.showInputDialog(null, "A", "B", JOptionPane.WARNING_MESSAGE);
		Object[] valores = {"SO", "ED", "P2", "PI"};
		JOptionPane.showInputDialog(null, "Agora você não erra", "Titulo", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icone.png"), valores, "SO");
		//o icone sobrescreve o icone do plain message
		//o ultimo parametro define a primeira opção do vetor como padrão
		
		Object [] botoes = {"Olá", "oi", "ooooiiiii"};
		JOptionPane.showOptionDialog(null, "Option type", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botoes, botoes[0]);
		
		//tudo que for internal precisa ter um objeto pai, ou seja, não pode ser null
	}
}
