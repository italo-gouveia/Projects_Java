
public class Principal {

	public static void main(String[] args) {

		CarroDAO cDao = new CarroDAO();
		
		//cDao.inserir(new Carro("MNU-5422", 154567, "Azul", "Chevrolet", "Celta", 2010));
		for(Carro c: cDao.listar()) {
			System.out.println("Placa: " + c.getPlaca() + "/n Chassi: " + c.getChassi() + "/n Cor: " + c.getCor() + 
						"/n Modelo: " + c.getModelo() + "/n Marca: " + c.getMarca() + "/n Ano: " + c.getAno());
		}
		//Carro c =new Carro("BDU-5422", 165498, "Vermelho", "Chevrolet", "Onix", 2015);
		//cDao.atualizar(154567, c);
		//cDao.deletar(165498);
		//Deposito d1 = new Deposito();
		
		/*for (int i = 0; i < 10; i++) {
			new Thread(new Produtor(d1, 3000)).start();
			new Thread(new Consumidor(d1, 2000)).start();
		}*/
	}

}
