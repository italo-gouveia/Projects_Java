import java.util.Scanner;

public class principal {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		ControleRemoto CR1 = new ControleRemoto();
		CR1.ligar();
		CR1.ligarMudo();
		CR1.play();
		CR1.maisVolume();
		CR1.abrirMenu();
		CR1.fecharMenu();
		
	}
}
