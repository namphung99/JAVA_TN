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
public class DSA09005 {
    static ArrayList<Integer> dske[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); 
            int m = sc.nextInt();
            int start = sc.nextInt();
            for(int i =1 ; i<=n;i++){
                dske[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i = 1;i<=m;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            BFS(start);
            System.out.println();
        }
    }
    public static void BFS(int u){
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        check[u] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+ " ");
            for(Integer x: dske[v]){
                if(check[x]){
                    check[x] = false;
                    q.add(x);
                }
            }
        }
    }
}
