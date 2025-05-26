package org.sathish.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> value = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> value1=new TreeMap<Integer,String>();
        sortedMap(value1);
    }
    public  static void sortedMap(Map<Integer,String> map){
    map.put(12, "one");
        map.put(13, "two");
        map.put(14, "three");
        map.put(16, "four");
        map.put(11, "five");
        map.put(12, "six");

        for (Integer numbers : map.keySet()){
            String count= map.get(numbers);
            System.out.println(numbers + count);

        }

    }

}
