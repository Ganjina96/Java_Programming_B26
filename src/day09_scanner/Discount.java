package day09_scanner;

public class Discount {
    /*
    declare and assign
    is it the weekend
    are you a teacher or police or firefighter
    do you get a discount
     */
    public static void main(String[] args) {
        boolean isItWeekend = true;
        boolean teacher = false;
        boolean policeOfficer = false;
        boolean firefighter = false;
        boolean getDiscount = isItWeekend && (teacher || policeOfficer || firefighter);
        System.out.println("Do you get a discount: " + getDiscount);
    }
}
