import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> subsequences = getSubsequences(s);
        
        System.out.println(subsequences);
    }
    
    public static List<String> getSubsequences(String s)
    {
        List<String> result = new ArrayList<>();
        getSubsequencesHelper(s , "", result);
        return result;
    }
    
    public static void getSubsequencesHelper(String s, String subsequence , List<String>result )
    {
        if(s.length() == 0)
        {
            result.add(subsequence);
            return;
        }
        getSubsequencesHelper(s.substring(1), subsequence + s.charAt(0), result);
        getSubsequencesHelper(s.substring(1), subsequence, result);
        
        
        
        
    }
}
