import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float Pre�oFabrica, PercentualDistribuidor, PorcentagemImpostos, ValorDistribuidor, ValorImpostos, ValorTotalCarro;
		
		System.out.println("Digite o pre�o de f�brica do carro: ");
		Pre�oFabrica = teclado.nextFloat();
		System.out.println("Digite o percentual de lucro da distribuidora: ");
		PercentualDistribuidor = teclado.nextFloat();
		System.out.println("Digite o percentual de impostos sobre o carro: ");
		PorcentagemImpostos = teclado.nextFloat();
		
		ValorDistribuidor = (Pre�oFabrica/100) * PercentualDistribuidor;
		ValorImpostos = (Pre�oFabrica/100) * PorcentagemImpostos;
		ValorTotalCarro = (Pre�oFabrica + ValorDistribuidor + ValorImpostos);
		
		System.out.println("O valor de fabrica do carro � de " + Pre�oFabrica + " Reais! ");
		System.out.println("O valor destinado � distribuidora � de " + ValorDistribuidor + " Reais! ");
		System.out.println("O valor pago em impostos � de " + ValorImpostos + " Reais! ");
		System.out.println("O valor total final do carro � de " + ValorTotalCarro + " Reais! ");
	}	
}