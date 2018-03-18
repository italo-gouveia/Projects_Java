
public class Cilindro {
	private double raioBase;
	private double altura;
	
	public double getRaioBase() {
		return raioBase;
	}
	public void setRaioBase(double raioBase) {
		this.raioBase = raioBase;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void status(){
		System.out.println("A altura é " + this.getAltura());
		System.out.println("O raio base é " + this.getRaioBase());
	}
}
