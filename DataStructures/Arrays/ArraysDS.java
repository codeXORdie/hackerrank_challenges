// solution by @think_or_die
// https://www.hackerrank.com/challenges/arrays-ds/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int x=0; x<size; x++) 
            arr[x] = sc.nextInt();
        for(int x=size-1; x>=0; x--)
            System.out.print(arr[x] + " ");
        }
}
