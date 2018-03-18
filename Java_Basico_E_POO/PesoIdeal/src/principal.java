import java.util.Scanner;

public class principal {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		float altura, pesoidealM, pesoidealF;
		int sexo;

		System.out.println("Digite sua altura! ");
		altura = teclado.nextFloat();
		
		System.out.println("informe o seu sexo: 1 para masculino ou 2 para feminino ");
		sexo = teclado.nextInt();
		
		if (sexo == 1){
			pesoidealM = (72.7f * altura)-58;
			System.out.println("O peso ideal é de " + pesoidealM);
			 
		}else{
			if(sexo == 2){
				pesoidealF = (62*altura)-44.7f;
				System.out.println("O peso ideal é de " + pesoidealF);
				
			}
		}
	}
}
