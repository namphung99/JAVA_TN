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
public class T213_Sua_Lai_Day_Ngoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String s = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            int res = 0;
            for(int i = 0; i < s.length(); i++){
                if(!stack.isEmpty()){
                    if(s.charAt(i) ==')' && stack.peek() == '('){
                        stack.pop();
                    }
                    else stack.push(s.charAt(i));
                }else{
                    if(s.charAt(i) == ')'){
                        res++;
                    }
                    stack.push('(');
                }
            }
            while (!stack.isEmpty()){
                char a = stack.peek(); stack.pop();
                char b = stack.peek(); stack.pop();
                if(a != ')' && b != '('){
                    res+=2;
                }else if((a==')' && b == ')') || (a=='(' && b == '(')){
                    res+=1;
                }
            }
            System.out.println(res);
        }
    }
}
