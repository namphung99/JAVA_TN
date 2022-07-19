/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.DSSV2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien {
    private String maSv, hoTen, lop;
    private Date ngaySinh;
    private float gpa;
    private String hoTenFormated;

    public SinhVien(int id, String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
        this.maSv = "B20DCCN" + String.format("%03d", id);
        StringTokenizer stk = new StringTokenizer(this.hoTen, " ");
        hoTenFormated = "";
        while (stk.hasMoreTokens()) {
            String s = stk.nextToken();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    hoTenFormated += String.valueOf(s.charAt(i)).toUpperCase();
                } else hoTenFormated += s.charAt(i);
            }
            hoTenFormated += " ";
        }
    }

    public String toString() {
        return maSv + " " + hoTenFormated + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
    }
}
