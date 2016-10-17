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
        String head = "informasi";
        String s = "Masukkan Kata:";
        String space = " ";
        String name;
        name= JOptionPane.showInputDialog(s);
        
        String name2;
        name2= JOptionPane.showInputDialog(s);
        
        String name3;
        name3= JOptionPane.showInputDialog(s);
        
        String msgx = name + space+ name2 + space  + name3;
        JOptionPane.showMessageDialog(null, msgx, head, 1);
    }
    
}
