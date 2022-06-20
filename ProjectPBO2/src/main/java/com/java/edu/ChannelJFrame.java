/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.java.edu;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Fredley Antony
 */

public class ChannelJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChannelJFrame
     */
    public ChannelJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPhotoProfile = new javax.swing.JPanel();
        TextFieldNama = new javax.swing.JTextField();
        TextFieldPoint = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        PanelPhotoProfile.setBackground(new java.awt.Color(255, 255, 255));
        PanelPhotoProfile.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        PanelPhotoProfile.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout PanelPhotoProfileLayout = new javax.swing.GroupLayout(PanelPhotoProfile);
        PanelPhotoProfile.setLayout(PanelPhotoProfileLayout);
        PanelPhotoProfileLayout.setHorizontalGroup(
            PanelPhotoProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        PanelPhotoProfileLayout.setVerticalGroup(
            PanelPhotoProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        TextFieldNama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TextFieldNama.setText("USERNAME  : ");
        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });

        TextFieldPoint.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TextFieldPoint.setText("TOTAL POINT :");
        TextFieldPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNama)
                            .addComponent(TextFieldPoint)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(PanelPhotoProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPhotoProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaActionPerformed

    private void TextFieldPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPointActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        BufferedImage photoProfile = ImageIO.read(new File("/Assets/Photo-profil.png"));
        JLabel profileLabel = new JLabel(new ImageIcon(photoProfile));
        panel.add(profileLabel);
        frame.add(panel);
        frame.setSize(150, 150);
        frame.setVisible(true);
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChannelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChannelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChannelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChannelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChannelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPhotoProfile;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JTextField TextFieldPoint;
    // End of variables declaration//GEN-END:variables
}
