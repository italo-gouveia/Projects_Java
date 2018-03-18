
public class Motor {

	private int potência; 
	private float preço; 
	private String fabricante;
	
	public Motor(){
		
	}
	
	public Motor(int potência, float preço, String fabricante) {
		super();
		this.potência = potência;
		this.preço = preço;
		this.fabricante = fabricante;
	}
	public int getPotência() {
		return potência;
	}
	public void setPotência(int potência) {
		this.potência = potência;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void status(){
		System.out.println("Motor: ");
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Potência: " + this.getPotência());
		System.out.println("Preço: " + this.getPreço());
	}
}
