import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		float CRE;
		
		Aluno a1 = new Aluno("Italo", 001, 118, 19);
		Disciplina Usabilidade = new Disciplina("Engenharia de Usabilidades", 9.8f, 9.7f, 9.6f);
		Disciplina Programacao1 = new Disciplina("Programação 1(Java Orientado à objetos)", 6.6f, 9.4f, 7.5f);
		Disciplina MetDesSistemas = new Disciplina("Metodologia de Desenvolvimento de Sistemas", 4.0f, 4.0f, 3.5f);
		Disciplina TecnologiasWeb = new Disciplina("Tecnologias Web(HTML5, CSS, Javascript e Ajax)", 9.5f, 9.5f, 9.5f);
		Disciplina RedesComputadores = new Disciplina("Redes de Computadores", 7.5f, 8.0f, 9.0f);
		
		System.out.println("Aluno: " + a1.getNome());
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("CPF: " + a1.getCPF());
		System.out.println("Idade: " + a1.getIdade());
		
		Usabilidade.calcularMedia();
		Usabilidade.setAprovado();
		Programacao1.calcularMedia();
		Programacao1.setAprovado();
		MetDesSistemas.calcularMedia();
		MetDesSistemas.setAprovado();
		TecnologiasWeb.calcularMedia();
		TecnologiasWeb.setAprovado();
		RedesComputadores.calcularMedia();
		RedesComputadores.setAprovado();
		System.out.println("");
		CRE = (Usabilidade.calcularMedia()+Programacao1.calcularMedia()+MetDesSistemas.calcularMedia()+
				TecnologiasWeb.calcularMedia()+RedesComputadores.calcularMedia())/5;
		System.out.println(CRE);
	}
}
