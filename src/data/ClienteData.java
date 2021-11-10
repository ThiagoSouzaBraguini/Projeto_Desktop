package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Funcionario;

/**
 * @author Thiago
 */
public class ClienteData extends Conexao{
    public ClienteData()throws SQLException,ClassNotFoundException{}
    public boolean incluir(Cliente obj)throws Exception{
        String sql ="Insert into pessoa(codigo_pessoa,nome_pessoa,email_pessoa) values(?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getCodigo());
        ps.setString(2,obj.getNome());
        ps.setString(3,obj.getEmail());
        
        return ps.executeUpdate()>0;
        /*if(ps.executeUpdate()>0){
            if(obj instanceof Funcionario){
                Funcionario fun = (Funcionario)obj;
                String sql2 = "Insert into funcionario(codigo_funcionario,nome_funcionario,email_funcionario,usuario_funcionario,senha_funcionario)"
                        + " values(?,?,?,?,?)";
                PreparedStatement ps2 = getConexao().prepareStatement(sql2);
                ps2.setInt(1,fun.getCodigo());
                ps2.setString(2,fun.getNome());
                ps2.setString(3,fun.getEmail());
                ps2.setString(4,fun.getUsuario());
                ps2.setString(5,fun.getSenha());
                if(ps2.executeUpdate()>0){
                    getConexao().commit();
                    return true;
                }
                else{
                    getConexao().rollback();
                }
                
            }
        }   
        return false;*/  
    }
    
    public boolean editar(Cliente obj)throws Exception{
        String sql ="Update pessoa set nome_pessoa=?,email_pessoa=?"
                + " where codigo_pessoa=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setString(2,obj.getEmail());
        ps.setInt(3, obj.getCodigo());
        return ps.executeUpdate()>0;
    }   
    
    public ArrayList<Cliente> pesquisar (String pesq)throws Exception{
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql="select * from pessoa where nome_pessoa like '"+pesq+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Cliente obj =  new Cliente(rs.getInt("codigo_pessoa"),rs.getString("nome_pessoa"),rs.getString("email_pessoa"));
            lista.add(obj);
        }
        return lista;
    }
    
    public Cliente pesquisaCli(int codigo)throws Exception{
        String sql = "Select * from pessoa where codigo_pessoa = " + codigo;
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Cliente cli = new Cliente(rs.getInt("codigo_pessoa"),rs.getString("nome_pessoa"),rs.getString("email_pessoa"));
            return cli;       
        }
        return null;
    }
    
        public boolean excluir(int codigo)throws Exception{
        String sql ="Delete from pessoa where codigo_pessoa=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,codigo);
        return ps.executeUpdate()>0;
    }
}


