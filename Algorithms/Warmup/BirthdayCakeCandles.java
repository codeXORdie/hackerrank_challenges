//solution by @think_or_die
//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
import java.util.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 1;
        int max = ar[n-1];
        for(int x=n-2; x>=0; x--) {
            if(ar[x] == max) count++;
            else break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
