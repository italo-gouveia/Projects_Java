import java.util.Scanner;

public class Teste04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		Cilindro c1 = new Cilindro();
		c1.setAltura(0.50);
		c1.setRaioBase(3.14);
		c1.status();
	}
}
