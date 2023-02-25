import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int median = nums[n/2];
        int moves = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            moves += Math.abs(nums[i] - median);
        }
        System.out.println(moves);
    }
}
