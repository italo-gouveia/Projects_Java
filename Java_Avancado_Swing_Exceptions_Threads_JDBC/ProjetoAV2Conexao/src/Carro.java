
public class Carro {

	private String placa;
	private long chassi;
	private String cor;
	private String modelo;
	private String marca;
	private int ano;
	
	public Carro() {
		
	}

	public Carro(String placa, long chassi, String cor, String modelo, String marca, int ano) {
		super();
		this.placa = placa;
		this.chassi = chassi;
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public long getChassi() {
		return chassi;
	}

	public void setChassi(long chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
