/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        tempArgs = Menu.giveArgs();
        
        JFrame lv = new JFrame();
        
        JPanel vp = new JPanel();
        vp.setLayout(new GridLayout(0,5,30,50));
        vp.setBackground(Color.BLACK);
        
        for (int i = 0; i < listVideo.size(); i++) {
            VideoPanel jp = new VideoPanel(listVideo.get(i));
            JLabel video = new JLabel();
            
            video.setIcon(listVideo.get(i).getIcon());
            video.setText(listVideo.get(i).getJudul()+"\n"+listVideo.get(i).getOwner().getNama());
            video.setForeground(Color.WHITE);
            video.setHorizontalTextPosition(JLabel.CENTER);
            video.setVerticalTextPosition(JLabel.BOTTOM);
            
            jp.setPreferredSize(new Dimension(200,100));
            jp.add(video);
            jp.setBackground(Color.BLACK);
            
            vp.add(jp);
            vp.revalidate();
        }
        JScrollPane js = new JScrollPane(vp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //js.setPreferredSize(new Dimension(710,150));
        
        lv.add(js);
        lv.pack();
        lv.setVisible(true);
    }
    
}
