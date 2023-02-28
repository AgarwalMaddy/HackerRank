import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = removeX(s);
        System.out.println(result);
        
    }
    public static String removeX(String s)
    {
        if(s.length() == 0 )
        {
            return s;
        }
        if(s.charAt(0) == 'x')
        {
            return removeX(s.substring(1));
        }
        return s.charAt(0) + removeX(s.substring(1));
    }
}
