/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visualizador.jar;
import visualizador.gui.MainFrame;
/**
 *
 * @author Silvia
 */
public class Visualizadorjar {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new MainFrame().setVisible(true);
            }
        });
    }
}





