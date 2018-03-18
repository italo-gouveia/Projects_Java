
public class Conta {

	private float saldo;
	private float limite;
	private int numero;
	
	public Conta(){
		
	}
	
	public Conta(float saldo, float limite, int numero){
		this.saldo = saldo;
		this.limite = limite;
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void sacar(float valor) throws SaldoNegException{
		if(valor > this.saldo+limite){
			throw new SaldoNegException(valor);
		}else{
			this.saldo -= valor;
		}
	}
	
	public void depositar(float valor){
		this.saldo += valor;
	}
}
