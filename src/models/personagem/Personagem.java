/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.personagem;

import java.util.Objects;
import models.Bolsa;

/**
 *
 * @author evson
 */
public abstract class Personagem {
    protected Integer id;
    protected String nome;
    protected Integer exp;
    protected Integer nivelMax;
    protected Integer nivel;
    protected Integer saudeMax;
    protected Integer saude;
    protected Integer dano;
    protected Integer defesa;
    protected Bolsa bolsa;

    public Personagem() {
    }

    public Personagem(Integer id, String nome, Integer exp, Integer nivelMax, Integer nivel, Integer saudeMax, Integer saude, Integer dano, Integer defesa, Bolsa bolsa) {
        this.id = id;
        this.nome = nome;
        this.exp = exp;
        this.nivelMax = nivelMax;
        this.nivel = nivel;
        this.saudeMax = saudeMax;
        this.saude = saude;
        this.dano = dano;
        this.defesa = defesa;
        this.bolsa = bolsa;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public void setNivelMax(Integer nivelMax) {
        this.nivelMax = nivelMax;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setSaudeMax(Integer saudeMax) {
        this.saudeMax = saudeMax;
    }

    public void setSaude(Integer saude) {
        this.saude = saude;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getExp() {
        return exp;
    }

    public Integer getNivelMax() {
        return nivelMax;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getSaudeMax() {
        return saudeMax;
    }

    public Integer getSaude() {
        return saude;
    }

    public Integer getDano() {
        return dano;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }
    
    public Integer atacar(Personagem inimigo) {
        if (inimigo != null) {
            Integer danoFinal = (this.dano > inimigo.defesa) ? (this.dano - inimigo.defesa) : 0;
            inimigo.saude -= danoFinal;
            
            return danoFinal;
        }
        
        return null;
    }
    
    public Boolean morrer() {
        return this.saude <= 0;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personagem other = (Personagem) obj;
        return Objects.equals(this.id, other.id);
    }
}
