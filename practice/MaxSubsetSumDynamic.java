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
        if(len >= 3)
        {
            int dArrLen = (len-2)+ (int)Math.pow(2, len-4);
            int dArr[][] = new int[len-1][dArrLen];
            int max = arr[0]+arr[2];

            for(int i=1; i<len-1; i++)
            {
                int locN = i+2;

                int locLen;
                if(i==1) locLen = 1;
                else locLen = (locN-2)+(int)Math.pow(2, locN-4);

                for(int j=1; j<locN-1; j++)
                {
                    dArr[i][j] = arr[j-1]+arr[locN-1];
                    if (dArr[i][j] > max) max = dArr[i][j];
                }
                
                int cNum = locN-2;
                int counter = cNum+1;
                for(int pR=1; pR<=i-2; pR++)
                {
                    int locN2 = pR+2;

                    int locLen2;
                    if(pR==1) 
                    {
                         System.out.printf("i: %d, counter: %d, pR: %d%n", i, counter, pR);
                         dArr[i][counter] = dArr[pR][1]+arr[locN-1];
                         if(dArr[i][counter] > max) max = dArr[i][counter];
                         counter++;
                    }
                    else 
                    {
                       locLen2 = pR + (int)Math.pow(2, locN2-4);
                       
                       for(int c2=1; c2<locLen2; c2++)
                       {   
                                                 
                           System.out.printf("i: %d, counter: %d, pR: %d, c2: %d%n", i, counter, pR, c2);
                           dArr[i][counter] = dArr[pR][c2]+arr[locN-1];
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
        else 
        {
            int max = arr[0];
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i] > max) max = arr[i];
            }
            return max;
        }       

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