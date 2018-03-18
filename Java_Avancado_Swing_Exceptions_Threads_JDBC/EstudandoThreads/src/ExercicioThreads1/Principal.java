package ExercicioThreads1;

public class Principal {

	public static void main(String[] args) {
		Deposito d1 = new Deposito();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Produtor(d1, 3000)).start();
			new Thread(new Consumidor(d1, 2000)).start();
		}
		
	}
}
