//solution by @think_or_die
//https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.*;

public class Solution {

    static int countingValleys(int n, String s) {;
        int valey = 0;
        int step = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'U') step++;
            if(ch == 'D') step--;
            if(step == 0 && ch == 'U') valey++;
        }
        return valey;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
