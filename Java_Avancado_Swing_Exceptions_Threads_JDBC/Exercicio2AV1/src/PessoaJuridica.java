
public class PessoaJuridica extends Pessoa{

	private String cpnj;

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public PessoaJuridica(String nome, String sobrenome, Endereco endereco, String cpnj) {
		super(nome, sobrenome, endereco);
		this.cpnj = cpnj;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	//Método com funcionamento semelhante ao toString, só que retornando todos os dados
	//@Override
	public String IdentityClass() {
		// TODO Auto-generated method stub
		return super.IdentityClass() + "\n CNPJ: " + this.getCpnj();
	}
}
