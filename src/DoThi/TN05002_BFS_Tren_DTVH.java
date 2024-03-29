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
public class TN05002_BFS_Tren_DTVH {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];
    static Queue<Integer> queue = new LinkedList<>();

    static void BFS(int start){
        queue.add(start);
        check[start] = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(start);
        System.out.print( "BFS("+ start + ")"+" = ");
        while(!queue.isEmpty()){
            int x = queue.poll();
            for (int i = 0; i < list[x].size(); i++) {
                int y = list[x].get(i);
                if(check[y] == 1){
                    arr.add(y);
//                    System.out.print(y + " ");
                    queue.add(y);
                    check[y] = 0;
                }
            }
        }
        for(int i =0;i< arr.size();i++){
            if(i== arr.size()-1){
                System.out.print(arr.get(i));
            }
            else{
                System.out.print(arr.get(i) + " -> ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int n = sc.nextInt();
            int start = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            for (int i = 0; i < check.length; i++) {
                check[i] = 1;
            }
            BFS(start);
            System.out.println();
        }
    }
}
