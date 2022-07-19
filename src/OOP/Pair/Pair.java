/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Pair;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class Pair<K,V> {
    private static  int K;
    private static  int V;

    public Pair(int a, int b) {
        this.K = a;
        this.V = b;
    }

    public boolean isPrime() {
        return checkPrime(K) && checkPrime(V);
    }

    private boolean checkPrime(int n) {
        if (n < 2) return false;
        else for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public String toString() {
        return K+" "+V;
    }
}