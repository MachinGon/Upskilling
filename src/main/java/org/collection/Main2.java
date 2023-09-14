package org.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Main2 {
    //14/Sep nextTask: functional interface

    public static void main(String[] args){
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua";
        HashMap<String,Long> map;
        map = Arrays.stream(loremIpsum.split("")) //separates String by char, if "" then all of them
                //.map(String :: toLowerCase) //all lowerCase to avoid UpperCase ocurrences
                .collect(Collectors.groupingBy(String::toLowerCase, LinkedHashMap::new, Collectors.counting())); //lambda function for group in Hashmap
        System.out.println("Unsorted HashMap: "+map);

        HashMap<String,Long> sortedMap = sortMinToMaxMap(map);
        System.out.println("Sorted HashMap: "+sortedMap);
        System.out.println("char menos repetido: "+sortedMap.entrySet().stream().findFirst().get().getKey());

        HashMap<String,Long> reverseSortedMap = sortMaxToMinMap(map);
        System.out.println("char mas repetido: "+reverseSortedMap.entrySet().stream().findFirst().get().getKey()+"\n");


        TreeMap<String,Long> tree;
        tree = Arrays.stream(loremIpsum.split(""))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
        System.out.println("Alphabetical order Treemap: "+tree);
        System.out.println(" valor max stream:"+tree.values().stream().max(Long::compareTo).get());
        System.out.println(" valor max Entry:_"+tree.entrySet().stream().max(Entry.comparingByValue()).get().getKey()+"_");


        tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare = map.get(o1).compareTo(map.get(o2));
                if (compare==0)
                    return 1;
                else
                    return compare;
            }
        });
        tree.putAll(map);
        System.out.println("Value order Treemap: "+tree);
        System.out.println("Treemap Min:"+ tree.pollFirstEntry().getKey() + "\nTreemap Max: "+tree.pollLastEntry().getKey());



        //functional interface -> (lista -> s, ... )
        
//        for(Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() +" : "+entry.getValue());
//        }

    }

    public static HashMap<String,Long> sortMaxToMinMap(Map<String, Long> map){
        List<Map.Entry<String,Long>> entries = new LinkedList<>(map.entrySet());
        entries.sort(new Comparator<Entry<String, Long>>() {
            @Override
            public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String,Long> sortedMap = new LinkedHashMap<>();
        for(Entry<String,Long> entry : entries){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }

    public static HashMap<String,Long> sortMinToMaxMap(Map<String, Long> map){
        List<Map.Entry<String,Long>> entries = new LinkedList<>(map.entrySet());
        entries.sort(new Comparator<Entry<String, Long>>() {
            @Override
            public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String,Long> sortedMap = new LinkedHashMap<>();
        for(Entry<String,Long> entry : entries){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }
}
