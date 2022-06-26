/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.MainMenu;
import Controller.DummyData;

/**
 *
 * @author Mena
 */
public class Main {
    
    public Main() {
        new DummyData();
        
        new MainMenu();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
