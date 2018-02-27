//solution by 
//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.*;


public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        //use sorted map to keep track of birds sights
        Map<Integer, Integer> map = new TreeMap<>();
        //loop through the ar, populate map
        for(int x : ar) {
            //if the key(id of a bird) does not exist, add it to the map
            if(!map.containsKey(x)) map.put(x, 1);
            //otherwise, increase its value
            else map.put(x, map.get(x)+1);
        }
        int id = 0; 
        int sights = 0;
        for(int x : map.keySet()) {
            if(map.get(x) > sights) {
                sights = map.get(x);
                id = x;
            } 
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
