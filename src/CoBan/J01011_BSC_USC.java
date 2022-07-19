
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
public class J01011_BSC_USC {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(BCNN(a,b) + " ");
            System.out.print(UCLN(a, b));
            System.out.println();
        }
    }
    
    public static long UCLN(long a, long b){
        if(b==0) return a;
        return UCLN(b, a%b);
    }
    
    public static long BCNN(long a, long b){
        return a*b / (UCLN(a, b));
    }
}
