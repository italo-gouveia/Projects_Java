package EstudoFactoryMethod2;

public class Mulher extends Pessoa{

	public Mulher(String nome){
		super(nome);
		System.out.println("Olá Senhora: " + nome);
	}
}
