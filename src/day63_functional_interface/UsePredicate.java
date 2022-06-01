package day63_functional_interface;

import java.util.function.Predicate;

public class UsePredicate {

    public static Predicate<String> isPalindrome = str -> {

        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    };

    public static Predicate<Integer> isPrime = integer -> {

        if (integer == 0 || integer == 1) return false;

        for (int i = 2; i < integer ; i++) {
            if (integer % i == 0){
                return false;
            }

        }
        return true;
    };
}
