/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.item.equipamento;

import models.item.Item;

/**
 *
 * @author evson
 */
public final class Armadura extends Item {
    private Integer defesa;

    public Armadura() {
    }

    public Armadura(Integer defesa) {
        this.defesa = defesa;
    }

    public Armadura(Integer defesa, Integer id, String nome, Integer quantidade, Integer valor) {
        super(id, nome, quantidade, valor);
        this.defesa = defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getDefesa() {
        return defesa;
    }
}
