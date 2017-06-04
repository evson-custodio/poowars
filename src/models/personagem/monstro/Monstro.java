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

    public Monstro() {
    }
    
    public void droparBolsa(Bolsa bolsa) {
        bolsa.setGold(bolsa.getGold() + this.bolsa.getGold());
        for(Item i : this.bolsa.getItens().values()) {
            bolsa.addItem(i);
        }
    }
    
    public void droparExp(Heroi heroi) {
        heroi.setExperiencia(heroi.getExperiencia() + experiencia);
    }
}
