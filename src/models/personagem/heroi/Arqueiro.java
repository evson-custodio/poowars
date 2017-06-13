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
public final class Arqueiro extends Heroi {
    private Integer precisao;

    public Arqueiro() {
    }

    public Arqueiro(Integer precisao) {
        this.precisao = precisao;
    }

    public Arqueiro(Integer precisao, Integer expMax, Arma arma, Armadura armadura) {
        super(expMax, arma, armadura);
        this.precisao = precisao;
    }

    public Arqueiro(Integer precisao, Integer expMax, Arma arma, Armadura armadura, Integer id, String nome, Integer exp, Integer nivelMax, Integer nivel, Integer saudeMax, Integer saude, Integer dano, Integer defesa, Bolsa bolsa) {
        super(expMax, arma, armadura, id, nome, exp, nivelMax, nivel, saudeMax, saude, dano, defesa, bolsa);
        this.precisao = precisao;
    }

    public void setPrecisao(Integer precisao) {
        this.precisao = precisao;
    }

    public Integer getPrecisao() {
        return precisao;
    }
}
