/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.java.edu;

import java.io.IOException;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Fredley Antony
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form iniFrame
     */
    public MainMenuFrame() {
        initComponents();
    }

    public MainMenuFrame(Stage primaryStage) {
        initComponents();
        this.primaryStage = primaryStage;
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        btnListVideo = new javax.swing.JButton();
        btnSortVideo = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnSearchVideo = new javax.swing.JButton();
        btnPlaylist = new javax.swing.JButton();
        btnChannel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        judul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judul.setText("PBO Media Player");
        judul.setToolTipText("");

        btnListVideo.setText("List Video");
        btnListVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListVideoActionPerformed(evt);
            }
        });

        btnSortVideo.setText("Sorting Video");
        btnSortVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnSortVideoActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnSetting.setText("Setting");
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnSearchVideo.setText("Search Video");
        btnSearchVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnSearchVideoActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        btnPlaylist.setText("Playlist");
        btnPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylistActionPerformed(evt);
            }
        });

        btnChannel.setText("Channel");
        btnChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChannelActionPerformed(evt);
            }
        });

        jLabel1.setText("*tip : upload video dahulu baru kemudian bisa di play");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(266, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(judul)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(btnListVideo,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSearchVideo,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSetting,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnChannel,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnPlaylist,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSortVideo,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(226, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(202, 202, 202)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSortVideo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlaylist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChannel)
                                .addGap(18, 18, 18)
                                .addComponent(btnSetting)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1)
                                .addContainerGap(17, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListVideoActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnListVideoActionPerformed
        if (!Menu.getVideo().isEmpty()) {
            new ListVideo();
        } else {
            JOptionPane.showMessageDialog(null, "Belum ada video");
        }
    }// GEN-LAST:event_btnListVideoActionPerformed

    private void btnSortVideoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_btnSortVideoActionPerformed
        // TODO add your handling code here:
        SortVideo sort = new SortVideo();
        sort.setVisible(true);
        sort.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_btnSortVideoActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSettingActionPerformed

    private void btnSearchVideoActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_btnSearchVideoActionPerformed
        // TODO add your handling code here:
        Search search = new Search();
        search.setVisible(true);
        search.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_btnSearchVideoActionPerformed

    private void btnPlaylistActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPlaylistActionPerformed
        // TODO add your handling code here:
        PlaylistFrame playlist = new PlaylistFrame(Menu.getUser());
        playlist.setVisible(true);
        playlist.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_btnPlaylistActionPerformed

    private void btnChannelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChannelActionPerformed
        // TODO add your handling code here:
        RegisterChannel r = new RegisterChannel();
        this.dispose();
        r.pack();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }// GEN-LAST:event_btnChannelActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChannel;
    private javax.swing.JButton btnListVideo;
    private javax.swing.JButton btnPlaylist;
    private javax.swing.JButton btnSearchVideo;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnSortVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel judul;
    // End of variables declaration//GEN-END:variables
    Stage primaryStage;
}
