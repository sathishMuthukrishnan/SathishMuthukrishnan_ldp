package org.sathish.ArrayList;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        ArrayList<Integer> value =new ArrayList<Integer>();
        value.add(20);
        value.add(30);
        value.add(40);

        System.out.println("value is:"+ value.get(2));
        for (int i=0;i< value.size();i++){
            System.out.println("iterated values: "+ value.get(i));

        }
        for (Integer val : value){
            System.out.println("iterated values: "+ val);

        }


    }
}
