import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngressoDAO implements IDAOGeneric{

	@Override
	public void inserir(Object o) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("insert into projeto_final(fileira_coluna, estudante, numeroCarteira, flag_vendida) values(?,?,?,?)");
			Ingresso i = (Ingresso) o;
			ps.setString(1, i.getFileira_Coluna());
			ps.setBoolean(2, i.isEstudante());
			ps.setLong(3, i.getNumeroCarteira());
			ps.setBoolean(4, i.isFlag_vendida());
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public ArrayList<Ingresso> listar() {
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		String sql = "select * from projeto_final";
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ResultSet rs = ps.executeQuery();
			Ingresso i = new Ingresso();
			if(rs.next() == false) {
				System.out.println("Não existem valores para listar");
				return null;
			}else if(rs.next() == true) {
				while(rs.next()) {
					i.setId(rs.getLong("id"));
					i.setFileira_Coluna(rs.getString("fileira_coluna"));
					i.setEstudante(rs.getBoolean("estudante"));
					i.setNumeroCarteira(rs.getLong("numeroCarteira"));
					i.setFlag_vendida(rs.getBoolean("flag_vendida"));
					ingressos.add(i);
					//System.out.println("Id: " + i.getId() + "/n Fileira: " + i.getFileira() + "/n Coluna: " + i.getColuna() + 
					//		"/n Estudante: " + i.isEstudante() + "/n Número Carteira: " + i.getNumeroCarteira() + "/n Flag(Vendida): " + i.isFlag_vendida());
					
				}
			}
			ps.close();
			rs.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return ingressos;
		
	}

	@Override
	public void deletar(long id) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("delete from projeto_final where id = ?");
			ps.setLong(1, id);
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void atualizar(long id, Ingresso i) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("update projeto_final set fileira_coluna = ?, "
					+ "estudante = ?, numeroCarteira = ?, flag_vendida = ? where id = id");
			ps.setString(1, i.getFileira_Coluna());
			ps.setBoolean(2, i.isEstudante());
			ps.setLong(3, i.getNumeroCarteira());
			ps.setBoolean(4, i.isFlag_vendida());
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
