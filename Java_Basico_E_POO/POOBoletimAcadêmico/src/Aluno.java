
public class Aluno {
	private String nome;
	private int matricula;
	private int CPF;
	private int idade;
	//Construtor
	public Aluno(String nome, int matricula, int CPF, int idade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.CPF = CPF;
		this.idade = idade;
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
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
