package AulaThreads_27_10;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		TarefaAdicionar ta = new TarefaAdicionar(array);
		Thread tAdicionar = new Thread(ta);
		
		TarefaImprimir ti = new TarefaImprimir(array);
		Thread tImprimir = new Thread(ti);
		
		tAdicionar.start();
		tImprimir.start();
	}
}
