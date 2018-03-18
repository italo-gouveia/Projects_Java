import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float ValorPrestação, ValorTaxa, ValorFinal;
		int TempoAtraso;
		
		System.out.println("Digite o valor da prestação: ");
		ValorPrestação = teclado.nextFloat();
		System.out.println("Digite o valor da taxa: ");
		ValorTaxa = teclado.nextFloat();
		System.out.println("Digite o tempo de atraso em dias: ");
		TempoAtraso = teclado.nextInt();
		
		ValorFinal = ValorPrestação + (ValorPrestação * (ValorTaxa/100) * TempoAtraso);
		
		System.out.println("O valor final da prestação em atraso é de " + ValorFinal + " Reais! ");
	}

}
