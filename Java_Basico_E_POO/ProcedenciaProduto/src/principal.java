import java.util.Scanner;

public class principal {

	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);
		float pre�o;
		int c�digo;
		
		System.out.println("Digite o valor do produto: ");
		pre�o = teclado.nextFloat();
		
		System.out.println("Digite o c�digo do produto (de 1 � 30): ");
		c�digo = teclado.nextInt();
		
			if(c�digo == 1){
				System.out.println("A proced�ncia do produto � da Regi�o Sul. Seu valor � de: " + pre�o + " Reais.");
			}else{
				if(c�digo == 2){
					System.out.println("A proced�ncia do produto � da Regi�o Norte. Seu valor � de: " + pre�o + " Reais.");
				}else{
					if(c�digo == 3){
						System.out.println("A proced�ncia do produto � da Regi�o Leste. Seu valor � de: " + pre�o + " Reais.");
					}else{
						if(c�digo == 4){
							System.out.println("A proced�ncia do produto � da Regi�o Oeste. Seu valor � de: " + pre�o + " Reais.");
						}else{
							if(c�digo >= 5 && c�digo <= 6){
								System.out.println("A proced�ncia do produto � da Regi�o Nordeste. Seu valor � de: " + pre�o + " Reais.");
							}else{
								if(c�digo >= 7 && c�digo <= 9){
									System.out.println("A proced�ncia do produto � da Regi�o Sudeste. Seu valor � de: " + pre�o + " Reais.");
								}else{
									if(c�digo >= 10 && c�digo <= 20){
										System.out.println("A proced�ncia do produto � da Regi�o Centro-Oeste. Seu valor � de: " + pre�o + " Reais.");
									}else{
										if(c�digo >= 21 && c�digo <= 30){
											System.out.println("A proced�ncia do produto � da Regi�o Nordeste. Seu valor � de: " + pre�o + " Reais.");
										}else{
											System.out.println("O n�mero digitado � inv�lido");
										}			
									}
								}
							}
						}		
					}
				}
			}
		}
	}