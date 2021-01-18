package com.company;

import java.util.ArrayList;

import java.io.IOException;
import java.util.Scanner;
class ArrayInsert {

    public static void main(String args[] ) throws  IOException{
try{

    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int q=sc.nextInt();

    int arr[]=new int[l];

    for(int i=0 ; i < l ; i++) {
        arr[i] = sc.nextInt();
    }
    while(q-- > 0)

    {

        int num=sc.nextInt();

        int x=sc.nextInt();

        int y=sc.nextInt();

        int sum=0;

        if(num==1)

        {

            arr[x]=y;

        }

        if(num == 2)

        {

            if(x>=0 && y<arr.length)

            {

                for(int i=x;i<=y;i++)

                {

                    sum+=arr[i];

                }

            }

            else

                sum=-1;

            System.out.println(sum);

        }



    }

}catch (Exception e){
    return;
}
    }

}