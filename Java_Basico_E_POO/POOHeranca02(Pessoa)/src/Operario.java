
public class Operario extends Empregado{

	private float valorProducao;
	private float comissao;
	
	public Operario(){
		
	}
	
	public Operario(String nome, String endereco, String telefone, int codSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
		super(nome, endereco, telefone, codSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void calcularSalario(){
		float salario;
		salario = this.getSalarioBase() - ((this.getSalarioBase()/100) * this.getImposto()) + ((this.getValorProducao()/100)*this.getComissao());
		System.out.println("O salario é: " + salario);
	}
}
