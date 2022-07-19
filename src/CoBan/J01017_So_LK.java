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
public class J01017_So_LK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long s = sc.nextLong();
            String str =  String.valueOf(s);
            boolean check = true;
            for(int i = 0;i<str.length()-1;i++){
                int a = Integer.parseInt(String.valueOf(str.charAt(i)));
                int b = Integer.parseInt(String.valueOf(str.charAt(i+1)));
                if((a-b!=1 && (a-b)!=-1)){
                    check =  false;
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
