import java.util.Scanner;
public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.println("Quer saber sobre o seu voto? Digite sua idade: ");
		idade = teclado.nextInt();
		
		if(idade <= 15){
		System.out.println("Sinto muito. Você não pode votar! ");	
		}else if(idade >= 16 && idade <= 17){
			System.out.println("Você já pode votar, no entando seu voto não é obrigatório! ");
		}else if(idade >= 18 && idade <=65){
			System.out.println("Seu voto é obrigatório! ");
		}else if(idade > 65){
			System.out.println("Você pode votar, porém seu voto não é obrigatório! ");
		}
		
	}

}
