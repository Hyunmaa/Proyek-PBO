/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.edu;

import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author Gaby Paulina Spanic
 */
public class Menu {
    MainMenuFrame mainMenu = new MainMenuFrame();
    
    int wFrame = 800;
    int hFrame = 400;
    static ArrayList<Video> video = new ArrayList<>();
    static ArrayList<Channel> channel = new ArrayList<>();
    static String[] args;
    
    public void mainMenu(String[] args) {
        mainMenu.setPreferredSize(new Dimension(wFrame, hFrame));
        mainMenu.pack();
        mainMenu.setVisible(true);
        mainMenu.pass(args);
        this.args=args;
    }
    
    // getter setter
    public static String[] giveArgs(){
        return args;
    }

    public static ArrayList<Channel> getChannel() {
        return channel;
    }

    public static void setChannel(ArrayList<Channel> channel) {
        Menu.channel = channel;
    }

    public static ArrayList<Video> getVideo() {
        return video;
    }

    public static void setVideo(ArrayList<Video> video) {
        Menu.video = video;
    }
    
    
}
