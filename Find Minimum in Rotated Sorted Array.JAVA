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
        int min = nums[0];
        System.out.println(min);
    }
}
