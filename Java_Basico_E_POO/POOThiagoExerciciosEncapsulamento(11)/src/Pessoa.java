
public class Pessoa {


	private String nome;
	private int idade;
	private long cpf;
	private Endereco endereco;
	
	public Pessoa(){
		this.endereco = new Endereco();
	}
	
	public Pessoa(String nome, int idade, long cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = new Endereco();
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Idade: " + this.getIdade());
		this.getEndereco().status();
	}
	
}
