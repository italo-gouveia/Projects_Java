import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		//Pessoa p1 = new Pessoa();
		
		//Visitante v1 = new Visitante();
		/*v1.setNome("Juvenal");
		v1.setIdade(50);
		v1.setSexo("M");
		System.out.println(v1.toString());
		*/
		
		Aluno a1 = new Aluno();//aluno é especialização de pessoa e pessoa é generalização de aluno
		a1.setNome("João");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(18);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(12);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}
}