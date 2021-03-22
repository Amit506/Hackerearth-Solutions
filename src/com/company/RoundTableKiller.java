package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RoundTableKiller {


    static  int getAns(ArrayList arrayList, int k, int gunHolder){
        int  totalLength = arrayList.size();
        int kills = gunHolder%k;
        int i = gunHolder;
int test =11;
while(test>5){
if(totalLength>i+kills){
    System.out.println("greater situation");
    int count =0;
    for (int m =i+1;i<totalLength;i++){
        System.out.println(arrayList.set(m-1,0));
        count++;
    }
    if(count==kills){
        i =0;
        kills= i%k;
    }
    else {

        for (int m =0;m<kills-count;m++){
            System.out.println(arrayList.set(m,0));
        }
        i= kills-count;
    }



}
else{
    for(int j = i+1;j<i+kills+1;j++){
        System.out.println(arrayList.set(j-1,0));

    }
    i=i+kills+1;
    kills = i%k;
}

     System.out.println(arrayList);


    test--;
}
        System.out.println(i);
        return 0;

    }
public  static  void main(String args[])throws IOException{


    try {

        Scanner sc = new Scanner(System.in);
        int playersNo = sc.nextInt();
        int specialNo = sc.nextInt();
        int holdingGun = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>(playersNo);
        for(int i =1;i<=playersNo;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
RoundTableKiller.getAns(arrayList, specialNo,holdingGun);

    }catch (Exception e){
        return;
    }
}
}
