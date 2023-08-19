import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result3{

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for(int i=n;i>0;i--){
            printTimes(i-1, " ");
            printTimes(n-i+1, "#");
            System.out.println();
        }
    }
    public static void printTimes(int times, String s){
        for(int i=0;i<times;i++){
            System.out.print(s);
        }
    }

}

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result3.staircase(n);

        bufferedReader.close();
    }
}
