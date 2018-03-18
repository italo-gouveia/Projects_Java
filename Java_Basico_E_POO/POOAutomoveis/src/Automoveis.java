
public class Automoveis {
	String fabricante;
	String modelo;
	String cor;
	int ano;
	float motor;
	float preço;
	
	void status(){
		System.out.println("Um carro " + this.modelo);
		System.out.println("Da fabricante " + this.fabricante);
		System.out.println("De cor " + this.cor);
		System.out.println("Do ano " + this.ano);
		System.out.println("Com motor " + this.motor);
		System.out.println("Custa " + this.preço);
	}
	
}
