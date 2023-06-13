/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.trabalholpa.trabalholpa;

import javax.swing.JFrame;

/**
 *
 * @author ht3015181
 */
public class TrabalhoLPA {

    static JFrame frame = new JFrame();
    
    public static void main(String[] args) {
        
        frame.setTitle("D&D Manager");
        frame.setLocationRelativeTo(null);
        frame.add(new CriacaoPt1());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
