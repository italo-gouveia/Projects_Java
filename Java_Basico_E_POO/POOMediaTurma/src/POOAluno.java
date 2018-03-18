import java.util.Scanner;

public class POOAluno {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno();
		int cont=0;
		int i;
		
		for(i=0; i<10; i++){
			System.out.println("Digite a primeira nota: ");
			a1.nota1=teclado.nextFloat();
			System.out.println("Digite a segunda nota: ");
			a1.nota2=teclado.nextFloat();
			System.out.println("Digite a terceira nota: ");
			a1.nota3=teclado.nextFloat();
			
			System.out.println("A média desse aluno é: " + a1.mediaAluno());
			
			if(a1.mediaAluno >= 5){
				cont++;
			}
		}
		
		System.out.println("A média da turma é: " + a1.mediaGeral(i));
		System.out.println("O percentual de alunos aprovados é: " + a1.percentualAprovados(cont, i) + "%");
	}
}
