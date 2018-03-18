import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner tecladoString = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);
		Livro[] livros = new Livro[10];
		int opc;
		
		do{
			
			System.out.println("CRUD de Livros");
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Alterar Livro");
			System.out.println("4 - Remover Livro");
			System.out.println("5 - Sair");
			System.out.println("Digite uma opção: ");
			opc = tecladoNumerico.nextInt();
			switch(opc){
				case 1:
					Livro l = new Livro();
					System.out.println("Titulo: ");
					l.setTitulo(tecladoString.nextLine());
					System.out.println("Edicao: ");
					l.setEdicao(tecladoNumerico.nextByte());
					System.out.println("Numero de Paginas: ");
					l.setNumPag(tecladoNumerico.nextInt());
					System.out.println("Nome Autor: ");
					l.getAutor().setNome(tecladoString.nextLine());
					System.out.println("Email Autor: ");
					l.getAutor().setEmail(tecladoString.nextLine());
					for(int i = 0; i < livros.length; i++){
						if(livros[i] == null){
							livros[i] = l;
							break;
						}
					}
					break;
				case 2:
					for(int i = 0; i < livros.length; i++){
						if(livros[i] != null){
							livros[i].imprimir();
							System.out.println("-----------------");
						}
					}
					break;
			
			}
			
		}while(opc != 5);
		
	}

}
