
public class Livro extends Produto{

	private String nome;
	private String autor;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(float preco, String nome, String autor) throws PrecoNegException {
		super(preco);
		this.nome = nome;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void valorDesconto(){
		System.out.println(getPreco() - ((getPreco()/100) * 2)); 
	}

}
