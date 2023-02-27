import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        printWave(arr,n,m);
        
    }
    public static void printWave(int[][] arr, int n, int m)
    {
        for(int j = 0 ; j < m ; j++)
        {
            if(j % 2 == 0)
            {
                for(int i = 0 ; i < n ; i++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for(int i = n -1 ; i >= 0 ; i--)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
