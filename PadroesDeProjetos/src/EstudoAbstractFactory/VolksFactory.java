package EstudoAbstractFactory;

public class VolksFactory extends Montadora {

	public VolksFactory(){
		System.out.println("Volks é uma montadora popular");
	}
	
	public Carro getCarro(String nome){
		if(nome.equals("Gol")){
			return new Gol();
		}else if (nome.equals("Golf")){
			return new Golf();
		}
		return null;
	}
}
