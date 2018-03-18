import java.util.Scanner;

public class principal {

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		
		int idade, AcumIdade=0;
		
		do{
			System.out.println("Digite uma idade: ");
			idade = teclado.nextInt();
			if(idade>0){
				AcumIdade = AcumIdade + idade;
			}
		}while(idade > 0);

		System.out.println("Soma das idades: " + AcumIdade);
	
	}

}