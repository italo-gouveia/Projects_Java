import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float ValorPresta��o, ValorTaxa, ValorFinal;
		int TempoAtraso;
		
		System.out.println("Digite o valor da presta��o: ");
		ValorPresta��o = teclado.nextFloat();
		System.out.println("Digite o valor da taxa: ");
		ValorTaxa = teclado.nextFloat();
		System.out.println("Digite o tempo de atraso em dias: ");
		TempoAtraso = teclado.nextInt();
		
		ValorFinal = ValorPresta��o + (ValorPresta��o * (ValorTaxa/100) * TempoAtraso);
		
		System.out.println("O valor final da presta��o em atraso � de " + ValorFinal + " Reais! ");
	}

}
