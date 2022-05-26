/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.application.Platform;
import javax.swing.JPanel;

/**
 *
 * @author axels
 */
public class VideoPanel extends JPanel implements MouseListener{

    private String link;
    
    public VideoPanel(Video video) {
        link = video.getLinkVideo();
        addMouseListener(this);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(this)) {
            Platform.setImplicitExit(false);
            Platform.runLater(new Runnable(){
                @Override
                public void run(){
                    new VideoPlayer().play(link);
                }
            });
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

}
