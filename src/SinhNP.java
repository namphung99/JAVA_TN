
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
public class SinhNP {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a = new int[100];
    public static void main(String[] args) {
        n = sc.nextInt();
        quaylui(1);
    }
    
    public static void quaylui(int i){
        for(int j = 0;j<=1;j++){
            a[i] = j;
            if(i == n){
                in();
            }else{
                quaylui(i +1);
            }
        }
    }
    
    public static void in(){
        for(int i =1;i<=n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
