import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    String stepsArray[] = s.split("");
        int valleyFlag=0;
        int counter=0;
        int valleys=0;
        for(String eachStep : stepsArray){
            if(eachStep.equalsIgnoreCase("D") && counter==0)
                valleyFlag=1;
            counter = (eachStep.equalsIgnoreCase("D")) ? (--counter) : (++counter);
            if(counter==0 && valleyFlag==1 ){
                ++valleys;            
                valleyFlag=0;
            }
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

