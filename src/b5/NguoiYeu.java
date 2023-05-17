/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b5;

import java.util.Date;

/**
 *
 * @author Phong
 */
public class NguoiYeu {
    
    private String nickname;
    private String hoTen;
    private Date sinhNhat;
    private Double diemTrungBinh;

    public NguoiYeu() {
    }

    public NguoiYeu(String nickname, String hoTen, 
            Date sinhNhat, Double diemTrungBinh) {
        this.nickname = nickname;
        this.hoTen = hoTen;
        this.sinhNhat = sinhNhat;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(Date sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    
}
