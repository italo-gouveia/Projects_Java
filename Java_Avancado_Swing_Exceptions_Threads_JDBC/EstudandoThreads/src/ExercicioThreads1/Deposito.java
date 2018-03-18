package ExercicioThreads1;

public class Deposito {

	private int itens = 0;
	private final int capacidade = 10;
	
	public synchronized void retirar() {
		if(this.itens>0) {
			this.itens--;
			System.out.println("Caixa retirada: Sombram " + this.itens + " caixas");
			//return 1;
		}
		//return 0;
	}
	
	public synchronized void colocar() {
		if(this.itens<capacidade) {
			this.itens++;
			System.out.println("Caixa armazenada: Passaram a ser " + this.itens + " caixas");
			//return 1;
		}
		//return 0;
	}
}
