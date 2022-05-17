package day08_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int b = 10; // b=10 -> 11 -> 10 -> 11 -> 12
        b++; // post increment, no other code, adds 1
        System.out.println(b); // print the value of b which is 11
        b--; // post decrement, no other code in this line so nothing happens, subtract 1
        System.out.println(b); // print the value of b which is now 10
        System.out.println(b++); // post increment, we get the value first which is 10, and then we print it
        System.out.println(b++); // post increment we get the value again first which is 11, and then we print it, then we add 1
        System.out.println(b); // here it is all updated which is 12

        // new code to analyze

        int a = 40; // a = 40 -> 39 -> 38 -> 37 -> 36 -> 35 -> 34
        System.out.println(--a); // pre decrement which means it will immediately subtract 1 which will print the new value of a which is 39
        System.out.println(--a); // pre decrement which means subtract 1 right away and print 38
        System.out.println(a--); // post decrement which means we will get the current value first to use in the code which is 38 and print it but it will update the value of a by subtracting 1
        System.out.println(--a); // pre decrement again which means take away 1 right away which makes it 36
        System.out.println(--a); // pre decrement which means subtract right away and print the new value of a which is 35
        System.out.println(a--); // post decrement which prints the original value first and then subtracts 1 from code it will be 34, but it won't print in the code

        // new code to analyze

        int h = 5; // h = 5 -> 6 -> 7 -> 8
        int p = h; // p gets assigned the value of h, which is 5, in the memory p = 5, copied the value of h before updating it and print p with the original value even tho h value later changes

        h++; // post increment no other code so it adds 1
        System.out.println("h " + h);
        System.out.println("p " + p);

        int k = h++; // post increment of value of h which is 6 and assign it to the new variable k, so k has the value of 6. then h adds 1
        System.out.println("h " + h); // 7
        System.out.println("k " + k); // 6

        int g = ++h; // pre increment which means adds 1 right away and prints the new value 8 to the variable g as well as h
        System.out.println("h " + h);
        System.out.println("g " + g);


    }
}
