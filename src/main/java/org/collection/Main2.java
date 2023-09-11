package org.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args){
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua";
        HashMap<String,Long> map;
        map = Arrays.stream(loremIpsum.split("")) //separates String by char, if "" then all of them
                .map(String :: toLowerCase) //all lowerCase to avoid UpperCase ocurrences
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting())); //lambda function for group in Hashmap
        System.out.println(map);

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }

    }
}
