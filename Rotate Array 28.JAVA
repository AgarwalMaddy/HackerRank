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
        int k = sc.nextInt();
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k ,n-1);
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
    }
    private static void reverse(int[] nums, int left, int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
