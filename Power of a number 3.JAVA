import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        for(int i = 0 ; i < 2; i++)
        {
            nums[i] = sc.nextInt();
        }
        double result = Math.pow(nums[0], nums[1]);
        System.out.println((int)result);
    }
}
