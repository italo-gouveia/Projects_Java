package AulaThreads_27_10;

import java.util.ArrayList;

public class TarefaAdicionar implements Runnable{

	
	private ArrayList<Integer> array;
	
	public TarefaAdicionar(ArrayList<Integer> array) {
		this.array = array;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1000000; i++) {
			System.out.println("Adicionando");
			array.add(i);
		}
		
		synchronized(array) {
			array.notify();	
		}
	}

}
