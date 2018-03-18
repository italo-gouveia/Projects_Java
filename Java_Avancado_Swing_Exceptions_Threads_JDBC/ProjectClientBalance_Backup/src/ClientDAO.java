import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class ClientDAO implements IDAOGeneric<Client>{
	
	//this method is used in the insertion of informations on database
	@Override
	public void insert(Client c) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = 
					conn.prepareStatement("insert into tb_customer_account(cpf_cnpj, nm_customer, is_active, vl_total) values(?,?,?,?)");
			Client c1 = new Client();
			ps.setString(1, c1.getCpf_cnpj());
			ps.setString(2, c1.getName());
			ps.setBoolean(3, c1.isActive());
			ps.setFloat(4, c1.getBalance());
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//this method is used in the consult of informations on database and verify the average of clients whose id is greater than 1500
	//and less than 2700 and whose balance is greater than 560
	@Override
	public ArrayList<Client> consult() {
		try(Connection conn = new ConnectionFactory().getConnection()){
			String sql = "select * from tb_customer_account";
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.execute();
			ResultSet rs = ps.executeQuery();
			
			float counterValue = 0;
			float counterQuantity = 0;
			float average;
			ArrayList<Client> listClients = new ArrayList<Client>();

			
			while(rs.next()) {
				Client clientModel = new Client();
				clientModel.setId(rs.getInt("id_customer"));
				clientModel.setName(rs.getString("nm_customer"));
				clientModel.setCpf_cnpj(rs.getString("cpf_cnpj"));
				clientModel.setActive(rs.getBoolean("is_active"));
				clientModel.setBalance(rs.getFloat("vl_total"));
				//listClients.add(clientModel);
				//consult().add(clientModel);
				
				/*int id = rs.getInt("id_customer");
				String name = rs.getString("nm_customer");
				String cpf_cnpj = rs.getString("cpf_cnpj");
				boolean is_active = rs.getBoolean("is_active");
				float balance = rs.getFloat("vl_total");*/
				
				if(clientModel.getId() >= 1500 && clientModel.getId() <= 2700 && clientModel.getBalance() >= 560) {
					counterValue += clientModel.getBalance();
					counterQuantity += 1;
					listClients.add(clientModel);
				}
				/*if(id >= 1500 && id <= 2700 && balance >= 560) {
					counterValue += balance;
					counterQuantity += 1;
					System.out.println("Id: " + id + " Name: " + name + " CPF/CNPJ: " + cpf_cnpj + 
							" Is Active: " + is_active + " Value totally: " + balance);
				}*/
			}
			
			average = (counterValue / counterQuantity);
			System.out.println("The final average of the clients whose id is greater than 1500 "
					+ "and less than 2700 and whose balance is greater than 560 is: " + average);
			
			/*Collections.sort(listClients);
			for(int i = 0; i < listClients.size(); i++) {
				Client aux = listClients.get(i);
				System.out.println("Id: " + aux.getId() + " Name: " + aux.getName() + " CPF/CNPJ: " + aux.getCpf_cnpj() + 
						" Is Active: " + aux.isActive() + " Value totally: " + aux.getBalance());
			}*/
			ps.close();
			rs.close();
			return listClients;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}


}
