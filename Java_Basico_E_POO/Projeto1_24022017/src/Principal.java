import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero inteiro: ");
		numero = teclado.nextInt();
		
		System.out.println("Numero: " + numero);
	}

}
