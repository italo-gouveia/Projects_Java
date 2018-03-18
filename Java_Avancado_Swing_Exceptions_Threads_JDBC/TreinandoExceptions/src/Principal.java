
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int vetor[] = new int[4];
			System.out.println("Antes da exce��o");
			
			vetor[5] = 1;
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Exce��o ao acessar um indice inexistente");
		}
		
		System.out.println("Esse texto ser� exibido ap�s a execu��o");
	}

}

/*try: � o bloco de comandos que s�o pass�veis de gerarem uma exce��o. Quando o programador
sabe que um determinado conjunto de instru��es pode gerar algum tipo de exce��o, ele agrega
esses comandos dentro de um bloco try. O c�digo contido dentro de um bloco try � chamado de
c�digo protegido.*/

/*catch: � o bloco de comandos alternativos ao try, ou seja, se os comandos do bloco try gerarem
uma exce��o ent�o os comandos do bloco catch ser�o executados no lugar deles. O bloco catch
� opcional, mas normalmente � implementado junto a um bloco try.*/

/*finally: � um comando utilizado para delimitar um grupo de instru��es que ser� sempre
executada ao final de um bloco try-catch, independente de qual dos blocos anteriores foi
processado pela m�quina virtual.
*/