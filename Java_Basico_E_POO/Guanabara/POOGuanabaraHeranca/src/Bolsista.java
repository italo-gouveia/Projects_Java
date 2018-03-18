
public class Bolsista extends Aluno{

	private float bolsa;
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa(){
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	@Override//sobrescrevendo um método
	public void pagarMensalidade(){
		System.out.println("O aluno " + this.nome + " é bolsista. Pagamento facilitado.");
	}
	
}
