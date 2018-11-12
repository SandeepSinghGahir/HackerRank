import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] queue) {
        int bribes = 0;
        
        boolean swapped = false;
        boolean chaoticflag = false;
        do
        {
            swapped = false;            
            for(int i = 0; i < queue.length-1; i++){
                if(queue[i] - (i + 1) > 2){
                   chaoticflag=true;
                    break;
                }               
                if(queue[i] > queue[i+1]){
                    //swap elements
                    int temp = queue[i+1];
                    queue[i+1] = queue[i];
                    queue[i] = temp;                    
                    swapped = true;
                    bribes++;
                }
            }
        }
        while(swapped);
        if(chaoticflag)
            System.out.println("Too chaotic");
        else
            System.out.println(bribes);   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
         minimumBribes(q);
        }
        
        scanner.close();
    }
}

