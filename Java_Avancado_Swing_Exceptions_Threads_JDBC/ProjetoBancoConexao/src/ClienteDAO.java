import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO implements IDAOGenerico{

	@Override
	public void inserir(Object o) {
		
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("insert into cliente(nome,idade, cpf) values(?,?,?)");
			Cliente c = (Cliente) o;
			ps.setString(1, c.getNome());
			ps.setInt(2, c.getIdade());
			ps.setLong(3, c.getCpf());
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	

}
