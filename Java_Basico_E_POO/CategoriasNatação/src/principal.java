import java.util.Scanner;
public class principal {
	public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);
	int idade;
	
	System.out.println("Digite a idade do nadador: ");
	idade = teclado.nextInt();
	
	if (idade >= 5 && idade <= 7){
		System.out.println("A categoria do atleta � a infantil! ");
	}else{
		if(idade >= 8 && idade <= 10){
			System.out.println("A categoria do atleta � a juvenil! ");
		}else{
			if(idade >= 11 && idade <= 15){
				System.out.println("A categoria do atleta � a dos adolescentes! ");
			}else{
				if(idade >= 16 && idade <=30){
					System.out.println("A categoria do atleta � a dos adultos! ");
				}else{
					if(idade > 30){
						System.out.println("A categoria do atleta � a de s�nior! ");
					}else{
						if(idade < 5){
							System.out.println("Sinto muito. N�o s�o permitidas crian�as abaixo de 5 anos! ");
						}
					}
				}
			}
		}
	}
	}
	
}
