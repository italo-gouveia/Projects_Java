import java.util.Scanner;
public class principal {

	public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);
	int idade, ValorCompra;
	float ValorBike, NovoValorBike, DescontoBike, ValorCarro, DescontoCarro, NovoValorCarro;
	
	System.out.println("Digite sua idade: ");
	idade = teclado.nextInt();
	
	if(idade <= 17){
		System.out.println("Você tem 40% de desconto na compra de uma bicicleta. Digite o valor da bicicleta: ");
		ValorBike = teclado.nextFloat();
		
		NovoValorBike = ValorBike-((ValorBike/100)*40);
		DescontoBike = NovoValorBike-ValorBike;
		
		System.out.println("O valor do desconto será de " + DescontoBike + " portanto o valor da bicicleta levando em conta o desconto será de " + NovoValorBike + " Reais.");
	}else if (idade >17){
		System.out.println("Você tem 20% de desconto na compra de um carro. Digite o valor do carro: ");
		ValorCarro = teclado.nextFloat();
		
		NovoValorCarro = ValorCarro-((ValorCarro/100)*20);
		DescontoCarro = NovoValorCarro-ValorCarro;
		
		System.out.println("O valor do desconto será de " + DescontoCarro + " portanto, o valor do carro levando em conta o desconto, será " + NovoValorCarro + " Reais.");
	}
	
	}
}
