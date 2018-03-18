
public class ClasseDebbuger {

	public static void main(String[] args) {
		IngressoDAO iDAO = new IngressoDAO();
		
		//iDAO.inserir(new Ingresso("A", 1, false, 1245, true));
		
		for(Ingresso i: iDAO.listar()) {
			System.out.println("Id: " + i.getId() + "/n Fileira e Coluna: " + i.getFileira_Coluna() + 
					"/n Estudante: " + i.isEstudante() + "/n Número Carteira: " + i.getNumeroCarteira() + "/n Flag(Vendida): " + i.isFlag_vendida());
		}
		iDAO.listar();
		
		//Ingresso i = new Ingresso("B", 2, true, 1564, true);
		//iDAO.atualizar(1, i);
		//iDAO.deletar(1);
		
	}
}
