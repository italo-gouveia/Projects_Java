import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		
		/*if(idade >= 18){
			System.out.println("Maior Idade!");
		}else{
			System.out.println("Menor Idade!");
		}*/
		
		String res = idade < 15 ? "Criança" : idade >= 15 && idade < 20 ? "Juvenil" : "Adulto";
		
		System.out.println(res);
		
	}

}
