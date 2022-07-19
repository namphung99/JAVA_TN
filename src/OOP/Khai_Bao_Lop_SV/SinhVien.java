/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Khai_Bao_Lop_SV;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien {
    private String ten,lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien( String ten, String lop, String ngaySinh, float gpa) throws Exception{
        
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }
    
    public String toString(){
        return "B20DCCN001" + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
    }
}
