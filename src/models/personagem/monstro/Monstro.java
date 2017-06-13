/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.personagem.monstro;

import models.Bolsa;
import models.item.Item;
import models.personagem.Personagem;
import models.personagem.heroi.Heroi;

/**
 *
 * @author evson
 */
public abstract class Monstro extends Personagem {
    public void droparBolsa(Heroi heroi) {
        if (heroi != null) {
            Bolsa bolsaHeroi = heroi.getBolsa();
            bolsaHeroi.setGold(bolsaHeroi.getGold() + this.bolsa.getGold());
            for(Item item : this.bolsa.getItens().values()) {
                bolsaHeroi.addItem(item);
            }
        }
    }
    
    public void droparExp(Heroi heroi) {
        if (heroi != null) {
            heroi.setExp(heroi.getExp() + this.exp);
        }
    }
}
