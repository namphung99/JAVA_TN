/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.TN02011_LK_XuatNhap_Hang_Theo_Nhom;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SanPham implements Comparable<SanPham>{
    private String ma;
    private int sl,slx,dongia, tien, thue;

    public SanPham(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
        switch (ma.charAt(0)) {
            case 'A': {
                slx = (int) Math.round(sl * 0.6);
                switch (ma.charAt(ma.length() - 1)) {
                    case 'Y': {
                        dongia = 110000;
                        tien = slx*dongia;
                        thue = (int) (0.08*tien);
                        break;
                    }
                    case 'N': {
                        dongia = 135000;
                        tien = slx*dongia;
                        thue = (int) (0.11*tien);
                        break;
                    }
                }
                break;
            }
            case 'B': {
                slx = (int) Math.round(sl * 0.7);
                switch (ma.charAt(ma.length() - 1)) {
                    case 'Y': {
                        dongia = 110000;
                        tien = slx*dongia;
                        thue = (int) (0.17*tien);
                        break;
                    }
                    case 'N': {
                        dongia = 135000;
                        tien = slx*dongia;
                        thue = (int) (0.22*tien);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String getMa() {
        return ma;
    }

    public String toString() {
        return ma+" "+sl+" "+Math.round(slx)+" "+dongia+" "+tien+" "+thue;
    }

    public int compareTo(SanPham o) {
        return (int) (o.thue - thue);
    }
}
