
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
public class TN08_Xau_NP_ke_tiep {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
        char[] X = s.toCharArray();
            for(int i = s.length()-1;i>0;i--){
                if(X[i] == '1'){
                    X[i] = '0';
                }
                else{
                    X[i] = '1';
                    break;
                }
            }
            System.out.println(X);
        }
    }
}
