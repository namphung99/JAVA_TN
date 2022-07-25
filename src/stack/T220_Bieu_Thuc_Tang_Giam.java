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
public class T220_Bieu_Thuc_Tang_Giam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            int a = 3;
            Stack<String> stack = new Stack<>();
            Stack<Integer> stack1 = new Stack<>();
            String s = scanner.nextLine();
            if (s.charAt(0) == 'I') stack.push("12");
            else stack.push("21");
            boolean I = (s.charAt(0) == 'I');
            for (int i = 1; i < s.length(); i++) {
                if ((s.charAt(i) == 'I') == I) {
                    String s1 = stack.pop();
                    if (s.charAt(i) == 'I') {
                        s1 = s1 + "" + a;
                    } else {
                        s1 = a + "" + s1;
                    }
                    a++;
                    stack.push(s1);
                } else {
                    I = (s.charAt(i) == 'I');
                    if(stack.peek().length() > 1) {
                        stack.push(a + "");
                    }else{
                        String s1 = stack.pop();
                        if (s.charAt(i) == 'I') {
                            s1 = s1 + "" + a;
                        } else {
                            s1 = a + "" + s1;
                        }
                        stack.push(s1);
                    }
                    a++;
                }
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }

}
