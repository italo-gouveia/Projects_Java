import java.util.Scanner;

public class POOPedido {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in), tecladoString = new Scanner(System.in);
		
		//Essa parte aqui lhe explico amanhã.
		//Pois fica complicado explicar por aqui.
		Pedido pedido1 = new Pedido();
		Pedido pedido2 = new Pedido();
		
		System.out.println("Digite o código do pedido: ");
		pedido1.CodigoPedido=teclado.nextInt();
		System.out.println("Digite o nome do cliente: ");
		pedido1.NomeCliente=tecladoString.nextLine();
		System.out.println("Digite a descrição do pedido: ");
		pedido1.DescricaoPedido=tecladoString.nextLine();
		
		pedido1.RetornaDescricaoPedido();
		pedido1.RetornaNomeCliente();
		
		System.out.println("Digite o código do pedido: ");
		pedido2.CodigoPedido=teclado.nextInt();
		System.out.println("Digite o nome do cliente: ");
		pedido2.NomeCliente=tecladoString.nextLine();
		System.out.println("Digite a descrição do pedido: ");
		pedido2.DescricaoPedido=tecladoString.nextLine();

		pedido2.RetornaDescricaoPedido();
		pedido2.RetornaNomeCliente();
		//Esta parte do programa modifica os dois pedidos anteriores por outros//
		System.out.println("Digite o código do pedido: ");
		pedido1.CodigoPedido=teclado.nextInt();
		System.out.println("Digite o nome do cliente: ");
		pedido1.NomeCliente=tecladoString.nextLine();
		System.out.println("Digite a descrição do pedido: ");
		pedido1.DescricaoPedido=tecladoString.nextLine();
		
		pedido1.RetornaDescricaoPedido();
		pedido1.RetornaNomeCliente();
		pedido1.insereValoresPedido(pedido1.NomeCliente, pedido1.DescricaoPedido);
		teclado.nextLine();
		
		System.out.println("Digite o código do segundo pedido: ");
		pedido2.CodigoPedido=teclado.nextInt();
		System.out.println("Digite o nome do segundo cliente: ");
		pedido2.NomeCliente=tecladoString.nextLine();
		System.out.println("Digite a descrição do segundo pedido: ");
		pedido2.DescricaoPedido=tecladoString.nextLine();
		

		pedido2.insereValoresPedido(pedido2.NomeCliente, pedido2.DescricaoPedido);


		pedido2.RetornaDescricaoPedido();
		pedido2.RetornaNomeCliente();
		
	}
}
