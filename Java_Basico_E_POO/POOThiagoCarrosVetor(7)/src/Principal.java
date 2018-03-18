import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		Carro[] carros = new Carro[2];
		for(int i=0; i<carros.length; i++){
			carros[i] = new Carro();
			System.out.println("Digite a marca do carro: ");
			carros[i].setMarca(tecladoString.nextLine());
			System.out.println("Digite o modelo do carro: ");
			carros[i].setModelo(tecladoString.nextLine());
			System.out.println("Digite o ano do veiculo: ");
			carros[i].setAno(tecladoNumerico.nextInt());
			System.out.println("Digite o chassi: ");
			carros[i].setChasi(tecladoString.nextLine());
			System.out.println("Digite a cor do veiculo: ");
			carros[i].setCor(tecladoString.nextLine());
		}
		
		for(int i=0; i<carros.length; i++){
			carros[i].status();
		}
	}	
}