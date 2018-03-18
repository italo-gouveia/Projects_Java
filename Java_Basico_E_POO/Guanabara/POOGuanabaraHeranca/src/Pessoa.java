
public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String sexo;
	
	//construtores
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	//getters e setters
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
	
	//metodos especificos
	public final void fazerAniversario(){
		this.idade++;
	}
	
	//método toString
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}
