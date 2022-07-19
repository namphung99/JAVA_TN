/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05022_LK_SV_Theo_Lop;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while (test-->0){
            list.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
            for(SinhVien sv : list)
                if(sv.getLop().equals(lop))
                    System.out.println(sv);
        }
    }
}
