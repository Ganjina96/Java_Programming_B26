package day48_encapsulation;

import java.util.Arrays;

import static java.util.Arrays.*; // this lines imports all the static members from the Arrays class

import static java.lang.Math.*;

import static my_utilities.StringUtil.reverse;

    public class WithImport {
        public static void main(String[] args) {
            int [] a = { 4, 12, 5, 25};

            sort(a);

            System.out.println(Arrays.toString(a));

            System.out.println(PI);

            System.out.println(abs(-1)); // Math.abs()

            System.out.println(reverse("apple"));
        }
}
