package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseEx {

    public static void main(String[] args) {

        /*

            People
                FIRST_NAME: James
                LAST_NAME: Bond
                BATCH: 7


         */

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME","Bond");
        map.put("BATCH", "7");
        System.out.println(map);

        List<  Map<String, String> > list = new ArrayList<>();
        list.add(map); // index 0
        list.add(makeMap("Shina", null, "26")); // index 1
        list.add(makeMap("Ganjina", "Nagzibekova", "24")); // index 2
        list.add(makeMap("Saeeda", "Daoud", "19")); // index 3
        list.add(makeMap("Oleksandra", "Pohorielova", "23")); // index 4
        list.add(makeMap("Khouloud", "Bergui", "18")); // index 5

        // how can I check the last name of the map I just added
        System.out.println(list.get(1).get("FIRST_NAME")); // first get is from the list by index, then we have the get method from map to give the value by the key
        System.out.println(list.get(1).get("LAST_NAME"));

        System.out.println();

        // Go thru the ArrayList of Map elements - the map elements are the info for each person

        for (Map<String,String> each: list){
            System.out.println(each);
        }

        System.out.println();

        // Go thru all the people and print all the first names

        for (Map<String,String> each : list){
            System.out.println(each.get("FIRST_NAME")); // each is each map, the maps are the people's info
        }

        System.out.println();

        // Find all the people who are in batch 20 and above

        for (Map<String,String> each : list){
            if (Integer.parseInt(each.get("BATCH")) >= 20){
                System.out.println(each.get("FIRST_NAME"));

            }
        }

        System.out.println();

        // print the info of the last person in my list
        System.out.println("First name: " + list.get(list.size()-1).get("FIRST_NAME"));
        System.out.println("Last name: " + list.get(list.size()-1).get("LAST_NAME"));
        System.out.println("Batch number: " + list.get(list.size()-1).get("BATCH"));
        
    }

    public static Map<String, String> makeMap (String ... values) {
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }
}
