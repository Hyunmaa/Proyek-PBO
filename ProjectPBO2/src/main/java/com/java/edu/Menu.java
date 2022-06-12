/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.edu;

import java.awt.Dimension;
import java.util.ArrayList;
import javafx.stage.Stage;

/**
 *
 * @author Gaby Paulina Spanic
 */
public class Menu {
    
    int wFrame = 800;
    int hFrame = 400;
    static ArrayList<Video> video = new ArrayList<>();
    static ArrayList<Channel> channel = new ArrayList<>();
    Stage primaryStage;
    
    public void mainMenu() {
        MainMenuFrame mainMenu = new MainMenuFrame();
        mainMenu.setPreferredSize(new Dimension(wFrame, hFrame));
        mainMenu.pack();
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
    }
    
    // getter setter
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
