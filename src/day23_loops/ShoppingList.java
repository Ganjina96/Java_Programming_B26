package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping list:\n";
        String addMore;

        do {
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine(); // this could also be done separately, assign a different variable and then concatenate
            /*
            String item = input.nextLine();
            list += item;
             */

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        } while (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase(("ok"))); // if the user types yes, then the loop will keep going (iterate again). It is going to ask again and if the user types anything besides "yes" then the loop will stop

        System.out.println(list); // always print outside the do...while loop so the statement does not repeat each time


    }
}
