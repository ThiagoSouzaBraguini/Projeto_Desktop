/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Venda {
  
    private ArrayList<VendaProduto>venda_produto;
    private int codigo_vendas;
    private int codigo_cliente;
    private String nome_cliente;

    public Venda(ArrayList<VendaProduto> venda_produto, int codigo_vendas, int codigo_cliente, String nome_cliente) {
        this.venda_produto = venda_produto;
        this.codigo_vendas = codigo_vendas;
        this.codigo_cliente = codigo_cliente;
        this.nome_cliente = nome_cliente;
    }

    public Venda() {
        venda_produto = new ArrayList();
        nome_cliente = new String();
        codigo_cliente =0;
        codigo_vendas = 0;
    }
   
    public void addItem(VendaProduto item){
      venda_produto.add(item);
    }    

    public ArrayList<VendaProduto> getVenda_produto() {
        return venda_produto;
    }

    public void setVenda_produto(ArrayList<VendaProduto> venda_produto) {
        this.venda_produto = venda_produto;
    }

    public int getCodigo_vendas() {
        return codigo_vendas;
    }

    public void setCodigo_vendas(int codigo_vendas) {
        this.codigo_vendas = codigo_vendas;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
}
