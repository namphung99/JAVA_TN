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
public class DFS_VH {
    static ArrayList<Integer> list[] =  new ArrayList[1005];
    static ArrayList<Integer> res =  new ArrayList<>();
    static boolean check[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int start = sc.nextInt();
            for(int i =1;i<=n;i++){
                list[i] = new ArrayList<>();
                check[i] = true;
            }
            for(int i =1;i<=m;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            DFS(start);
            System.out.println();
            System.out.print("DFS(" + start+") = ");
            for(int j = 0;j<res.size();j++){
                if(j == res.size()-1){
                    System.out.print(res.get(j));
                }else{
                    System.out.print(res.get(j) + " -> "); 
                }
            }
            System.out.println();
        }
    }
    
    public static void DFS(int i){
        res.add(i);
        check[i] = false;
        for(Integer x: list[i]){
            if(check[x]){
                DFS(x);
            }
        }
    }
}
