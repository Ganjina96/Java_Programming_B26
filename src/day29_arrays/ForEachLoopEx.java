package day29_arrays;

public class ForEachLoopEx {
    public static void main(String[] args) {

        int [] nums = {30, 12, 159, 12};

        // traditional loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println();
        // for each loop, element is just the value of whatever we are giving in the array
        for (int element : nums){
            System.out.println("For each: " + element);
        }
        System.out.println();

        // string example

        String [] classes = {"java", "soft skills", "selenium", "database", "api"};

        // traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
        System.out.println();

        // for each loop
        for (String word : classes){
            System.out.println(word);
        }

        System.out.println();

        // double example

        double [] prices = {10.4, 40.2, 410.2};

        for (double each : prices){
            System.out.println("$" + each);
        }

    }
}
