package EstudoFactoryMethod;

public class Montadora {

	public static void main(String[] args) {
		CarFactory car = new CarFactory();
		String nome = "Vectra";
		
		car.getCarro(nome);
	}
}
