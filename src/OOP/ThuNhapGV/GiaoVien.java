/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.ThuNhapGV;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class GiaoVien {
    private String maGach;
    private int luongCoBan;
    private int phuCap;
    private String hoTen;
    private int bacLuong;

    public GiaoVien(String maGach, String hoTen, int luongCoBan) {
        this.maGach = maGach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        switch (maGach.substring(0,2)){
            case "HT" :{
                phuCap = 2000000;
                break;
            }
            case "HP" :{
                phuCap = 900000;
                break;
            }
            case "GV":{
                phuCap = 500000;
                break;
            }
        }
        bacLuong = Integer.parseInt(maGach.substring(2,4));
    }

    public String toString() {
        return maGach+" "+hoTen+" "+bacLuong+" "+phuCap+" "+(luongCoBan*bacLuong+phuCap);
    }

}
