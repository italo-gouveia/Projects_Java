import java.util.Scanner;

public class Teste06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		Calculos c1 = new Calculos();
		System.out.println(c1.calculo(5, 10));
		System.out.println(c1.calculo(12, 22, 54));
		System.out.println(c1.calculo(12.6f, 17.5f));
	}
}