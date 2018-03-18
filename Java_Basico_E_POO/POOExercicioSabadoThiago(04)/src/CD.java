
public class CD {

	private String titulo;
	private int numFaixas;
	private float preco;
	private String nomeCantor;
	
	public CD(){
		
	}
	
	public CD(String titulo, int numFaixas, float preco, String nomeCantor) {
		super();
		this.titulo = titulo;
		this.numFaixas = numFaixas;
		this.preco = preco;
		this.nomeCantor = nomeCantor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNomeCantor() {
		return nomeCantor;
	}

	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}
	
	public void status(){
		System.out.println(this.getTitulo());
		System.out.println(this.getNumFaixas());
		System.out.println(this.getPreco());
		System.out.println(this.getPreco());
	}
}
