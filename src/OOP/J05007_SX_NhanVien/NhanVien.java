/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05007_SX_NhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class NhanVien implements Comparable<NhanVien> {
    private String ma, hoTen, gioiTinh, diaChi, maSoThue;
    private Date ngaySinh, ngayKyHopDong;

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.ngayKyHopDong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKyHopDong);
        this.ma = String.format("%05d", id);
    }

    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)
                + " " + diaChi + " " + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKyHopDong);
    }

    public int compareTo(NhanVien o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}

