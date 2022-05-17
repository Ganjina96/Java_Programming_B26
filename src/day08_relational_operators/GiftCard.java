package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        /*
        Declare and assign a gift card with some money, $200
        buy 2 items. buy 1 item for x price and subtract from your gift card and then buy another item for x price
        print the remaining balance of your gift card
         */
         double giftCard = 200;
        System.out.println("Buy item 1 for $39.99");
        giftCard -= 39.99; // giftCard = giftCard - 39.99;

        System.out.println("Buy item 2 for $69.99");
        giftCard -= 69.99; // giftCard = giftCard - 69.99;
        System.out.println("your gift card balance is now: " + giftCard);


    }
}
