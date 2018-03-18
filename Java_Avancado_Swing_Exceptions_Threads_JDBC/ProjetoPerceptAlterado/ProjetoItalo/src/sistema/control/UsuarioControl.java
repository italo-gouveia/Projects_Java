package sistema.control;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import sistema.conexao.conexao;

public class UsuarioControl {
  
 public void InsereDados(String nome, String sobrenome, String email, String senha, String confirmarsenha){
  conexao percep = new conexao();
  String retorno = "erro";
  try {
   //Se conecta com o banco
   Connection ExConn = (Connection) percep.abrirBDConn();
   //Prepara o SQL para conexão
   String sql = "insert into percep (nome, sobrenome, email, senha, confirmarSenha) VALUES (?,?,?,?,?)";
   PreparedStatement stmt = (PreparedStatement) ExConn.prepareStatement(sql);
   
   //insere o atributo pedido no programa dentro do banco de dados
   //no seu atributo relacionado, o primeiro, seria a primeira interrogação que é o nome e assim por diante
   stmt.setString(1, nome);
   stmt.setString(2, sobrenome);
   stmt.setString(3, email);
   stmt.setString(4, senha);
   stmt.setString(5, confirmarsenha); 
   
   stmt.executeUpdate();
   stmt.close();
   JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!!!");

  }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!");
  }
 }
} 