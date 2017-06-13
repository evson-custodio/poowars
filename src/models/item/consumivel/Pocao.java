/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.item.consumivel;

import models.item.Item;

/**
 *
 * @author evson
 */
public final class Pocao extends Item {
    private Integer cura;

    public Pocao() {
    }

    public Pocao(Integer cura) {
        this.cura = cura;
    }

    public Pocao(Integer cura, Integer id, String nome, Integer quantidade, Integer valor) {
        super(id, nome, quantidade, valor);
        this.cura = cura;
    }

    public void setCura(Integer cura) {
        this.cura = cura;
    }

    public Integer getCura() {
        return cura;
    }
}
