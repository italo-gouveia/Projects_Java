
public class Mamifero extends Animal{
	private String corPelo;
	
	//métodos sobrepostos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamifero");
	}
	
	//getters e setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
