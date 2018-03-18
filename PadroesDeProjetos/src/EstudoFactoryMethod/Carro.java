package EstudoFactoryMethod;

public abstract class Carro {

	private float valor;

	
	public Carro() {

	}
	
	public Carro(float valor) {
		super();
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
