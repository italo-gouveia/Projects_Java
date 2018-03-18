
public class Cliente {
	
	private String nome;
	private int idade;
	private long cpf;
	
	public Cliente() {
		
	}

	public Cliente(String nome, int idade, long cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

}
