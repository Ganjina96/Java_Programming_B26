package Office_Hours;

public class Anagram {
    /*
    Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method
     */

    public static void main(String[] args) {
        String a = "A gentleman";
        String b = "elegant man";

        // removed all the spaces from the strings to make sure we fixate on characters only and spaces in order
        a = a.toLowerCase().replace(" ","");
        b = b.toLowerCase().replace(" ","");

        if (a.length() == b.length()){ // this is pre-condition to check if anagram or not, if length is not equal then it can't be an anagram cause not all the same characters or the same number of characters
            for (int i = 0; i < a.length(); i++) {
                char each = a.charAt(i);

                // with each iteration we will remove a similar character in a from b until nothing is left to make sure the same characters are in both words
                b= b.replaceFirst("" + each, "");
            }

            if (b.isEmpty()){
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        } else {
            System.out.println("Not an anagram");
        }



    }
}
