package day31_arrays;

import java.util.Arrays;

public class EqualsEx {
    public static void main(String[] args) {


        int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = a;
        System.out.println(a == b); // not the same object
        System.out.println(Arrays.equals(a,b));
        System.out.println(a == c); // same object

        boolean same = Arrays.equals(a,b);
        int[] d = {3,2,1};
        System.out.println(Arrays.equals(a,d));

    }
}
