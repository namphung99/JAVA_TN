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
public class S123_So_Loc_Phat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            Queue<String> queue = new LinkedList<>();
            Stack<String> stack = new Stack<>();
            stack.push("6");
            stack.push("8");
            queue.add("6");
            queue.add("8");
            while (!queue.isEmpty()){
                String s = queue.poll();

                if(s.length() == n){
                    break;
                }
                queue.add(s+"6");
                queue.add(s+"8");
                stack.push(s+"6");
                stack.push(s+"8");
            }
            System.out.println(stack.size());
            while (!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}
