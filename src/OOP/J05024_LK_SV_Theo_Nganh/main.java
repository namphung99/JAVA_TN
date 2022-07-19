/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05024_LK_SV_Theo_Nganh;

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
        while(test-->0){
            list.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase()+":");
            for(SinhVien sv : list)
            {
                if(sv.getNganh()!=null && sv.getNganh().getTen().equals(nganh))
                    System.out.println(sv);
            }
        }
    }
}
