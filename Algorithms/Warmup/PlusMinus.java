// solution by @think_or_die
// https://www.hackerrank.com/challenges/plus-minus/problem

public class Solution {

    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int x : arr) {
            if(x > 0) pos++;
            if(x < 0) neg++;
            if(x == 0) zero++;
        }
        System.out.printf("%.6f%n%.6f%n%.6f%n", (double)pos/arr.length, (double)neg/arr.length,    (double)zero/arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
