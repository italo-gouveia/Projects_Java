
public class ContaBancaria {
	//atributos
	int numConta;
	String tipo;
	String dono;
	float saldo;
	boolean status;
	//métodos especificos
	void EstadoAtual(){
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " +this.isStatus());
	}
	void AbrirConta(String t){
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP"){
			this.setSaldo(150);
		}
	}
	void FecharConta(){
		if (this.getSaldo()>0) {
			System.out.println("A conta não pode ser fechada porque ainda tem dinheiro. ");
		} else if(this.getSaldo()<0){
			System.out.println("A conta não pode ser fechada porque está em débito. ");
		}else{
			this.setStatus(false);
			System.out.println("A conta foi fechada com sucesso. ");
		}
	}
	void depositar(float v){
		if(this.isStatus()){
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono() + ".");
		}else {
			System.out.println("Impossivel depositar numa conta fechada. ");
		}
	}
	void sacar(float v){
		if (this.isStatus()){
			if (this.getSaldo() >= v){
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado na conta de " + this.getDono() + ".");
			} else {
				System.out.println("Saldo insuficiente para saque. ");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada. ");
		}
	}
	void pagarMensalidade(){
		int v = 0;
		if (this.getTipo()=="CC") {
			v=12;
		} else if(this.getTipo()=="CP"){
			v = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono() + ".");
		} else {
			System.out.println("Impossivel pagar uma conta fechada.");
		}
	}
	//método construtor
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	//metodos getters e setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
