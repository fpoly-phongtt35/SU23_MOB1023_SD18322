/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7;

import java.math.BigDecimal;

/**
 *
 * @author Phong
 */
public class ExampleBigDecimal {
    
    public static void main(String[] args) {
        
        double f1 = 0.2f;
        double f2 = 3;
        double f3 = f1 * f2;
        System.out.println(f3);
        
        BigDecimal d1 = BigDecimal.valueOf(0.2);
        BigDecimal d2 = BigDecimal.valueOf(3);
        BigDecimal d3 = d1.multiply(d2);
        System.out.println(d3);
        
    }
}
