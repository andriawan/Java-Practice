/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

import java.util.Scanner;

/**
 *
 * @author andriawan
 */
public class operasiHitung {
    
    private final String head = "hasilnya adalah: ";
	private static Scanner input;
    
    public String menjumlahkan(int a, int b){
        String penj = " (penjumlahan)";
        int c = a + b;
        String s = head + c + penj;
        return s;
    }    
    
    public String mengurangkan(int a, int b){
        String peng = " (pengurangan)";
        int c = a - b;
        String s = head + c + peng;
        return s ;
    }
    
    public String mengalikan(int a, int b){
        String kali = " (perkalian)";
        int c = a * b;
        String s = head + c + kali;
        return s;
    }
    
    public String membagi(double a, double b){
        String bagi = " (pembagian)";
        double c = (a / b);
        String s = head + c + bagi;
        return s;
    }
    
    public String akar(int basis, int kuadrat){
        String akar = " (akar)";
        int x;
        x = 1;
        for (int i = 0; i < kuadrat; i++) {    
            x = x * basis;
        }
        String s = head + x + akar;
        return s;
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        String x = "pilih";
        System.out.println(x);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        operasiHitung pertama, kedua, ketiga;
        pertama = new operasiHitung();
        kedua = new operasiHitung();
        ketiga = new operasiHitung();
        
        System.out.println(ketiga.akar(3, 6));
        System.out.println(pertama.akar(a, b));
        System.out.println(kedua.membagi(a, b));
        System.out.println(kedua.menjumlahkan(a, b));
        
    }

}