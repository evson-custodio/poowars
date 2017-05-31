/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author evson
 */
public abstract class Item {
    protected Integer idItem;
    protected Integer quantidade;
    protected Integer valor;

    public Item() {
        
    }

    public Item(Integer idItem, Integer quantidade, Integer valor) {
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getValor() {
        return valor;
    }

    
    

}
