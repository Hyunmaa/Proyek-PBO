/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author axels
 */
public class Video {
    private String judul,linkVideo;
    private Channel owner;
    BufferedImage img;
    private ImageIcon icon;

    public Video(String judul) {
        try {
            this.img = ImageIO.read(new File("Assets\\Video-Icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image defaultimg = img.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        this.icon = new ImageIcon(defaultimg);
        this.judul = judul;
    }

    public Video(String judul, String linkVideo) {
        try {
            this.img = ImageIO.read(new File("Assets\\Video-Icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image defaultimg = img.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        this.icon = new ImageIcon(defaultimg);
        this.judul = judul;
        this.linkVideo = linkVideo;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    public void setThumbnail(Image img){
        icon = new ImageIcon(img);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public Channel getOwner() {
        return owner;
    }

    public void setOwner(Channel owner) {
        this.owner = owner;
    }
    
    
}
