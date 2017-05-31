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
public class Monstro extends Personagem {
    public Monstro() {
        
    }
    
    public void droparBolsa(Heroi heroi) {
        
    }
    
    public void droparExp(Heroi heroi) {
        heroi.setExperiencia(heroi.getExperiencia() + this.getExperiencia());
        heroi.passarNivel();
    }
}
