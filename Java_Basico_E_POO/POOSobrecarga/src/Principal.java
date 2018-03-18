import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		float acumulador=0;
		
		Funcionario f = new Funcionario();
		for(int i=0; i<5; i++){
			System.out.println("Nome: ");
			f.nome = tecladoString.nextLine();
			System.out.println("Salario: ");
			f.salario = teclado.nextFloat();
			acumulador += f.salario;
		}
		
		System.out.println("Salario Total: " + acumulador);
	}
}
