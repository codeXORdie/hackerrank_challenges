// https://www.hackerrank.com/challenges/diagonal-difference/problem
// solution by @code-xor-die

public class Solution {

    static int diagonalDifference(int[][] a) {
        int sum1 = 0; //holds sum of the right to left diagonal
        int sum2 = 0;  //holds sum of the left to right diagonal
        for(int x=0; x<a.length; x++) {
            sum1 += a[x][x];
            sum2 += a[x][a.length-1-x];
        }
        return Math.abs(sum1-sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
