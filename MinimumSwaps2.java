import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int numberOfSwaps = 0;
        int correctIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                correctIndex = i;
                while (arr[correctIndex] != i + 1) {
                    correctIndex++;
                }
                //Since we have got correct Index now, we will swap it with the number at its current index
                arr[correctIndex] =  arr[i];
                arr[i] = i+1;
                numberOfSwaps++;
            }
        }
        //Printing sorted Array
        System.out.println(new ArrayList<Integer>(){{for(int i : arr) add(i);}});
        return numberOfSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

