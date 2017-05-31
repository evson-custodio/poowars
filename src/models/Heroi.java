/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author evson
 */
public abstract class Heroi extends Personagem {
    private Integer maxExperiencia;

    public Heroi() {
        
    }

    public Heroi(Integer maxExperiencia) {
        this.maxExperiencia = maxExperiencia;
    }

    public Heroi(Integer maxExperiencia, String nome, Integer saude, Integer nivel, Integer experiencia, Integer dano, Integer defesa, Bolsa bolsa) {
        super(nome, saude, nivel, experiencia, dano, defesa, bolsa);
        this.maxExperiencia = maxExperiencia;
    }

    public void setMaxExperiencia(Integer maxExperiencia) {
        this.maxExperiencia = maxExperiencia;
    }

    public Integer getMaxExperiencia() {
        return maxExperiencia;
    }
    
    public void passarNivel() {
        if(this.experiencia >= this.maxExperiencia) {
            this.setNivel(this.nivel + 1);
            this.maxExperiencia += (int)(this.maxExperiencia * 0.20);
        }
    }
}
