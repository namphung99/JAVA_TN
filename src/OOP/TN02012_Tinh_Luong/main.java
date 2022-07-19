/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.TN02012_Tinh_Luong;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        Map<String,String> mp = new HashMap<>();
        while (test-->0){
            mp.put(sc.next(),sc.nextLine());
        }
        test = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        while (test-->0){
            list.add(new NhanVien(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),mp));
        }
        for(NhanVien nv : list)
            System.out.println(nv);
    } 
}
