
public class Cliente {

	private Data dataNasc;
	private int carteiraEstudante;
	
	public Cliente(){
		super();
	}
	
	public Cliente(Data dataNasc, int carteiraEstudante) {
		super();
		this.dataNasc = dataNasc;
		this.carteiraEstudante = carteiraEstudante;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getCarteiraEstudante() {
		return carteiraEstudante;
	}

	public void setCarteiraEstudante(int carteiraEstudante) {
		this.carteiraEstudante = carteiraEstudante;
	}
}
