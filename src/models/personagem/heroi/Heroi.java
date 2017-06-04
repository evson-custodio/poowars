/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.personagem.heroi;

import models.Bolsa;
import models.personagem.Personagem;

/**
 *
 * @author evson
 */
public abstract class Heroi extends Personagem {
    protected Integer maxExperiencia;

    public Heroi() {
    }

    public Heroi(Integer id, String nome, Integer experiencia, Integer nivel, Integer saude, Integer dano, Integer defesa, Bolsa bolsa, Integer maxExperiencia) {
        super(id, nome, experiencia, nivel, saude, dano, defesa, bolsa);
        this.maxExperiencia = maxExperiencia;
    }
    
    public void passarNivel() {
        if (experiencia >= maxExperiencia) {
            nivel++;
        }
    }
}
