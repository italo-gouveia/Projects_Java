
public class SaldoNegException extends Exception {

	private float valor;
	
	public SaldoNegException(float valor){
		this.valor = valor;
	}
	
	@Override
	public String getMessage(){
		return "O valor digitado foi: " + valor;
	}
	
}
