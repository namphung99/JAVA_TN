/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.J05058_SX_KQ_Tuyen_Sinh;

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
        List<ThiSinh> list = new ArrayList<>();
        while (test-- > 0) {
            list.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list);
        for (ThiSinh ts : list)
            System.out.println(ts);
    }
}
