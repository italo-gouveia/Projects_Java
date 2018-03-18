
public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	
	//construtores
	public Aluno(){
		
	}
	public Aluno(int matricula, String curso) {
		this.matricula = matricula;
		this.curso = curso;
	}
	
	//getters e setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//métodos especiais
	public void cancelarMatricula(){
		System.out.println("Matricula será cancelada");
	}
	public void pagarMensalidade(){
		System.out.println("Pagando mensalidade do aluno " + this.nome);
	}
}
