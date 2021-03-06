/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javafx.geometry.Insets;

/**
 *
 * @author axels
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form LoginChannel
     */
    public Search() throws IOException {
        initComponents();
        addPictureToSearchButton();
    }

    Channel user;

    public Search(Channel c) throws IOException {
        initComponents();
        user = c;
        addPictureToSearchButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rewardPoint = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        InputSearchField = new javax.swing.JTextField();
        LogoSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rewardPoint.setText("0");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        InputSearchField.setText("Masukkan judul");
        InputSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSearchFieldActionPerformed(evt);
            }
        });

        LogoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rewardPoint)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(InputSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 321,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LogoSearch)
                                .addContainerGap(101, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(rewardPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnBack)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(InputSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LogoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(350, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LogoSearchActionPerformed
        // TODO add your handling code here:
        try {
            addPictureToSearchButton();
            LogoSearch.setSize(LogoSearch.getIcon().getIconWidth(), LogoSearch.getIcon().getIconHeight());
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Video> result = new ArrayList<Video>();
        Menu.getVideo();
        String search = InputSearchField.getText();
        if (search.equals("") || search.equals("Masukkan judul")) {
            JOptionPane.showMessageDialog(null, "Please enter a search term");
        } else {
            for (int i = 0; i < Menu.getVideo().size(); i++) {
                if (Menu.getVideo().get(i).getJudul().toLowerCase().contains(search.toLowerCase())) {
                    result.add(Menu.getVideo().get(i));
                }
            }
            if (result.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No result found");
            } else {
                ListVideo lv = new ListVideo(result);
            }
        }
    }// GEN-LAST:event_LogoSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainMenuFrame m = new MainMenuFrame();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }// GEN-LAST:event_btnBackActionPerformed

    private void InputSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_InputSearchFieldActionPerformed
        // TODO add your handling code here:
        ArrayList<Video> result = new ArrayList<Video>();
        Menu.getVideo();
        String search = InputSearchField.getText();
        if (search.equals("") || search.equals("Masukkan judul")) {
            JOptionPane.showMessageDialog(null, "Please enter a search term");
        } else {
            for (int i = 0; i < Menu.getVideo().size(); i++) {
                if (Menu.getVideo().get(i).getJudul().toLowerCase().contains(search.toLowerCase())) {
                    result.add(Menu.getVideo().get(i));
                }
            }
            if (result.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No result found");
            } else {
                ListVideo lv = new ListVideo(result);
            }
        }
    }// GEN-LAST:event_InputSearchFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Search().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void addPictureToSearchButton() throws IOException {
        BufferedImage buffimg = ImageIO.read(new File("Assets\\search.png"));
        Image image = buffimg.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        LogoSearch.setIcon(newIcon);
        LogoSearch.setPreferredSize(new Dimension(50, 50));
        LogoSearch.setMaximumSize(new Dimension(50, 50));
        LogoSearch.setMinimumSize(new Dimension(50, 50));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputSearchField;
    private javax.swing.JButton LogoSearch;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rewardPoint;
    // End of variables declaration//GEN-END:variables
}
