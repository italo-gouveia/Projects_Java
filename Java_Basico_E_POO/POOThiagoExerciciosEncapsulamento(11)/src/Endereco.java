
public class Endereco {

	private String Estado;
	private String Cidade;
	private String Bairro;
	private String Rua; 
	private int CEP; 
	private int telefone;
	
	public Endereco(){

	}
	
	public Endereco(String estado, String cidade, String bairro, String rua, int CEP, int telefone) {
		super();
		this.Estado = estado;
		this.Cidade = cidade;
		this.Bairro = bairro;
		this.Rua = rua;
		this.CEP = CEP;
		this.telefone = telefone;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		this.Estado = estado;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		this.Cidade = cidade;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		this.Bairro = bairro;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		this.Rua = rua;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int CEP) {
		this.CEP = CEP;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void status(){
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Cidade: " + this.getCidade());
		System.out.println("Estado: " + this.getEstado());
		System.out.println("Rua: " + this.getRua());
		System.out.println("CEP: " + this.getCEP());
		System.out.println("Telefone: " + this.getTelefone());
	}
}
