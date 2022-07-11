
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
public class J01017_So_Lien_Ke {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n < 10){
                System.out.println("NO");
            }
            else{
                boolean check = true;
                String str = String.valueOf(n);
                for(int i = 1;i< str.length();i++){
                    if((Integer.valueOf(str.charAt(i)) - Integer.valueOf(str.charAt(i+1)) == 1) 
                        || (Integer.valueOf(str.charAt(i)) - Integer.valueOf(str.charAt(i+1)) == -1)){
                        check = true;
                    }
                    else{
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
}
