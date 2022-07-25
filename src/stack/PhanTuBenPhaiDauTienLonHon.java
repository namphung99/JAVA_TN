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
public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 5];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.next());
                while (stack.size() > 0 && arr[stack.peek()] < arr[i]) {
                    arr[stack.peek()] = arr[i];
                    stack.pop();
                }
                stack.push(i);
            }
            while (stack.size() > 0) {
                arr[stack.peek()] = -1;
                stack.pop();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
