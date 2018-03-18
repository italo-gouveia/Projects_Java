
public class Motor {

	private int pot�ncia; 
	private float pre�o; 
	private String fabricante;
	
	public Motor(){
		
	}
	
	public Motor(int pot�ncia, float pre�o, String fabricante) {
		super();
		this.pot�ncia = pot�ncia;
		this.pre�o = pre�o;
		this.fabricante = fabricante;
	}
	public int getPot�ncia() {
		return pot�ncia;
	}
	public void setPot�ncia(int pot�ncia) {
		this.pot�ncia = pot�ncia;
	}
	public float getPre�o() {
		return pre�o;
	}
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
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
		System.out.println("Pot�ncia: " + this.getPot�ncia());
		System.out.println("Pre�o: " + this.getPre�o());
	}
}
