
public class Empregado extends Pessoa{

	private int codSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(){
		super();
	}
	
	public Empregado(String nome, String endereco, String telefone, int codSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario(){
		float salario;
		salario = this.getSalarioBase() - ((this.getSalarioBase()/100) * this.getImposto());
		System.out.println("O salario é: " + salario);
	}
	
}
