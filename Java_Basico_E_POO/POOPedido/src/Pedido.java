
public class Pedido {
	int CodigoPedido, CodigoPedido2;
	String NomeCliente, NomeCliente2;
	String DescricaoPedido, DescricaoPedido2;
	
	void ModificarNomeCliente(){
		this.NomeCliente=NomeCliente;
		this.NomeCliente2=NomeCliente2;
	}
	void RetornaNomeCliente(){
		System.out.println("Nome do primeiro cliente: " + this.NomeCliente);
	}
	void RetornaNomeCliente2(){
		System.out.println("Nome do segundo cliente: " + this.NomeCliente2);
	}
	void ModificarDescricaoPedido(){
		this.DescricaoPedido=DescricaoPedido;
		this.DescricaoPedido2=DescricaoPedido2;
	}
	void RetornaDescricaoPedido(){
		System.out.println("Descrição do primeiro pedido: " + this.DescricaoPedido);
	}
	void RetornaDescricaoPedido2(){
		System.out.println("Descrição do segundo pedido: " + this.DescricaoPedido2);
	}
	void insereValoresPedido1(String ClienteP1, String DescricaoP1){
		this.NomeCliente=ClienteP1;
		this.DescricaoPedido=DescricaoP1;
	}
	void insereValoresPedido2(String ClienteP2, String DescricaoP2){
		this.NomeCliente2=ClienteP2;
		this.DescricaoPedido2=DescricaoP2;
	}
}
