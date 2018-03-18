import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExercicioAula01JFrame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bem vindo � aplica��o!", "PDV", JOptionPane.INFORMATION_MESSAGE);
		
		Object[] produtos = { "Feij�o", "Macarr�o", "Arroz", "Coca-Cola" };
		String produto = (String) JOptionPane.showInputDialog(null, "Selecione o produto", "Produtos",
				JOptionPane.QUESTION_MESSAGE, null, produtos, produtos[0]);
		
		float preco = Float.valueOf(
				JOptionPane.showInputDialog(null, "Informe o pre�o", "Produtos", JOptionPane.QUESTION_MESSAGE));
		
		float quant = Float.valueOf(
				JOptionPane.showInputDialog(null, "Informe a quantidade", "Produtos", JOptionPane.QUESTION_MESSAGE));
		
		float subtotal = preco * quant;
		float total = preco * quant;
		
		Venda venda = new Venda(produto, subtotal, total);
		JOptionPane.showMessageDialog(null, venda.toString(), "Total", JOptionPane.WARNING_MESSAGE, null);
		
		JOptionPane.showConfirmDialog(null, "Deseja confirmar a opera��o ?", "Confirmar Transa��o",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		JOptionPane.showMessageDialog(null, "Obrigado e volte sempre! ", "Caixa Livre", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

}