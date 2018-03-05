// solution by @think_or_die
// https://www.hackerrank.com/challenges/2d-array/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[6][6];
        for(int row=0; row<6; row++) {
            for(int cmn=0; cmn<6; cmn++) {
                arr[row][cmn] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int row=0; row<4; row++) {
            for(int cmn=0; cmn<4; cmn++) {
                int sum = arr[row][cmn] + arr[row][cmn+1] + arr[row][cmn+2] +
                          arr[row+1][cmn+1] +
                          arr[row+2][cmn] + arr[row+2][cmn+1] + arr[row+2][cmn+2];
                if(sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}
