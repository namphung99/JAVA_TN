
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
public class DSA06025_SX_Chen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(), a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        sapxep(a,n);
    }
    
    public static void sapxep(int a[], int n){
        int i,j,t;
        System.out.println("Buoc 0: "+ a[0]);
        for(i =1; i<n; i++){
            t = a[i]; 
            j = i-1;
            while(j>=0&& a[j]>t){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
            System.out.print("Buoc "+ i + ": ");
            for(j=0;j<=i;j++){
                System.out.print(a[j] +" ");
            }
            System.out.println();
        }
    }
}
