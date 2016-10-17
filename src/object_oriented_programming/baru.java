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
public class baru {
    
    public static void main(String[] args) {
        forFPB(10);        
    }
    
    public static void forFPB(int init){
        
        int v1 = init;
        for (int i = 1; i <= init; i++) {
        if (init % i == 0) {
            v1 /=i;
        
        System.out.printf("%d,",v1);
        }
        }
//        int tambah = 0;
//        int z = 0;
//        int w = 0;
//        int y = 0;
//        for (int i = 1; i < init; i++) {
//            tambah++;
//            
//            if (init%tambah==0) {
//                z = init/tambah;                
//                w = z/tambah;  
//                y = w /tambah;
//            }
//            
//            System.out.print(z);
//            System.out.print(w);
//            System.out.print(y);
    }
    
}
