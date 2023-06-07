/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

import java.io.Serializable;

/**
 *
 * @author Phong
 */
public class ToDo implements Serializable {
    
    private String tenCongViec;
    private String deadline;

    public ToDo() {
    }

    public ToDo(String tenCongViec, String deadline) {
        this.tenCongViec = tenCongViec;
        this.deadline = deadline;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    
}
