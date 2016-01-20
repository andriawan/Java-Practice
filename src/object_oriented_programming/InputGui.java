/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class InputGui {
    
    public static void main(String[] args) {
        String name;
        name= JOptionPane.showInputDialog("Input Something:");
        
        String name2;
        name2= JOptionPane.showInputDialog("Input Something:");
        
        String name3;
        name3= JOptionPane.showInputDialog("Input Something:");
        
        String msgx = name +" " + name2 +" "  + name3;
        JOptionPane.showMessageDialog(null, msgx);
    }
    
}
