import java.util.Scanner;

public class principal {

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		
		int idade, AcumIdade=0;
		
		System.out.println("Digite uma idade: ");
		idade = teclado.nextInt();
		
		while(idade > 0){
			AcumIdade += idade;
			System.out.println("Digite uma idade: ");
			idade = teclado.nextInt();
		}
		
		System.out.println("Soma das idades: " + AcumIdade);
		
	}
	
}
