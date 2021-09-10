package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author Thiago
 */
public class FuncionarioData extends Conexao{
    public FuncionarioData()throws SQLException,ClassNotFoundException{}
    public boolean incluir(Funcionario obj)throws Exception{
        String sql ="Insert into funcionario(codigo_funcionario,nome_funcionario,email_funcionario,usuario_funcionario,senha_funcionario) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getCodigo());
        ps.setString(2,obj.getNome());
        ps.setString(3,obj.getEmail());
        ps.setString(4,obj.getUsuario());
        ps.setString(5,obj.getSenha());
        
        return ps.executeUpdate()>0;    
    }
    
    
    public Funcionario validarFuncionario(String usuario,String senha) throws SQLException,ClassNotFoundException{
        String Sql ="SELECT * FROM funcionario WHERE usuario_funcionario =? AND senha_funcionario=?";
        PreparedStatement ps = getConexao().prepareStatement(Sql);
        ps.setString(1,usuario);
        ps.setString(2,senha);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Funcionario obj = new Funcionario();
            obj.setCodigo(rs.getInt("codigo_funcionario"));
            obj.setNome(rs.getString("nome_funcionario"));
            obj.setEmail(rs.getString("email_funcionario"));
            obj.setUsuario(rs.getString("usuario_funcionario"));
            obj.setSenha(rs.getString("senha_funcionario"));
            return obj;
        }
        else return null;
    }
}