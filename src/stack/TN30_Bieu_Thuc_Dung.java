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
public class TN30_Bieu_Thuc_Dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            int result = 0;
            //    ][ : 0
            //    [] : 1
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else{
                        stack.push(s.charAt(i));
                    }
                } else {
                    if (!stack.isEmpty() && stack.peek() == ']') {
                        result++;
                        stack.pop();
                        if (!stack.isEmpty()) {
                            stack.push('[');
                            stack.push(']');
                        }
                    } else stack.push(s.charAt(i));
                }
            }
            while (!stack.empty()) {
                char a = stack.peek();
                stack.pop();
                char b = stack.peek();
                stack.pop();
                if (a == ']' && b == '[') result++;
            }
            System.out.println(result);
        }
    }
}
