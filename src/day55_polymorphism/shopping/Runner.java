package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

        /*

        Shopping and OnlineShopping are abstract classes, so we can't make object of them

        Shipping is an interface, so we can't make an object of it

         */

        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();
       // target/payForShipping(true); no relationship with interface Shipping

        System.out.println();

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        System.out.println(amazon.price);
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);

        System.out.println(Shipping.country); // proper way to access static info in the interface
    }
}
