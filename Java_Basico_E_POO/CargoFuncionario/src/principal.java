import java.util.Scanner;

public class principal {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int cargo;
		float salarioinicial, salariofinal, aumento;
		
		System.out.println("Digite o seu salário: ");
		salarioinicial = teclado.nextFloat();
		
		System.out.println("Digite o código equivalente ao seu cargo: ");
		System.out.println("1 - Escrituário ");
		System.out.println("2 - Secretário ");
		System.out.println("3 - Caixa ");
		System.out.println("4 - Gerente ");
		System.out.println("5 - Diretor ");
		cargo = teclado.nextInt();
		
		if(cargo==1){
			salariofinal = salarioinicial + ((salarioinicial/100)*50);
			aumento = salariofinal - salarioinicial;
			System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final será de " + salariofinal);
		}else{
			if(cargo==2){
				salariofinal = salarioinicial + ((salarioinicial/100)*35);
				aumento = salariofinal - salarioinicial;
				System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salário final será de " + salariofinal);
			}else{
				if(cargo==3){
					salariofinal = salarioinicial + ((salarioinicial/100)*20);
					aumento = salariofinal - salarioinicial;
					System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final será de " + salariofinal);
				}else{
					if(cargo==4){
						salariofinal = salarioinicial + ((salarioinicial/100)*10);
						aumento = salariofinal - salarioinicial;
						System.out.println("O aumento foi de " + aumento + " reais, dessa forma o salario final será de " + salariofinal);
					}else{
						if(cargo==5){
							System.out.println("Para o cargo de diretor não há aumento, permanecendo o valor original! ");
						}else{
							System.out.println("Número inválido. ");
						}
					}
				}
			}
		}
	}
}