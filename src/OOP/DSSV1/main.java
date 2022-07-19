/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.DSSV1;
import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i =1;i<=t;i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(),in.nextLine() , Float.parseFloat(in.nextLine()));
            System.out.println(sv.toString());
        }
    }
}
