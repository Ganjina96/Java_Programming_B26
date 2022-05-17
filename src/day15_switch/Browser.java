package day15_switch;

import java.util.Scanner;
import java.util.SortedMap;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.nextLine();
        System.out.println("Enter your url");
        String url = input.nextLine();

        switch (browser) {
            case "Chrome":
                System.out.println("Opening " + url + " in the Chrome browser");
                System.out.println("Loading... ");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in Safari");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in Firefox");
                break;
            default:
                System.out.println(browser + " is not a valid browser");

        }
    }
}
