package day23_loops;

import java.util.Scanner;

public class SaimPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String msg = input.nextLine().trim();

        int wordCount = 1;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ' && msg.charAt(i + 1) != ' ') {
                wordCount++;
            }

        }
            if(msg.isBlank()){
                System.out.println("no words");
            } else {
                System.out.println(wordCount);
            }






}
}






