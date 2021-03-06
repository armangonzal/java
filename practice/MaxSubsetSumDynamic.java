import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;


public class MaxSubsetSumDynamic {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        
         int len = arr.length;
         int dArrLen = (len-2) + (int)Math.pow(2, len-4);
         int dArr[][] = new int[len+1][dArrLen];
         int max = arr[0]+arr[2];

         for(int i=3; i<=len; i++)
         {
            int locLen;
            if(i==3) locLen = 1;
            else locLen = (i-2)+(int)Math.pow(2, i-4);

            for(int j=1; j<=i-2; j++)
            {
               dArr[i][j] = arr[j-1]+arr[i-1];
               if (dArr[i][j] > max) max = dArr[i][j];
            }
                
            int counter = i-1;
                
            for(int pR=3; pR<=i-2; pR++)//counting all previous rows except for the row i-1
            {
               if(pR==3) 
               {
                  //System.out.printf("i: %d, counter: %d, pR: %d%n", i, counter, pR);
                  dArr[i][counter] = dArr[pR][1]+arr[i-1];
                  if(dArr[i][counter] > max) max = dArr[i][counter];
                  counter++;
               }
               else 
               {
                  int locLen2 = pR-2 + (int)Math.pow(2, pR-4);
                       
                  for(int c2=1; c2<=locLen2-1; c2++)
                  {                          
                     //System.out.printf("i: %d, counter: %d, pR: %d, c2: %d%n", i, counter, pR, c2);
                     dArr[i][counter] = dArr[pR][c2]+arr[i-1];
                     if(dArr[i][counter] > max) max = dArr[i][counter];
                     counter++;                           
                  }
               }
            }
         }
         for(int i=0; i<dArr.length; i++)
         {
            System.out.println(Arrays.toString(dArr[i]));
         }
         return max; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inputGen.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}