
public class Aluno {
	float nota1;
	float nota2;
	float nota3;
	float mediaAluno;
	static float mediaGeral;
	
	public float mediaAluno()
	{
		mediaAluno = (nota1+nota2+nota3)/3;
		mediaGeral+=mediaAluno;
		return mediaAluno;
	}
	public float mediaGeral(int i)
	{
		return mediaGeral/i;
	}
	public float percentualAprovados(int cont, int i)
	{
		return (cont/(float)i)*100.0f;
	}
}
