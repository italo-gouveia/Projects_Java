
public class ClasseThreads implements Runnable {
	
	public ClasseThreads() {
		
	}
	
	@Override
	public void run() {
		CarroDAO cDao = new CarroDAO();
		//String lista = String.valueOf(cDao.listar());
		//System.out.println(lista);
		while(true) {
			for(Carro c: cDao.listar()) {
				System.out.println("Placa: " + c.getPlaca() + "/n Chassi: " + c.getChassi() + "/n Cor: " + c.getCor() + 
							"/n Modelo: " + c.getModelo() + "/n Marca: " + c.getMarca() + "/n Ano: " + c.getAno());
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
