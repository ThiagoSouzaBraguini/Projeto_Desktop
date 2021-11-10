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
public class VendaProduto {
    private int codigo_venda;
    private int codigo_produto;
    private double preco_produto;
    private String nome_produto;

    public VendaProduto() {
    }

    public VendaProduto(int codigo_venda, int codigo_produto, String nome_produto) {
        this.codigo_venda = codigo_venda;
        this.codigo_produto = codigo_produto;
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public int getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(int codigo_venda) {
        this.codigo_venda = codigo_venda;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
    
    
}
