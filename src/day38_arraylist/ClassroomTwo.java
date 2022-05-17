package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {

    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group); // [Ziba]

        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]

        System.out.println(group.get(0)); // Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Olga");
        System.out.println(group); // [Victor, Ziba, Olga]

        group.add(1,"James");
        System.out.println(group); // [Victor, James, Ziba, Olga]

        System.out.println(group.add("Emre"));
        System.out.println(group); // [Victor, James, Ziba, Olga, Emre]

    }
}
