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
public class TN29_GT_NN_Cua_Xau_AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int[] arr = new int[100];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)]++;
            }
            for (int i = 'A'; i <= 'Z'; i++) {
                if (arr[i] > 0) {
                    pq.add(arr[i]);
                }
            }
            while (n-- > 0) {
                int a = pq.poll();
                pq.add(a-1);
            }
            int result = 0;
            while(!pq.isEmpty()){
                result += Math.pow(pq.peek(),2);
                pq.poll();
            }
            System.out.println(result);
        }
    }
}
