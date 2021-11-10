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
}