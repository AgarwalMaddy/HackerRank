import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isPallindrome(s);
        System.out.println(result);
    }
    public static boolean isPallindrome(String s)
    {
        if(s.length() <= 1)
        {
            return true;
        }
        else if(s.charAt(0) != s.charAt(s.length()-1))
        {
            return false;
        }
        else
        {
            return isPallindrome(s.substring(1 , s.length()-1));
        }
        
    }
}
