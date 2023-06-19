/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.trabalholpa.trabalholpa;

import com.trabalholpa.trabalholpa.Telas.InformacoesBasicas;
import javax.swing.JFrame;

/**
 *
 * @author ht3015181
 */
public class TrabalhoLPA {
    
    public TrabalhoLPA() {
    
        JFrame frame = new JFrame();
        InformacoesBasicas infBasc = new InformacoesBasicas(this);
        
        frame.setTitle("D&D Manager");
        frame.setLocationRelativeTo(null);
        frame.add(infBasc);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        
        new TrabalhoLPA();
        
    }
    
    public void callback(InformacoesBasicas infBasc) {
        System.out.print(infBasc.getNome());
    }
}
