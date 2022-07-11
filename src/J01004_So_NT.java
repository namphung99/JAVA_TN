
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
public class J01004_So_NT {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0) {            
            int n = sc.nextInt();
            if(checkNT(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean checkNT(int a){
        if(a< 2){
            return false;
        }
        for(int i =2;i<Math.sqrt(a);i++){
                if(a%i == 0){
                    return false;
                }
            }
        return true;
    }
}
