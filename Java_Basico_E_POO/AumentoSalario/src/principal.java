import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float salario, ResAumento;
		
		System.out.println("Digite o valor do salario: ");
		salario = teclado.nextFloat();
		
		ResAumento = salario + (salario/4);
		
		System.out.println("O funcionário receberá o valor de: " + ResAumento + " pelo Trabalho desempenhado! ");
		
	}
	
}
