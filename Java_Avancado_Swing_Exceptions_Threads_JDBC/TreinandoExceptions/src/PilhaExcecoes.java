
public class PilhaExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do main");
	}

	static void metodo1(){
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	static void metodo2(){
		System.out.println("Inicio do metodo2");
		int vetor[] = new int[4];
		System.out.println("Antes da exceção");
		vetor[5] = 1;
		System.out.println("Depois da exceção");
		System.out.println("Fim do metodo2");
	}
}
