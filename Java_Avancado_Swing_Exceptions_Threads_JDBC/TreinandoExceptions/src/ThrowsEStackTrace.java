import java.util.Scanner;

public class ThrowsEStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros =  {4, 8, 16, 32, 64, 128};
		int [] denominadores = {2, 0, 4, 8, 0};
		
		for(int i=0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denominadores[i] 
						+ " = " + (numeros[i]/denominadores[i]));
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}

/*A classe Throwable oferece v�rios m�todos uteis, sendo os mais utilizados o getMessage
que retorna uma mensagem informando o motivo do erro e o m�todo printStackTrace, esse 
m�todo � o respons�vel por mostrar aquelas mensagens de erro vermelhas que vemos desde
o come�o de java, esse m�todo na verdade serve pra mostrar em qual linha do c�digo o 
erro ou exce��o foi encontrado, isso facilita bastante a vida dos programadores*/


/*ATEN��O - � importante resaltar que o printStackTrace deve ser utilizado � nivel de
 * log para gerar o arquivo log com os erros para que os programadores possam corrigir
 * mas para o usu�rio final n�o se deve utilizar esse m�todo, pois ir� mostrar detalhes
 * do programa que podem ser utilizados por pessoas mal intencionadas para fazer ataques
 * ao seu sistema, sendo assim, para o usu�rio final deve-se ser utilizada apenas uma
 * mensagem simples.*/