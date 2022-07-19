/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05079_Lop_HP1;

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
        List<Lop> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int query = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        while (query-- > 0) {
            String ma = sc.nextLine();
            System.out.print("Danh sach nhom lop mon ");
            for (Lop lop : list) {
                if (lop.getMa().equals(ma)) {
                    System.out.print(lop.getTen()+":");
                    break;
                }
            }
            System.out.println();
            for (Lop lop : list) {
                if (lop.getMa().equals(ma))
                    System.out.println(lop);
            }
        }
    }
}
