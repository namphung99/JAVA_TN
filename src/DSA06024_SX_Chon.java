
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
public class DSA06024_SX_Chon {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n+5];
        for(int i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int step =1, tmp, min_idx;
        for(int i =1;i<=n-1;i++){
            min_idx = i;
            for(int j = i;j<=n;j++){
                if(arr[j]< arr[min_idx]){
                    min_idx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            System.out.print("Buoc "+step+": ");
            for(int k =1;k<=n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            step++;
        }
    }
}
