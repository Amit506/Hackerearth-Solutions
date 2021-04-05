package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Divisible {

public static int firstDigit(int n){

    int f =0;
    while (n>=10){
        n=n/10;
        f=n;
    }
    return f;
}

    public  static  void main(String srgd[])throws  IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long oddPLaces = 0;
        long evenPlaces = 0;
        String str="";
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
              if(i<n/2){
                  str = str +firstDigit(array[i]);

              }else {
                  str= str+array[i]%10;
              }
        }

for (int i =0;i<str.length();i++){
    long j=Integer.parseInt(String.valueOf(str.charAt(i)));
    if(i%2==0){
        oddPLaces=oddPLaces+ j;
    }else {
        evenPlaces=evenPlaces+j;
    }


}
if((oddPLaces-evenPlaces)==0||(oddPLaces-evenPlaces)%11==0){
    System.out.println("OUI");
}else {
    System.out.println("NON");
}
    }

}
