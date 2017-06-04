/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;
import models.item.Item;

/**
 *
 * @author evson
 */
public final class Bolsa {
    private Integer id;
    private Integer gold;
    private Map<Integer, Item> itens;

    public Bolsa() {
    }

    public Bolsa(Integer id, Integer gold, Map<Integer, Item> itens) {
        this.id = id;
        this.gold = gold;
        this.itens = itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public void setItens(Map<Integer, Item> itens) {
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGold() {
        return gold;
    }

    public Map<Integer, Item> getItens() {
        return itens;
    }
    
    public void addItem(Item item) {
        try {
            if (itens == null) {
                itens = new HashMap<>();
            }
            
            Item i = itens.get(item.getId());
            i.setQuantidade(i.getQuantidade() + item.getQuantidade());
        }
        catch(NullPointerException ex) {
            itens.put(item.getId(), item);
        }
    }
    
    public void removeItem(Item item) {
        try {
            if (itens != null) {
                Item i = itens.get(item.getId());
                i.setQuantidade(i.getQuantidade() - item.getQuantidade());
            }
        }
        catch(NullPointerException ex) {
            System.out.println("O item não existe na sua bolsa: " + ex);
        }
    }
    
    public boolean comprar(Bolsa bolsa, Item item) {
        int valorTotal = item.getValor() * item.getQuantidade();
        if (gold >= valorTotal) {
            gold -= valorTotal;
            bolsa.setGold(bolsa.getGold() + valorTotal);
            this.addItem(item);
            bolsa.removeItem(item);
            return true;
        }
        
        return false;
    }
}
