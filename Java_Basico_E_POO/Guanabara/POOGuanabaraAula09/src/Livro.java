
public class Livro implements Publicacao{
	//Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private boolean aberto;
	private int pagAtual;
	private Pessoa leitor; //Atributo privado do tipo Pessoa
	
	//Construtores(Padrão e com paramêtros)
	public Livro() {
	}
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	//Métodos Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//Método toString(pode chamar esse metodo por detalhes ou outros nomes também)
	@Override
	public String toString() {
		return "Livro \n [titulo=" + titulo + ",\n autor=" + autor + ",\n totPaginas=" + totPaginas +
				",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + ", \n leitor=" + leitor.getNome() +
				", \n idade=" + leitor.getIdade() + ",\n sexo=" + leitor.getSexo() + "]";
	}
	//Métodos Abstratos
	@Override
	public void abrir() {
		// TODO Auto-generated method stub	
		this.aberto = true;
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}
	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p>this.totPaginas){
			this.pagAtual=0;
		}else{
			this.pagAtual = p;	
		}
	}
	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub	
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub	
		this.pagAtual--;
	}
}
