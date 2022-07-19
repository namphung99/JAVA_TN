/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.KB_Lop_NV;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class NhanVien {
    private String ten, gioitinh, ngaysinh, diachi,mathue,ngaykyHD;
    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachi, String mathue, String ngaykyHD ){
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh =ngaysinh;
        this.diachi = diachi;
        this.mathue = mathue;
        this.ngaykyHD = ngaykyHD;
    }
    public String toString(){
        return "00001" + " " + ten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + mathue+" "+ ngaykyHD;
    }
}
