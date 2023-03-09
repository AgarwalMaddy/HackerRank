import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =  0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        quickSort(arr , 0 , n-1);
        
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void quickSort(int[] arr , int low , int high)
    {
        if(low < high)
        {
            int pi = partition(arr , low , high);
            
            quickSort(arr, low , pi - 1);
            quickSort(arr , pi + 1 , high);
        }
    }
    
    public static int partition(int[] arr , int low , int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low ; j <= high - 1 ; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
} 
