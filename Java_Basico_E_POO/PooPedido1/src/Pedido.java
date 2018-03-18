
public class Pedido {
	
	/*Correto: A classe � o modelo, nesse caso s� � necess�rio um atributo de cada.
	 * No entanto, cada objeto que voc� criar ser� uma estrutura que ir� agrupar esses tr�s
	 * atributos
	 * 	int CodigoPedido;
		String NomeCliente;
		String DescricaoPedido;
	 */
	int CodigoPedido;
	String NomeCliente;
	String DescricaoPedido;
	
	/*Correto: Construtor Padr�o
	 * public Pedido(){
	 *     
	 * }
	 */
	
	/*
	 * Correto: O m�todo modifica nome cliente, n�o retorna nada e recebe como
	 * par�metro um nome para ser guardado no atributo do objeto.
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
	 * Correto: O m�todo retorna a descri��o do pedido n�o recebe nada como par�metro
	 * e retorna o valor do atributo descri��o pedido da classe.
	 * 	String RetornaDescricaoPedido(){
			return this.DescricaoPedido;
		}
	 */
	void RetornaDescricaoPedido(){
		System.out.println("Descri��o do primeiro pedido: " + this.DescricaoPedido);
	}
	void insereValoresPedido(String Cliente, String Descricao){
		this.NomeCliente=Cliente;
		this.DescricaoPedido=Descricao;
	}
}
 