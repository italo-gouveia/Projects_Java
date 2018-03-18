package ExercicioThreads1;

public class Produtor implements Runnable{

	Deposito deposito;
	private long tempoFabricacao;
	
	public Produtor(Deposito deposito, long tempoFabricacao) {
		this.deposito = deposito;
		this.tempoFabricacao = tempoFabricacao;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			this.deposito.colocar();
			try {
				Thread.sleep(tempoFabricacao);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

	
}
