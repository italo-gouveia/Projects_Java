
public class Pneus {

	private float preço;
	private String tipo; 
	private String fabricante;
	
	public Pneus(){
		
	}
	
	public Pneus(float preço, String tipo, String fabricante) {
		super();
		this.preço = preço;
		this.tipo = tipo;
		this.fabricante = fabricante;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void status(){
		System.out.println("Pneus: ");
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Preco: " + this.getPreço());
	}
}
