import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroCoelhos;
		float custo;
		
		System.out.println("Digite o numero de Coelhos: ");
		numeroCoelhos = teclado.nextInt();
		
		custo = (numeroCoelhos * 0.70f)/18+10;
		
		System.out.println("Para o numero de coelhos: " + numeroCoelhos + " o custo é: " + custo);
		
	}

}
