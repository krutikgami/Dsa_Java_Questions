package GreedyProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class chocolaProblem {
    public static void main(String[] args) {
    
    Integer horizontal [] = {1,3,5};
    Integer vertical [] = {4,2,3};

    Arrays.sort(horizontal,Comparator.reverseOrder());
    Arrays.sort(vertical,Comparator.reverseOrder());

    int h =0, v =0; 
    int vp = 0,hp = 0,cost = 0;

    while (h<horizontal.length && v<vertical.length) {
        if (vertical[v]<=horizontal[h]) {
            cost = horizontal[h] * vp;
            hp++;
            h++;
        }else{
            cost = vertical[v] * hp;
            vp++;
            v++;
        }
    }

    while (v<vertical.length) {
        cost = vertical[v] * hp;
        vp++;
        v++;
    }
    while (h<horizontal.length) {
        cost = horizontal[h] * vp;
        hp++;
        h++;
    }
    
    System.out.println("Minimum cost to cut the chocolate : "+cost);
}
    
}
