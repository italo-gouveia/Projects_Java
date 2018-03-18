import java.util.Scanner;

public class POOPedido {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		Pedido pedido1 = new Pedido();
		String ClienteP1, DescricaoP1;
		int CodigoP1;
		
		Pedido pedido2 = new Pedido();
		String ClienteP2, DescricaoP2;
		int CodigoP2;
		
		System.out.println("Digite o código do pedido: ");
		pedido1.CodigoPedido=teclado.nextInt();
		System.out.println("Digite o nome do cliente: ");
		pedido1.NomeCliente=teclado.next();
		System.out.println("Digite a descrição do pedido: ");
		pedido1.DescricaoPedido=teclado.next();
		
		System.out.println("Digite o código do segundo pedido: ");
		pedido2.CodigoPedido2=teclado.nextInt();
		System.out.println("Digite o nome do segundo cliente: ");
		pedido2.NomeCliente2=teclado.next();
		System.out.println("Digite a descrição do segundo pedido: ");
		pedido2.DescricaoPedido2=teclado.next();
		
		pedido1.RetornaDescricaoPedido();
		pedido1.RetornaNomeCliente();
		teclado.nextLine();
		pedido2.RetornaDescricaoPedido2();
		pedido2.RetornaNomeCliente2();
		
		
		//Esta parte do programa modifica os dois pedidos anteriores por outros//
		System.out.println("Digite o código do pedido: ");
		CodigoP1=teclado.nextInt();
		System.out.println("Digite o nome do cliente: ");
		ClienteP1=teclado.next();
		System.out.println("Digite a descrição do pedido: ");
		DescricaoP1=teclado.next();
		
		System.out.println("Digite o código do segundo pedido: ");
		CodigoP2=teclado.nextInt();
		System.out.println("Digite o nome do segundo cliente: ");
		ClienteP2=teclado.next();
		System.out.println("Digite a descrição do segundo pedido: ");
		DescricaoP2=teclado.next();
		
		pedido1.insereValoresPedido1(ClienteP1, DescricaoP1);
		pedido2.insereValoresPedido2(ClienteP2, DescricaoP2);

		pedido1.RetornaDescricaoPedido();
		pedido1.RetornaNomeCliente();
		teclado.nextLine();
		pedido2.RetornaDescricaoPedido2();
		pedido2.RetornaNomeCliente2();
		
	}
}
