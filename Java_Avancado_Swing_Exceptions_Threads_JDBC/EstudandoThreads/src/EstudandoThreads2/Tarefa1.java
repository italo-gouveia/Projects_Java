package EstudandoThreads2;

public class Tarefa1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] frutas = {"maça", "kiwi", "laranja", "pera"};
		
		for(String fruta:frutas) {
			System.out.println(fruta);
			
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
