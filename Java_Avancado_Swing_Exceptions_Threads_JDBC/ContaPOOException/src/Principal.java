import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Usuario u = new Usuario("Italo", 11897835418l, 500, 3000, 5);
		boolean flag = false;
		
		do{
			System.out.println("Digite o valor do saque: ");
			float valor = teclado.nextFloat();
			
			try {
				u.realizarSaque(valor);
				flag = true;
			} catch (SaldoNegException e) {
				// TODO Auto-generated catch block
				System.out.println("Usuário: " + u.getNome());
				e.printStackTrace();
				System.out.println("Seu saldo é de: " + u.getConta().getSaldo());
				System.out.println("O seu limite é de: " + u.getConta().getLimite());
				System.out.println("Digite um valor válido!");
			}
		}while(!flag);
		
	}

}
