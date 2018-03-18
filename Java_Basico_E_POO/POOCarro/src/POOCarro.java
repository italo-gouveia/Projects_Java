import java.util.Scanner;

public class POOCarro {

	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		Carro c1 = new Carro();
		System.out.println("Digite a placa do carro: ");
		c1.placa=teclado.nextLine();
		System.out.println("Digite o ano do carro: ");
		c1.ano=teclado.nextInt();
		System.out.println("Digite o modelo do carro: ");
		c1.modelo=teclado.next();
		
		System.out.println("Placa: " + c1.placa);
		System.out.println("Ano: " + c1.ano);
		System.out.println("Modelo: " + c1.modelo);
	}
}
