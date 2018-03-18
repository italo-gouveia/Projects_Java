import java.util.Scanner;
	
public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float SalarioBase, Gratificação, Imposto, SalarioFinal;
		
		System.out.println("Digite o Salário Base do funcionário: ");
		SalarioBase = teclado.nextFloat();
		
		Gratificação = (SalarioBase/100) * 5;
		Imposto = (SalarioBase/100) * 7;
		
		SalarioFinal = (SalarioBase + Gratificação) - Imposto;
		System.out.println("O valor final do salário será de " + SalarioFinal + " Reais! ");
	}

}
