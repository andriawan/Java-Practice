/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *
 * @author andriawan
 */
public class Penjumlahan {
    
    public String menjumlah(){
        int a = 5;
        int b = 60;
        int c = a + b;
        String s = "hasil nya adalah:" + c;
        return s;
    }    

    public static void main(String[] args) {
        Penjumlahan s = new Penjumlahan();
        String d = s.menjumlah();
        System.out.println(d);
    }

}