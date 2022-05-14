/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author axels
 */
public class VideoPlayer extends Application{
    
    private String link="";
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        /*FileChooser fil_chooser = new FileChooser();
        File file = fil_chooser.showOpenDialog(primaryStage);
        Media source = new Media(file.toURI().toString());*/
        Media source = new Media(link);
        MediaPlayer player = new MediaPlayer(source);
        MediaView mediaView = new MediaView(player);

        root.getChildren().add( mediaView);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();


        player.play();
    }
    
}
