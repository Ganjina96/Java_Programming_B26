package day19_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with titles");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello sir");
        } else if (name.startsWith("ms ") || name.startsWith("miss") || name.startsWith("madam")){
            System.out.println("Hello ma'am");
        } else if (name.startsWith("dr ")){
            System.out.println("Hello doctor");
        }

        if (name.endsWith(" sr")){
            System.out.println("Nice to meet you senior");
        } else if (name.endsWith(" jr")){
            System.out.println("Nice to meet you junior");
        }


        }
    }

