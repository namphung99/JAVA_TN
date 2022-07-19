/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN05_Chuan_Hoa_Xau_HT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            String[] strs = s.trim().toLowerCase().split("\\s++");
            String res = "";
            for (String str : strs) {
                res += str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
            }
            System.out.println(res.trim());
        }
    }
}
