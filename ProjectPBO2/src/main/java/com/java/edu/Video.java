/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

/**
 *
 * @author axels
 */
public class Video {
    private String judul,linkVideo,linkGambar;
    private Channel owner;

    public Video(String judul) {
        this.judul = judul;
    }

    public Video(String judul, String linkVideo) {
        this.judul = judul;
        this.linkVideo = linkVideo;
    }

    public Video(String judul, String linkVideo, String linkGambar) {
        this.judul = judul;
        this.linkVideo = linkVideo;
        this.linkGambar = linkGambar;
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

    public String getLinkGambar() {
        return linkGambar;
    }

    public void setLinkGambar(String linkGambar) {
        this.linkGambar = linkGambar;
    }

    public Channel getOwner() {
        return owner;
    }

    public void setOwner(Channel owner) {
        this.owner = owner;
    }
    
    
}
