package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Thiago
 */
public class ProdutoData extends Conexao{
    public ProdutoData()throws SQLException,ClassNotFoundException{
        super();
    }
    public boolean incluir(Produto obj)throws Exception{
        String sql ="Insert into produto(codigo_produto,nome_produto,preco_produto) values(?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getCodigo());
        ps.setString(2,obj.getNome());
        ps.setDouble(3,obj.getPreco());
        
        return ps.executeUpdate()>0;    
    }
    
    public Produto produto(int codigo)throws Exception{
        String sql = "Select * from produto where codigo_produto = " + codigo;
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Produto pro = new Produto(rs.getInt("preco_produto"), rs.getInt("codigo_produto"),rs.getString("nome_produto"));
            return pro ;       
        }
        return null;
    }
    
        public boolean editar(Produto obj)throws Exception{
        String sql ="Update produto set nome_produto=?, preco_produto=?"
                + " where codigo_produto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setDouble(2,obj.getPreco());
        ps.setInt(3, obj.getCodigo());
        return ps.executeUpdate()>0;
    }
        
        public boolean excluir(int codigo)throws Exception{
        String sql ="Delete from produto where codigo_produto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,codigo);
        return ps.executeUpdate()>0;
    }
    
        public ArrayList<Produto> pesquisar (String pesq)throws Exception{
        ArrayList<Produto> lista = new ArrayList<>();
        String sql="select * from produto where nome_produto like '"+pesq+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Produto obj =  new Produto(rs.getDouble("preco_produto"),rs.getInt("codigo_produto"),rs.getString("nome_produto"));
            lista.add(obj);
        }
        return lista;
    }
    
}