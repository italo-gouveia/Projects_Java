
public class Pneus {

	private float pre�o;
	private String tipo; 
	private String fabricante;
	
	public Pneus(){
		
	}
	
	public Pneus(float pre�o, String tipo, String fabricante) {
		super();
		this.pre�o = pre�o;
		this.tipo = tipo;
		this.fabricante = fabricante;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
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
		System.out.println("Preco: " + this.getPre�o());
	}
}
