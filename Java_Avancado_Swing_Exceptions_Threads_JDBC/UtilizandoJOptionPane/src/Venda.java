
public class Venda {
	
	private String produto;
	private float subtotal;
	private float total;
	
	public Venda(String produto, float subtotal, float total) {
		super();
		this.produto = produto;
		this.subtotal = subtotal;
		this.total = total;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto: " + this.produto 
				+ "Subtotal: " + this.subtotal + "Total: " + this.total;
	}
}
