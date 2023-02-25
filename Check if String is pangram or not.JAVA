import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[] check = new boolean[26];
        int index = 0; 
        for(int i = 0 ; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                index = c - 'a';
                check[index] = true;
            }
            
        }
        boolean pangram = true;
        for(int i = 0 ; i < 26; i++)
        {
            if(!check[i])
            {
                pangram = false;
                break;
            }
        }
        if(pangram)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
