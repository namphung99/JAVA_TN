
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class J01009_Tong_Giai_Thua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       long gt = 1;
       long sum = 0;
        for(int i = 1; i<=n;i++){
            gt *= i;
            sum += gt;
        }
        
        System.out.println(sum);
    }
}
