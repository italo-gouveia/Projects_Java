
public class Livro {
	
	private String titulo;
	private byte edicao;
	private int numPag;
	private Autor autor;
	
	public Livro(){
		this.autor = new Autor();
	}

	public Livro(String titulo, byte edicao, int numPag, Autor autor) {
		this.titulo = titulo;
		this.edicao = edicao;
		this.numPag = numPag;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte getEdicao() {
		return edicao;
	}

	public void setEdicao(byte edicao) {
		this.edicao = edicao;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void imprimir(){
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Edicao: " + this.edicao);
		System.out.println("Numero de Paginas: " + this.numPag);
		autor.imprimir();
	}
}
