import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int idade, somaIdades = 0;
		
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		while(idade > 0){
			
			somaIdades += idade;
			System.out.println("Digite a sua idade: ");
			idade = teclado.nextInt();

		}
		
		System.out.println("Soma das idades Lidas: " + somaIdades);
		
	}

}
