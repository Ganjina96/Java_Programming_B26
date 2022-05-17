package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen";

        String s2 = new String("pen");

        System.out.println("Compare with ==: " + (s == s2));
        System.out.println("Compare the proper way: " + (s.equals(s2)));

        System.out.println("compare with a change in capitalization: " + s.equals("Pen"));
        System.out.println("compare with a method that ignores casing: " + s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("PEN");

        if (s.equals("pen")){

        }
        int len = s.length();
        System.out.println(len);

        if (s.length() > 4){
            System.out.println("long word");
        } else {
            System.out.println("short word");
        }

        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());
    }
}
