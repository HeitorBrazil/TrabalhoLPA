/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.trabalholpa.trabalholpa;

import com.trabalholpa.trabalholpa.Telas.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ht3015181
 */
public class TrabalhoLPA {
    
    JFrame frame;
    
    public TrabalhoLPA() {
    
        frame = new JFrame();
        InformacoesBasicas infBasc = new InformacoesBasicas(this);
        
        frame.setTitle("D&D Manager");
        frame.setLocationRelativeTo(null);
        frame.add(infBasc);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
    
    public void trocarTelas(int novaTela) {
        
        this.frame.removeAll();
        this.frame.setVisible(false);
        
        switch(novaTela) {
            case 1:
                Atributos at = new Atributos();
                this.frame.add(at);
                break;
                
            case 2:
                Pericias pr = new Pericias();
                this.frame.add(pr);
                break;
                
            case 3:
                Personalidade per = new Personalidade();
                this.frame.add(per);
                break;
                
            case 4:
                EquipamentoPt1 eq1 = new EquipamentoPt1();
                this.frame.add(eq1);
                break;
                
            case 5:
                
                break;
                
            case 6:
                
                break;
                
            case 7:
                
                break;
        }
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new TrabalhoLPA();
        
    }
    
    public void callback(InformacoesBasicas infBasc, int novaTela) {
        System.out.print(infBasc.getNome());
        trocarTelas(novaTela);
    }
}
