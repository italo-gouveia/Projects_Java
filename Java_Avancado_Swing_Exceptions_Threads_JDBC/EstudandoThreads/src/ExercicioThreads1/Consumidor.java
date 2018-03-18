package ExercicioThreads1;

public class Consumidor implements Runnable{

	Deposito deposito;
	private long tempoConsumo;
	
	public Consumidor(Deposito deposito, long tempoConsumo) {
		this.deposito = deposito;
		this.tempoConsumo = tempoConsumo;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			this.deposito.retirar();
			try {
				Thread.sleep(tempoConsumo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}
