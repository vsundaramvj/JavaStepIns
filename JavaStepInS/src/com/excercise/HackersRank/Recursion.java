package com.excercise.HackersRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n >= 2 && n <= 20){
            while (n != 0) {
             return   n = n * factorial(n - 1);
              
            }
        }
        return 1;
      
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int result = factorial(n);
        System.out.println(result);
     //   bufferedWriter.write(String.valueOf(result));
    //    bufferedWriter.newLine();

    //    bufferedWriter.close();
//
        scanner.close();
	
	
    }
	
// in geeks for geeks: 
/*static int factorial(int n){      
    if (n == 1)      
      return 1;      
    else      
      return(n * factorial(n-1));      
}      

public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
} */ 
}
