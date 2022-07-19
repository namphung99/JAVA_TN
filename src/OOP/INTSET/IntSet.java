/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.INTSET;

import java.util.TreeSet;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int[] a) {
        for(int i = 0; i < a.length; i++)
            set.add(a[i]);
    }

    @Override
    public String toString() {
        String res = "";
        for(Integer i : set){
            res += i +" ";
        }
        return res;
    }

    public IntSet union(IntSet s2) {
        IntSet u = new IntSet();
        u.set.addAll(set);
        u.set.addAll(s2.set);
        return u;
    }
}
