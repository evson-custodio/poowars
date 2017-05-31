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
public abstract class Personagem {
    private String nome;
    private Integer saude;
    private Integer nivel;
    private Integer experiencia;
    private Integer dano;
    private Integer defesa;

    public Personagem() {
        
    }

    public Personagem(String nome, Integer saude, Integer nivel, Integer experiencia, Integer dano, Integer defesa) {
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.dano = dano;
        this.defesa = defesa;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }

    public Integer getDano() {
        return dano;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Integer getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSaude() {
        return saude;
    }
    
    public Integer atacar(Personagem inimigo) {
        Integer danoFinal = (this.dano > inimigo.defesa ? (this.dano-inimigo.defesa) : 0);
        inimigo.saude -= danoFinal;
        
        return danoFinal;
    }
    
    public abstract boolean morrer();
}
