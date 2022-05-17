package day03_comments_escape_sequence;

public class Quotes {
    public static void main(String[] args) {
        /*
        Q: How can you output this:
        I like "java" programming
         */
        System.out.println("I like \"java\" programming");
        /*
        the first quote is before java printing the text
        the second quote is to print the " in the console
         */

        // I want to print backslash
        System.out.println("abc \\ def");

        /*
        the first backslash is for the syntax of escape characters
        the second backslash is for the \ character to be output
         */
        System.out.println("abc \\\\");

    }
}
