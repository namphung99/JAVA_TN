/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OT.DT;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class DSA09004_DFS_VoHuong {
    static ArrayList<Integer> dske[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int n,m,start;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            m = sc.nextInt();
            start = sc.nextInt();
            for(int i =1;i<=n;i++){
                dske[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i =1;i<=m;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            DFS(start);
        }
    }
    
    public static void DFS(int i){
        check[i] = false;
        System.out.print(i+ " ");
        for(Integer u: dske[i]){
            if(check[u]){
                DFS(u);
            }
        }
    }
}
