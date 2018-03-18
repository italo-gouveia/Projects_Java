
public class Pessoa {

	private String nome;
	private int dataNasc;
	private long cpf;
	private Endereco endereco;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, int dataNasc, long cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
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
	
}
