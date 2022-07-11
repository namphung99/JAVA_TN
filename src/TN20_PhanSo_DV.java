
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
public class TN20_PhanSo_DV {
    static void printFraction(long P, long Q){
        if(P == 0 || Q == 0){
            return;
        }
        if(Q % P == 0){
            System.out.println("1/" + Q / P);
            return;
        }
        long n = Q / P + 1;
        System.out.print("1/" + n + " + ");
        printFraction(P * n - Q, Q * n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long P = sc.nextLong();
            long Q = sc.nextLong();
            printFraction(P, Q);
        }
    }
}
