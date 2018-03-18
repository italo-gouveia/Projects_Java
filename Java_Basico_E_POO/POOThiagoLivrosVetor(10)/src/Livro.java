
public class Livro {

	private String titulo;
	private String isbn;
	private int numPaginas;
	private String autor;
	//Construtores
	public Livro(){
		
	}
	
	public Livro(String titulo, String isbn, int numPaginas, String autor) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.autor = autor;
	}
	
	//getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//métodos especificos
	public void imprimir(){
		System.out.println("Titulo do livro: " + this.getTitulo());
		System.out.println("ISBN: " + this.getIsbn());
		System.out.println("Número total de páginas: " + this.getNumPaginas());
		System.out.println("Autor: " + this.getAutor());
	}
}