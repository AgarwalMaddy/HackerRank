import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s");
        StringBuilder reversed = new StringBuilder();
        for(String word : words)
        {
            reversed.append(new StringBuilder(word).reverse().toString());
            reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }
}
