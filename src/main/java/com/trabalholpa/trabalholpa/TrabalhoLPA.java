/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.trabalholpa.trabalholpa;

import com.trabalholpa.trabalholpa.Telas.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ht3015181
 */
public class TrabalhoLPA {
    
    JFrame frame;
    JPanel jp;
    Personagem p;
    
    public TrabalhoLPA() {
    
        frame = new JFrame();
        jp = new JPanel(new CardLayout());
        p = new Personagem();
        
        jp.add(new Menu(this));
        jp.add(new InformacoesBasicas(this));
        jp.add(new Atributos(this));
        jp.add(new Pericias(this));
        jp.add(new Personalidade(this));
        jp.add(new EquipamentoPt1(this));
        jp.add(new EquipamentoPt2(this));
        
        frame.setTitle("D&D Creator");
        frame.add(jp);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
    
    public void trocarTelas(int novaTela) {
        
        Component actualPanel = null;
        
        for(int i = 0; i < jp.getComponentCount(); i++) {
            if ( jp.getComponent(i).isVisible() ) {
                actualPanel = jp.getComponent(i);
            }
        }
        
        actualPanel.setVisible(false);
        jp.getComponent(novaTela).setVisible(true);
        frame.pack();
        
    }
    
    public static void main(String[] args) {
        
        new TrabalhoLPA();
        
    }
    public void callback(Menu panel, int novaTela) {
        trocarTelas(novaTela);
    }
    
    public void callback(InformacoesBasicas panel, int novaTela) {
        p.setNome(panel.getNome());
        p.setClasse(panel.getClasse());
        p.setRaca(panel.getRaca());
        p.setAntc(panel.getAntecedente());
        p.setAlinh(panel.getAlinhamento());
        p.setLevel(panel.getLevel());
        p.setJogador(panel.getJogador());

        trocarTelas(novaTela);
    }

    public void callback(Atributos panel, int novaTela) {
        int atrb[] = new int[6];
        atrb[0] = panel.getForca();
        atrb[1] = panel.getDestreza();
        atrb[2] = panel.getInteligencia();
        atrb[3] = panel.getConstituicao();
        atrb[4] = panel.getSabedoria();
        atrb[5] = panel.getCarisma();
        p.setAtributos(atrb);

        trocarTelas(novaTela);
    }

    public void callback(Pericias panel, int novaTela) {

        ArrayList<String> treinadas = new ArrayList<String>();

        if (panel.getAcrobacia()) {
            treinadas.add("Acrobacia");
        } if (panel.getArcanismo()) {
            treinadas.add("Arcanismo");
        } if (panel.getAtletismo()) {
            treinadas.add("Atletismo");
        } if (panel.getAtuacao()) {
            treinadas.add("Atuacao");
        } if (panel.getEnganacao()) {
            treinadas.add("Enganacao");
        } if (panel.getFurtividade()) {
            treinadas.add("Furtividade");
        } if (panel.getHistoria()) {
            treinadas.add("Historia");
        } if (panel.getIntimidacao()) {
            treinadas.add("Intimidacao");
        } if (panel.getIntuicao()) {
            treinadas.add("Intuicao");
        } if (panel.getInvestigacao()) {
            treinadas.add("Investigacao");
        } if (panel.getLidarCAnimais()) {
            treinadas.add("Lidar Com Animais");
        } if (panel.getMedicina()) {
            treinadas.add("Medicina");
        } if (panel.getNatureza()) {
            treinadas.add("Natureza");
        } if (panel.getPercepcao()) {
            treinadas.add("Percepcao");
        } if (panel.getPersuasao()) {
            treinadas.add("Persuasao");
        } if (panel.getPrestidigitacao()) {
            treinadas.add("Prestidigitacao");
        } if (panel.getReligiao()) {
            treinadas.add("Religiao");
        } if (panel.getSobrevivencia()) {
            treinadas.add("Sobrevivencia");
        }
        p.setTreinadas(treinadas);

        trocarTelas(novaTela);
    }

    public void callback(Personalidade panel, int novaTela) {
        p.setTracos(panel.getTracos());
        p.setIdeais(panel.getIdeais());
        p.setLacos(panel.getLacos());
        p.setFraquezas(panel.getFraquezas());

        trocarTelas(novaTela);
    }

    public void callback(EquipamentoPt1 panel, int novaTela) {
        p.setArmadura(panel.getArmadura());
        p.setEscudo(panel.getEscudo());
        p.setArmas(panel.getArmas());

        trocarTelas(novaTela);
    }

    public void callback(EquipamentoPt2 panel, int novaTela) {
        p.setOutrosEquip(panel.getOutrosEquip());

        jp.add(new FichaFinal(this, p));

        trocarTelas(novaTela);
    }
}
