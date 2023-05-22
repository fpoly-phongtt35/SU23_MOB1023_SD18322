/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Phong
 */
public class ExampleException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tuổi: ");
        try {
            Integer tuoi = sc.nextInt();
            System.out.println("Bạn " + tuoi + " tuổi");
        } catch (InputMismatchException ex) {
            System.out.println("Bạn nhập sai òy. InputMismatch");
        }

    }

}
