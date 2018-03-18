
public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;
	
	//construtores
	public Funcionario(){
		
	}
	public Funcionario(String setor, boolean trabalhando) {
		this.setor = setor;
		this.trabalhando = trabalhando;
	}
	
	//getters e setters
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//Métodos especificos
	public void mudaTrabalho(){
		this.trabalhando = !this.trabalhando; //esse comando faz com que trabalhando receba o inverso de trabalhando
	}
}
