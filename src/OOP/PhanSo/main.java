/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.PhanSo;

import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo p = new PhanSo(in.nextLong(), in.nextLong());
        p.RutGon();
        System.out.println(p);
    }
}
