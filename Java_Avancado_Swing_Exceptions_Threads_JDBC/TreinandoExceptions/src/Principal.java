
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int vetor[] = new int[4];
			System.out.println("Antes da exceção");
			
			vetor[5] = 1;
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Exceção ao acessar um indice inexistente");
		}
		
		System.out.println("Esse texto será exibido após a execução");
	}

}

/*try: é o bloco de comandos que são passíveis de gerarem uma exceção. Quando o programador
sabe que um determinado conjunto de instruções pode gerar algum tipo de exceção, ele agrega
esses comandos dentro de um bloco try. O código contido dentro de um bloco try é chamado de
código protegido.*/

/*catch: é o bloco de comandos alternativos ao try, ou seja, se os comandos do bloco try gerarem
uma exceção então os comandos do bloco catch serão executados no lugar deles. O bloco catch
é opcional, mas normalmente é implementado junto a um bloco try.*/

/*finally: é um comando utilizado para delimitar um grupo de instruções que será sempre
executada ao final de um bloco try-catch, independente de qual dos blocos anteriores foi
processado pela máquina virtual.
*/