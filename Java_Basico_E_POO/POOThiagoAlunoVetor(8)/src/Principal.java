import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[10];
		for(int i=0; i<alunos.length; i++){
			alunos[i]=new Aluno();
			System.out.println("Digite o nome do aluno: ");
			alunos[i].setNome(tecladoString.nextLine());
			System.out.println("Digite a matricula: ");
			alunos[i].setMatricula(tecladoNumerico.nextInt());
			System.out.println("Digite a primeira nota: ");
			alunos[i].setNota1(tecladoNumerico.nextFloat());
			System.out.println("Digite a segunda nota: ");
			alunos[i].setNota2(tecladoNumerico.nextFloat());
			alunos[i].setMedia();
		}
		for(int i=0; i<alunos.length; i++){
			alunos[i].status();
		}
	}
}