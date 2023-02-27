import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,"a","c","b");
    }
    public static void towerOfHanoi(int n , String sourceRod , String destinationRod , String auxiliaryRod)
    {
        if(n == 1)
        {
            System.out.println(sourceRod + " " + destinationRod);
            return;
        }
        towerOfHanoi(n-1, sourceRod, auxiliaryRod, destinationRod);
        System.out.println(sourceRod + " " + destinationRod);
        towerOfHanoi(n-1, auxiliaryRod, destinationRod, sourceRod);
    }
}
