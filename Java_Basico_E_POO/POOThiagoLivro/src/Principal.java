import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		
		/*Livro L = new Livro();
		L.getAutor().setEmail("J@email.com");
		System.out.println(L.getAutor().getEmail());
		*/
		
		
		/*Livro[]livros = new Livro[3];
		for(int i = 0; i<livros.length;i++){
			livros[i]=new Livro();
			System.out.println("Digite o titulo do livro: ");
			livros[i].setTitulo(tecladoString.nextLine());
			System.out.println("Digite a edição: ");
			livros[i].setEdicao(teclado.nextByte());
			System.out.println("Digite o número de páginas: ");
			livros[i].setNumPag(teclado.nextInt());
			System.out.println("Digite o nome do autor: ");
			livros[i].getAutor().setNome(tecladoString.nextLine());
			System.out.println("Digite o email do autor: ");
			livros[i].getAutor().setEmail(tecladoString.nextLine());
		}
		for(int i=0; i < livros.length; i++){
			livros[i].status();
		}*/                                   //esse é o comando certo
		
		Livro[] livros = new Livro[10];
		int opc;
		
		do{
			System.out.println("CRUD de livros");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Alterar livro");
			System.out.println("4 - Remover livro");
			System.out.println("5 - Sair");
			System.out.println("Digite uma opção: ");
			opc = teclado.nextInt();
			switch(opc){
				case 1:
					Livro l = new Livro();
					System.out.println("Digite o titulo do livro: ");
					l.setTitulo(tecladoString.nextLine());
					System.out.println("Digite a edição: ");
					l.setEdicao(teclado.nextByte());
					System.out.println("Digite o número de páginas: ");
					l.setNumPag(teclado.nextInt());
					System.out.println("Digite o nome do autor: ");
					l.getAutor().setNome(tecladoString.nextLine());
					System.out.println("Digite o email do autor: ");
					l.getAutor().setEmail(tecladoString.nextLine());
					for(int i=0; i < livros.length; i++){
						if(livros[i] == null){
							livros[i] = l;
							break;
						}
					}
					break;
				case 2:
					for(int i=0;i<livros.length;i++){
						if(){
							livros[i]
						}
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
			}
		}while(opc != 5);
	}
}
