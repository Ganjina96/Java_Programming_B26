package day48_encapsulation;

public class UsePizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large", 3);
        System.out.println(pizza1);
        pizza1.setNumberOfToppings(2);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("", -2);
        System.out.println(pizza2);
        pizza2.setSize("small");
        pizza2.setNumberOfToppings(1);
        System.out.println(pizza2);

    }
}
