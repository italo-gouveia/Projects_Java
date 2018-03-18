import java.util.Scanner;

public class principal {

	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);
		float preço;
		int código;
		
		System.out.println("Digite o valor do produto: ");
		preço = teclado.nextFloat();
		
		System.out.println("Digite o código do produto (de 1 à 30): ");
		código = teclado.nextInt();
		
			if(código == 1){
				System.out.println("A procedência do produto é da Região Sul. Seu valor é de: " + preço + " Reais.");
			}else{
				if(código == 2){
					System.out.println("A procedência do produto é da Região Norte. Seu valor é de: " + preço + " Reais.");
				}else{
					if(código == 3){
						System.out.println("A procedência do produto é da Região Leste. Seu valor é de: " + preço + " Reais.");
					}else{
						if(código == 4){
							System.out.println("A procedência do produto é da Região Oeste. Seu valor é de: " + preço + " Reais.");
						}else{
							if(código >= 5 && código <= 6){
								System.out.println("A procedência do produto é da Região Nordeste. Seu valor é de: " + preço + " Reais.");
							}else{
								if(código >= 7 && código <= 9){
									System.out.println("A procedência do produto é da Região Sudeste. Seu valor é de: " + preço + " Reais.");
								}else{
									if(código >= 10 && código <= 20){
										System.out.println("A procedência do produto é da Região Centro-Oeste. Seu valor é de: " + preço + " Reais.");
									}else{
										if(código >= 21 && código <= 30){
											System.out.println("A procedência do produto é da Região Nordeste. Seu valor é de: " + preço + " Reais.");
										}else{
											System.out.println("O número digitado é inválido");
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