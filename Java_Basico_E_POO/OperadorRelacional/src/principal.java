import java.util.Scanner;

public class principal {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float num2 = teclado.nextFloat();
		
		if (num1 > num2){
			System.out.println("O número " + num1 + " é maior do que o número " + num2 );
		}else{
			if(num1 < num2){
				System.out.println("O número " + num1 + " é menor do que o número " + num2 );
			}else{
				if(num1 == num2){
					System.out.println("O número " + num1 + " é igual ao número " + num2);
				}
			}
				
		}
	}

}
