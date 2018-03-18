
public class Ingresso {
	private long id;
	private String fileira_Coluna;
	private boolean estudante;
	private long numeroCarteira;
	private boolean flag_vendida;
	
	public Ingresso() {
		
	}

	public Ingresso(String fileira_Coluna, boolean estudante, long numeroCarteira, boolean flag_vendida) {
		super();
		this.fileira_Coluna = fileira_Coluna;
		this.estudante = estudante;
		this.numeroCarteira = numeroCarteira;
		this.flag_vendida = flag_vendida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileira_Coluna() {
		return fileira_Coluna;
	}

	public void setFileira_Coluna(String fileira_Coluna) {
		this.fileira_Coluna = fileira_Coluna;
	}

	public boolean isEstudante() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}

	public long getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(long numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public boolean isFlag_vendida() {
		return flag_vendida;
	}

	public void setFlag_vendida(boolean flag_vendida) {
		this.flag_vendida = flag_vendida;
	}
	
	/*@Override
	public String toString() {
		return this.getId() + this.getColuna() + this.getFileira() + this.isEstudante() + this.getNumeroCarteira() + this.isFlag_vendida();
	}*/
	
}
