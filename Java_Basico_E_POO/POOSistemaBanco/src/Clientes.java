
public class Clientes {
	String nome;
	String endereço;
	int código;
	int idade;
	String sexo;
	
	void status(){
		System.out.println("O cliente " + nome);
		System.out.println("que mora na " + endereço);
		System.out.println("de código " + código);
		System.out.println("de idade " + idade);
	}
}
