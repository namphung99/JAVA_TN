
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
public class DSA06026_Noi_Bot {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        boolean haveSwap;
        int step = 1,tmp;
        for (int i = 1; i <= n - 1; i++) {
            haveSwap = false;
            for (int j = 1; j <= n - i; j++) {
                if(a[j] > a[j+1]){
                    haveSwap = true;
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(haveSwap){
                System.out.print("Buoc "+step+": ");
                for(int k = 1; k <= n; k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
                step++;
            }
        }
    }
}
