/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05079_Lop_HP1;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Lop implements Comparable<Lop>{
    private String ma, ten, tenGV, nhomLop;

    public Lop(String ma, String ten, String nhomLop, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.tenGV = tenGV;
        this.nhomLop = nhomLop;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return nhomLop +" "+tenGV;
    }

    public int compareTo(Lop o) {
        return Integer.parseInt(nhomLop)-Integer.parseInt(o.nhomLop);
    }
}
