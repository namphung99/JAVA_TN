/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.*;


/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Dau_ngoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Character> st1 = new Stack<>();
            Stack<Integer> st2 = new Stack<>(); 
            int dem =0;
            for(int i =0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    dem++;
                    System.out.print(dem+" ");
                    st1.push('(');
                    st2.push(dem);
                }else if(st1.peek() == '(' && s.charAt(i) == ')'){
                    System.out.print(st2.pop()+ " ");
                }
            }
            System.out.println("");
        }
    }
}
