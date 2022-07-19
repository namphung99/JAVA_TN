/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05057_Bang_Diem_Thi_Sinh;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class ThiSinh {
    private String ma,hoTen,status;
    private float toan,ly,hoa,tong,dt,diemCong;

    public ThiSinh(String ma, String hoTen, float toan, float ly, float hoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.dt = toan*2+ly+hoa;
        this.tong = dt;
        switch (ma.substring(0,3)){
            case "KV1" :{
                this.tong += 0.5;
                diemCong = 0.5F;
                break;
            }
            case "KV2" :{
                this.tong += 1.0;
                diemCong = 1.0F;
                break;
            }
            case "KV3" :{
                this.tong += 2.5;
                diemCong = 2.5F;
                break;
            }
        }
        if(this.tong >= 24)
            status = "TRUNG TUYEN";
        else status = "TRUOT";
    }

    public String toString() {
        String s = "";
        s+=ma+ " "+hoTen +" ";
        if(diemCong == Math.round(diemCong))  s+=Math.round(diemCong)+" ";
        else s+=diemCong+" ";
        if(dt == Math.round(dt))  s+=Math.round(dt)+" ";
        else s+=dt+" ";
        s+=status;
        return s;
    }
}
