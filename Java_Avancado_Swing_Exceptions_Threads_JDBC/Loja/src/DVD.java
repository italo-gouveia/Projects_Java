
public class DVD extends Produto{
	
	private String nome;
	private float duracao;

	
	public DVD(){
		
		
	}
	
	public DVD(float preco, String nome, float duracao) throws PrecoNegException{
		super(preco);
		this.nome = nome;
		this.duracao= duracao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void valorDesconto(){
		System.out.println(getPreco() - ((getPreco()/100) * 5)); 
	}
}


