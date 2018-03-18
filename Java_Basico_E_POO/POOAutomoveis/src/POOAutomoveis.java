
public class POOAutomoveis {
	public static void main(String [] args){
		Automoveis carro1 = new Automoveis();
		carro1.modelo = "Grand Siena";
		carro1.fabricante = "FIAT";
		carro1.cor = "Preto";
		carro1.ano = 2017;
		carro1.preço = 43.590f;
		carro1.status();
		
		Automoveis carro2 = new Automoveis();
		carro2.modelo = "Celta";
		carro2.fabricante = "Chevrolet";
		carro2.cor = "Azul";
		carro2.ano = 2010;
		carro2.preço = 15.500f;
		carro2.status();
		
		Automoveis carro3 = new Automoveis();
		carro3.modelo = "Corolla";
		carro3.fabricante = "Toyota";
		carro3.cor = "Prata";
		carro3.ano = 2015;
		carro3.preço = 51.290f;
		carro3.status();
	}
}
