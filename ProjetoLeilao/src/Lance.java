
public class Lance {
	
	private float valor;
	private Usuario usuario;
	
	public Lance(){
		this.usuario = new Usuario();
	}
	
	public Lance(float valor, Usuario usuario) {
		this.valor = valor;
		this.usuario = usuario;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
