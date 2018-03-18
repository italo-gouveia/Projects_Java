
public class Funcionario {
	//Atributos
	private int matricula;
	private String nome;
	private int idade;
	private String cargo;
	private float salario;
	//Construtores
	public Funcionario() {
		this.salario = 1500;
	}
	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public Funcionario(int matricula, String nome, int salario){
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	//getters and setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
