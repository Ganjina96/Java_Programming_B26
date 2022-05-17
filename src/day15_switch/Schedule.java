package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about");
        String day = input.nextLine();
        String info = "";

        switch (day){

            case "Monday": case "monday" : case "mon" : case "MONDAY":
                info = "We have Java class with Saim at 7 pm EST";
                break;
            case "Tuesday":
            case "Wednesday":
                info = "We have Java class with Saim at 7 pm EST, but we also have office hrs at 5:30 pm";
                break;
            case "Thursday":
                info = "We have soft skills with NAdir at 7 pm EST";
                break;
            case "Friday":
                info = "Day off or soft skills studying day";
                break;
            case "Saturday":
            case "Sunday":
                info = "Full day of Java from 10 am to 5 pm EST";
                break;
            default:
                info = "Not a valid day";

        }
        System.out.println(info);
    }
}
