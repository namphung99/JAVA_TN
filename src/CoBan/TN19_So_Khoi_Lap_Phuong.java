/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN19_So_Khoi_Lap_Phuong {
    static ArrayList<Long> s = new ArrayList<>();
    static ArrayList<String> cubes = new ArrayList<>();
    static long n;

    static String solve(){
        String s1 = String.valueOf(n);
        for (int i = cubes.size() - 1; i >= 0; i--) {
            if(n < s.get(i)) continue;
            int temp = 0;
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) == cubes.get(i).charAt(temp)){
                    temp++;
                }
                if(temp == cubes.get(i).length()){
                    return cubes.get(i);
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (long i = 1; i <= 1e6; i++) {
            long temp = i * i * i;
            s.add(temp);
            String str = String.valueOf(temp);
            cubes.add(str);
        }
        while(t-- > 0){
            n = sc.nextLong();
            System.out.println(solve().trim());
        }

    }
}
