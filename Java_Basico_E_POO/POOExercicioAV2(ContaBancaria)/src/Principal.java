import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Endereco e1 = new Endereco("Av Campos Salles", 5869800, "Bessa", 150, "João Pessoa");
		PessoaFisica p1 = new PessoaFisica("Italo", 500, 1, 115654, 5050, e1); 
		Date data1 = new Date();
		Conta c1 = new Conta(205, data1, 1, 222, 500, p1);
		c1.toString();

		Endereco e2 = new Endereco("Av Pedro I", 5876800, "Bessa", 155, "João Pessoa");
		PessoaJuridica p2 = new PessoaJuridica("João", 1000, 1, 14465445, e2);
		Conta c2 = new Conta(305, dataAbertura = new Date(), 1, 464, 600, p2);
		c2.toString();
		
		contas.add(c1);
		contas.add(c2);
		
		c1.depositar(500);
		c1.depositar(500);
		c1.sacar(200);
		c1.sacar(200);
		c2.depositar(1000);
		c2.depositar(1000);
		
		c2.transferir(500, c2, c1);
		c2.transferir(500, c2, c1);
		
	}
}	