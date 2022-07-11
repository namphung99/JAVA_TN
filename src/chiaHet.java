
import java.math.BigInteger;
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
public class chiaHet {
    static BigInteger a;
    static BigInteger b;
    static BigInteger zero = BigInteger.valueOf(0);
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            if(a.mod(b).equals(zero) || b.mod(a).equals(zero)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
