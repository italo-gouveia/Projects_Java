import java.util.Scanner;
	
public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float SalarioBase, Gratifica��o, Imposto, SalarioFinal;
		
		System.out.println("Digite o Sal�rio Base do funcion�rio: ");
		SalarioBase = teclado.nextFloat();
		
		Gratifica��o = (SalarioBase/100) * 5;
		Imposto = (SalarioBase/100) * 7;
		
		SalarioFinal = (SalarioBase + Gratifica��o) - Imposto;
		System.out.println("O valor final do sal�rio ser� de " + SalarioFinal + " Reais! ");
	}

}
