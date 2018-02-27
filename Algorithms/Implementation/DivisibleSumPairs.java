// solution by @think_or_die
// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.util.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for(int x=0; x<ar.length-1; x++) {
            for(int i=x+1; i<ar.length; i++) {
                if((ar[x]+ar[i])%k==0) count++;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
