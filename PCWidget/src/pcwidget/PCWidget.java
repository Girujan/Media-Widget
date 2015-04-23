/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcwidget;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;




/**
 *
 * @author girujan
 */
public class PCWidget extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Widget widget = new Widget();
        widget.pack();
        widget.setShape((new RoundRectangle2D.Double(0, 0, 183, 148, 800, 800)));
        widget.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        widget.setOpacity(0.5f);
        //widget.getContentPane().setBackground(Color.white);
        widget.setLocation(1195, 0);
        widget.setVisible(true);
        
    }
    
}
