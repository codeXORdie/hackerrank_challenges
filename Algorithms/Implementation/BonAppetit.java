// solution by @think_or_die
//https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of items ordered
        int k = sc.nextInt(); //index of an item Anna didn't eat
        int aShare = 0;
        for(int x=0; x<n; x++) {
            int price = sc.nextInt();
            if(x != k) aShare += price;
        }
        int charged = sc.nextInt();
        System.out.print((aShare/2 == charged) ? "Bon Appetit" : (charged - aShare/2));
    }
}
