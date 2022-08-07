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
public class BFS_VH {
    static ArrayList<Integer> list[] = new ArrayList[1005];
    static ArrayList<Integer> res = new ArrayList<>();
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int start = sc.nextInt();
            for(int i = 1;i<=n;i++){
                check[i] = true;
                list[i] = new ArrayList<>();
            }
            for(int i = 1;i<=m;i++){
                int x =sc.nextInt();
                int y = sc.nextInt();
                list[x].add(y);
                list[y].add(x);         
            }
            
            BFS(start);
            System.out.println();
            
        }
    }
    public static void BFS(int u){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        q.add(u);
        res.add(u);
        check[u] = false;
        System.out.print("BFS("+ u+") = ");
        while(!q.isEmpty()){
            int v = q.poll();
            for(int i = 0;i< list[v].size();i++){
                int x = list[v].get(i);
                if(check[x]){
                    res.add(x);
                    check[x] = false;
                    q.add(x);
                }
            }
        }
        for(int i = 0;i<res.size();i++){
            if(i == res.size()-1){
                System.out.print(res.get(i));
            }
            else{
                System.out.print(res.get(i)+" -> ");
            }
        }
    }
            
}
