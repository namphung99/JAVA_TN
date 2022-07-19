/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.TN02011_LK_XuatNhap_Hang_Theo_Nhom;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<SanPham> list = new ArrayList<>();
        while (test-->0){
            list.add(new SanPham(sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        String s = sc.nextLine();
        for(SanPham sp : list)
            if(sp.getMa().charAt(0)==s.charAt(0))
                System.out.println(sp);
    }
}