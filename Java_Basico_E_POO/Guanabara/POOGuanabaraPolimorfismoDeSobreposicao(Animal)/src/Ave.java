
public class Ave extends Animal {
	private String corPena;
	
	//m�todos sobrepostos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave");
	}
	
	//m�todos espec�ficos
	public void fazerNinho(){
		System.out.println("Construiu um ninho");
	}

	//getters e setters
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
