package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class Conexao {
  private Connection con;
    public Connection getConexao(){
        return con;
        
    }
    
    public Conexao()throws SQLException, ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/projetolp1?zeroDateTimeBehavior=convertToNull";
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        con = DriverManager.getConnection(url,"root","Thiago123");
    }
}