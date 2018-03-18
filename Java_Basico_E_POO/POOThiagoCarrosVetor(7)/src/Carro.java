
public class Carro {
	//Atributos
	private String marca;
	private String modelo;
	private int ano;
	private String chasi;
	private String cor;
	//Construtores
	public Carro(){
		
	}
	
	public Carro(String marca, String modelo, int ano, String chasi, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.chasi = chasi;
		this.cor = cor;
	}
	
	//Getters e Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getChasi() {
		return chasi;
	}
	public void setChasi(String chasi) {
		this.chasi = chasi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Método de Status
	public void status(){
		System.out.println(this.getMarca());
		System.out.println(this.getModelo());
		System.out.println(this.getAno());
		System.out.println(this.getChasi());
		System.out.println(this.getCor());
	}
}