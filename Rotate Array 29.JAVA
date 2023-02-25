import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0 ; i < m;i++)
        {
            for(int j = 0; j < n ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[][] rMatrix = new int[m][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                rMatrix[i][j] = matrix[n - j - 1][i];
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ;j < n; j++)
            {
                System.out.print(rMatrix[i][j] + " ");
            }
        }
    }
}
