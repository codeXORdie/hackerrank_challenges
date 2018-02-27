// solution by @think_or_die
// https://www.hackerrank.com/challenges/sock-merchant/problem

import java.util.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : ar) {
            if(!map.containsKey(x)) map.put(x, 1);
            else map.put(x, map.get(x)+1);
        }
        int count = 0;
        for(int x : map.values()){
            count += x/2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
