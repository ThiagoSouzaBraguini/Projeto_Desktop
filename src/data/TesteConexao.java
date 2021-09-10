package data;

import java.sql.PreparedStatement;
/**
 *
 * @author Thiago
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            System.out.println("Conexão OK");
            System.out.println("Inserindo dados na tabela pessoa");
            String sql="Insert into pessoa(codigo_pessoa,nome_pessoa,email_pessoa)"
                    +"values('159','RONALDO','Ronaldo@gmail.com')";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            if(ps.executeUpdate()>0)
                System.out.println("Gravado!");
            else
                System.out.println("Não foi possível atualizar.");
        } catch (Exception e) {
            System.out.println("Erro na conexão: "+e.getMessage());
        }
    }
}
