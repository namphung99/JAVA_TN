/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class DSA07020_Dao_Tu {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            Stack<Character> stack = new Stack<>();
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    while (!stack.empty()){
                        System.out.print(stack.peek());stack.pop();
                    }
                    System.out.print(" ");
                }else{
                    stack.push(s.charAt(i));
                }
            }
            while (!stack.empty()){
                System.out.print(stack.peek());stack.pop();
            }
            System.out.println();
        }
    }
}
