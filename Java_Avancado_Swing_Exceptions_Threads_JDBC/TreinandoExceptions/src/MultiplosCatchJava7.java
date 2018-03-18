
public class MultiplosCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros =  {4, 8, 16, 32, 64, 128};
		int [] denominadores = {2, 0, 4, 8, 0};
		
		for(int i=0; i < numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + denominadores[i] 
						+ " = " + (numeros[i]/denominadores[i]));
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e1){
				System.out.println("Erro de aritmética ou de indice");
			}
			//A partir do Java 7 pode-se colocar vários tipos de exeções dentro de um único catch
		}
		
	}
}
