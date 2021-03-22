package com.company;

import java.io.IOException;
import java.util.Scanner;

public class SummationProblem {
    static  public  long solve( long n)
    {
       long ans=0;
        for( long i=1;i<=n;i++)
            ans+=(n/i);
        return ans;
    }

    public  static  void main(String args[]) throws IOException {
     try {
//         Scanner sc = new Scanner(System.in);
//         long testCases = sc.nextInt();
//         while (testCases-->0){
//             long  n = sc.nextInt();
             long ans = SummationProblem.solve(2);
             System.out.println(ans);

//
//         }
     }catch (Exception e){
         return;
     }
    }
}
