
public class Funcionario {
	
	String nome;
	float salario;
	
	public Funcionario(){
		
	}
	
	void alterar(String nome){
		this.nome=nome;
	}
	
	void alterar(float salario){
		this.salario=salario;
	}
	
	void alterar(String nome, float salario){
		this.nome = nome;
		this.salario = salario;
	}
}
