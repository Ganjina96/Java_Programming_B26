package day14_nested_if_statements;

public class AmazonPrime {
    /*
    task:
        declare and assign a price variable
        declare and assign a boolean hasPrime variable

        possible outputs:
            -prime member: "Eligible for 2-day shipping
            -not prime and item price is more than 25:
                eligible for regular free shipping
            -not prime and item price is less than 25:
                not eligible for free shipping. shipping is 3.99
     */
    public static void main(String[] args) {
        double price = 20.99;
        boolean hasPrime = false;

        if (hasPrime){
            System.out.println("Eligible for 2-day shipping");
        } else {
            // here when hasPrime is false
            if (price >= 25){
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is $3.99");
                price += 3.99; // price = price + 3.99
            }
        }
        System.out.println(price);
    }
}
