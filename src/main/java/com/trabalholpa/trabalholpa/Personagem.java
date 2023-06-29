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
    private String ideais;
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

    public String getAtributos(int i) {
        return String.valueOf(atributos[i]);
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }
    
    public String getModAtributos(int i) {
        return String.valueOf((int) Math.floor((float) (atributos[i] - 10) / 2));
    }

    public String getTreinadas() {
        String listaTreinadas = "";
        for (int i = 0; i < treinadas.size(); i++) {
            if(i == 0) {
                listaTreinadas += treinadas.get(i);
            } else {
                listaTreinadas += ", " + treinadas.get(i);
            }
        }

        return listaTreinadas;
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

    public String getIdeais() {
        return ideais;
    }

    public void setIdeais(String ideias) {
        this.ideais = ideias;
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
    
    public String getCA() {
        String armadura = this.getArmadura();
        int CA;
        switch(armadura) {
            case "Acolchoada":
                CA = 11 + Integer.parseInt(getModAtributos(1));
                break;
            case "Couro":
                CA = 11 + Integer.parseInt(getModAtributos(1));
                break;
            case "Couro Batido":
                CA = 12 + Integer.parseInt(getModAtributos(1));
                break;
            case "Gibão de Peles":
                CA = 12 + Integer.parseInt(getModAtributos(1));
                break;
            case "Camisão de Malha":
                CA = 13 + Integer.parseInt(getModAtributos(1));
                break;
            case "Brunea":
                CA = 14 + Integer.parseInt(getModAtributos(1));
                break;
            case "Peitoral":
                CA = 14 + Integer.parseInt(getModAtributos(1));
                break;
            case "Meia-Armadura":
                CA = 15 + Integer.parseInt(getModAtributos(1));
                break;
            case "Cota de Anéis":
                CA = 15;
                break;
            case "Cota de Malha":
                CA = 16;
                break;
            case "Cota de Talhas":
                CA = 17;
                break;
            case "Placas":
                CA = 18;
                break;
            default:
                CA = 10;
                break;
        }
        
        if(this.isEscudo()){
            CA += 2;
        }
        
        return String.valueOf(CA);
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
    
    public String getVida() {
        if(this.getClasse().equals("Bardo") || this.getClasse().equals("Clérigo") || this.getClasse().equals("Bruxo") || this.getClasse().equals("Druida") || this.getClasse().equals("Ladino") || this.getClasse().equals("Monge")) {
            return String.valueOf(8 + Integer.parseInt(this.getModAtributos(3)));
        } else if(this.getClasse().equals("Guerreiro") || this.getClasse().equals("Paladino") || this.getClasse().equals("Patrulheiro")) {
            return String.valueOf(10 + Integer.parseInt(this.getModAtributos(3)));
        } else if(this.getClasse().equals("Feiticeiro") || this.getClasse().equals("Mago")) {
            return String.valueOf(6 + Integer.parseInt(this.getModAtributos(3)));
        } else {
            return String.valueOf(12 + Integer.parseInt(this.getModAtributos(3)));
        }
    }
    
    public String getDeslocamento() {
        if(this.getRaca().equals("Anão") || this.getRaca().equals("Halfling") || this.getRaca().equals("Gnomo")) {
            return "7,5m";
        } else {
            return "9m";
        }
    }
    
    public String getSalvaguardas() {
        if(this.getClasse().equals("Bárbaro") || this.getClasse().equals("Guerreiro")) {
            return "Força, Constituição";
        } else if(this.getClasse().equals("Bruxo") || this.getClasse().equals("Clérigo") || this.getClasse().equals("Paladino")) {
            return "Sabedoria, Carisma";
        } else if(this.getClasse().equals("Druida") || this.getClasse().equals("Mago")) {
            return "Inteligência, Sabedoria";
        } else if(this.getClasse().equals("Monge") || this.getClasse().equals("Patrulheiro")) {
            return "Força, Destreza";
        } else if(this.getClasse().equals("Bardo")) {
            return "Destreza, Carisma";
        } else if(this.getClasse().equals("Ladino")) {
            return "Destreza, Inteligência";
        } else {
            return "Constituição, Carisma";
        }
    }
    
    public String getBonus() {
        if(Integer.parseInt(this.getLevel()) < 5) {
            return "+2";
        } else if(Integer.parseInt(this.getLevel()) < 9) {
            return "+3";
        } else if(Integer.parseInt(this.getLevel()) < 13) {
            return "+4";
        } else if(Integer.parseInt(this.getLevel()) < 17) {
            return "+5";
        } else {
            return "+6";
        }
    }
}
