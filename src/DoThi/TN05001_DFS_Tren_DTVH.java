/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoThi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN05001_DFS_Tren_DTVH {
    static ArrayList<Integer> dsKe[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int n, m, start;
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            start = scanner.nextInt();
            for(int i = 1; i <= n; i++) dsKe[i] = new ArrayList<>();
            for(int i = 1; i <= n; i++) check[i] = true;
            for(int i = 1; i <= m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            DFS(start);
            System.out.print( "DFS("+ start + ")"+" = ");
            for(int i =0;i< arr.size();i++){
                if(i== arr.size()-1){
                    System.out.print(arr.get(i));
                }
                else{
                    System.out.print(arr.get(i) + " -> ");
                }
            }
            System.out.println();
        }
    }
    public static void DFS(int i) {
        arr.add(i);
//        System.out.print(i + " ");
        check[i] = false;
        for(Integer v : dsKe[i]) {
            if(check[v]) DFS(v);
        }
    }
}
