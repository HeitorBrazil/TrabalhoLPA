/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.trabalholpa.trabalholpa;

import com.trabalholpa.trabalholpa.Telas.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ht3015181
 */
public class TrabalhoLPA {
    
    JFrame frame;
    JPanel jp;
    
    public TrabalhoLPA() {
    
        frame = new JFrame();
        jp = new JPanel(new CardLayout());
        
        jp.add(new Menu(this));
        jp.add(new InformacoesBasicas(this));
        jp.add(new Atributos(this));
        jp.add(new Pericias(this));
        jp.add(new Personalidade(this));
        jp.add(new EquipamentoPt1(this));
        jp.add(new EquipamentoPt2(this));
        jp.add(new Magias(this));
        jp.add(new FichaFinal(this));
        
        frame.setTitle("D&D Manager");
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
    
    public void callback(JPanel panel, int novaTela) {
        trocarTelas(novaTela);
    }
}
