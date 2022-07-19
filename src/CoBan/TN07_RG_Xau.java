
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
public class TN07_RG_Xau {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length(); ){
            if(i>0 && sb.charAt(i) == sb.charAt(i-1)){
                sb.delete(i-1,i+1);
                i--;
            }else{
                i++;
            }
        }
        if(sb.toString().isEmpty()){
            System.out.println("Empty String");
        }else{
            System.out.println(sb);
        }
    }

}
