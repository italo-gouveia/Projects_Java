import java.util.Scanner;

public class principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int idade, MaiorIdade=0, MenorIdade=0;
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		MaiorIdade = idade;
		MenorIdade = idade;
		
		while(idade>0){
			if(idade>MaiorIdade){
				MaiorIdade=idade;
			}
			if(idade<MenorIdade){
				MenorIdade=idade;
			}
			System.out.println("Digite a sua idade ");
			idade = teclado.nextInt();
		}
		System.out.println("A maior idade é: " + MaiorIdade + " E a menor é: " + MenorIdade);
	}

}