package day28_arrays;

public class MaxMin {
    /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */
    public static void main(String[] args) {

        int [] nums = {100, 120, -80, 90, 250, -10};
        int max = nums[0]; // in arrays it is good to start with the first digit
        int min = nums[0];

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];

            if (num > max){ // if (nums[i] > max)
                max = num; // max = nums[i]
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println("My max is: " + max + " and my min is: " + min);







    }




}
