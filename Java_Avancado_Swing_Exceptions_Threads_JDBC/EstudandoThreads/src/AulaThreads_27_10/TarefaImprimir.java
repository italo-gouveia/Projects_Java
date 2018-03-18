package AulaThreads_27_10;

import java.util.ArrayList;

public class TarefaImprimir implements Runnable{

	
	private ArrayList<Integer> array;
	
	public TarefaImprimir(ArrayList<Integer> array) {
		this.array = array;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(array) {
			try {
				array.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}
