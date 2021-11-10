/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Venda;
import model.VendaProduto;

/**
 *
 * @author Thiago
 */
public class VendaData extends Conexao{
    public VendaData()throws SQLException,ClassNotFoundException{}
    public boolean incluir (Venda obj)throws Exception{
        getConexao().setAutoCommit(false);
        String sql = "Insert into vendas (codigo_venda,codigo_pessoa,nome_pessoa) values (?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getCodigo_vendas());
        ps.setInt(2, obj.getCodigo_cliente());
        ps.setString(3, obj.getNome_cliente());
        if(ps.executeUpdate()>0){
                int i = 0;
                for(VendaProduto ven: obj.getVenda_produto()){
                String sql2 = "Insert into venda_produto (codigo_venda,codigo_produto,nome_produto,preco_produto) values (?,?,?,?)";
                PreparedStatement ps2 = getConexao().prepareStatement(sql2);
                ps2.setInt(1,obj.getCodigo_vendas());
                ps2.setInt(2,ven.getCodigo_produto());
                ps2.setString(3,ven.getNome_produto());
                ps2.setDouble(4, ven.getPreco_produto());
                if(ps2.executeUpdate()==0) {
                    getConexao().rollback();
                    getConexao().setAutoCommit(true);
                    return false;
                    }
                }
            getConexao().commit();
            getConexao().setAutoCommit(true);
            return true;
        }
        return false;
    }
}
