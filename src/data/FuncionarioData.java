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
    
    public boolean editar(Funcionario obj)throws Exception{
        String sql ="Update funcionario set nome_funcionario=?,email_funcionario=?,usuario_funcionario=?,senha_funcionario=?"
                + " where codigo_funcionario=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setString(2,obj.getEmail());
        ps.setString(3,obj.getUsuario());
        ps.setString(4,obj.getSenha());
        ps.setInt(5, obj.getCodigo());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int codigo)throws Exception{
        String sql ="Delete from funcionario where codigo_funcionario=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,codigo);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<Funcionario> pesquisar (String pesq)throws Exception{
        ArrayList<Funcionario> lista = new ArrayList<>();
        String sql="select * from funcionario where nome_funcionario like '"+pesq+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Funcionario obj =  new Funcionario(rs.getInt("codigo_funcionario"),rs.getString("nome_funcionario"),rs.getString("email_funcionario"),
                    rs.getString("usuario_funcionario"),rs.getString("senha_funcionario"));
            lista.add(obj);
        }
        return lista;
    }
}