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
public final class Arma extends Item {
    private Integer dano;

    public Arma() {
    }

    public Arma(Integer dano) {
        this.dano = dano;
    }

    public Arma(Integer dano, Integer id, String nome, Integer quantidade, Integer valor) {
        super(id, nome, quantidade, valor);
        this.dano = dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDano() {
        return dano;
    }
}
