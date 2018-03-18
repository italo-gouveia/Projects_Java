
public class Client {

	//atributes
	private String cpf_cnpj;
	private String name;
	private boolean isActive;
	private float balance;
	//this variable specially is used on the method of consult in the class ClientDAO
	private int id;
	
	//default constructor
	public Client() {
		
	}

	//constructor with all parameters
	public Client(String cpf_cnpj, String name, boolean isActive, float balance) {
		super();
		this.cpf_cnpj = cpf_cnpj;
		this.name = name;
		this.isActive = isActive;
		this.balance = balance;
	}

	//getters and setters
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//toString method
	@Override
	public String toString() {
		return super.toString();
	}
	
	//status method
	public void statusClient() {
		System.out.println(this.getName() + this.getCpf_cnpj() + this.getBalance() + this.isActive());
	}
	
}
