import java.util.Scanner;

public class principal {
	
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		float valor;
		int QuantCupons;
		
		System.out.println("Digite o valor da compra: ");
		valor = teclado.nextFloat();
		
		QuantCupons = (int) (valor/20);
		
		System.out.println("A sua quantidade de cupons recebidos será de " + QuantCupons);
	}
}
