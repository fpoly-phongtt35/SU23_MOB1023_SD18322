/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Phong
 */
public class ExampleCollection {
    
    public static void main(String[] args) {
        // 1. List
        ArrayList<Integer> danhSach1 = new ArrayList(); 
        // List là bố mẹ của ArrayList
        List<Integer> danhSach2 = new ArrayList(); 
        // Collection là ông bà của ArrayList
        Collection<Integer> danhSach3 = new ArrayList(); 
        
        danhSach1.add(3); danhSach1.add(9);
        danhSach1.add(2); danhSach1.add(3);
        
        // In danh sách sử dụng Lambda
        System.out.println("Đây là List: ");
        danhSach1.forEach(d -> System.out.println(d));
        // Có thể tìm hiểu thêm về Stream
        
        // 2. Set
        HashSet<Integer> set1 = new HashSet();
        // Set là bố mẹ của HashSet
        Set<Integer> set2 = new HashSet();
        // Collection là ông bà của HashSet
        Collection<Integer> set3 = new HashSet();
        
        set1.add(3); set1.add(9);
        set1.add(2); set1.add(3);
        
        System.out.println("Đây là Set: ");
        set1.forEach(d -> System.out.println(d));
    }
}
