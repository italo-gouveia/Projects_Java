package EstudoFactoryMethod;

public class CarFactory {

	private Carro carro;

	public Carro getCarro(String nome) {
		if(nome.equals("Omega")){
			return new Omega();
		}else if(nome.equals("Vectra")){
			return new Vectra();
		}else if(nome.equals("Gol")){
			return new Gol();
		}else if(nome.equals("Golf")){
			return new Golf();
		}
		return null;
	}
	
}
