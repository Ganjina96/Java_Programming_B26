package day55_polymorphism.interface_methods;

public interface Mac {

    String NAME = "Mac"; // public static final variables
    String SOFTWARE = "IOS"; // they are constants which means they must be uppercase per convention

    void turnOn(); // public abstract

    // Q: how do you create a method w/ implementation in an interface

    // One way is a static method:

    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ in LA");
        System.out.println("New release in Nov");
    }

    // Another way is a default method:

    public default void faceTime(){
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }


}
