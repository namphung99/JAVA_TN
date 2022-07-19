
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
public class TN09_HV_ke_tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m+5];
            for (int j = 1; j <= m; j++) {
                arr[j] = sc.nextInt();
            }
            next(arr, m);
        }
    }

    static void next(int[] arr, int n) {
        int i = n-1;
        while(i > 0 && arr[i] >  arr[i+1]) i--;
        if(i <= 0){
            for (i = 1; i <= n; i++) {
                System.out.print(i+ " ");
            }
            return;
        }else{
            int k = n;
            while(arr[k] < arr[i]) k--;
            int tmp = arr[k];
            arr[k] = arr[i];
            arr[i] = tmp;
            int l = i+1,r=n;
            while(l < r){
                tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                l++;r--;
            }
        }
        for (i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
