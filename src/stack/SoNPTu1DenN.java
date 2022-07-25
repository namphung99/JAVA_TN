/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class SoNPTu1DenN {
    static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            generateBinary(n);
            System.out.println();
        }
    }
}
