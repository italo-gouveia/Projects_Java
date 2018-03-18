package EstudoAbstractFactory;

public class Montadora {

	public Montadora getMontadora(String nome){
		if(nome.equals("Volks")){
			return new VolksFactory();
		}else if(nome.equals("GM")){
			return new GMFactory();
		}
		return null;
	}
	
	public Carro getCarro(String nome){
		
		
		return null;
	}
}
