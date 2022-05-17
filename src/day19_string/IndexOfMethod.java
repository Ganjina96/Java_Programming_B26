package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        System.out.println(s.indexOf("p"));

        System.out.println(s.indexOf("x")); // it gives you -1 if ask for an index of a character that does not exist in the string

        System.out.println(s.indexOf("pe"));
        System.out.println(s.indexOf("pz"));
    }
}
