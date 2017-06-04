/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.item.equipamento;

import models.item.Item;
import models.personagem.heroi.Heroi;

/**
 *
 * @author evson
 */
public final class Arma extends Item implements Equipamento<Heroi> {
    private Integer dano;

    public Arma() {
    }

    public Arma(Integer id, String nome, Integer quantidade, Integer valor, Integer dano) {
        super(id, nome, quantidade, valor);
        this.dano = dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDano() {
        return dano;
    }

    @Override
    public boolean equipar(Heroi heroi) {
        return true;
    }

    @Override
    public boolean desequipar(Heroi heroi) {
        return true;
    }
}
