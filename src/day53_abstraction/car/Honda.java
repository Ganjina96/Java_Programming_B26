package day53_abstraction.car;

public class Honda extends Car{

    @Override
    public void start() {
        System.out.println("press the button");
    }
}
// this class is called concrete class so you must implement the abstract methods, have to override!!!