package org.sathish.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        HashMap<Integer, String> value = new HashMap<Integer, String>();
        value.put(12,"dog");
        value.put(11,"cat");
        value.put(14,"pen");
        value.put(15,"fan");

        String animal= value.get(14);
        System.out.println(animal);

        for (Map.Entry<Integer,String> out : value.entrySet()){
            int key=out.getKey();
            String values= out.getValue();
            System.out.println(key + values);


        }
    }
}