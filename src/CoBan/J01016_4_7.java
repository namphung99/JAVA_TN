
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
public class J01016_4_7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        long n = sc.nextLong();
        String str = String.valueOf(n);
        for(int i =0;i< str.length();i++){
            if(str.charAt(i) == '4' || str.charAt(i) == '7'){
                count++;
            }
        }
        if(count == 4 || count ==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
