
public class Compra {
	int numeroDoPedido;
	String dataPedido;
	float precoUnitario;
	int quantidade;
	static float acumulador;
	
	public void calcularCompra(float preco, int quantidade){
		acumulador = acumulador + preco * quantidade;
	}
	public void exibirTotal (){
		System.out.println("Total: " + acumulador);
	}
}
