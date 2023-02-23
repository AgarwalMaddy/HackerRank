import java.util.*;

public class Solution
{
    public static boolean canJump(int[] nums)
    {
        int lastPos = nums.length - 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--)
        {
            if(i + nums[i] >= lastPos)
            {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt();
        }
        
        if(canJump(nums))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
