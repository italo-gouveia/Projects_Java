
public class Agencia {

	private int codigo;
	private String nome;
	private Conta[] conta;
	private Endereco endereco;
	
	public Agencia(){
		
	}
	
	public Agencia(int codigo, String nome, Conta[] conta) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.conta = conta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta[] getConta() {
		return conta;
	}

	public void setConta(Conta[] conta) {
		this.conta = conta;
	}
	
}