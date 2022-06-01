package Office_Hours;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String [] browsers = {"Chrome", "Firefox", "Chrome", "Edge", "IE", "Edge", "Safari", "Remote-Chrome"};


        System.out.println("---------------HASHSET-----------------");
        Set<String> hashSet = new HashSet<>(Arrays.asList(browsers));
        System.out.println(hashSet);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("---------------LinkedHASHSET-----------------");
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(browsers));
        System.out.println(linkedHashSet);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        System.out.println("---------------TREESET-----------------");
        Set<String> treeSet = new TreeSet<>(Arrays.asList(browsers));
        System.out.println(treeSet);
        //treeSet.add(null); doesn't accept null values
        System.out.println(treeSet);


        // Exercises

        Integer[] a={1,2,3,44,3,67,43,2,78,9,8};

        List<Integer> list = Arrays.asList(a);
        System.out.println(list);
        System.out.println("===================");

        // Remove duplicates from all cases

        // Keep insertion order
        System.out.println(new LinkedHashSet<>(list));

        // Return fifth element after remove    67
        System.out.println(new ArrayList<>(new LinkedHashSet<>(list)).get(4));

        // sort in ascending order
        System.out.println(new TreeSet<>(list));

        // sort in desc order
        ArrayList<Integer> sortedList = new ArrayList<>(new TreeSet<>(list));
        Collections.reverse(sortedList);
        System.out.println(sortedList);


    }
}
