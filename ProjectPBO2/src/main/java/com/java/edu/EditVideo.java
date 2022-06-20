/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author axels
 */
public class EditVideo extends javax.swing.JFrame {

    /**
     * Creates new form EditVideo
     */
    private DefaultListModel<String> model;
    private ArrayList<Video> videos;
    private Channel user;
    private Video vid;

    public EditVideo() {
        initComponents();
    }

    public EditVideo(Channel user) {
        initComponents();
        this.user = user;
        videos = user.getVideo();
        model = new DefaultListModel<>();
        videoList.setModel(model);
        for (Video video : videos) {
            model.addElement(video.getJudul());
        }
        videoList.addMouseListener(mouseListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        videoList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        textJudul = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        thumbnail = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        btnGanti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 400));

        jScrollPane1.setViewportView(videoList);

        jLabel1.setText("Judul Video");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Thumbnail");

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnGanti.setText("Change Thumbnail");
        btnGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGantiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnFinish)
                                                        .addComponent(btnGanti))
                                                .addGap(0, 80, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(textJudul, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnBack)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textJudul, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(thumbnail, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnGanti)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFinish)
                                                .addGap(6, 6, 6)))
                                .addContainerGap(81, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        LoginChannel l = new LoginChannel(user);
        l.pack();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }// GEN-LAST:event_btnBackActionPerformed

    private void btnGantiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGantiActionPerformed
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(null);
        File fileG = j.getSelectedFile();
        BufferedImage buffimg = null;
        try {
            buffimg = ImageIO.read(fileG);
        } catch (IOException ex) {
            Logger.getLogger(EditVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image image = buffimg.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        vid.setThumbnail(image);
        thumbnail.setIcon(new ImageIcon(image));
    }// GEN-LAST:event_btnGantiActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFinishActionPerformed
        if (textJudul.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a title");
        } else {
            model.setElementAt(textJudul.getText(), videoList.getSelectedIndex());
            vid.setJudul(textJudul.getText());
            this.dispose();
            LoginChannel l = new LoginChannel(user);
            l.pack();
            l.setVisible(true);
            l.setLocationRelativeTo(null);
        }
    }// GEN-LAST:event_btnFinishActionPerformed

    MouseListener mouseListener = new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {

            String selectedItem = (String) videoList.getSelectedValue();
            for (Video video : videos) {
                if (video.getJudul().equals(selectedItem)) {
                    vid = video;
                    thumbnail.setIcon(vid.getIcon());
                    break;
                }
            }
            textJudul.setText(selectedItem);
            // model.setElementAt("", videoList.getSelectedIndex());
        }
    };

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
            java.util.logging.Logger.getLogger(EditVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVideo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnGanti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textJudul;
    private javax.swing.JLabel thumbnail;
    private javax.swing.JList<String> videoList;
    // End of variables declaration//GEN-END:variables
}
