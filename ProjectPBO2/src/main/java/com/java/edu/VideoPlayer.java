/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author axels
 */
public class VideoPlayer extends Application{
    
    private static String link;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FileChooser fil_chooser = new FileChooser();
        File file = fil_chooser.showOpenDialog(primaryStage);
        link = file.toURI().toString();
        Player player = new Player(link);
        Scene scene = new Scene(player,800,400, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void setLink(String link) {
        VideoPlayer.link = link;
    }
    
}
