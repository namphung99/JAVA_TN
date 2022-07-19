/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05024_LK_SV_Theo_Nganh;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SinhVien {
    private String maSv, hoTen, lop, email;
    private Nganh nganh;
    public SinhVien(String maSv, String hoTen, String lop, String email) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        if(maSv.contains("DCKT")) nganh =  Nganh.DCKT;
        if(maSv.contains("DCCN") && lop.charAt(0)!='E') nganh =  Nganh.DCCN;
        if(maSv.contains("DCAT") && lop.charAt(0)!='E') nganh =  Nganh.DCAT;
        if(maSv.contains("DCVT")) nganh = Nganh.DCVT;
        if(maSv.contains("DCDT")) nganh =  Nganh.DCDT;
    }
    public Nganh getNganh(){
        return nganh;
    }

    @Override
    public String toString() {
        return maSv + " " + hoTen + " " + lop + " " + email;
    }
    enum Nganh{
        DCKT("Ke toan"),
        DCCN("Cong nghe thong tin"),
        DCAT("An toan thong tin"),
        DCVT("Vien thong"),
        DCDT("Dien tu"),
        ;
        private String ten;
        Nganh(String ten) {
            this.ten = ten;
        }

        public String getTen() {
            return ten;
        }
    }
}
