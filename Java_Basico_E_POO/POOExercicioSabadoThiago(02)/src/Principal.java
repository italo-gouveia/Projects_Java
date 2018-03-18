  import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner InString = new Scanner(System.in);
		Scanner InNum = new Scanner(System.in);
		int maiorIdade=0, menorIdade=0;
		float mediaIdade, acumIdade=0;
		
		Pessoa [] pessoas = new Pessoa[3];
		for(int i=0; i<pessoas.length; i++){
			pessoas[i] = new Pessoa();
			System.out.println("Digite o nome: ");
			pessoas[i].setNome(InString.nextLine());
			System.out.println("Digite a idade: ");
			pessoas[i].setIdade(InNum.nextInt());
			acumIdade+=pessoas[i].getIdade();
			
			if(pessoas[i].getIdade() > maiorIdade){
				maiorIdade = pessoas[i].getIdade();
			} else if(pessoas[i].getIdade() < menorIdade){
				menorIdade = pessoas[i].getIdade();
			}
		}
		
		for(int i=0; i<pessoas.length; i++){
			pessoas[i].status();
		}
		f4sd4fsdf
		mediaIdade=(acumIdade/pessoas.length);
		System.out.println("Menor Idade: " + menorIdade);
		System.out.println("Maior Idade: " + maiorIdade);
		System.out.println("Média de idades: " + mediaIdade);

	}
}
