
public class Tarefa1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inicio da Thread");
		for(int i=0; i<500000; i++) {
			System.out.println("Olá");
		}
		System.out.println("Fim da thread");
	}
}
