
public class Empregado extends Pessoa{

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(){
		
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	

	public int getCodigoSetor() {
		return codigoSetor;
	}



	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
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



	public void aumentarSalario(int percentualAum){
		float novoSalario;
		novoSalario = this.getSalarioBase() + this.getSalarioBase()/100*percentualAum;
		System.out.println("Novo Salário " + novoSalario);
	}
	public void status(){
		super.status();
		System.out.println("Código do setor: " + this.getCodigoSetor());
		System.out.println("Salario Base: " + this.getSalarioBase());
		System.out.println("Imposto: " + this.getImposto());
	}
}
