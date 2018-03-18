
public class Administrador extends Empregado {

	private float ajudaCustos;

	
	public Administrador(){
		
	}
	
	public Administrador(String nome, String endereco, String telefone, int codSetor, float salarioBase, float imposto, float ajudaCustos) {
		super(nome, endereco, telefone, codSetor, salarioBase, imposto);
		this.ajudaCustos = ajudaCustos;
	}

	public float getAjudaCustos() {
		return ajudaCustos;
	}

	public void setAjudaCustos(float ajudaCustos) {
		this.ajudaCustos = ajudaCustos;
	}
	
	@Override
	public void calcularSalario(){
		float salario;
		salario = (this.getSalarioBase() - ((this.getSalarioBase()/100) * this.getImposto())) + this.getAjudaCustos();
		System.out.println("O salario é: " + salario);
	}
	
}
