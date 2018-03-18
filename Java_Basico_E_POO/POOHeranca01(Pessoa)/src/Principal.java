
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado e = new Empregado ("Italo", "Av. Campos Salles", "889929", 2, 1000, 20);
		e.status();
		e.aumentarSalario(20);
		
		Fornecedor f = new Fornecedor("David", "Mangabeira", "839956", 500, 400);
		f.status();
		f.obterSaldo();
	}

}
