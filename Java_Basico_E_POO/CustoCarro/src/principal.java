import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float PreçoFabrica, PercentualDistribuidor, PorcentagemImpostos, ValorDistribuidor, ValorImpostos, ValorTotalCarro;
		
		System.out.println("Digite o preço de fábrica do carro: ");
		PreçoFabrica = teclado.nextFloat();
		System.out.println("Digite o percentual de lucro da distribuidora: ");
		PercentualDistribuidor = teclado.nextFloat();
		System.out.println("Digite o percentual de impostos sobre o carro: ");
		PorcentagemImpostos = teclado.nextFloat();
		
		ValorDistribuidor = (PreçoFabrica/100) * PercentualDistribuidor;
		ValorImpostos = (PreçoFabrica/100) * PorcentagemImpostos;
		ValorTotalCarro = (PreçoFabrica + ValorDistribuidor + ValorImpostos);
		
		System.out.println("O valor de fabrica do carro é de " + PreçoFabrica + " Reais! ");
		System.out.println("O valor destinado à distribuidora é de " + ValorDistribuidor + " Reais! ");
		System.out.println("O valor pago em impostos é de " + ValorImpostos + " Reais! ");
		System.out.println("O valor total final do carro é de " + ValorTotalCarro + " Reais! ");
	}	
}