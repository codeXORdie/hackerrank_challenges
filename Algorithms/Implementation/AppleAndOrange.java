//solution by @think_or_die
//https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countA = 0;
        int countO = 0;
        for(int x : apples) {
            if(x > 0) {
                int distance = a + x;
                if(distance >= s && distance <= t) countA++;
            }
        }
        for(int x : oranges) {
            if(x < 0) {
                int distance = b + x;
                if(distance <= t && distance >= s) countO++;
            }
        }
        System.out.printf("%d%n%d", countA, countO);   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
