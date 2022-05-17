package day18_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message");
        String msg = input.nextLine(); // input.nextLine().toLowerCase().trim(); which gives you string back and helps chain the msg
        msg = msg.toLowerCase();
        msg = msg.trim();

        if (msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + msg + "\"" + " sent");
        }
    }
}
