
public class CriandoNewException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros =  {4, 5, 8, 16, 15, 32, 64, 128};
		int [] denominadores = {2, 4, 0, 4, 8, 10, 0};
		
		for(int i=0; i < numeros.length; i++){
			try{
				if(numeros[i] % 2 !=0){
					//lançar a exceção aqui
					throw new Exception(
							"Número impar, impossível divisão exata(inteira) por par");
				}
				//utilizando o código acima, criamos uma nova exceção
				System.out.println(numeros[i] + "/" + denominadores[i] 
						+ " = " + (numeros[i]/denominadores[i]));
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
		}
	}
}
