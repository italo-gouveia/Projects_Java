
public class PrecoNegException extends Exception{

	private float preco;
	
	public PrecoNegException(float Preco){
		this.preco = preco;
	}
	
	public String getMessage(){
		return preco + "o pre�o n�o pode ser negativo";
	}
	
}
