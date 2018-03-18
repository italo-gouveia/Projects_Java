
public class Pessoa {

	private String nome;
	private int idade;
	
	public void Pessoa(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
	}
}
