import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inNum = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		int luzesAcessas=0, luzesApagadas=0, luzesMeia=0;
		int opc;
		
		Lampada[] lampadas = new Lampada[2];
		for(int i=0; i<lampadas.length; i++){
			lampadas[i] = new Lampada();
			System.out.println("Digite 1 para acender a luz, 2 para apagar e "
					+ "3 para deixar meia luz");
			opc = inNum.nextInt();
			switch(opc){
				case 1: luzesAcessas++;
				break;
				case 2: luzesApagadas++;
				break;
				case 3: luzesMeia++;
				break;
			}
		}
		System.out.println("Quantidade de luzes acessas: " + luzesAcessas);
		System.out.println("Quantidade de luzes apagadas: " + luzesApagadas);
		System.out.println("Quantidade de luzes em meia-luz: " + luzesMeia);
	}

}
