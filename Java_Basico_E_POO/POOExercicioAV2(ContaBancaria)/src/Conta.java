import java.util.ArrayList;
import java.util.Date;

public class Conta {
	
	private long numConta;
	private Date dataAbertura;
	private Date dataEncerramento;
	private int situacao = 1;
	private String senha;
	private double saldo=0;
	private Pessoa pessoa;
	private ArrayList<Movimento> movimento = new ArrayList();
	
	public Conta() {
		// TODO Auto-generated constructor stub
		this.pessoa = new Pessoa();
	}
	
	public Conta(long numConta, Date dataAbertura, int situacao, String senha,
			double saldo, Pessoa pessoa) {
		super();
		this.pessoa = new Pessoa();
		this.numConta = numConta;
		this.dataAbertura = new Date();
		//this.dataEncerramento = new Date();
		this.situacao = 1;
		this.senha = senha;
		this.saldo = 0;
	}
	
	public void sacar(double valor){
		if(valor < this.getSaldo()){
			Movimento m1 = new Movimento();
			m1.regMovimento(1, valor);
			movimento.add(m1);
			//this.movimento = new Movimento(1, valor);
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("O saldo da conta" +  this.getNumConta() + " agora é: " + this.getSaldo());
		}else{
			System.out.println("Valor informado maior do que o saldo!");
		}
	}
	
	public void depositar(double valor){
		Movimento m2 = new Movimento();
		m2.regMovimento(2, valor);
		movimento.add(m2);
		//this.movimento = new Movimento(2, valor);
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("O saldo da conta" +  this.getNumConta() + " agora é: " + this.getSaldo());
	}
	public void transferir(double valor, Conta conta, Conta conta2){
		Movimento m3 = new Movimento();
		m3.regMovimento(3, valor);
		movimento.add(m3);
		//this.movimento = new Movimento(3, valor);
		conta.sacar(valor);
		//conta.movimento = new Movimento();
		conta2.depositar(valor);
		//conta2.movimento = new Movimento();
		//conta.setSaldo(this.getSaldo() + valor);
		//System.out.println("O seu saldo agora é: " + this.getSaldo());
		//System.out.println("O saldo da conta " + conta2.getNumConta() + "agora é: " + this.getSaldo());
	}

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}

	public Date getDataAbertura(){
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura){
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ArrayList<Movimento> getMovimento() {
		return movimento;
	}

	public void setMovimento(ArrayList<Movimento> movimento) {
		this.movimento = movimento;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", dataAbertura=" + dataAbertura + ", dataEncerramento="
				+ dataEncerramento + ", situacao=" + situacao + ", senha=" + senha + ", saldo=" + saldo + ", pessoa="
				+ pessoa + "]" + pessoa.toString();
	}
	
}
