/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.edu;

import java.awt.Dimension;

/**
 *
 * @author Gaby Paulina Spanic
 */
public class Menu {
    MainMenuFrame mainMenu = new MainMenuFrame();
    
    int wFrame = 800;
    int hFrame = 400;
    
    public void mainMenu(String[] args) {
        mainMenu.setPreferredSize(new Dimension(wFrame, hFrame));
        mainMenu.pack();
        mainMenu.setVisible(true);
        mainMenu.pass(args);
    }
}
