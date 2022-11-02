
package javaapplication5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JButton;

public class JavaApplication5 {


    public static void main(String[] args) {
           JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(30,30));
        f.add(new JButton("Kuzey"),BorderLayout.NORTH);
         f.add(new JButton("Güney"),BorderLayout.SOUTH);
         f.add(new JButton("Kuzey"),BorderLayout.WEST);
         f.add(new JButton("Kuzey"),BorderLayout.EAST);
         f.add(new JButton("Kuzey"),BorderLayout.CENTER);
        
        f.setSize(800,500);
        f.setVisible(true);
    }
    
}
