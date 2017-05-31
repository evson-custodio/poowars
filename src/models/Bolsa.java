/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evson
 */
public class Bolsa {
    private Integer gold;
    private List<Item> itens;

    public Bolsa() {
        
    }

    public Bolsa(Integer gold, List<Item> itens) {
        this.gold = gold;
        this.itens = itens;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getGold() {
        return gold;
    }
    
    public void addItem(Item item) {
        if(this.itens == null) {
            this.itens = new ArrayList<>();
        }
        
        if(this.itens.contains(item)) {
            item.setQuantidade(item.getQuantidade() + 1);
        } else {
            this.itens.add(item);
        }
    }
    
    public void removeItem(Item item) {
        
    }
}
