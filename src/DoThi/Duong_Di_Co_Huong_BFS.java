/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Duong_Di_Co_Huong_BFS {
    static int n,m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            n = in.nextInt(); m = in.nextInt();
            int  s = in.nextInt(),t = in.nextInt();
          
            for(int i=0;i <=n ;i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;            }
            for(int i=1;i<=m;i++){
                int u= in.nextInt(), v = in.nextInt();
                dske[u].add(v);
               dske[v].add(u); // vo huong, bo di la co huong
            }
            bfs(s);
            if(chuaxet[t]) System.out.println(-1);
            else{
               ArrayList<Integer> kq = new ArrayList<>();
               int x =t;
               while(x!=s){
                   kq.add(x);
                   x = truoc[x];
               }
               kq.add(s);
               Collections.reverse(kq);
               for(Integer tmp: kq){
                   System.out.print( tmp+ " ");
               }
                System.out.println();
            }
        }
    }
    
   public static void bfs(int u){
        Queue<Integer> q = new LinkedList<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v + " ");
            for(Integer x : dske[v]){
                if(chuaxet[x]){
                    q.add(x); chuaxet[x] = false;
                    truoc[x] = u;
                }
            }
        }
    }
}
