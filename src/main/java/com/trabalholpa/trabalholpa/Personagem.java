/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalholpa.trabalholpa;

import java.util.ArrayList;

/**
 *
 * @author ht3015181
 */
public class Personagem {
    //Informacoes Basicas
    private String nome;
    private String classe;
    private String raca;
    private String antc;
    private String alinh;
    private String jogador;
    private byte level;
    
    //Atributos e Pericias
    private int[] atributos = new int[6];
    private ArrayList <String> treinadas = new ArrayList();
    
    //Personalidade
    private String tracos;
    private String ideias;
    private String lacos;
    private String fraquezas;
    
    //Equipamento
    private String armadura;
    private boolean escudo;
    private ArrayList <Arma> armas = new ArrayList();
    private String outrosEquip;

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", classe=" + classe + ", raca=" + raca + ", antc=" + antc + ", alinh=" + alinh + ", jogador=" + jogador + ", level=" + level + '}';
    }
    
    
}
