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
public class Armadura extends Item implements Equipamento<Heroi> {
    private Integer defesa;

    public Armadura() {
    }

    public Armadura(Integer id, String nome, Integer quantidade, Integer valor, Integer defesa) {
        super(id, nome, quantidade, valor);
        this.defesa = defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Integer getDefesa() {
        return defesa;
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
