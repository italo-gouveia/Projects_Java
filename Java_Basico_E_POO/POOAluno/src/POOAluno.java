import java.util.Scanner;

public class POOAluno {

	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a1.nome=teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a1.idade=teclado.nextInt();
		System.out.println("Digite a altura do aluno: ");
		a1.altura=teclado.nextFloat();
		
		System.out.println("Nome do aluno: " + a1.nome);
		System.out.println("Idade: " + a1.idade);
		System.out.println("Altura: " + a1.altura);
	}
}
