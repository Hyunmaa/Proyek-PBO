/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.util.ArrayList;

/**
 *
 * @author axels
 */
public class Channel {
    private String nama,password;
    private int rewardPoint=0;
    private ArrayList<Video> video = new ArrayList<>();

    public Channel(String nama, String password) {
        this.nama = nama;
        this.password=password;
    }

    public ArrayList<Video> getVideo() {
        return video;
    }

    public void setVideo(ArrayList<Video> video) {
        this.video = video;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void upload(Video v){
        video.add(v);
    }
}
