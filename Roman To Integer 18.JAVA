import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        
        int result = romantoInt(roman);
        System.out.println(result);
    }
    
    public static int romantoInt(String roman)
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0 ;
        int prev = 0 ;
        for(int i = roman.length() - 1 ; i >= 0 ; i--)
        {
            int curr = map.get(roman.charAt(i));
            if(curr < prev)
            {
                result -= curr;
            }
            else
            {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}
