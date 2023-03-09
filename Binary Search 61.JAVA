import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        int index = binarySearch(arr,x);
        
        if(index == -1)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(index);
        }
    }
   public static int binarySearch(int[] arr, int x)
   {
       int low = 0, high = arr.length - 1;
       
       while(low <= high)
       {
           int mid = (low + high) / 2;
           
           if(arr[mid] == x)
           {
               return mid;
           }
           else if(arr[mid] < x)
           {
               low = mid + 1;
           }
           else
           {
               high  = mid - 1;
           }
       }
       return -1;
       
   }
}
