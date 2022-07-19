
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
public class J02004_MangDX {
    static Scanner sc = new Scanner(System.in);
    static int arr[] = new int[100];
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean check = true;
            for(int j=0;j<n/2;j++){
                if(arr[j] != arr[n-j-1]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
