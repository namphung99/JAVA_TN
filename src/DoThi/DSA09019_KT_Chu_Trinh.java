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
public class DSA09019_KT_Chu_Trinh {
    static List<Integer>[] list = new ArrayList[1003];
    static boolean chuTrinh = false;
    static boolean chuaXet[] = new boolean[1003];
    static int truoc[] = new int[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            chuTrinh = false;
            int V = scanner.nextInt(), E = scanner.nextInt();
            for (int i = 0; i <= V; i++) {
                list[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= E; i++) {
                int x = scanner.nextInt(), y = scanner.nextInt();
                list[x].add(y);
                list[y].add(x);
            }
            for (int i = 1; i <= V; i++) {
                if (chuaXet[i]) {
                    if (bfs(i)) {
                        chuTrinh = true;
                        break;
                    }
                }
            }
            if (chuTrinh) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaXet[s] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer k : list[x]) {
                if (chuaXet[k]) {
                    chuaXet[k] = false;
                    truoc[k] = x;
                    queue.add(k);
                } else if (k != truoc[x]) return true;
            }
        }
        return false;
    }
}
