import java.util.Scanner;

public class principal {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int cargo;
		float salarioinicial, salariofinal, aumento;
		
		System.out.println("Digite o seu sal�rio: ");
		salarioinicial = teclado.nextFloat();
		
		System.out.println("Digite o c�digo equivalente ao seu cargo: ");
		System.out.println("1 - Escritu�rio ");
		System.out.println("2 - Secret�rio ");
		System.out.println("3 - Caixa ");
		System.out.println("4 - Gerente ");
		System.out.println("5 - Diretor ");
		cargo = teclado.nextInt();
		
		if(cargo==1){
			salariofinal = salarioinicial + ((salarioinicial/100)*50);
			aumento = salariofinal - salarioinicial;
			System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final ser� de " + salariofinal);
		}else{
			if(cargo==2){
				salariofinal = salarioinicial + ((salarioinicial/100)*35);
				aumento = salariofinal - salarioinicial;
				System.out.println("O aumento foi de " + aumento + " reais, dessa forma o sal�rio final ser� de " + salariofinal);
			}else{
				if(cargo==3){
					salariofinal = salarioinicial + ((salarioinicial/100)*20);
					aumento = salariofinal - salarioinicial;
					System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final ser� de " + salariofinal);
				}else{
					if(cargo==4){
						salariofinal = salarioinicial + ((salarioinicial/100)*10);
						aumento = salariofinal - salarioinicial;
						System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final ser� de " + salariofinal);
					}else{
						if(cargo==5){
							System.out.println("Para o cargo de diretor n�o h� aumento, permanecendo o valor original! ");
						}else{
							System.out.println("N�mero inv�lido. ");
						}
					}
				}
			}
		}
	}
}