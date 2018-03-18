
public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Métodos Construtores(Padrão e com paramêtros)
	public Pessoa() {
	}
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//Métodos Getters e Setters
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//Métodos Especificos
	public void fazerAniversario(){
		this.idade = this.idade+1;
	}
}
