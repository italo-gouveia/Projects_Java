import java.util.Scanner;

public class principal {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		float salario, PercentualAumento, ValorAumento, NovoSalario;
		
		System.out.println("Digite o valor do sal�rio: ");
		salario = teclado.nextFloat();
		
		System.out.println("Digite a porcentagem do aumento: ");
		PercentualAumento = teclado.nextFloat();
		
		NovoSalario = salario + (salario/100) * PercentualAumento;
		System.out.println("O novo sal�rio ser� de " + NovoSalario + " Reais! ");
		
		ValorAumento = NovoSalario - salario;
		System.out.println("Houve um acrescimo de " + ValorAumento + " Reais no seu sal�rio! ");
		
		
	}

}
