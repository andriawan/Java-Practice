/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_oriented_programming;

/**
 *
 * @author root
 * 
 */

class MyThreads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
    
}

class MyThreads2 implements Runnable{

    @Override
    public void run() {        
         for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
    
}

public class Threads {
    
    public static void main(String[] args) {
        
        MyThreads x = new MyThreads();
        x.start();
        
        MyThreads y = new MyThreads();
        y.start();
        
        Thread w = new Thread(new MyThreads2());
        w.start();
        
        Thread a = new Thread(new MyThreads());
        a.start();
        
        Thread z = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId() + " hello");
            }
        });
        
        z.start();
    }
    
}
