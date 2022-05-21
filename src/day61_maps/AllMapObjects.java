package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        // no insertion order, random, allows null
        Map<String, String> map = new HashMap<>();
        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "ui testing");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);

        // maintains insertion order, null allowed
        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("saim", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "ui testing");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null, "nothing");
        System.out.println(linked);

        // sorts the keys in (natural) ascending order and does not allow null key
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("saim", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("aysun", "ui testing");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
        //treeMap.put(null, "nothing");
        System.out.println(treeMap);

        // like HashMap but does not allow null keys/ values
        Map<String, String> table = new Hashtable<>();
        table.put("saim", "java");
        table.put("hello", "world");
        table.put("james", "bond");
        table.put("aysun", "ui testing");
        table.put("nadir", "soft skills");
        table.put("username", "password");
      //  table.put(null, "nothing");
        System.out.println(table);




    }
}
