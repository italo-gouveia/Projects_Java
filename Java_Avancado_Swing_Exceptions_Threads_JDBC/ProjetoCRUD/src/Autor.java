
public class Autor {
	
	private String nome;
	private String email;
	
	public Autor(){
		
	}
	
	public Autor(String nome, String email){
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void imprimir(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
	}
}
