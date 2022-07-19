/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05006_DS_NhanVien;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class NhanVien {
    private String maNv,hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKyHopDong;

    public NhanVien(int id,String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = ngayKyHopDong;
        this.maNv = String.format("%05d",id);
    }

    public String toString() {
        return maNv+" "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSoThue+" "+ngayKyHopDong;
    }
}
