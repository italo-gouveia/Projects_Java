
public class Lampada {

	private boolean apagada;
	private boolean acessa;
	private boolean meiaLuz;
	
	public Lampada(){
		
	}
	
	public Lampada(boolean apagada, boolean acessa, boolean meiaLuz) {
		super();
		this.apagada = apagada;
		this.acessa = acessa;
		this.meiaLuz = meiaLuz;
	}

	public boolean isApagada() {
		return apagada;
	}

	public void setApagada(boolean apagada) {
		this.apagada = apagada;
	}

	public boolean isAcessa() {
		return acessa;
	}

	public void setAcessa(boolean acessa) {
		this.acessa = acessa;
	}

	public boolean isMeiaLuz() {
		return meiaLuz;
	}

	public void setMeiaLuz(boolean meiaLuz) {
		this.meiaLuz = meiaLuz;
	}
	
	public void apagarLuz(){
		this.apagada = true;
		this.acessa = false;
		this.meiaLuz = false;
		
	}
	public void acenderLuz(){
		this.acessa = true;
		this.apagada = false;
		this.meiaLuz = false;
	}
	public void meiaLuz(){
		this.meiaLuz = true;
		this.acessa = false;
		this.apagada = false;
	}
}
