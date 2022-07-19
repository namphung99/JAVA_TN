/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.TN02012_Tinh_Luong;

import java.util.Map;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class NhanVien {
    private String ma, ten, phongban;
    private int luong, ngaycong,hs;
    private int[][] a = {{10,12,14,20},{10,11,13,16},{9,10,12,14},{8,9,11,13}};

    public NhanVien(String ma, String ten, int luong, int ngaycong, Map<String, String> mp) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.ngaycong = ngaycong;
        this.phongban = mp.get(ma.substring(ma.length() - 2, ma.length()));
        int i,j;
        switch (ma.charAt(0)){
            case 'A' :{
                i = 0;
                break;
            }
            case 'B' :{
                i = 1;
                break;
            }
            case 'C' :{
                i = 2;
                break;
            }
            case 'D' :{
                i = 3;
                break;
            }
            default: i = 0;break;
        }
        int year = Integer.parseInt(ma.substring(1,3));
        if(year>=16) j = 3;
        else if(year>=9)    j = 2;
        else if(year>=4) j = 1;
        else j = 0;
        hs = a[i][j];
    }

    public String toString() {
        return ma + " " + ten + " " + phongban + " " + (luong * ngaycong * 1000*hs);
    }
}