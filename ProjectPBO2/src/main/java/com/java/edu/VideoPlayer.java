/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author axels
 */
public class VideoPlayer{
    private Player player;
    private Stage stage;
    public void play(String link){
        stage = new Stage();
        player = new Player(link);
        Scene scene = new Scene(player,800,400, Color.BLACK);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> player.tutup(stage));
    }
    
    public void stop(){
        player.tutup(stage);
    }
    
}
