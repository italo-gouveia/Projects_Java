import java.util.Scanner;

public class principal {

	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float C, F;
		
		System.out.println("Digite a temperatura em Celsius");
		
		C = teclado.nextFloat();
		F = (9*C + 160)/5;
		
		System.out.println("O valor em Farenheit da temperatura é " + F);
			if (F>=86){
				System.out.println("Hoje é um ótimo dia para ir à praia! ");
			}
			if (F>77 && F<86){
				System.out.println("A temperatura está normal hoje !");
			}
			
			if (F<=77){
				System.out.println("Se for sair leve um casaco, o dia hoje será frio !");
			}
	}
	
	
	
}
