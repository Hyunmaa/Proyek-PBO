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
public class Playlist {
    private String nama;
    private ArrayList<Video> content;

    public Playlist() {
        content = new ArrayList<>();
    }
    
    public Playlist(String nama) {
        content = new ArrayList<>();
        this.nama=nama;
    }
    
    public Video get(int i){
        return content.get(i);
    }
    
    public void remove(int i){
        content.remove(i);
    }
    
    public void remove(Video v){
        content.remove(v);
    }
    
    public void add(Video v){
        content.add(v);
    }
    
    public int size(){
        return content.size();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
