/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoThi;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class DFS_Vo_Huong {
    static ArrayList<Integer> dsKe[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int n, m, start;
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
            System.out.println();
        }
    }
    public static void DFS(int i) {
        System.out.print(i + " ");
        check[i] = false;
        for(Integer v : dsKe[i]) {
            if(check[v]) DFS(v);
        }
    }
}
