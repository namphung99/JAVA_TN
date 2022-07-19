/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.LopThiSinh;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class ThiSinh{
    private String ten;
    private String ngaysinh;
    private float diem1, diem2,diem3, tong;
    
    public ThiSinh(String ten, String ngaysinh, float diem1,float diem2, float diem3){
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        tong = diem1 + diem2 + diem3;
    }
    
    public String toString(){
        return ten + " " +ngaysinh +" " + String.format("%.1f",tong);
    }
}
