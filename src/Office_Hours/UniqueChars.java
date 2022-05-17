package Office_Hours;

public class UniqueChars {
    /*
    Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String

     */

    public static void main(String[] args) {
        //manually

        String str = "aabdfccfs";
        //            012345678

        // if you have unique chars then the firstIndexof and lastIndexOf will be the same
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        // dynamic

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            boolean isUnique = str.indexOf(each) == str.lastIndexOf(each);

            if (isUnique){
                System.out.print(each);
            }
        }

    }
}
