/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05007_SX_NhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            list.add(new NhanVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(NhanVien nv : list)
            System.out.println(nv);
    }
}
