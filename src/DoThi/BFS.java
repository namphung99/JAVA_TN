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
public class BFS {
    static ArrayList<Integer>[] ke=new ArrayList[1005];
    static Boolean chuaxet[]= new Boolean[1005]; 
    public static void main(String[] args) {       
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();int m=in.nextInt();int u=in.nextInt();
            for(int i=1;i<=n;i++){
                ke[i]=new ArrayList<>();
                chuaxet[i]=true;
            }
            for(int i=1;i<=m;i++){
                int x=in.nextInt();int y=in.nextInt();
                ke[x].add(y);
                ke[y].add(x);
            }
            bfs(u);
            System.out.println();
        }
    }

    private static void bfs(int u) {
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        chuaxet[u]=false;
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");
            for(Integer x: ke[v]){
                if(chuaxet[x]){
                    chuaxet[x]=false;
                    q.add(x);
                }
            }
        }
    }
}
