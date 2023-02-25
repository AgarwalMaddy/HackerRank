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
        int maxSoFar = nums[0];
        int maxEnd = nums[0];
        for(int i = 1 ;  i <  n; i++)
        {
            maxEnd = Math.max(nums[i], maxEnd + nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEnd);
        }
        System.out.println(maxSoFar);
    }
}
