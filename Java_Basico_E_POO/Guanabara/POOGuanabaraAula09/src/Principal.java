import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("MySQL facil", "Thiago Prado", 200, p[1]);
		l[2] = new Livro("POO em Java", "Pedro Ferreira", 350, p[0]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].voltarPag();
		System.out.println(l[0].toString());
		

	}
}
