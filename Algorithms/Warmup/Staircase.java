// solution by code-xor-die
// https://www.hackerrank.com/challenges/staircase/problem

import java.util.*;

public class Solution {

    static void staircase(int n) {
       for(int row=1; row<=n; row++) {
           //print out spaces
           for(int space=n; space>row; space--) {
               System.out.print(" ");
           }
           //print out #
           for(int symbol=1; symbol<=row; symbol++) {
               System.out.print("#");
           }
           //new row
           System.out.println();
       }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
