import java.util.Date;

public class Movimento {

	private int tipoMovimento;
	private Date dataMovimentacao;
	private Date horaMovimentacao;
	private double valMovimento;
	
	public Movimento() {
		// TODO Auto-generated constructor stub
	}
	
	public Movimento(int tipoMovimento, Date dataMovimentacao, Date horaMovimentacao, double valMovimento) {
		super();
		this.tipoMovimento = tipoMovimento;
		this.dataMovimentacao = dataMovimentacao;
		this.horaMovimentacao = horaMovimentacao;
		this.valMovimento = valMovimento;
	}

	public Movimento(int tipoMovimento, double valMovimento) {
		// TODO Auto-generated constructor stub
		this.tipoMovimento = tipoMovimento;
		this.valMovimento = valMovimento;
	}
	
	public int getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(int tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Date getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public void setHoraMovimentacao(Date horaMovimentacao) {
		this.horaMovimentacao = horaMovimentacao;
	}

	public double getValMovimento() {
		return valMovimento;
	}

	public void setValMovimento(double valMovimento) {
		this.valMovimento = valMovimento;
	}
	
	public void regMovimento(int tipo, double valor){
		Date dataHora = new Date();
		horaMovimentacao = dataHora;
		dataMovimentacao = dataHora;
		this.setTipoMovimento(tipo);
		this.setValMovimento(valor);
		
	}
	/*public void regMovimento(int tipo, double valor){
		
	}
	public void consultarMovimento(String inicio, String fim){
		
	}*/
}