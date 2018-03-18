
public class Principal {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(1, "A");
		Usuario u2 = new Usuario(2, "B");
		Usuario u3 = new Usuario(3, "C");
		
		Leilao l = new Leilao();
		
		Lance l1 = new Lance(400, u1);
		Lance l2 = new Lance(800, u2);
		Lance l3 = new Lance(250, u3);
		
		l.propor(l1);
		l.propor(l2);
		l.propor(l3);
		
		Avaliador leiloeiro = new Avaliador();
		float maior = leiloeiro.avaliar(l);
		
		System.out.println(maior);
	}

}
