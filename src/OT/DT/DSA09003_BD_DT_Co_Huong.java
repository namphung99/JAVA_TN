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
public class DSA09003_BD_DT_Co_Huong {
    static ArrayList<Integer> list[] = new ArrayList[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int V = sc.nextInt(); int E = sc.nextInt();
            for(int i =1;i<=V;i++){
                list[i] =  new ArrayList<>();
            }
            for(int i = 1;i<=E;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list[x].add(y);
            }
            for(int i =1;i<=V;i++){
                System.out.print(i+": ");
                Collections.sort(list[i]);
                for(Integer k: list[i]){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
}
