import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
	
public class CarroDAO implements IDAOGeneric{

	@Override
	public void inserir(Object o) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("insert into projeto_av2(placa, chassi, cor, modelo, marca, ano) values(?,?,?,?,?,?)");
			Carro c = (Carro) o;
			ps.setString(1, c.getPlaca());
			ps.setLong(2, c.getChassi());
			ps.setString(3, c.getCor());
			ps.setString(4, c.getModelo());
			ps.setString(5, c.getMarca());
			ps.setInt(6, c.getAno());
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
	@Override
	public ArrayList<Carro> listar() {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		String sql = "select * from projeto_av2";
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			//PreparedStatement ps = conn.prepareStatement("select * from projeto_av2");
			ps.execute();
			ResultSet rs = ps.executeQuery();
			Carro c = new Carro();
			if(rs.next() == false) {
				//System.out.println("Não existem valores para listar");
				return null;
			}else if(rs.next() == true) {
				while(rs.next()) {
					/*ps.setString(1, c.getPlaca());
					ps.setLong(2, c.getChassi());
					ps.setString(3, c.getCor());
					ps.setString(4, c.getModelo());
					ps.setString(5, c.getMarca());
					ps.setInt(6, c.getAno());*/
					c.setPlaca(rs.getString("placa"));
					c.setChassi(rs.getLong("chassi"));
					c.setCor(rs.getString("cor"));
					c.setMarca(rs.getString("marca"));
					c.setModelo(rs.getString("modelo"));
					c.setAno(rs.getInt("ano"));
					carros.add(c);
					//System.out.println("Placa: " + c.getPlaca() + "/n Chassi: " + c.getChassi() + "/n Cor: " + c.getCor() + 
					//		"/n Modelo: " + c.getModelo() + "/n Marca: " + c.getMarca() + "/n Ano: " + c.getAno());
					
				}
			}
			ps.close();
			rs.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return carros;
	}
	
	@Override
	public void deletar(long chassi) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("delete from projeto_av2 where chassi = ?");
			ps.setLong(1, chassi);
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void atualizar(long chassi, Carro c) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("update projeto_av2 set placa = ?, chassi = ?, "
					+ "cor = ?, modelo = ?, marca = ?, ano = ? where chassi = chassi");
			ps.setString(1, c.getPlaca());
			ps.setLong(2, c.getChassi());
			ps.setString(3, c.getCor());
			ps.setString(4, c.getModelo());
			ps.setString(5, c.getMarca());
			ps.setInt(6, c.getAno());
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}


}
