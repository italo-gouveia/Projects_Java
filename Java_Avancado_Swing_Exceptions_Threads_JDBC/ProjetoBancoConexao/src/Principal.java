import java.sql.Connection;
import java.sql.SQLException;

public class Principal {
	
	public static void main(String[] args) {
		
//		try(Connection conn = new ConnectionFactory().getConnection()) {
//			
//			System.out.println("Conexão Ok!");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		ClienteDAO cDao = new ClienteDAO();
		
		cDao.inserir(new Cliente("Maria",50,12456));
		
	}

}
