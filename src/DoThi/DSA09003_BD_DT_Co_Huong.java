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
public class DSA09003_BD_DT_Co_Huong {
    static ArrayList<Integer>[] lists = new ArrayList[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            int V = scanner.nextInt(),E = scanner.nextInt();
            for(int i =0; i <= V;i ++){
                lists[i] = new ArrayList<>();

            }
            for(int i = 1; i <= E; i++){
                int x= scanner.nextInt(),y =scanner.nextInt();
                lists[x].add(y);
            }
            for(int i = 1; i <= V;i++){
                System.out.print(i+": ");
                Collections.sort(lists[i]);
                for(Integer k : lists[i]){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
}
