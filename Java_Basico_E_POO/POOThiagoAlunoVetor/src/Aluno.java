
public class Aluno {

	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float media;
	
	//Construtores
	public Aluno(){
		
	}
	
	public Aluno(String nome, int matricula, float nota1, float nota2) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia() {
		media=(this.nota1+this.nota2)/2;
		this.media = media;;
	}
	
	public void status(){
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Nota 1: " + getNota1());
		System.out.println("Nota 2: " + getNota2());
		System.out.println("Media: " + getMedia());
	}
}
