
public class CriandoNewException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros =  {4, 5, 8, 16, 15, 32, 64, 128};
		int [] denominadores = {2, 4, 0, 4, 8, 10, 0};
		
		for(int i=0; i < numeros.length; i++){
			try{
				if(numeros[i] % 2 !=0){
					//lan�ar a exce��o aqui
					throw new Exception(
							"N�mero impar, imposs�vel divis�o exata(inteira) por par");
				}
				//utilizando o c�digo acima, criamos uma nova exce��o
				System.out.println(numeros[i] + "/" + denominadores[i] 
						+ " = " + (numeros[i]/denominadores[i]));
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}
