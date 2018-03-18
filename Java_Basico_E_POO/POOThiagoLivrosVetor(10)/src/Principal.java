import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		
		Livro[] livros = new Livro[10];
		for(int i=0; i<livros.length;i++){
			livros[i] = new Livro();
			System.out.println("Digite o titulo do livro: ");
			livros[i].setTitulo(tecladoString.nextLine());
			System.out.println("Digite o ISBN: ");
			livros[i].setIsbn(tecladoString.nextLine());
			System.out.println("Digite o total de páginas: ");
			livros[i].setNumPaginas(tecladoNumerico.nextInt());
			System.out.println("Digite o autor: ");
			livros[i].setAutor(tecladoString.nextLine());
		}
		for(int i=0; i<livros.length; i++){
			livros[i].imprimir();
		}
	}
}