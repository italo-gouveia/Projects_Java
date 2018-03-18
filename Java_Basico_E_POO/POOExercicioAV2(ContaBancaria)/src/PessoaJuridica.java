
public class PessoaJuridica extends Pessoa{
	
	//atributos
	private long cnpj;
	
	//construtor padr�o
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	//construtor com todos os parametros e recebendo o construtor da classe m�e
	public PessoaJuridica(String nome, float rendaPessoa, int sitPessoa, long cnpj, Endereco endereco) {
		super(nome, rendaPessoa, sitPessoa, endereco);
		this.cnpj = cnpj;
	}
	
	//getters e setters
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
}
