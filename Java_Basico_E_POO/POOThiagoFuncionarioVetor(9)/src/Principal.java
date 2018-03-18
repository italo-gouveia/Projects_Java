import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		int opc;
		
		Funcionario[] funcionarios = new Funcionario[5];
		for(int i=0; i<funcionarios.length; i++){
			funcionarios[i]= new Funcionario();
			System.out.println("Digite o nome do funcionario: ");
			funcionarios[i].setNome(tecladoString.nextLine());
			System.out.println("Digite a matricula: ");
			funcionarios[i].setMatricula(tecladoNumerico.nextInt());
			System.out.println("Digite o salario: ");
			funcionarios[i].setSalario(tecladoNumerico.nextFloat());
			System.out.println("Deseja consultar o salario com aumento de 20% ou com um outro valor ? ");
			System.out.println("Para consultar o salario com aumento de 20% digite 1: "
					+ "Para consultar o salario com um aumento especifico digite 2");
			opc=tecladoNumerico.nextInt();
			if(opc == 1){
				funcionarios[i].aumentarSalario();
			}else if(opc==2){
				System.out.println("Digite a porcentagem de aumento desejada: ");
				funcionarios[i].aumentarSalario(tecladoNumerico.nextFloat());
			}else{
				System.out.println("Opção inválida: ");
			}
		}
		for(int i=0; i<funcionarios.length;i++){
			funcionarios[i].status();
		}
	}
}