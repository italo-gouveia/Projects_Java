
public class Pedido {
	
	/*Correto: A classe é o modelo, nesse caso só é necessário um atributo de cada.
	 * No entanto, cada objeto que você criar será uma estrutura que irá agrupar esses três
	 * atributos
	 * 	int CodigoPedido;
		String NomeCliente;
		String DescricaoPedido;
	 */
	int CodigoPedido;
	String NomeCliente;
	String DescricaoPedido;
	
	/*Correto: Construtor Padrão
	 * public Pedido(){
	 *     
	 * }
	 */
	
	/*
	 * Correto: O método modifica nome cliente, não retorna nada e recebe como
	 * parâmetro um nome para ser guardado no atributo do objeto.
	 * 	void modificarNomeCliente(){
			this.NomeCliente=NomeCliente;
		}
	 */
	void ModificarNomeCliente(String NomeCliente){
		this.NomeCliente=NomeCliente;
	}
	void RetornaNomeCliente(){
		System.out.println("Nome do primeiro cliente: " + this.NomeCliente);
	}
	void ModificarDescricaoPedido(String DescricaoPedido){
		this.DescricaoPedido=DescricaoPedido;
	}
	/*
	 * Correto: O método retorna a descrição do pedido não recebe nada como parâmetro
	 * e retorna o valor do atributo descrição pedido da classe.
	 * 	String RetornaDescricaoPedido(){
			return this.DescricaoPedido;
		}
	 */
	void RetornaDescricaoPedido(){
		System.out.println("Descrição do primeiro pedido: " + this.DescricaoPedido);
	}
	void insereValoresPedido(String Cliente, String Descricao){
		this.NomeCliente=Cliente;
		this.DescricaoPedido=Descricao;
	}
}
 