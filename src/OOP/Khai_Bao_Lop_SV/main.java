/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Khai_Bao_Lop_SV;

import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextFloat());
        System.out.println(sv.toString());
    }
}
