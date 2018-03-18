
public class Professor extends Pessoa{

	private String especialidade;
	private float salario;
	
	//construtores
	public Professor(){
		
	}
	public Professor(String especialidade, float salario) {
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	//getters e setters
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//métodos especificos
	public void receberAum(float aum){
		this.salario+=aum;
	}
}
