/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poowars;

import java.util.Random;
import java.util.Scanner;
import models.Bolsa;
import models.item.consumivel.Pocao;
import models.item.equipamento.Arma;
import models.item.equipamento.Armadura;
import models.personagem.heroi.Arqueiro;
import models.personagem.heroi.Guerreiro;
import models.personagem.heroi.Heroi;
import models.personagem.heroi.Mago;
import models.personagem.monstro.Monstro;

/**
 *
 * @author evson
 */
public class POOWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        Heroi heroi = null;
        Monstro monstro = null;
        
        Bolsa padrao = new Bolsa();
        padrao.addItem(new Armadura(10, null, "Farrapos", 1, 10));
        padrao.addItem(new Pocao(50, null, "Poção de Vida Pequena", 1, 20));
        
        String entrada;
        
        do {
            System.out.println("Olá Aventureiro! Sua nova jornada irá começar!");
            System.out.println("Aqui você pode ser um Guerreiro, Arqueiro ou Mago");
            System.out.println("Escolha uma classe de Herói:");
            entrada = scan.nextLine();
            
            if (entrada.equalsIgnoreCase("guerreiro")) {
                padrao.addItem(new Arma(10, null, "Espada de Madeira", 1, 10));
                heroi = new Guerreiro(0, 100, null, null, null, null, 0, 10, 1, 300, 300, 30, 60, padrao);
            }
            else if (entrada.equalsIgnoreCase("arqueiro")) {
                padrao.addItem(new Arma(5, null, "Faca de Madeira", 1, 5));
                heroi = new Arqueiro(0, 100, null, null, null, null, 0, 10, 1, 200, 200, 45, 45, padrao);
            }
            else if (entrada.equalsIgnoreCase("mago")) {
                padrao.addItem(new Arma(20, null, "Cajado de Madeira", 1, 10));
                heroi = new Mago(100, 100, null, null, null, null, 0, 10, 1, 100, 100, 60, 30, padrao);
            }
            else {
                System.out.println("Opção Invalida! Escolha novamente!");
            }
        }
        while(!(entrada.equalsIgnoreCase("guerreiro") || entrada.equalsIgnoreCase("arqueiro") || entrada.equalsIgnoreCase("mago")));
        
        do {
            System.out.println("Olá... " + heroi.getClass().getSimpleName() + "! Será que existe um outro nome que eu possa lhe chamar?");
            entrada = scan.nextLine();
            heroi.setNome(entrada);
        }
        while(heroi.getNome() == null);
        
//        do {
//            
//        }
//        while(heroi.morrer());
    }
}
