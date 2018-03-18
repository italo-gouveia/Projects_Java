package sistema.control;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import sistema.conexao.conexao;

public class UsuarioControl {
  
 public void InsereDados(String nome, String sobrenome, String email, String senha, String confirmarsenha){
  conexao percep = new conexao();
  String retorno = "erro";
  try {
    
   Connection ExConn = (Connection) percep.abrirBDConn();
   Statement stmt = (Statement) ExConn.createStatement();
   String sSQL = "INSERT INTO cadastro.percep VALUES (null,'"+nome+"','"+sobrenome+"','"+email+"','"+senha+"',"+
   ",'"+confirmarsenha+"');";
   System.out.println(sSQL);
   
   boolean res = stmt.execute(sSQL);
    
   JOptionPane.showMessageDialog(null,(!res)?"Dados inseridos com sucesso!!!":"" +
    "Os dados não puderam ser inseridos!!!");
   stmt.close();
   percep.fecharBDConn();
  }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
  }
 }
} 