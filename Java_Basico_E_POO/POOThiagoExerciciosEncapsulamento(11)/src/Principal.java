import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner inString = new Scanner(System.in);
		Scanner inNum = new Scanner(System.in);
		
		Pessoa [] pessoas = new Pessoa[1];
		
		for(int i=0;i<pessoas.length;i++){
			pessoas[i] = new Pessoa();
			System.out.println("Digite o nome: ");
			pessoas[i].setNome(inString.nextLine());
			System.out.println("Digite a idade: ");
			pessoas[i].setIdade(inNum.nextInt());
			System.out.println("Digite o CPF: ");
			pessoas[i].setCpf(inNum.nextLong());
			System.out.println("Digite a rua: ");
			pessoas[i].getEndereco().setRua(inString.nextLine());
			System.out.println("Digite o bairro: ");
			pessoas[i].getEndereco().setBairro(inString.nextLine());
			System.out.println("Digite a cidade: ");
			pessoas[i].getEndereco().setCidade(inString.nextLine());
			System.out.println("Digite o CEP: ");
			pessoas[i].getEndereco().setCEP(inNum.nextInt());
			System.out.println("Digite o seu estado: ");
			pessoas[i].getEndereco().setEstado(inString.nextLine());
			System.out.println("Digite o telefone");
			pessoas[i].getEndereco().setTelefone(inNum.nextInt());
		}
		for(int i=0;i<pessoas.length;i++){
			pessoas[i].status();
		}
	}
}
