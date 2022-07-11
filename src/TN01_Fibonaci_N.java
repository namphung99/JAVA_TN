
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
public class TN01_Fibonaci_N {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long fibo[] = new long[100];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i<=92;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        while(value-->0){
            int n = in.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
