
public class Bancos {

	private float pre�o; 
	private String modelo; 
	private String fabricante;
	
	public Bancos(){
		
	}
	
	public Bancos(float pre�o, String modelo, String fabricante) {
		super();
		this.pre�o = pre�o;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public float getPre�o() {
		return pre�o;
	}
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
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
		System.out.println("Pre�o: " + this.getPre�o());
	}
	
}
