/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thiago
 */
public class Produto {

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    private double preco;
    private int codigo;
    private String nome;
    
    
    public Produto(int preco, int codigo, String nome) {
        this.preco = preco;
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public Produto(){
        codigo = 0;
        preco = 0;
        nome = new String();
 
    }
}
