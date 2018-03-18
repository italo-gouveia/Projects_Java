
public class Vendedor extends Empregado{

	private float valorVendas;
	private float comissao;
	
	public Vendedor(){
		
	}
	
	public Vendedor(String nome, String endereco, String telefone, int codSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
		super(nome, endereco, telefone, codSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
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
		salario = this.getSalarioBase() - ((this.getSalarioBase()/100) * this.getImposto()) + ((this.getValorVendas()/100)*this.getComissao());
		System.out.println("O salario é: " + salario);
	}
	
}
