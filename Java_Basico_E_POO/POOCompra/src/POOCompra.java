import java.util.Scanner;

public class POOCompra {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		Compra pedido1 = new Compra();
		
		do {
			System.out.println("Digite o número do pedido: ");
			pedido1.numeroDoPedido=teclado.nextInt();
			System.out.println("Digite a data do pedido: ");
			pedido1.dataPedido=teclado.next();
			System.out.println("Digite o preço do pedido: ");
			pedido1.precoUnitario=teclado.nextFloat();
			System.out.println("Digite a quantidade do pedido: ");
			pedido1.quantidade=teclado.nextInt();
			
			if(pedido1.numeroDoPedido > 0){
				pedido1.calcularCompra(pedido1.precoUnitario, pedido1.quantidade);
			}
			
		} while(pedido1.numeroDoPedido > 0);
		
		pedido1.exibirTotal();
	}
}
