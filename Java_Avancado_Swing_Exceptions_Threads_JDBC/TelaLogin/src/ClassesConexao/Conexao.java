package ClassesConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	//private static String caminho = "jdbc:mysql://localhost/db_senhas";
	//private static String usuario = "root";
	//private static String senha = "";
	
	public static Connection conexaoBanco() throws SQLException{
		
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		
		//return DriverManager.getConnection(caminho, usuario, senha);
		return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas", "root", "");
		
		}catch(ClassNotFoundException ce){
			throw new SQLException(ce.getException());
		}
	}
}
