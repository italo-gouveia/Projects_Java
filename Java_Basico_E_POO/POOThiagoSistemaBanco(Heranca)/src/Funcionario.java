
public class Funcionario extends Pessoa {

	private int matricula;
	private float salario;
	
	public Funcionario(){
		
	}
	
	public Funcionario(int matricula, float salario) {
		super();
		this.matricula = matricula;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
