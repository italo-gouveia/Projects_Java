
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
	
	@Override//sobrescrevendo um m�todo
	public void pagarMensalidade(){
		System.out.println("O aluno " + this.nome + " � bolsista. Pagamento facilitado.");
	}
	
}
