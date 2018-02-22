// solution by code-xor-die
// https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;
        Arrays.sort(arr);
        //sum up all numbers but the last to get min
        for(int x=0; x<arr.length-1; x++) {
            min += arr[x];
        }
        //sum up all numbers but the first to get max
        for(int x=1; x<arr.length; x++) {
            max += arr[x];
        }
        System.out.print(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
