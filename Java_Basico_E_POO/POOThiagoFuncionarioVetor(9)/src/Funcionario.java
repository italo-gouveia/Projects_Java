
public class Funcionario {
	//Atributos
	private String nome;
	private int matricula;
	private float salario;
	
	//construtores
	public Funcionario(){
		
	}
	
	public Funcionario(String nome, int matricula, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	//métodos especificos
	public void aumentarSalario(){
		this.salario += ((this.getSalario()/100)*20);
	}
	public void aumentarSalario(float aumento){
		this.salario +=((this.getSalario()/100)*aumento);
	}
	public void status(){
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Salario: " + getSalario());
	}
}