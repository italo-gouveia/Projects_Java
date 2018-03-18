
public class Pessoa {

	//atributos
	private String nome;
	private float rendaPessoa;
	private int sitPessoa=1;
	private Endereco endereco;
	
	//construtor padrão
	public Pessoa() {
		this.endereco = new Endereco();
		// TODO Auto-generated constructor stub
	}
	
	//construtor mãe passando todos os parametros
	public Pessoa(String nome, float rendaPessoa, int sitPessoa, Endereco endereco) {
		super();
		this.endereco = new Endereco();
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.sitPessoa = 1;
	}

	//getters e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getRendaPessoa() {
		return rendaPessoa;
	}

	public void setRendaPessoa(float rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}

	public int getSitPessoa() {
		return sitPessoa;
	}

	public void setSitPessoa(int sitPessoa) {
		this.sitPessoa = sitPessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendaPessoa=" + rendaPessoa + ", sitPessoa=" + sitPessoa + ", endereco="
				+ endereco + "]" + endereco.toString();
	}
	
}
