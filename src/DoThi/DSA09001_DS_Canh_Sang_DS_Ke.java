/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoThi;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class DSA09001_DS_Canh_Sang_DS_Ke {
    static List<Integer>[] ke = new ArrayList[1005];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            int v = scanner.nextInt(), e = scanner.nextInt();
            for(int i = 1; i <= v; i++){
                ke[i] = new ArrayList<>();
            }
            for(int i = 1; i <= e; i++){
                int a = scanner.nextInt(),b = scanner.nextInt();
                ke[a].add(b);
                ke[b].add(a);
            }
            for(int i = 1; i <= v; i++){
                System.out.print(i+": ");
                for(int j = 0; j < ke[i].size(); j++)
                    System.out.print(ke[i].get(j)+" ");
                System.out.println();
            }
        }
    }
}
