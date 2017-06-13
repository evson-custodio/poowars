/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.personagem.heroi;

import models.Bolsa;
import models.item.equipamento.Arma;
import models.item.equipamento.Armadura;
import models.personagem.Personagem;

/**
 *
 * @author evson
 */
public abstract class Heroi extends Personagem {
    protected Integer expMax;
    protected Arma arma;
    protected Armadura armadura;

    public Heroi() {
    }

    public Heroi(Integer expMax, Arma arma, Armadura armadura) {
        this.expMax = expMax;
        this.arma = arma;
        this.armadura = armadura;
    }

    public Heroi(Integer expMax, Arma arma, Armadura armadura, Integer id, String nome, Integer exp, Integer nivelMax, Integer nivel, Integer saudeMax, Integer saude, Integer dano, Integer defesa, Bolsa bolsa) {
        super(id, nome, exp, nivelMax, nivel, saudeMax, saude, dano, defesa, bolsa);
        this.expMax = expMax;
        this.arma = arma;
        this.armadura = armadura;
    }

    public void setExpMax(Integer expMax) {
        this.expMax = expMax;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Integer getExpMax() {
        return expMax;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }
    
    public Integer passarNivel() {
        if (nivel != nivelMax) {
            if (exp >= expMax) {
                nivel++;
                expMax += (int)(expMax * 1.5);
            }
        }
        
        return expMax - exp;
    }
}
