
public class Leilao {
	
	private String descricao;
	private Lance[] lances;
	private int contador = 0;
	
	public Leilao(){
		lances = new Lance[10];
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Lance[] getLances() {
		return lances;
	}

	public void setLances(Lance[] lances) {
		this.lances = lances;
	}
	
	public void propor(Lance lance){
		lances[contador] = lance;
		contador++;
	}
}
