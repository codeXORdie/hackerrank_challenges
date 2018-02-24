//solution by @think_or_die
//https://www.hackerrank.com/challenges/kangaroo/problem

import java.util.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        /*
        1. In condition the position(x2) of roo2 is always greater than the position(x1) of roo1
        2. Therefore, roos can meet only if the jump distance(v1) of roo1 is greater than the 
           jump distance(v2) of roo2
        3. Make an equation to see if the roos can meet:
                x1 + v1*z = x2 + v2*z; where z is the jumps
                z*(v1-v2) = x2 - x1; where v1-v2 must be positive
        4. Roos will meet if (x2-x1)%(v1-v2) equals 0
        */
        if(v1 <= v2 || !((x2-x1)%(v1-v2) == 0)) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
