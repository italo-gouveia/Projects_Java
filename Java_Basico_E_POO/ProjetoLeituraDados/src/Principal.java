import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		int numeroInteiro;
		float numeroReal;
		float resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero Inteiro: ");
		numeroInteiro = teclado.nextInt();
		System.out.println("Digite o valor do numero Real: ");
		numeroReal = teclado.nextFloat();
		
		resultado = numeroInteiro + numeroReal;
		
		System.out.println("O numero inteiro digitado foi: "+numeroInteiro);
		System.out.println("O numero real digitado foi: " + numeroReal);
		System.out.println("O valor do resultado é: " + resultado);
	}

}
