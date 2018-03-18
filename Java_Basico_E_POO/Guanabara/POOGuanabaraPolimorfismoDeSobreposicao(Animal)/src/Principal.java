
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero m = new Mamifero();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		m.setPeso(5.70f);
		m.setIdade(8);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		c.setPeso(55.30f);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		
		k.setPeso(3.94f);
		k.setIdade(5);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.abanarRabo();
		
	}	
}
