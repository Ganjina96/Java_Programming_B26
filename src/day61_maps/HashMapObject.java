package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        // keys are Integer and values are String
        // add key/value to the map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); // HashMap element order is random, not insertion order, not sorted

        // read the key/value from map
        System.out.println(map.get(10)); // argument is the key, not index

        String value = map.get(5);
        System.out.println(value);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world");
        System.out.println(map);

        // no duplicate keys allowed, but you can have duplicate values. Maps allow null keys and values

        // put can work as both add and update
        map.put(3, "March");
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);
    }
}
