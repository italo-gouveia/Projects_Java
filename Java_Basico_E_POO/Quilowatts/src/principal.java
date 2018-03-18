import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float SalarioMinimo, QuantQuilowatts, ValorQuilowatts, ValorDesconto, CustoEnergiaComDesconto;
		
		System.out.println("Digite o valor do salário mínimo: ");
		SalarioMinimo = teclado.nextFloat();
		
		System.out.println("Digite a quantidade de quilowatts consumidos na casa: ");
		QuantQuilowatts = teclado.nextFloat();
		
		ValorQuilowatts = (SalarioMinimo/5) * QuantQuilowatts;
		ValorDesconto = (ValorQuilowatts/100) * 15; 
		CustoEnergiaComDesconto = ValorQuilowatts - ValorDesconto;
		
		System.out.println("O valor consumido em quilowatts equivale a " + ValorQuilowatts + " Reais! ");
		System.out.println("O valor do desconto é de " + ValorDesconto + " Reais! ");
		System.out.println("O valor total do custo de energia com o desconto de 15% é de " + CustoEnergiaComDesconto + " Reais! ");
	}

}