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
public class S226_Bieu_Thuc_Dung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String s = scanner.nextLine();
            System.out.println(check(s));
        }
    }

    private static int check(String s) {
        Stack<Integer> stack = new Stack<>();
        int Max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(stack.size()+1);
                Max = Math.max(stack.size(),Max);
            } else if(s.charAt(i) == ')'){
                if (stack.isEmpty()) return -1;
                stack.pop();
            }
        }
        if(!stack.isEmpty())    return -1;
        return Max;
    }
}
