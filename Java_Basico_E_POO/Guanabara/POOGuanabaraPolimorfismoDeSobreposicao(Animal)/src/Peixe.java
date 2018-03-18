
public class Peixe extends Animal {
	private String corEscama;
	
	//métodos sobrepostos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo substância");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe não faz som");
	}
	
	//métodos específicos
	public void soltarBolha(){
		System.out.println("Soutou uma bolha");
	}
	
	//getters e setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
