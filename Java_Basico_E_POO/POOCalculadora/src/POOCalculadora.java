import java.util.Scanner;

public class POOCalculadora {

	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		Calculadora calc1 = new Calculadora();
		int n1,n2;
		
		System.out.println("Digite o primeiro valor: ");
		calc1.numero1=teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		calc1.numero2=teclado.nextInt();
				
		calc1.retornaSoma();
		calc1.retornaMultiplicacao();
		
		System.out.println("Digite o primeiro valor: ");
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2=teclado.nextInt();
		
		calc1.insereValores(n1, n2);
		
		calc1.retornaSoma();
		calc1.retornaMultiplicacao();
	}
}
