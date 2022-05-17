package day28_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal variables

        String city1 = "Chicago";
        String city2 = "New York";
        String city3 = "Houston";
        String city4 = "Denver";
        String city5 = "Pittsburgh";

        // declare array with values

        String [] cities = { "Chicago", "New York", "Houston", "Denver", "Pittsburgh"};

        String [] cities2 = {city1, city2, city3, city4, city5}; // can do this one but does not make sense to do twice

        // how to access each element in the array

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // print all the cities in one line

        System.out.println("Reverse order of the cities: " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);

        // print the array all at one time
        //        System.out.println(cities); // this doesn't print the array how we want, gives an error
        System.out.println(Arrays.toString(cities)); // this method from Arrays class lets you print the array fully


        // number of elements

        System.out.println(cities.length);



    }
}
