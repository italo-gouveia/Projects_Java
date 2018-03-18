import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Tarefa1 t1= new Tarefa1();
		Thread thread1 = new Thread(t1);
		Tarefa2 t2= new Tarefa2();
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		thread1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Inicio do main");
		for(int i=0; i<500000; i++) {
			System.out.println("Hello");
		}
		System.out.println("Fim do main");

	}

}
