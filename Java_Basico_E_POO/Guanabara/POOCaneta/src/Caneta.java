
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status(){
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tampada ? " + this.tampada);
		System.out.println("Com carga " + this.carga);
		System.out.println("De ponta " + this.ponta);
		System.out.println("Do modelo " + this.modelo);
	}
	
	void rabiscar(){
		if(this.tampada == true){
			System.out.println("ERRO! Não posso rabiscar.");
		}else{
			System.out.println("Estou rabiscando.");
		}
	}
	
	void tampar(){
		this.tampada = true;
	}
	
	void destampar(){
		this.tampada = false;
	}
}
