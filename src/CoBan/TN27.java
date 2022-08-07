/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN27 {
    static Scanner sc = new Scanner(System.in);
    static int test;
    static char[] a, b;

    public static void main(String[] args) {
        a = sc.next().toCharArray();
        b = sc.next().toCharArray();
        for (int i = 0; i < a.length; i++)
            if (a[i] == '6')
                a[i] = '5';
        for (int i = 0; i < b.length; i++)
            if (b[i] == '6')
                b[i] = '5';
        System.out.print(Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b)));
        for (int i = 0; i < a.length; i++)
            if (a[i] == '5')
                a[i] = '6';
        for (int i = 0; i < b.length; i++)
            if (b[i] == '5')
                b[i] = '6';
        System.out.print(" ");
        System.out.print(Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b)));
    }
}
