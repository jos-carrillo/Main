/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author 1ºDAM
 */
public class Main2 extends JFrame {

    /**
     * @param args the command line arguments
     */
           public Main2() {
            JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo");
            add(lblSaludo);
            this.setSize(400, 200);
            this.setTitle("JFrame");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        public static void main(String[] args) {
            Main2 main = new Main2();
        }
}
