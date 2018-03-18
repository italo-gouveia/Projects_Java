
public class Pessoa {

	private String nome; 
	private String sobrenome;
	private Endereco endereco;
	
	public Pessoa() {
		super();
		this.endereco = new Endereco();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String sobrenome, Endereco endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = new Endereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
	
	//Método com funcionamento semelhante ao toString, só que retornando todos os dados
	public String IdentityClass(){
		return " Nome: " + this.getNome() + "\n Sobrenome: " + this.getSobrenome() + this.endereco.IdentityClass();
	}
	
}
