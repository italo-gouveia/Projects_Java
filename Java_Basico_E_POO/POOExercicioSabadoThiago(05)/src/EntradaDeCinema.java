
public class EntradaDeCinema {

	private Data data;
	private float horario;
	private int sala;
	private float valor;
	private Cliente cliente;
	
	public EntradaDeCinema(){
		super();
		this.data = new Data();
		this.cliente = new Cliente();
	}
	
	public EntradaDeCinema(Data data, float horario, int sala, float valor, Cliente cliente) {
		super();
		this.data = new Data();
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
		this.cliente = new Cliente();
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public float getHorario() {
		return horario;
	}

	public void setHorario(float horario) {
		this.horario = horario;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void calcularDesconto(Data data){
		if(this.getCliente().getDataNasc().getAno() >= 2005){
			this.setValor(this.valor/2);
		}
	}
	public void calcularDesconto(Data data, int carteiraEstudante){
		if(this.getCliente().getDataNasc().getAno() >= 2002 && this.getCliente().getDataNasc().getAno() <=2005){
			this.setValor((this.valor/100)*40);
		}else if(this.getCliente().getDataNasc().getAno() >=1997 && this.getCliente().getDataNasc().getAno() <= 2001){
			this.setValor((this.valor/100)*30);
		}else if(this.getCliente().getDataNasc().getAno() <= 1997){
			this.setValor((this.valor/100)*20);
		}
	}
	public void calcularDescontoHorario(){
		if(this.getHorario() < 16.00){
			this.setValor(this.valor/100*10);
		}
	}
	public void imprimir(){
		toString();
	}
}
