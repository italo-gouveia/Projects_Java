import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float SalarioMinimo, SalarioBruto, SalarioFinal, ValorHorasExtras, ValorHorasTrabalhadas, QuantHorasTrabalhadas, QuantHorasExtras;
		
		System.out.println("Digite o valor do salário mínimo: ");
		SalarioMinimo = teclado.nextFloat();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		QuantHorasTrabalhadas = teclado.nextFloat();
		System.out.println("Digite a quantidade de horas extras trabalhadas: ");
		QuantHorasExtras = teclado.nextFloat();
		
		ValorHorasTrabalhadas = (SalarioMinimo/8) * QuantHorasTrabalhadas;
		ValorHorasExtras = (SalarioMinimo/4) * QuantHorasExtras;
		SalarioBruto = (SalarioMinimo + ValorHorasTrabalhadas);
		SalarioFinal = (SalarioBruto + ValorHorasExtras);
		
		System.out.println("O salário mínimo é de " + SalarioMinimo + " Reais! ");
		System.out.println("A Quantidade de horas trabalhadas equivale a " + ValorHorasTrabalhadas + " Reais! ");
		System.out.println("O salário bruto é de " + SalarioBruto + " Reais! ");
		System.out.println("A quantidade de horas extras trabalhadas equivale à " + ValorHorasExtras + " Reais! ");
		System.out.println("O salário Final considerando o salario bruto e as horas extras é de: " + SalarioFinal + " Reais! ");
	}
}	