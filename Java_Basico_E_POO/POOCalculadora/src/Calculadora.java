
public class Calculadora {
	int numero1;
	int numero2;
	
	void retornaSoma(){
		System.out.println("A soma dos valores é " + (this.numero1 + this.numero2));
	}
	void retornaMultiplicacao(){
		System.out.println("A multiplicação dos valores é " + (this.numero1*this.numero2));
	}
	void insereValores(int numero1, int numero2){
		this.numero1=numero1;
		this.numero2=numero2;
	}
}
