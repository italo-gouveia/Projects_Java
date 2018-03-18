
public class Fornecedor extends Pessoa{

	private float valorCredito;
	private float valorDebito;
	
	public Fornecedor(){
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDebito) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDebito = valorDebito;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(float valorDebito) {
		this.valorDebito = valorDebito;
	}
	
	public void obterSaldo(){
		float saldo;
		saldo = this.getValorCredito() - this.getValorDebito();
		System.out.println("Saldo: " + saldo);
	}
	
	
}
