
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio do programa");
		try{
			float divisao = 28/15;
			System.out.println(divisao);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim do programa");
		
	}

}
