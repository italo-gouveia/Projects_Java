
public class PessoaFisica extends Pessoa{

	private String cpf;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
		super();
	}

	public PessoaFisica(String nome, String sobrenome, Endereco endereco, String cpf) {
		super(nome, sobrenome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Método com funcionamento semelhante ao toString, só que retornando todos os dados
	//@Override
	public String IdentityClass() {
		// TODO Auto-generated method stub
		return super.IdentityClass() + "\n CPF: " + this.getCpf();
	}
}
