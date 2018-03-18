
public class Conta {

	private int numero;
	private float saldo;
	private float limite;
	private String tipo;
	private Cliente cliente;
	
	public Conta(){
		
	}
	
	public Conta(int numero, float saldo, float limite, String tipo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	
}
