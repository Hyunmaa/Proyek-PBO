/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author axels
 */
public class ListVideo {
    String[] tempArgs;
    ArrayList<Video> listVideo;
    
    public ListVideo() throws IOException {
        listVideo = Menu.getVideo();
        
        JFrame lv = new JFrame();
        
        JPanel vp = new JPanel();
        vp.setLayout(new GridLayout(0,5,30,50));
        vp.setBackground(Color.BLACK);
        
        for (int i = 0; i < listVideo.size(); i++) {
            VideoPanel jp = new VideoPanel(listVideo.get(i));
            JLabel video = new JLabel();
            
            video.setIcon(listVideo.get(i).getIcon());
            video.setText(listVideo.get(i).getJudul());
            video.setForeground(Color.WHITE);
            video.setHorizontalTextPosition(JLabel.CENTER);
            video.setVerticalTextPosition(JLabel.BOTTOM);
            
            JLabel nama = new JLabel(listVideo.get(i).getOwner().getNama());
            
            jp.setPreferredSize(new Dimension(200,100));
            jp.add(video);
            jp.add(nama);
            jp.setBackground(Color.BLACK);
            
            vp.add(jp);
            vp.revalidate();
        }
        JScrollPane js = new JScrollPane(vp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //js.setPreferredSize(new Dimension(710,150));
        
        lv.add(js);
        lv.pack();
        lv.setPreferredSize(new Dimension(800,400));
        lv.setVisible(true);
    }
    
}