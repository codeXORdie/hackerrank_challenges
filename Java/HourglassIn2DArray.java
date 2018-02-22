// @code_xor_die
// https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        //populate  array
        for(int row=0; row< 6; row++){
            for(int col=0; col< 6; col++){
                arr[row][col] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int row=0; row<4; row++) {
            for(int col=0; col<4; col++) {
                int sum = arr[row][col] + arr[row][col+1] + arr[row][col+2] +
                    arr[row+1][col+1] + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                if(max < sum) max = sum;
            }
        }
        System.out.print(max);
    }
}
