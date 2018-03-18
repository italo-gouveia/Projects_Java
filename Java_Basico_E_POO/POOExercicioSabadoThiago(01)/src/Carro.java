
public class Carro {

	private Motor motor;
	private Bancos bancos;
	private Pneus pneus;
	private float precoCarro;
	
	public Carro(){
		this.motor = new Motor();
		this.bancos = new Bancos();
		this.pneus = new Pneus();
	}
	
	public Carro(Motor motor, Bancos bancos, Pneus pneus) {
		super();
		this.motor = motor;
		this.bancos = bancos;
		this.pneus = pneus;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Bancos getBancos() {
		return bancos;
	}
	public void setBancos(Bancos bancos) {
		this.bancos = bancos;
	}
	public Pneus getPneus() {
		return pneus;
	}
	public void setPneus(Pneus pneus) {
		this.pneus = pneus;
	}
	
	public void precoCarro(){
		this.precoCarro = this.getBancos().getPre�o() + this.getMotor().getPre�o() + this.getPneus().getPre�o();
		System.out.println("O valor total desse carro �: " + precoCarro);
	}
	
	public void status(){
		this.getMotor().status();
		System.out.println("-------------------------------------------");
		this.getBancos().status();
		System.out.println("-------------------------------------------");
		this.getPneus().status();
	}
}
