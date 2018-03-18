
public class POO1 {

	public static void main(String []args){
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.carga = 90;
		c1.ponta = 0.7f;
		c1.modelo = "Bic";
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.carga = 70;
		c2.ponta = 0.5f;
		c2.modelo = "Compactor";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
}
