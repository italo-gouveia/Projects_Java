
public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor(){
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public void obterSaldo(){
		float saldo;
		saldo = this.getValorCredito() - this.getValorDivida();
		System.out.println("Saldo : " + saldo);
	}
	public void status(){
		super.status();
		System.out.println("Valor Crédito: " + this.getValorCredito());
		System.out.println("Valor Divida " + this.getValorDivida());
	}
}
