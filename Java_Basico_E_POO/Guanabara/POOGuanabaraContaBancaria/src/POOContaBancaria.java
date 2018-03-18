import java.util.Scanner;

public class POOContaBancaria {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria p1 = new ContaBancaria();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.AbrirConta("CC");
		
		ContaBancaria p2 = new ContaBancaria();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.AbrirConta("CP");
		
		p1.depositar(500);
		p2.depositar(750);
		p2.sacar(100);
		
		p1.EstadoAtual();
		p2.EstadoAtual();
	}
}
