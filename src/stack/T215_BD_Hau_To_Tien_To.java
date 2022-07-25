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
public class T215_BD_Hau_To_Tien_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '^' || str.charAt(i) == '%') {
                    String s1 = stack.pop();
                    String s2 = stack.pop();
                    String temp = String.valueOf(str.charAt(i)) + s2 + s1;
                    stack.push(temp);
                }
                else{
                    stack.push(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println(stack.peek());
        }
    }
}
