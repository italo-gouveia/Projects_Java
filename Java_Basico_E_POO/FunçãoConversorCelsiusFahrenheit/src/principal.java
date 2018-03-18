import java.util.Scanner;

public class principal {

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		float celsius, f;
		
		System.out.println("Digite uma temperatura em Celsius: ");
		celsius = teclado.nextFloat();
		f = temperatura(celsius);
		
		System.out.println("A temperatura em fahrenheit é " + f);
	}
	static float temperatura (float celsius){
		float f;
		f = (9 * celsius+160)/5;
		return f;
	}
}
