/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author axels
 */
public class Video {
    private String judul,linkVideo;
    private Channel owner;
    private ImageIcon icon;

    public Video(String judul) {
        this.judul = judul;
    }

    public Video(String judul, String linkVideo) {
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
