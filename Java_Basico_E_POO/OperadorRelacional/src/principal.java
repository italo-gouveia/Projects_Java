import java.util.Scanner;

public class principal {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float num2 = teclado.nextFloat();
		
		if (num1 > num2){
			System.out.println("O n�mero " + num1 + " � maior do que o n�mero " + num2 );
		}else{
			if(num1 < num2){
				System.out.println("O n�mero " + num1 + " � menor do que o n�mero " + num2 );
			}else{
				if(num1 == num2){
					System.out.println("O n�mero " + num1 + " � igual ao n�mero " + num2);
				}
			}
				
		}
	}

}
