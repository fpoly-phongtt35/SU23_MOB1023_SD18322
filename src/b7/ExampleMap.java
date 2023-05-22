/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Phong
 */
public class ExampleMap {
    
    public static void main(String[] args) {
        // Key: Mã số sinh viên | Value: Tên sinh viên
        // Vì: Tên sinh viên có thể trùng nhau. Nhưng mã thì không
        HashMap<String, String> danhSachSinhVien = new HashMap();
        
        // Thêm dữ liệu
        danhSachSinhVien.put("PH12345", "Minh");
        danhSachSinhVien.put("PH23456", "Dũng");
        danhSachSinhVien.put("PH34567", "Minh");
        
        // Duyệt các phần tử trong Map
        System.out.println("Trước khi xóa:");
        // B1. Đưa Map về Set
        Set<Entry<String, String>> mySet = danhSachSinhVien.entrySet();
        // B2. Duyệt các phần tử trên Set
        for(Entry<String, String> entry : mySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        // Xóa phần tử của Map
        danhSachSinhVien.remove("PH23456");
        // In lại
        System.out.println("Sau khi xóa:");
        danhSachSinhVien.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
