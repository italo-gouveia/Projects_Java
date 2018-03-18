
public enum DiaSemana {

	/*esses valores não existiam antes, foram adicionados para passar 
	para o parametro do construtor adicionado*/
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	/*o construtor de um enum deve ser utilizado apenas com 
	o seu nome ignorando modificadores de acesso*/
	
	private int valor;
	
	DiaSemana(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}

/*enumeradores podem ser uteis para substituir constantes, 
no entando tem outras utilidades*/

/*podem ser utilizados como classes também, desse modo podem 
ter construtores e métodos*/
