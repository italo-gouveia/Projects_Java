import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner inString = new Scanner(System.in);
		Scanner inNum = new Scanner(System.in);
		
		Carro c1 = new Carro();
		c1.getMotor().setFabricante("Fiat");
		c1.getMotor().setPot�ncia(1000);
		c1.getMotor().setPre�o(3000);
		c1.getBancos().setFabricante("Renault");
		c1.getBancos().setModelo("Estofado");
		c1.getBancos().setPre�o(6000);
		c1.getPneus().setFabricante("Pirelli");
		c1.getPneus().setTipo("Liga leve");
		c1.getPneus().setPre�o(1000);
		c1.status();
		c1.precoCarro();
		
	}
}
