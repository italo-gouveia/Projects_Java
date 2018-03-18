
public class Peixe extends Animal {
	private String corEscama;
	
	//m�todos sobrepostos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo subst�ncia");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe n�o faz som");
	}
	
	//m�todos espec�ficos
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
