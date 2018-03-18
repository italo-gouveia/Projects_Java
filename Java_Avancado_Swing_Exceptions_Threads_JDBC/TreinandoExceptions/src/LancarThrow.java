import java.util.Scanner;

public class LancarThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entre com um número decimal");
		
		/*double num = leNumero(); - utilizando esse codigo o eclipse irá reclamar para
		que essa exceção seja tratada, clicando na segunda opção que irá aparecer o 
		eclipse irá gerar o try-catch escrito abaixo*/
		
		try {
			double num = leNumero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
