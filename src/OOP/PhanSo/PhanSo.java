/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.PhanSo;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class PhanSo {
    private long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public String toString(){
        return tu+ "/" + mau;
    }
    
    public void RutGon(){
        long x = usc(tu,mau);
        tu /= x;
        mau /=x;
    }
    
    private long usc(long a, long b){
        long t;
        while(b>0){
            t = a%b;
            a=b;b=t;
        }
        return a;
    }
}
