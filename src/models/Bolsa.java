/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
        if (item != null) {
            if (itens == null) {
                itens = new HashMap<>();
            }
            Item other = itens.get(item.getId());
            if (other != null) {
                other.setQuantidade(other.getQuantidade() + item.getQuantidade());
            }
            else {
                itens.put(item.getId(), item);
            }
        }
    }
    
    public void removeItem(Item item) {
        if (item != null) {
            if (itens != null) {
                Item other = itens.get(item.getId());
                if (other != null) {
                    other.setQuantidade(other.getQuantidade() - item.getQuantidade());
                }
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bolsa other = (Bolsa) obj;
        return Objects.equals(this.id, other.id);
    }
}
