
public class Disciplina {
	//Atributos
	private String NomeDisciplina;
	private float av1, av2, av3;
	private float MediaDisciplina;
	private boolean aprovado;
	//Construtor
	public Disciplina(String nomeDisciplina, float av1, float av2, float av3) {
		super();
		this.NomeDisciplina = nomeDisciplina;
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
	}
	//Getters e Setters
	public String getNomeDisciplina() {
		return NomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.NomeDisciplina = nomeDisciplina;
	}
	public float getAv1() {
		return av1;
	}
	public void setAv1(float av1) {
		this.av1 = av1;
	}
	public float getAv2() {
		return av2;
	}
	public void setAv2(float av2) {
		this.av2 = av2;
	}
	public float getAv3() {
		return av3;
	}
	public void setAv3(float av3) {
		this.av3 = av3;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado() {
		if(this.MediaDisciplina >= 6){
			this.aprovado = true;
			System.out.println("O aluno está aprovado na disciplina");
		}else{
			this.aprovado = false;
			System.out.println("O aluno está reprovado na disciplina");
		}
	}
	//Métodos específicos
	public float calcularMedia(){
		this.MediaDisciplina = ((this.getAv1()+this.getAv2()+this.getAv3())/3);
		System.out.println("A média da disciplina " + this.NomeDisciplina + " foi de " + this.MediaDisciplina);
		return MediaDisciplina;
	}
}
