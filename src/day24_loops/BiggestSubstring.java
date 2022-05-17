package day24_loops;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print
it.
Ex: aaabbbcccccddddee
Output: ccccc
     */

    public static void main(String[] args) {
        String s = "aaabbbcccccddddee";
        String sub = ""; // each iteration that has the same character then it will be added to the substring
        String biggest = "";

        for (int i = 0; i < s.length() - 1; i++) {
            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)){ // when the character of i is different from the character next to it then this statement will run
                if (sub.length() > biggest.length()){
                    biggest = sub;
                }
                sub = ""; // resets this string for the next substring, so it does not concatenate all the characters
            }
        }
        System.out.println(biggest);
    }


}

/*
go thru each char in the loop
look for each substring which is repeating chars
Ex: aaa

check next character to see if it is the same character or different
check if it's the biggest substring
 */
