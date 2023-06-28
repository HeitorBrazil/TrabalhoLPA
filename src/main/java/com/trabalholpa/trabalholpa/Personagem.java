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
    private String level;
    
    //Atributos e Pericias
    private int[] atributos = new int[6];
    private ArrayList <String> treinadas = new ArrayList<String>();
    
    //Personalidade
    private String tracos;
    private String ideias;
    private String lacos;
    private String fraquezas;
    
    //Equipamento
    private String armadura;
    private boolean escudo;
    private String armas;
    private String outrosEquip;

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", classe=" + classe + ", raca=" + raca + ", antc=" + antc + ", alinh=" + alinh + ", jogador=" + jogador + ", level=" + level + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAntc() {
        return antc;
    }

    public void setAntc(String antc) {
        this.antc = antc;
    }

    public String getAlinh() {
        return alinh;
    }

    public void setAlinh(String alinh) {
        this.alinh = alinh;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int[] getAtributos() {
        return atributos;
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getTreinadas() {
        return treinadas;
    }

    public void setTreinadas(ArrayList<String> treinadas) {
        this.treinadas = treinadas;
    }

    public String getTracos() {
        return tracos;
    }

    public void setTracos(String tracos) {
        this.tracos = tracos;
    }

    public String getIdeias() {
        return ideias;
    }

    public void setIdeias(String ideias) {
        this.ideias = ideias;
    }

    public String getLacos() {
        return lacos;
    }

    public void setLacos(String lacos) {
        this.lacos = lacos;
    }

    public String getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String fraquezas) {
        this.fraquezas = fraquezas;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public boolean isEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getOutrosEquip() {
        return outrosEquip;
    }

    public void setOutrosEquip(String outrosEquip) {
        this.outrosEquip = outrosEquip;
    }
    
    
}
