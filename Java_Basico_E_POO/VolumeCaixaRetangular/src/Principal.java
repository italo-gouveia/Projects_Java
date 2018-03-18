import java.util.Scanner;

public class Principal {

	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float volume, comprimento, largura, altura;
		
		System.out.println("Digite a altura: ");
		altura = teclado.nextFloat();
		System.out.println("Digite a largura: ");
		largura = teclado.nextFloat();
		System.out.println("Digite o comprimento: ");
		comprimento = teclado.nextFloat();
		
		volume = (comprimento * largura * altura);
		
		System.out.println("O volume da caixa é de " + volume);
	}
	
}
