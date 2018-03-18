
public class Produto {

	private float preco;

	public Produto (){
		
	}
	
	public Produto (float preco) throws PrecoNegException{
		setPreco(preco);
	}
	
	public void valorDesconto() {
			System.out.println(getPreco() - ((getPreco()/100) * 2)); 
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) throws PrecoNegException{
		if(preco < 0){
			throw new PrecoNegException(preco);
		}
		this.preco = preco;
	}
	
}
