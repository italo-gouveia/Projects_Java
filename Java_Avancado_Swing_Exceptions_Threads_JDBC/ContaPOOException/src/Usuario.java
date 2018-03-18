
public class Usuario {

	private String nome;
	private long cpf;
	private Conta conta;
	
	public Usuario(){
		this.conta = new Conta();
	}
	
	public Usuario(String nome, long cpf, float saldo, float limite, int numero){
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta(saldo, limite, numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void realizarSaque(float valor) throws SaldoNegException{
		this.conta.sacar(valor);
	}
	
	public void realizarDeposito(float valor){
		this.conta.depositar(valor);
	}
}
