import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int matricula, idade;
		float n1,n2,n3,media;
		
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a matricula: ");
		matricula = teclado.nextInt();
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		
		System.out.println("Digite a primeira nota: ");
		n1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = teclado.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		if(media >= 7){
			System.out.println("Você está aprovado!");
		}
		else if(media > 4 && media < 7)
		{
			System.out.println("Você está em recuperação! Precisa estudar mais pra não reprovar!");
		}
		else{
			System.out.println("Sinto muito você está reprovado");
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Idade: " + idade);
		System.out.println("Media: " + media);
	}
}
