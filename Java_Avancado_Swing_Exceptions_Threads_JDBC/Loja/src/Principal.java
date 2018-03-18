
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Livro livro;
		try {
			livro = new Livro(500, "Harry Potter", "JK");
			livro.valorDesconto();
		} catch (PrecoNegException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CD cd;
		try {
			cd = new CD(-100, "Nirvana", 16);
			cd.valorDesconto();
		} catch (PrecoNegException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
