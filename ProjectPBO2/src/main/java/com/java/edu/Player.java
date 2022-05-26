/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author axels
 */
public class Player extends BorderPane{
    private Media media;
    private MediaPlayer player;
    private MediaView view;
    private Pane mpane;
    private MediaBar bar;
    public Player(String link) {
        media = new Media(link);
        player = new MediaPlayer(media);
        view = new MediaView(player);
        mpane = new Pane();
        
        view.setPreserveRatio(false);
        view.fitWidthProperty().bind(mpane.widthProperty());
        view.fitHeightProperty().bind(mpane.heightProperty());
        
        mpane.getChildren().add(view);
        
        setCenter(mpane);
        
        bar = new MediaBar(player);
        
        setBottom(bar);
        
        setStyle("-fx-background-color: #bfc2c7");
        
        player.play();
    }
    
    public void tutup(Stage stage){
        player.stop();
        stage.close();
    }
}
