
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN12_ToHop_Tiep_Theo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n,k;
            n = sc.nextInt();
            k = sc.nextInt();
            int[] a = new int[k+2];
            int[] b = new int[k+2];
            int[] dd = new int[n+2];
            for(int i = 1; i <= n; i++){
                dd[i] = 0;
            }
            for(int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
                dd[a[i]] = 1;
            }

            int i = k;
            while(i>0 && b[i] == n-k+i) i--;
            if(i > 0){
                int count = 0;
                b[i] ++;
                for(int j = i+1; j <= k; j++)
                    b[j] = b[i] + j - i;
                for(int j = 1; j <= k; j++)
                    if(dd[b[j]]==0)
                        count ++;
                System.out.println(count);
            }else{
                System.out.println(k);
            }
        }
    }
}
