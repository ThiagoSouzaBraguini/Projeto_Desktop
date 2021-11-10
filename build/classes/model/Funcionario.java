package model;


/**
 *
 * @author Thiago
 */
public class Funcionario extends Cliente{
    
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario(String usuario, String senha, int codigo, String nome, String email) {
        super(codigo, nome, email);
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario() {
        usuario = new String();
        senha = new String();
    }
    
   
}
