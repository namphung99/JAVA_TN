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
public class T225_GT_NN_Cua_Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int k = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            int[] arr = new int[256];
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i)]++;
            }
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for (int i = 0; i < 256; i++) {
                if (arr[i] > 0) q.add(arr[i]);
            }
            while (k-- > 0) {
                int temp = q.poll();
                if (temp > 0) {
                    temp--;
                    q.add(temp);
                }
            }
            long sum = 0;
            while (!q.isEmpty()) {
                int temp = q.poll();
                sum = sum + (long) temp * temp;
            }
            System.out.println(sum);
        }
    }
}
