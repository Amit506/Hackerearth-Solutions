package com.company;

import java.io.IOException;
import java.util.*;

public class MultipleOcurrences {


    int subtract(int i, int j) {
        int subResult = j - i;

        return subResult;
    }

    int getAnswer(ArrayList<Integer> arrayList) {
        int result = 0;
        MultipleOcurrences multipleOcurrences = new MultipleOcurrences();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrayList.size(); i++) {

            map.put(arrayList.get(i), i);
            map2.put(arrayList.get(i), arrayList.indexOf(arrayList.get(i)));
        }


        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

        Iterator<Map.Entry<Integer, Integer>> itr2 = map2.entrySet().iterator();

        while (itr.hasNext() && itr2.hasNext()) {

            Map.Entry<Integer, Integer> entry = itr.next();
            Map.Entry<Integer, Integer> entry2 = itr2.next();
            result = result + multipleOcurrences.subtract(entry2.getValue(), entry.getValue());

        }
        System.out.println(result);

        return 0;
    }


    public static void main(String args[]) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            MultipleOcurrences mul = new MultipleOcurrences();
            while (t-- > 0) {
                int arrayLength = sc.nextInt();

                ArrayList<Integer> list = new ArrayList<Integer>();

                while (arrayLength-- > 0) {
                    list.add(sc.nextInt());
                }
                mul.getAnswer(list);

            }

        } catch (Exception e) {
            return;
        }


    }


}

