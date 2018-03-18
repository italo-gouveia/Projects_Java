import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientDAO implements IDAOGeneric{
	//this method is used in the insertion of informations on database
	@Override
	public void insert(Object o) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("insert into tb_customer_account(cpf_cnpj, nm_customer, is_active, vl_total) values(?,?,?,?)");
			Client c = (Client) o;
			ps.setString(1, c.getCpf_cnpj());
			ps.setString(2, c.getName());
			ps.setBoolean(3, c.isActive());
			ps.setFloat(4, c.getBalance());
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//this method is used in the consult of informations on database and verify the average of clients whose id is greater than 1500
	//and less than 2700 and whose balance is greater than 560
	@Override
	public void consult() {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("select * from tb_customer_account");
			ps.execute();
			ResultSet rs = ps.executeQuery();
			
			float counterValue = 0;
			float counterQuantity = 0;
			float average;
			ArrayList<Client> listClients = new ArrayList<Client>();
			Client clientModel = new Client();
			
			while(rs.next()) {
				clientModel.setId(rs.getInt("id_customer"));
				clientModel.setName(rs.getString("nm_customer"));
				clientModel.setCpf_cnpj(rs.getString("cpf_cnpj"));
				clientModel.setActive(rs.getBoolean("is_active"));
				clientModel.setBalance(rs.getFloat("vl_total"));
				
				if(clientModel.getId() >= 1500 && clientModel.getId() <= 2700 && clientModel.getBalance() >= 560) {
					counterValue += clientModel.getBalance();
					counterQuantity += 1;
					listClients.add(clientModel);
					System.out.println("Id: " + clientModel.getId() + " Name: " + clientModel.getName() + " CPF/CNPJ: " + clientModel.getCpf_cnpj() + 
							" Is Active: " + clientModel.isActive() + " Value totally: " + clientModel.getBalance());
				}
			}

			average = (counterValue / counterQuantity);
			System.out.println("The final average of the clients whose id is greater than 1500 "
					+ "and less than 2700 and whose balance is greater than 560 is: " + average);			

		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
