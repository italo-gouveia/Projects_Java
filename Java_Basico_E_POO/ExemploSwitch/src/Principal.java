import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor (1-7): ");
		valor = teclado.nextInt();
		
		switch(valor){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Digite um valor válido (1-7)");
		}
		
		
	}

}
