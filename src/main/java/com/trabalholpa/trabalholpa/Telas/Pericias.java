/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.trabalholpa.trabalholpa.Telas;

import javax.swing.JCheckBox;

import com.trabalholpa.trabalholpa.TrabalhoLPA;

/**
 *
 * @author ht3015181
 */
public class Pericias extends javax.swing.JPanel {

    /**
     * Creates new form Pericias
     */
    
    private TrabalhoLPA t;
    
    public Pericias(TrabalhoLPA t) {
        initComponents();
        this.t = t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jCheckBox1.setText("Acrobacia");

        jCheckBox2.setText("Arcanismo");

        jCheckBox3.setText("Atletismo");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Atuação");

        jCheckBox5.setText("Enganação");

        jCheckBox6.setText("Furtividade");

        jCheckBox7.setText("História");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Intimidação");

        jCheckBox9.setText("Intuição");

        jCheckBox10.setText("Investigação");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("Lidar com Animais");

        jCheckBox12.setText("Medicina");

        jCheckBox13.setText("Natureza");

        jCheckBox14.setText("Percepção");

        jCheckBox15.setText("Prestidigitação");

        jCheckBox16.setText("Religião");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox17.setText("Sobrevivência");

        jCheckBox18.setText("Persuasão");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Perícias");

        jButton1.setText("Personalidade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox7)
                                            .addComponent(jCheckBox8)
                                            .addComponent(jCheckBox9))
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jCheckBox12)
                                                    .addGap(36, 36, 36))
                                                .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox15)
                                    .addComponent(jCheckBox14)
                                    .addComponent(jCheckBox13)
                                    .addComponent(jCheckBox16)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jCheckBox18))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(207, 207, 207))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addGap(24, 24, 24)
                        .addComponent(jCheckBox8)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox9)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox11)
                                    .addComponent(jCheckBox17))
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox18))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCheckBox1)
                            .addGap(24, 24, 24)
                            .addComponent(jCheckBox2)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox3)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox4)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox5)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jCheckBox13)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox14)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox15)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox16))))
                .addGap(90, 90, 90)
                .addComponent(jButton1)
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t.callback(this, 4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public boolean getAcrobacia() {
        return jCheckBox1.isSelected();
    }

    public boolean getArcanismo() {
        return jCheckBox2.isSelected();
    }

    public boolean getAtletismo() {
        return jCheckBox3.isSelected();
    }
    
    public boolean getAtuacao() {
        return jCheckBox4.isSelected();
    }
    
    public boolean getEnganacao() {
        return jCheckBox5.isSelected();
    }
    
    public boolean getFurtividade() {
        return jCheckBox6.isSelected();
    }
    
    public boolean getHistoria() {
        return jCheckBox7.isSelected();
    }
    
    public boolean getIntimidacao() {
        return jCheckBox8.isSelected();
    }
    
    public boolean getIntuicao() {
        return jCheckBox9.isSelected();
    }
    
    public boolean getInvestigacao() {
        return jCheckBox10.isSelected();
    }
    
    public boolean getLidarCAnimais() {
        return jCheckBox11.isSelected();
    }
    
    public boolean getMedicina() {
        return jCheckBox12.isSelected();
    }
    
    public boolean getNatureza() {
        return jCheckBox13.isSelected();
    }
    
    public boolean getPercepcao() {
        return jCheckBox14.isSelected();
    }

    public boolean getPrestidigitacao() {
        return jCheckBox15.isSelected();
    }

    public boolean getReligiao() {
        return jCheckBox16.isSelected();
    }

    public boolean getSobrevivencia() {
        return jCheckBox17.isSelected();
    }

    public boolean getPersuasao() {
        return jCheckBox18.isSelected();
    }

}
