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
public class Guerreiro extends Heroi {
    private Integer rage;

    public Guerreiro() {
    }

    public Guerreiro(Integer rage) {
        this.rage = rage;
    }

    public Guerreiro(Integer rage, Integer maxExperiencia) {
        super(maxExperiencia);
        this.rage = rage;
    }

    public Guerreiro(Integer rage, Integer maxExperiencia, String nome, Integer saude, Integer nivel, Integer experiencia, Integer dano, Integer defesa) {
        super(maxExperiencia, nome, saude, nivel, experiencia, dano, defesa);
        this.rage = rage;
    }

    @Override
    public Integer atacar(Personagem inimigo) {
        Integer danoAtual = this.getDano();
        this.setDano(danoAtual + rage);
        Integer danoFinal = super.atacar(inimigo);
        this.setDano(danoAtual);
        return danoFinal;
    }

    @Override
    public void passarNivel() {
        super.passarNivel();
        this.rage += (int)(this.rage * 0.1);
    }
    
    public void multilar(Monstro monstro) {
        
    }
}
