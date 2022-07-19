/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05022_LK_SV_Theo_Lop;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien {
    private String maSv, hoTen, lop, email;

    public SinhVien(String maSv, String hoTen, String lop, String email) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        return maSv + " " + hoTen + " " + lop + " " + email;
    }
}
