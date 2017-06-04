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
    protected Integer experiencia;
    protected Integer nivel;
    protected Integer saude;
    protected Integer dano;
    protected Integer defesa;
    protected Bolsa bolsa;

    public Personagem() {
    }

    public Personagem(Integer id, String nome, Integer experiencia, Integer nivel, Integer saude, Integer dano, Integer defesa, Bolsa bolsa) {
        this.id = id;
        this.nome = nome;
        this.experiencia = experiencia;
        this.nivel = nivel;
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

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
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

    public Integer getExperiencia() {
        return experiencia;
    }

    public Integer getNivel() {
        return nivel;
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
    
    public int atacar(Personagem inimigo) {
        int danoFinal = dano > inimigo.defesa ? (dano - inimigo.defesa) : 0;
        inimigo.saude -= danoFinal;
        return danoFinal;
    }
    
    public boolean morrer() {
        return saude == 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
