// solution to hackerrank challenge
// https://www.hackerrank.com/challenges/java-string-tokens/problem
// @think_or_die

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) { 
            System.out.print(0);
            return;
        }
        String s = scan.nextLine();
        s = s.trim();
        String[] tokens = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(tokens.length);
        for(String str : tokens) {
            System.out.println(str);
        }
        scan.close();
    }
}
