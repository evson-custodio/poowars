/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.personagem.heroi;

import models.Bolsa;
import models.item.equipamento.Arma;
import models.item.equipamento.Armadura;

/**
 *
 * @author evson
 */
public final class Guerreiro extends Heroi {
    private Integer rage;

    public Guerreiro() {
    }

    public Guerreiro(Integer rage) {
        this.rage = rage;
    }

    public Guerreiro(Integer rage, Integer expMax, Arma arma, Armadura armadura) {
        super(expMax, arma, armadura);
        this.rage = rage;
    }

    public Guerreiro(Integer rage, Integer expMax, Arma arma, Armadura armadura, Integer id, String nome, Integer exp, Integer nivelMax, Integer nivel, Integer saudeMax, Integer saude, Integer dano, Integer defesa, Bolsa bolsa) {
        super(expMax, arma, armadura, id, nome, exp, nivelMax, nivel, saudeMax, saude, dano, defesa, bolsa);
        this.rage = rage;
    }

    public void setRage(Integer rage) {
        this.rage = rage;
    }

    public Integer getRage() {
        return rage;
    }
}
