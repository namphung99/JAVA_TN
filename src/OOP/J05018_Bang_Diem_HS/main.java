/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05018_Bang_Diem_HS;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        List<HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= test; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float diemTb = 0.0F;
            diemTb += sc.nextFloat()*2;
            diemTb += sc.nextFloat()*2;
            for (int j = 1; j <= 8; j++)
                diemTb += sc.nextFloat();
            list.add(new HocSinh(i, name, diemTb));
        }
        Collections.sort(list);
        for (HocSinh hs : list)
            System.out.println(hs);
    }

}
