/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14;

import javax.swing.JLabel;

/**
 *
 * @author Phong
 */
public class CountingThread extends Thread {

    private JLabel lb;
    
    public CountingThread(JLabel lb) {
        this.lb = lb;
    }
    
    @Override
    public void run() {
        int count = 0;
        while(true) {
            try {
                count++;
                lb.setText(count + "");
                System.out.println(count);
                Thread.sleep(1000); // Cho thread ngủ 1000ms = 1s
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
