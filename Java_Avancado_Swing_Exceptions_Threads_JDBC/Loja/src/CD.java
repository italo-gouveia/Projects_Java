
public class CD extends Produto{

	private String nome;
	private int numFaixas;
	
	public CD(){
		
	}
	
	public CD(float preco, String nome, int numFaixas) throws PrecoNegException{
		super(preco);
		this.nome = nome;
		this.numFaixas = numFaixas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public void valorDesconto(){
		System.out.println(getPreco() - ((getPreco()/100) * 5)); 
	}

}
