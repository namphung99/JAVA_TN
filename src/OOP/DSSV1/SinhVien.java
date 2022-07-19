/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.DSSV1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien {
   String ma, ten, lop;
    Date ngaysinh;
    float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws Exception{
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
     public String toString(){
         return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
     } 
}
