package day39_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums.indexOf(100)); // gives first 100
        System.out.println(nums.indexOf(700));
        System.out.println(nums.lastIndexOf(100)); // last 100

//        nums.remove((Integer)100); // removes the first 100
        // or
        nums.set(nums.indexOf(100),0); // better way to get the true index
        System.out.println(nums.indexOf(100)); // middle 100
    }
}
