package day53_abstraction.car;

public class Tesla extends ElectricCar{


    @Override
    public void start() {
        System.out.println("card in the car");
        System.out.println("press the button");

    }

    @Override
    public void charge() {
        System.out.println("charging Tesla");

    }
}

/*

Tesla is the sub class of ElectricCar class. It is non-abstract (concrete) class, which means it cannot have abstract methods, which means we must override any abstract methods that were inherited from parent classes
 */