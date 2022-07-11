
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
public class J02006_Hop_hai_day_so {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m+5];
        int[] b = new int[n+5];
        boolean[] A = new boolean[1005];
        boolean[] B = new boolean[1005];
        for(int i=0;i<m;i++){
            a[i] = sc.nextInt();
            A[a[i]] = true;
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
            B[b[i]] = true;
        }
        
        for(int i = 0;i<=1000;i++){
            if(A[i] || B[i]){
                System.out.print(i+" ");
            }
        }
    }
}
