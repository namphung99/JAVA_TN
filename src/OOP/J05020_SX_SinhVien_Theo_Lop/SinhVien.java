/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05020_SX_SinhVien_Theo_Lop;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSv;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien(String maSv, String hoTen, String lop, String email) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return maSv+" "+hoTen+" "+lop+" "+email;
    }

    public int compareTo(SinhVien o) {
        if(lop.equals(o.lop)){
            return maSv.compareTo(o.maSv);
        }
        return lop.compareTo(o.lop);
    }
}