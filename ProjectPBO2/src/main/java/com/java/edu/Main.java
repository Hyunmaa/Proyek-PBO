/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.java.edu;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author Fredley Antony
 */
public class Main extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //Application.launch(VideoPlayer.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Menu menu = new Menu();
        menu.mainMenu();
    }
    
}
