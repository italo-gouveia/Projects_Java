import java.util.Scanner;

public class Teste05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println();
		
		Funcionario f2 = new Funcionario("joão", 19);
		System.out.println(f2.getNome());
		System.out.println(f2.getIdade());
		System.out.println(f2.getSalario());
		System.out.println();
		
		Funcionario f3 = new Funcionario(2005, "Maria", 1500);
		System.out.println(f3.getMatricula());
		System.out.println(f3.getNome());
		System.out.println(f3.getSalario());
	}
}
