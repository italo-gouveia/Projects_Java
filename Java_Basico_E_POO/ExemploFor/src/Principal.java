import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int idade, acumaladorIdade = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite uma idade: ");
			idade = teclado.nextInt();
			
			acumaladorIdade = acumaladorIdade + idade;
			System.out.println("---" + acumaladorIdade);
		}
		
		System.out.println(acumaladorIdade);
	}

}
