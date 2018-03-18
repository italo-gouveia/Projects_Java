import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//for this connection with the database is necessarious a server(Wampserver or Xampp) installed in localhost 
	//or configure manually the link for the database 
	public Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection
				("jdbc:mysql://localhost:3308/client_balance?useSSL=false", "root", "");
	}
	
}
