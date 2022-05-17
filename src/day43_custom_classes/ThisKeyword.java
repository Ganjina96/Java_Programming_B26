package day43_custom_classes;

public class ThisKeyword {

    int a = 100; // instance variable

    public ThisKeyword(int a){ // local variable (prioritized)
        a = 400;
        System.out.println(a);
        this .a = 600;
    }
}
