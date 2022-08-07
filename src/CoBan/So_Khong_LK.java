/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class So_Khong_LK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean check = true;
            long s = sc.nextLong();
            String str =  String.valueOf(s);
            int sum = Integer.parseInt(String.valueOf(str.charAt(0)));
            for(int i = 0;i<str.length() -1;i++){
                int a = Integer.parseInt(String.valueOf(str.charAt(i)));
                int b = Integer.parseInt(String.valueOf(str.charAt(i+1)));
                if(Math.abs(a-b) != 2){
                    check= false;
                    break;
                }
                sum+= Integer.parseInt(String.valueOf(str.charAt(i+1)));
            }
            if(check == true && sum%10 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
