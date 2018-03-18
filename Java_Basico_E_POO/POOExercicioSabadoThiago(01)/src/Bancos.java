
public class Bancos {

	private float preço; 
	private String modelo; 
	private String fabricante;
	
	public Bancos(){
		
	}
	
	public Bancos(float preço, String modelo, String fabricante) {
		super();
		this.preço = preço;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void status(){
		System.out.println("Bancos: ");
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo: " +this.getModelo());
		System.out.println("Preço: " + this.getPreço());
	}
	
}
