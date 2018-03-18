import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner inNum = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		
		Contato [] contatos = new Contato[5];
		for(int i=0; i < contatos.length; i++){
			System.out.println("Digite o nome do contato: ");
			contatos[i].setNome(inString.nextLine());
			System.out.println("Digite o email do contato");
			contatos[i].setEmail(inString.nextLine());
		}
		
		454
	}
}
