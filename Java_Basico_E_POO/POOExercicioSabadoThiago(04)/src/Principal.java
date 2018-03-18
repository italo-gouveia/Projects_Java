import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inNum = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		
		CD[] cds = new CD[5];
		for(int i=0; i<cds.length; i++){
			cds[i] = new CD();
			System.out.println("Digite o titulo do cd:");
			cds[i].setTitulo(inString.nextLine());
			System.out.println("Digite o numero de faixas:");
			cds[i].setNumFaixas(inNum.nextInt());
			System.out.println("Digite o preço:");
			cds[i].setPreco(inNum.nextFloat());
			System.out.println("Digite o nome do cantor:");
			cds[i].setNomeCantor(inString.nextLine());
		}
		
		for(int i=0; i< cds.length; i++){
			cds[i].status();
		}
	}

}
