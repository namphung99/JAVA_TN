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
public class KeSangCanh {
    static ArrayList<Integer> list[] = new ArrayList[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i =1;i<=n;i++){
            list[i] = new ArrayList<>();
            String s = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(s, " ");
            while(stk.hasMoreTokens()){
                int k = Integer.parseInt(stk.nextToken());
                if(i<k){
                    list[i].add(k);
                }
                    
            }
        }
        for(int i=1;i<=n;i++){
            if(list[i].size() > 0){
                for(int j = 0;j< list[i].size(); j++){
                    System.out.print(list[i].get(j)+ " ");
                }
                System.out.println();
            }
        }
    }
}
