import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            prices[i] = sc.nextInt();
        }
        
        int maxProfit = 0 ;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0 ; i< n; i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else if(prices[i] - minPrice > maxProfit)
            {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        System.out.println(maxProfit);
    }
}
