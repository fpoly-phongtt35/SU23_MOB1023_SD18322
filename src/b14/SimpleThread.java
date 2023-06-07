/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14;

/**
 *
 * @author Phong
 */
public class SimpleThread extends Thread {
    private String name;
    public SimpleThread(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread " + name + " : " + i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("T1 start");
        SimpleThread thread1 = new SimpleThread("T1");
        thread1.start();
        
        System.out.println("T2 start");
        SimpleThread thread2 = new SimpleThread("T2");
        thread2.start();
    }
}
