
public class UsingFinally {

	public static void main(String[] args) {
		int [] numeros =  {4, 8, 16, 32, 64, 128};
		int [] denominadores = {2, 0, 4, 8, 0};
		
		for(int i=0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denominadores[i] 
						+ " = " + (numeros[i]/denominadores[i]));
			}catch(ArithmeticException e1){
				System.out.println("Erro ao dividir por zero");
			}catch(Throwable e2){
				System.out.println("Erro n�o especificado");
			}
			finally{
				System.out.println(
						"Essa mensagem sempre ir� aparecer ap�s o try e o catch");
			}/*finally (finalmente) � um comando que ao final de qualquer exce��o 
			ir� executar algo sempre independente se pasou pelos dois blocos ou apenas um, 
			e sempre ao final dos dois*/
			
			/*ATEN��O - existe um comando que pode impedir o finally de ser executado
			 * � o comando system.exit(0); que simplesmente funciona como uma sa�da do
			 * sistema ou como se o pc fosse desligado da tomada*/
		}

	}
}
