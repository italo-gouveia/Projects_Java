package EstudandoThreads2;

public class Principal {

	public static void main(String[] args) {
		Tarefa1 t1 = new Tarefa1();
		Thread thread1 = new Thread(t1);
		
		thread1.start();
	}
}
