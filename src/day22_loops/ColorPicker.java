package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorsPicked = 0;
        String uniqueColors = "";

        while (colorsPicked < 3){
            System.out.println("Pick a color");
            String color = input.next();

            if (uniqueColors.contains(color)){
                System.out.println("You already have that color");
            } else {
                // if we are here it means we have a unique color
                uniqueColors += color + " ";
                colorsPicked++;
            }
        }
        System.out.println(uniqueColors);
    }
}
