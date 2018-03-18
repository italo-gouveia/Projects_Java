
public class Livro {

	private String titulo;
	private byte edicao;
	private int numPag;
	private Autor autor;
	
	public Livro() {
		this.autor = new Autor();/*esse comando está instânciando um objeto do tipo
		autor no momento em que o construtor padrão de livro for usado*/
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
	
	public void status(){
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Edição: " + this.edicao);
		System.out.println("Número de páginas: " + this.numPag);
		autor.status();
	}
}
