package model;


/**
 *
 * @author Thiago
 */
public class Funcionario{
    
    private int codigo;
    private String usuario;
    private String senha;
    private String nome;
    private String email;

    public Funcionario(int codigo,String usuario, String senha,String nome, String email) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
    }

    public Funcionario() {
        codigo = 0;
        usuario = new String();
        senha = new String();
        nome = new String();
        email = new String();
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
