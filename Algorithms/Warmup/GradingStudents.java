//solution by @think_or_die
//https://www.hackerrank.com/challenges/grading/problem


import java.util.*;

public class Solution {

    static int[] solve(int[] grades){
        int[] rounds = new int[grades.length];
        for(int x=0; x<grades.length; x++) {
            int grade = grades[x];
            if(grade < 38 || grade%5 < 3) rounds[x] = grade;
            else rounds[x] = grade + (5-(grade%5));
        }
        return rounds;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
