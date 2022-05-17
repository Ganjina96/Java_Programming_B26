package day24_loops;

public class CountJava {
    /*
    java is a language
    0123

    java 0, 4
    always checking for 4 characters because java is 4 characters
     */

    public static void main(String[] args) {
        String str = "java is a java language.java";
        int count =0;

        for (int i = 0; i < str.length()-3; i++) {
            String everyFour = str.substring(i , i + 4);
           if (everyFour.equals("java")){
               count++;
           }
        }
        System.out.println(count);
    }
}
