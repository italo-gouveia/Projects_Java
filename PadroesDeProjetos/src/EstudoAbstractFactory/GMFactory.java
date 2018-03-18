package EstudoAbstractFactory;

public class GMFactory extends Montadora{
	
	public GMFactory(){
		System.out.println("General Motors � uma �tima montadora");
	}
	
	public Carro getCarro(String nome){
		if(nome.equals("Vectra")){
			return new Vectra();
		}else if(nome.equals("Omega")){
			return new Omega();
		}
		return null;
	}
}
