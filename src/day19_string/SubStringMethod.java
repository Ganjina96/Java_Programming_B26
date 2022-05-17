package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";
        //            012345
        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(0,3)); // sun
        System.out.println(str); // sunday
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,6)); // okay cause the index 6 is just a stopping point, not included in the code

    }
}
