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
public class DSA09001_DS_Ke_Sang_DS_Canh {
    static List<Integer>[] a = new ArrayList[1003];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++){
            a[i] = new ArrayList<>();
            String s = scanner.nextLine();
            StringTokenizer stk = new StringTokenizer(s," ");
            while (stk.hasMoreTokens()){
                int k = Integer.parseInt(stk.nextToken());
                if(i < k)
                    a[i].add(k);
            }
        }
        for(int i = 1; i <= n; i++){
            if(a[i].size() > 0){
                for(int j = 0 ; j < a[i].size(); j++)
                    System.out.println(i +" "+a[i].get(j));
            }
        }
    }
}
