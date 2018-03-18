
public class PessoaFisica extends Pessoa{

	//atributos
	private long cpf;
	private long rg;
	
	//construtor padrão
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	//construtor passando todos os parametros e recebendo o construtor da classe mãe
	public PessoaFisica(String nome, float rendaPessoa, int sitPessoa, long cpf, long rg, Endereco endereco) {
		super(nome, rendaPessoa, sitPessoa, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	//getters e setters
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
	
}
